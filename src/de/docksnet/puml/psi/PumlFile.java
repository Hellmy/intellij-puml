package de.docksnet.puml.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import de.docksnet.puml.language.PumlFileType;
import de.docksnet.puml.language.PumlLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
 
public class PumlFile extends PsiFileBase {
    public PumlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PumlLanguage.INSTANCE);
    }
 
    @NotNull
    @Override
    public FileType getFileType() {
        return PumlFileType.INSTANCE;
    }
 
    @Override
    public String toString() {
        return "PlainUml File";
    }
 
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}