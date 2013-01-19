package de.docksnet.puml.language;

import com.intellij.lang.CompositeLanguage;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;

public class PumlLanguage extends CompositeLanguage {
    public static final PumlLanguage INSTANCE = new PumlLanguage();

    private PumlLanguage() {
        super("PUML", "text/puml");
//        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
//            @NotNull
//            protected SyntaxHighlighter createHighlighter() {
//                return new PumlSyntaxHighlighter();
//            }
//        });
    }
}
