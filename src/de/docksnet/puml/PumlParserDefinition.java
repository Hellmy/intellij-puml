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
        return PumlTypes.Factory.createElement(node);
    }
}