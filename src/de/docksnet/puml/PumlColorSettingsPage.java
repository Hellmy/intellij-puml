package de.docksnet.puml;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import de.docksnet.puml.highlighter.PumlSyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
 
import javax.swing.*;
import java.util.Map;
 
public class PumlColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("keyword", PumlSyntaxHighlighter.UML_KEYWORD),
            new AttributesDescriptor("type", PumlSyntaxHighlighter.UML_TYPE),
            new AttributesDescriptor("ID", PumlSyntaxHighlighter.UML_ID),
            new AttributesDescriptor("string", PumlSyntaxHighlighter.UML_STRING),
    };
 
    @Nullable
    @Override
    public Icon getIcon() {
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
                "\n" +
                "User -> (Start)\n" +
                "User --> (Use the application) : A small label\n" +
                "\n" +
                ":Main Admin: ---> (Use the application) : This is\\nyet another\\nlabel\n" +
                "\n" +
                "usecase UC1 as \"You can use\n" +
                "several lines to define your usecase.\n" +
                "You can also use separators.\n" +
                "--\n" +
                "Several separators are possible.\n" +
                "==\n" +
                "And you can add titles:\n" +
                "..Conclusion..\n" +
                "This allows large description.\"" +
                "\n" +
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
        return "Puml";
    }
}