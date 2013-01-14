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

public class BnfUmlBodyImpl extends BnfCompositeElementImpl implements BnfUmlBody {

  public BnfUmlBodyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<BnfActorDef> getActorDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BnfActorDef.class);
  }

  @Override
  @NotNull
  public List<BnfLinkDef> getLinkDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BnfLinkDef.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BnfVisitor) ((BnfVisitor)visitor).visitUmlBody(this);
    else super.accept(visitor);
  }

}
