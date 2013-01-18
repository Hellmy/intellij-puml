package de.docksnet.puml.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import de.docksnet.puml.highlighter.PumlLexer;
import de.docksnet.puml.language.PumlLanguage;
import de.docksnet.puml.psi.BnfTokenType;
import de.docksnet.puml.psi.BnfTypes;
import de.docksnet.puml.psi.impl.PumlFileImpl;
import org.jetbrains.annotations.NotNull;

public class PumlParserDefinition implements ParserDefinition {

    public static final IFileElementType BNF_FILE_ELEMENT_TYPE = new IFileElementType("BNF_FILE", PumlLanguage.INSTANCE);
    public static final TokenSet WS = TokenSet.create(TokenType.WHITE_SPACE);
    public static final IElementType BNF_LINE_COMMENT = new BnfTokenType("BNF_LINE_COMMENT");
    public static final IElementType BNF_BLOCK_COMMENT = new BnfTokenType("BNF_BLOCK_COMMENT");
    public static final TokenSet COMMENTS = TokenSet.create(BNF_LINE_COMMENT, BNF_BLOCK_COMMENT);
//    public static final TokenSet LITERALS = TokenSet.create(BnfTypes.BNF_STRING);
    public static final TokenSet LITERALS = TokenSet.create(new BnfTokenType("BNF_LINE_COMMENT"));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new PumlLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new PumlParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return BNF_FILE_ELEMENT_TYPE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WS;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return LITERALS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return BnfTypes.Factory.createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new PumlFileImpl(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }

}
