package de.docksnet.puml;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import de.docksnet.puml.language.PumlLanguage;
import de.docksnet.puml.parser.PumlParser;
import de.docksnet.puml.psi.PumlActorIdDefinition;
import de.docksnet.puml.psi.PumlFile;
import de.docksnet.puml.psi.PumlTypes;
import de.docksnet.puml.psi.impl.PumlActorIdDefinitionImpl;
import de.docksnet.puml.psi.impl.PumlActorIdReferenceImpl;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;
 
public class PumlParserDefinition implements ParserDefinition{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(PumlTypes.COMMENT);
 
    public static final IFileElementType FILE = new IFileElementType(Language.<PumlLanguage>findInstance(PumlLanguage.class));
 
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlexAdapter(new _PumlLexer((Reader) null));
    }
 
    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }
 
    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }
 
    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }
 
    @NotNull
    public PsiParser createParser(final Project project) {
        return new PumlParser();
    }
 
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }
 
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PumlFile(viewProvider);
    }
 
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
 
    @NotNull
    public PsiElement createElement(ASTNode node) {
//        if (PumlTypes.ACTOR_ID_REFERENCE.equals(node.getElementType())) {
//            String actorId = extractIdFromActorIdReference(node);
//            if (existActorDefinitionWithId(node, actorId)) {
//                return createActorIdReference(node);
//            } else {
//                return createActorIdDefinition(node);
//            }
//        }
        return PumlTypes.Factory.createElement(node);
    }

//    private String extractIdFromActorIdReference(ASTNode actorStatement) {
//        return getIdFromActorDefOrRef(actorStatement);
//    }
//
//    private String getIdFromActorDefOrRef(ASTNode actorStatement) {
//        return actorStatement.findChildByType(PumlTypes.ID).getText();
//    }
//
//    private boolean existActorDefinitionWithId(ASTNode node, String actorId) {
//        PsiFile psiFile = PsiTreeUtil.getTopmostParentOfType(node.getPsi(), PsiFile.class);
//        PumlActorIdDefinition[] actorIdDefinitions = PsiTreeUtil.getChildrenOfType(psiFile, PumlActorIdDefinition.class);
//        for (PumlActorIdDefinition actorIdDefinition : actorIdDefinitions) {
//            if (actorId.equals(getIdFromActorDefOrRef(actorIdDefinition))) {
//
//            }
//        }
//        return false;  //To change body of created methods use File | Settings | File Templates.
//    }
//
//    private PsiElement createActorIdReference(ASTNode node) {
//        return new PumlActorIdReferenceImpl(node);
//    }
//
//    private PsiElement createActorIdDefinition(ASTNode node) {
//        return new PumlActorIdDefinitionImpl(node);
//    }
}