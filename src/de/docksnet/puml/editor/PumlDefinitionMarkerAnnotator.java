package de.docksnet.puml.editor;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import de.docksnet.puml.PumlSyntaxHighlighter;
import de.docksnet.puml.psi.PumlActorIdDefinition;
import org.jetbrains.annotations.NotNull;

public class PumlDefinitionMarkerAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
        if (!(psiElement instanceof PumlActorIdDefinition)) return;
        PumlActorIdDefinition actorIdDefinition = (PumlActorIdDefinition) psiElement;
        annotationHolder.createInfoAnnotation(actorIdDefinition, "definition").setTextAttributes(PumlSyntaxHighlighter.DEFINITION);
    }
}