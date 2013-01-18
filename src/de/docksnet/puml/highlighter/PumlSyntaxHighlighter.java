package de.docksnet.puml.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.BnfTypes;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PumlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> KEYS;

    public static final TextAttributesKey UML_KEYWORD = TextAttributesKey.createTextAttributesKey("UML_KEYWORD",
            SyntaxHighlighterColors.KEYWORD.getDefaultAttributes());

    public static final TextAttributesKey UML_TYPE = TextAttributesKey.createTextAttributesKey("UML_TYPE",
            SyntaxHighlighterColors.KEYWORD.getDefaultAttributes());

    public static final TextAttributesKey UML_STRING = TextAttributesKey.createTextAttributesKey
            ("UML_STRING",
            SyntaxHighlighterColors.STRING.getDefaultAttributes());

    public static final TextAttributesKey UML_ID = createTextAttributesKey("ID",
            new TextAttributes(Color.RED, null, null, null, Font.BOLD));

    static {
        KEYS = new THashMap<IElementType, TextAttributesKey>();

        KEYS.put(BnfTypes.BNF_STRING, UML_STRING);
        KEYS.put(BnfTypes.BNF_ID, UML_ID);

        KEYS.put(BnfTypes.BNF_ABSTRACT, UML_TYPE);
        KEYS.put(BnfTypes.BNF_ACTOR, UML_TYPE);
        KEYS.put(BnfTypes.BNF_CLASS, UML_TYPE);
        KEYS.put(BnfTypes.BNF_COMPONENT, UML_TYPE);
        KEYS.put(BnfTypes.BNF_ENUM, UML_TYPE);
        KEYS.put(BnfTypes.BNF_INTERFACE, UML_TYPE);
        KEYS.put(BnfTypes.BNF_OBJECT, UML_TYPE);
        KEYS.put(BnfTypes.BNF_PARTICIPANT, UML_TYPE);
        KEYS.put(BnfTypes.BNF_STATE, UML_TYPE);
        KEYS.put(BnfTypes.BNF_USECASE, UML_TYPE);


        KEYS.put(BnfTypes.BNF_AT__ENDUML, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_AT__STARTUML, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ACTIVATE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ALSO, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ALT, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_AS, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_AUTONUMBER, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_BOTTOM, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_BOX, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_BREAK, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_CENTER, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_CREATE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_CRITICAL, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_DEACTIVATE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_DESTROY, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_DOWN, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ELSE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_END, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ENDIF, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_FOOTBOX, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_FOOTER, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_GROUP, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_HEADER, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_HIDE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_IF, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_LEFT, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_LINK, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_LOOP, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_NAMESPACE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_NEWPAGE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_NOTE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_OF, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ON, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_OPT, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_OVER, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_PACKAGE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_PAGE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_PAR, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_PARTITION, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_REF, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_RETURN, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_RIGHT, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_ROTATE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_SHOW, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_SKIN, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_SKINPARAM, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_TITLE, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_TOP, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_TOP_TO_BOTTOM_DIRECTION, UML_KEYWORD);
        KEYS.put(BnfTypes.BNF_UP, UML_KEYWORD);
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
