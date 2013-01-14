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

public class BnfFileBodyImpl extends BnfCompositeElementImpl implements BnfFileBody {

  public BnfFileBodyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public BnfUmlBody getUmlBody() {
    return findChildByClass(BnfUmlBody.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BnfVisitor) ((BnfVisitor)visitor).visitFileBody(this);
    else super.accept(visitor);
  }

}
