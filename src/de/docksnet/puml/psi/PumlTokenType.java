package de.docksnet.puml.psi;

import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.language.PumlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
 
public class PumlTokenType extends IElementType {
    public PumlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PumlLanguage.INSTANCE);
    }
 
    @Override
    public String toString() {
        return "PumlTokenType." + super.toString();
    }
}