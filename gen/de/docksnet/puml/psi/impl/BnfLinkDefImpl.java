// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.docksnet.puml.psi.BnfTypes.*;
import de.docksnet.puml.psi.*;

public class BnfLinkDefImpl extends BnfCompositeElementImpl implements BnfLinkDef {

  public BnfLinkDefImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(BNF_ID);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BnfVisitor) ((BnfVisitor)visitor).visitLinkDef(this);
    else super.accept(visitor);
  }

}
