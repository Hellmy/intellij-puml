package de.docksnet.puml.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.util.PsiTreeUtil;
import de.docksnet.puml.language.PumlFileType;
import de.docksnet.puml.language.PumlLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<PumlActorIdDefinition> getActorIdDefinitions() {
        List<PumlActorIdDefinition> result = new ArrayList<>();
        PumlActorEntry[] actorEntries = PsiTreeUtil.getChildrenOfType(this, PumlActorEntry.class);
        for (PumlActorEntry actorEntry : actorEntries) {
            List<PumlActorIdDefinition> actorDefinitions = PsiTreeUtil.getChildrenOfTypeAsList(actorEntry, PumlActorIdDefinition.class);
            result.addAll(actorDefinitions);
        }
        return result;
    }
}