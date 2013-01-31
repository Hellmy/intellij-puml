package de.docksnet.puml.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import de.docksnet.puml.psi.PumlNamedElement;
import org.jetbrains.annotations.NotNull;
 
public abstract class PumlNamedElementImpl extends ASTWrapperPsiElement implements PumlNamedElement {
    public PumlNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}