package de.docksnet.puml.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.BnfTypes;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class PumlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> KEYS;

    private static final TextAttributesKey UML_KEYWORD = TextAttributesKey.createTextAttributesKey("UML_KEYWORD",
            SyntaxHighlighterColors.KEYWORD.getDefaultAttributes());

    private static final TextAttributesKey UML_STRING = TextAttributesKey.createTextAttributesKey
            ("UML_STRING",
            SyntaxHighlighterColors.STRING.getDefaultAttributes());

    private static final TextAttributesKey BAD_CHARACTER_ATTRIBUTES = TextAttributesKey.createTextAttributesKey("BAD_CHARACTER_ATTRIBUTES",
            SyntaxHighlighterColors.INVALID_STRING_ESCAPE.getDefaultAttributes());

    static {
        KEYS = new THashMap<IElementType, TextAttributesKey>();

        KEYS.put(BnfTypes.BNF_START_UML, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_END_UML, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ACTOR, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ID, UML_STRING);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PumlSyntaxHighlightingLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return new TextAttributesKey[]{KEYS.get(tokenType)};
    }
}
