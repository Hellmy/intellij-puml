package de.docksnet.puml;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.PumlTypes;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class PumlSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("PUML_KEY", SyntaxHighlighterColors.KEYWORD.getDefaultAttributes());
    public static final TextAttributesKey ID = createTextAttributesKey("PUML_VALUE", SyntaxHighlighterColors.STRING.getDefaultAttributes());
    public static final TextAttributesKey COMMENT = createTextAttributesKey("PUML_COMMENT", SyntaxHighlighterColors.LINE_COMMENT.getDefaultAttributes());
 
    static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER",
            new TextAttributes(Color.RED, null, null, null, Font.BOLD));
 
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] ID_KEYS = new TextAttributesKey[]{ID};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
 
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new _PumlLexer((Reader) null));
    }
 
    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(PumlTypes.UML_START) || tokenType.equals(PumlTypes.UML_END)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(PumlTypes.ACTOR) || tokenType.equals(PumlTypes.USECASE)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(PumlTypes.AS)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(PumlTypes.ID)) {
            return ID_KEYS;
        } else if (tokenType.equals(PumlTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}