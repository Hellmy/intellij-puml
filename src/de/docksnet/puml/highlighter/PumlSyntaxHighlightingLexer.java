package de.docksnet.puml.highlighter;

import com.intellij.lexer.LayeredLexer;

public class PumlSyntaxHighlightingLexer extends LayeredLexer {
    public PumlSyntaxHighlightingLexer() {
        super(new PumlLexer());
    }
}
