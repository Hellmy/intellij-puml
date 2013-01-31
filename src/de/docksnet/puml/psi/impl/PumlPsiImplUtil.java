package de.docksnet.puml.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import de.docksnet.puml.psi.PumlActorIdDefinition;
import de.docksnet.puml.psi.PumlElementFactory;
import de.docksnet.puml.psi.PumlTypes;

public class PumlPsiImplUtil {

    public static String getId(PsiElement element) {
        ASTNode keyNode = element.getNode().findChildByType(PumlTypes.ID);
        if (keyNode != null) {
            return keyNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(PumlActorIdDefinition element) {
        return getId(element);
    }

    public static PsiElement setName(PumlActorIdDefinition element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(PumlTypes.ID);
        if (keyNode != null) {
            PumlActorIdDefinition actorIdDefinition = PumlElementFactory.createActorIdDefinition(element.getProject(), newName);
            ASTNode newKeyNode = actorIdDefinition.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(PumlActorIdDefinition element) {
        ASTNode keyNode = element.getNode().findChildByType(PumlTypes.ID);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }
}