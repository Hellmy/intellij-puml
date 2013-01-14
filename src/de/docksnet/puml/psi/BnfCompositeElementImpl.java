package de.docksnet.puml.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;

public class BnfCompositeElementImpl extends ASTWrapperPsiElement implements BnfCompositeElement {
    public BnfCompositeElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }
}
