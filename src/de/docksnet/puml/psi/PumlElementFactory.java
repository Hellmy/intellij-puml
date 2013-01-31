package de.docksnet.puml.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import de.docksnet.puml.language.PumlFileType;

public class PumlElementFactory {
    public static PumlActorIdDefinition createActorIdDefinition(Project project, String actorId) {
        final PumlFile file = createFile(project, "@startuml\nactor " + actorId + "\n@enduml");
        PumlActorEntry pumlActorEntry = file.findChildByClass(PumlActorEntry.class);
        return PsiTreeUtil.getChildOfType(pumlActorEntry, PumlActorIdDefinition.class);
    }

    public static PumlFile createFile(Project project, String text) {
        String name = "dummy.puml";
        return (PumlFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, PumlFileType.INSTANCE, text);
    }
}