package de.docksnet.puml.parser;

import com.intellij.lang.ParserDefinition;
import com.intellij.testFramework.ParsingTestCase;

public abstract class PumlParserTestBase extends ParsingTestCase {
    public PumlParserTestBase(String dataPath, String fileExt, ParserDefinition... definitions) {
        super(dataPath, fileExt, definitions);
    }

    @Override
    protected String getTestDataPath() {
        return "testData";
    }

    @Override
    protected boolean skipSpaces() {
        return true;
    }

    protected void doTest(boolean checkResult, boolean suppressErrors) {
        doTest(true);
        if (!suppressErrors) {
            assertFalse(
                    "PsiFile contains error elements",
                    toParseTreeText(myFile, skipSpaces(), includeRanges()).contains("PsiErrorElement")
            );
        }
    }
}
