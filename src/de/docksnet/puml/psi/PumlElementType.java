package de.docksnet.puml.psi;

import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.language.PumlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
 
public class PumlElementType extends IElementType {
    public PumlElementType(@NotNull @NonNls String debugName) {
        super(debugName, PumlLanguage.INSTANCE);
    }
}