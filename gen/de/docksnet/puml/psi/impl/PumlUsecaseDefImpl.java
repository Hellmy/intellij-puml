// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.docksnet.puml.psi.PumlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.docksnet.puml.psi.*;

public class PumlUsecaseDefImpl extends ASTWrapperPsiElement implements PumlUsecaseDef {

  public PumlUsecaseDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PumlVisitor) ((PumlVisitor)visitor).visitUsecaseDef(this);
    else super.accept(visitor);
  }

}
