package de.docksnet.puml.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;
import de.docksnet.puml.psi.PumlActorIdDefinition;
import de.docksnet.puml.psi.PumlElementFactory;
import de.docksnet.puml.psi.PumlFile;
import de.docksnet.puml.psi.PumlTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractPumlActorReference extends ASTWrapperPsiElement implements PsiReference {

    public AbstractPumlActorReference(@NotNull ASTNode node) {
        super(node);
    }

    public PsiElement bindToElement(@NotNull PsiElement element) throws IncorrectOperationException {
        throw new IncorrectOperationException();
    }

    public PsiReference getReference() {
        return this;
    }

    public String getCanonicalText() {
        return getText();
    }

    public PsiElement getElement() {
        return this;
    }

    public TextRange getRangeInElement() {
        return new TextRange(0, getTextLength());
    }

    public Object[] getVariants() {
        return new Object[0];
    }

    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        ASTNode keyNode = getNode().findChildByType(PumlTypes.ID);
        if (keyNode != null) {
            PumlActorIdDefinition actorIdDefinition = PumlElementFactory.createActorIdDefinition(getProject(), newElementName);
            ASTNode newKeyNode = actorIdDefinition.getFirstChild().getNode();
            getNode().replaceChild(keyNode, newKeyNode);
        }
        return this;
    }

    public boolean isReferenceTo(PsiElement element) {
        return element instanceof PumlActorIdDefinition && PumlPsiImplUtil.getId(element).equals(getId());
    }


    public boolean isSoft() {
        return false;
    }

    @Nullable
    public PsiElement resolve() {
        PumlFile file = (PumlFile) getElement().getContainingFile();
        List<PumlActorIdDefinition> suspects = file.getActorIdDefinitions();
        for (PumlActorIdDefinition suspect : suspects) {
            if (suspect.getName().equals(getId())) {
                return suspect;
            }
        }
        return null;
    }

    private String getId() {
        return PumlPsiImplUtil.getId(this);
    }
}