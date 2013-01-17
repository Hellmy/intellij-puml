package de.docksnet.puml.highlighter;

import java.util.Arrays;
import java.util.List;

/**
 * based on
 * C:\development\opt\plantuml>java -jar plantuml.jar -version
 * PlantUML version 7942 (Tue Nov 27 19:33:20 CET 2012)
 * Java(TM) SE Runtime Environment
 * Java HotSpot(TM) 64-Bit Server VM
 * 1.6.0_29-b11
 * Windows 7
 */
public class PumlLanguageUtil {
    public static final List<String> TYPES = Arrays.asList("abstract", "actor", "class", "component", "enum", "interface",
            "object",
            "participant",
            "state", "usecase2");

    public static final List<String> KEYWORDS = Arrays.asList("@enduml",
            "@startuml",
            "activate",
            "also",
            "alt",
            "as",
            "autonumber",
            "bottom",
            "box",
            "break",
            "center",
            "create",
            "critical",
            "deactivate",
            "destroy",
            "down",
            "else",
            "end",
            "endif",
            "footbox",
            "footer",
            "group",
            "header",
            "hide",
            "if",
            "left",
            "link",
            "loop",
            "namespace",
            "newpage",
            "note",
            "of",
            "on",
            "opt",
            "over",
            "package",
            "page",
            "par",
            "partition",
            "ref",
            "return",
            "right",
            "rotate",
            "show",
            "skin",
            "skinparam",
            "title",
            "top",
            "top to bottom direction",
            "up");

    public static void main(String[] args) {

        System.out.println();
        System.out.println("puml.flex: ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(toFlex(PumlLanguageUtil.TYPES));
        System.out.println();
        System.out.println(toFlex(PumlLanguageUtil.KEYWORDS));

        System.out.println();
        System.out.println("BnfTypes.java:  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(toTypes(PumlLanguageUtil.TYPES));
        System.out.println();
        System.out.println(toTypes(PumlLanguageUtil.KEYWORDS));


        System.out.println();
        System.out.println("PumlSyntaxHighlighter.java ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println(toHighlightEntries(PumlLanguageUtil.TYPES, "UML_TYPE"));
        System.out.println();
        System.out.println(toHighlightEntries(PumlLanguageUtil.KEYWORDS, "UML_KEYWORD"));
    }

    public static String toTypes(List<String> tokens) {
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(toTypeDefinitionStatement(token)).append(";\n");
        }
        return sb.toString();
    }

    public static String toFlex(List<String> tokens) {
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(toFlexStatement(token)).append("\n");
        }
        return sb.toString();
    }

    public static String toHighlightEntries(List<String> tokens, String highlightType) {
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(toHighlightStatement(token, highlightType)).append("\n");
        }
        return sb.toString();
    }

    public static String toTypeDefinitionStatement(String token) {
        return "IElementType " + toTypeName("", token) + " = new BnfTokenType(\"" + token + "\")";
    }

    public static String toFlexStatement(String token) {
        return "\"" + token + "\" {yybegin(YYINITIAL); return " + toTypeName("BnfTypes.", token) + "; }";
    }

    public static String toHighlightStatement(String token, final String highlightType) {
        return "KEYS.put(" + toTypeName("BnfTypes.", token) + ", " + highlightType + ");";
    }

    public static String toTypeName(final String prefix, String token) {
        return prefix + "BNF_" + token.replace("@", "AT__").replace(" ",
                "_").toUpperCase();
    }
}
