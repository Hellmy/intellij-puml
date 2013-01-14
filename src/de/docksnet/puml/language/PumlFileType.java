package de.docksnet.puml.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PumlFileType extends LanguageFileType {
    public static final PumlFileType PUML_FILE_TYPE = new PumlFileType();

    protected PumlFileType() {
        super(PumlLanguage.PUML_LANGUAGE);
    }

    @NotNull
    @Override
    public String getName() {
        return "PlantUML";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "PlantUML files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "puml";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @Override
    public String getCharset(@NotNull VirtualFile virtualFile, byte[] bytes) {
        return null;
    }
}
