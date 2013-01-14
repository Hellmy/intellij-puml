package de.docksnet.puml.parser;

import com.intellij.lang.PsiBuilder;

/**
 * This class ... TODO
 */
public class GrammarParserUtil extends GeneratedParserUtilBase {
    public static boolean parseGrammar(PsiBuilder builder_, int level, Parser parser) {
        ErrorState state = ErrorState.get(builder_);
        return parseAsTree(state, builder_, level, DUMMY_BLOCK, true, parser, TRUE_CONDITION);
    }
}
