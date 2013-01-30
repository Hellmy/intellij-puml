package de.docksnet.puml;

import com.intellij.lang.PsiBuilder;
import com.intellij.openapi.util.Key;
import de.docksnet.puml.psi.PumlTypes;

import java.util.HashSet;
import java.util.Set;

public class MyGeneratedParserUtilBase extends GeneratedParserUtilBase {
    public static boolean rememberID(PsiBuilder builder, int level) {
        if (builder.getTokenType() == PumlTypes.ID) getKnownIDs(builder).add(builder.getTokenText());
        return true;
    }

    public static boolean isKnownID(PsiBuilder builder, int level) {
        return builder.getTokenType() == PumlTypes.ID && getKnownIDs(builder).contains(builder.getTokenText());
    }

    private static final Key<Set<String>> KNOWN_IDS = Key.create("KNOWN_IDS");

    private static Set<String> getKnownIDs(PsiBuilder builder) {
        Set<String> set = builder.getUserDataUnprotected(KNOWN_IDS);
        if (set == null) builder.putUserDataUnprotected(KNOWN_IDS, set = new HashSet<>());
        return set;
    }
}
