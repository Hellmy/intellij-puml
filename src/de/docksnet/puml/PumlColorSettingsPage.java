package de.docksnet.puml;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
 
import javax.swing.*;
import java.util.Map;
 
public class PumlColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", PumlSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("ID", PumlSyntaxHighlighter.ID),
    };
 
    @Nullable
    @Override
    public Icon getIcon() {
        // TODO
        return null;
    }
 
    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PumlSyntaxHighlighter();
    }
 
    @NotNull
    @Override
    public String getDemoText() {
        return "@startuml\n" +
                "usecase UC3 as FF\n" +
                "usecase (Last\\nusecase) as UC4\n" +
                "@enduml";
    }
 
    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }
 
    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }
 
    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }
 
    @NotNull
    @Override
    public String getDisplayName() {
        return "PlantUML";
    }
}