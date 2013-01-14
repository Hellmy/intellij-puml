// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.docksnet.puml.psi.impl.*;

public interface BnfTypes {

  IElementType BNF_ACTOR_DEF = new BnfCompositeElementType("BNF_ACTOR_DEF");
  IElementType BNF_FILE_BODY = new BnfCompositeElementType("BNF_FILE_BODY");
  IElementType BNF_LINK_DEF = new BnfCompositeElementType("BNF_LINK_DEF");
  IElementType BNF_UML_BODY = new BnfCompositeElementType("BNF_UML_BODY");

  IElementType BNF_ACTOR = new BnfTokenType("actor");
  IElementType BNF_DASH = new BnfTokenType("-");
  IElementType BNF_END_UML = new BnfTokenType("@enduml");
  IElementType BNF_ID = new BnfTokenType("id");
  IElementType BNF_START_UML = new BnfTokenType("@startuml");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BNF_ACTOR_DEF) {
        return new BnfActorDefImpl(node);
      }
      else if (type == BNF_FILE_BODY) {
        return new BnfFileBodyImpl(node);
      }
      else if (type == BNF_LINK_DEF) {
        return new BnfLinkDefImpl(node);
      }
      else if (type == BNF_UML_BODY) {
        return new BnfUmlBodyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
