// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.BnfTokenType;
import de.docksnet.puml.psi.BnfTypes;
import net.sourceforge.plantuml.syntax.SyntaxChecker;
import net.sourceforge.plantuml.syntax.SyntaxResult;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PumlParser implements PsiParser {

    public static Logger LOG_ = Logger.getInstance("de.docksnet.puml.parser.PumlParser");

    @NotNull
    public ASTNode parse(IElementType root, PsiBuilder builder) {
        Marker marker_ = builder.mark();

        int errorInLine = -1;
        SyntaxResult syntaxResult = null;
        try {
            String originalText = builder.getOriginalText().toString();
            syntaxResult = SyntaxChecker.checkSyntax(originalText);
            if (syntaxResult.isError()) {
                errorInLine = syntaxResult.getErrorLinePosition();
            }
        } catch (Exception e) {
            // TODO remove this try catch when SyntaxChecker doesn't throw Exception on missing @startuml or @enduml
            builder.error("@startuml or @endurl is probably missing");
        }

        while (builder.getTokenType() != null) {
            if (errorInLine != -1) {
                if (((BnfTokenType) builder.getTokenType()).getLine() == errorInLine) {
                    builder.error(createErrorString(syntaxResult));
                }
            }
            builder.advanceLexer();
        }

        marker_.done(root);
        return builder.getTreeBuilt();
    }

    private String createErrorString(SyntaxResult syntaxResult) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error in line " + syntaxResult.getErrorLinePosition()).append("\n");
        for (String line : syntaxResult.getErrors()) {
            sb.append(line).append("\n");
        }
        for (String line : syntaxResult.getSuggest()) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    private boolean gotoElementType(PsiBuilder builder, IElementType elementType, String messageText) {
        while (builder.getTokenType() != null && !elementType.equals(builder.getTokenType())) {
            builder.advanceLexer();
        }
        if (builder.getTokenType() == null) {
            builder.error(messageText);
            return false;
        }
        return true;
    }
}