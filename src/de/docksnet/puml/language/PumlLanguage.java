package de.docksnet.puml.language;

import com.intellij.lang.CompositeLanguage;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import de.docksnet.puml.highlighter.PumlSyntaxHighlighter;
import org.jetbrains.annotations.NotNull;

public class PumlLanguage extends CompositeLanguage {
    public static final PumlLanguage PUML_LANGUAGE = new PumlLanguage();

    private PumlLanguage() {
        super("PUML", "text/puml");
        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
            @NotNull
            protected SyntaxHighlighter createHighlighter() {
                return new PumlSyntaxHighlighter();
            }
        });
    }
}
