package de.docksnet.puml;

import com.intellij.lang.PsiBuilder;
import com.intellij.openapi.util.Key;
import de.docksnet.puml.psi.PumlTypes;

import java.util.HashSet;
import java.util.Set;

public class MyGeneratedParserUtilBase extends GeneratedParserUtilBase {
    public static boolean rememberActorID(PsiBuilder builder, int level) {
        if (builder.getTokenType() == PumlTypes.ID) getKnownActorIDs(builder).add(builder.getTokenText());
        return true;
    }

    public static boolean isKnownActorID(PsiBuilder builder, int level) {
        return builder.getTokenType() == PumlTypes.ID && getKnownActorIDs(builder).contains(builder.getTokenText());
    }

    private static final Key<Set<String>> KNOWN_ACTOR_IDS = Key.create("KNOWN_ACTOR_IDS");

    private static Set<String> getKnownActorIDs(PsiBuilder builder) {
        Set<String> set = builder.getUserDataUnprotected(KNOWN_ACTOR_IDS);
        if (set == null) builder.putUserDataUnprotected(KNOWN_ACTOR_IDS, set = new HashSet<>());
        return set;
    }

    public static boolean rememberUsecaseID(PsiBuilder builder, int level) {
        if (builder.getTokenType() == PumlTypes.ID) getKnownUsecaseIDs(builder).add(builder.getTokenText());
        return true;
    }

    public static boolean isKnownUsecaseID(PsiBuilder builder, int level) {
        return builder.getTokenType() == PumlTypes.ID && getKnownUsecaseIDs(builder).contains(builder.getTokenText());
    }

    private static final Key<Set<String>> KNOWN_USECASE_IDS = Key.create("KNOWN_USECASE_IDS");

    private static Set<String> getKnownUsecaseIDs(PsiBuilder builder) {
        Set<String> set = builder.getUserDataUnprotected(KNOWN_USECASE_IDS);
        if (set == null) builder.putUserDataUnprotected(KNOWN_USECASE_IDS, set = new HashSet<>());
        return set;
    }
}
