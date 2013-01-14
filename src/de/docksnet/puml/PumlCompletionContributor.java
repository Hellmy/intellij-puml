package de.docksnet.puml;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiRecursiveElementWalkingVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.PlatformIcons;
import com.intellij.util.ProcessingContext;
import de.docksnet.puml.psi.BnfActorDef;
import de.docksnet.puml.psi.BnfUmlBody;
import de.docksnet.puml.psi.impl.PumlFileImpl;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class PumlCompletionContributor extends CompletionContributor {

    public PumlCompletionContributor() {
        extend(CompletionType.BASIC, psiElement().inFile(PlatformPatterns.instanceOf(PumlFileImpl.class)),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters,
                                                  ProcessingContext context,
                                                  @NotNull final CompletionResultSet result) {
                        addKeywords(result);
                        addContextSensitiveKeywords(parameters.getPosition(), result);
                        addReferences(parameters, result);
                    }
                }

        );
    }

    private void addKeywords(CompletionResultSet result) {
    }

    private void addContextSensitiveKeywords(PsiElement element, CompletionResultSet result) {
        BnfUmlBody bnfBody = PsiTreeUtil.getParentOfType(element, BnfUmlBody.class);
        if (bnfBody == null) {
            BnfUmlBody body = PsiTreeUtil.getChildOfType(element.getParent(), BnfUmlBody.class);
            if (body == null) {
                result.addElement(LookupElementBuilder.create("@startuml"));
            }
        } else {
            result.addElement(LookupElementBuilder.create("@enduml"));
            result.addElement(LookupElementBuilder.create("actor"));
        }
    }

    private void addReferences(CompletionParameters parameters, final CompletionResultSet result) {
        parameters.getOriginalFile().acceptChildren(new PsiRecursiveElementWalkingVisitor() {
            @Override
            public void visitElement(PsiElement element) {
                if (element instanceof BnfActorDef) {
                    String text = element.getLastChild().getText();
                    result.addElement(LookupElementBuilder.create(text).setIcon(PlatformIcons.VARIABLE_ICON));
                }
            }
        });
    }
}