package de.docksnet.puml.highlighter;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class PumlLexer extends FlexAdapter {
    public PumlLexer() {
        super(new _PumlLexer((Reader)null));
    }
}
