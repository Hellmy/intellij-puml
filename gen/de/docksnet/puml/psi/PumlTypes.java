// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.docksnet.puml.psi.impl.*;

public interface PumlTypes {

  IElementType ACTOR_DEF = new PumlElementType("ACTOR_DEF");
  IElementType USECASE_DEF = new PumlElementType("USECASE_DEF");

  IElementType ACTOR = new PumlTokenType("ACTOR");
  IElementType AS = new PumlTokenType("AS");
  IElementType COMMENT = new PumlTokenType("COMMENT");
  IElementType EOL = new PumlTokenType("EOL");
  IElementType ID = new PumlTokenType("ID");
  IElementType UML_END = new PumlTokenType("UML_END");
  IElementType UML_START = new PumlTokenType("UML_START");
  IElementType USECASE = new PumlTokenType("USECASE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACTOR_DEF) {
        return new PumlActorDefImpl(node);
      }
      else if (type == USECASE_DEF) {
        return new PumlUsecaseDefImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
