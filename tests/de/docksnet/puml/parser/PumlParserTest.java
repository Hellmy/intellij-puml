package de.docksnet.puml.parser;

import de.docksnet.puml.PumlParserDefinition;

public class PumlParserTest extends PumlParserTestBase {
  public PumlParserTest() {
    super("parser", "puml", new PumlParserDefinition());
  }

  public void testOneActor()                                { doTest(true, false); }
  public void testActorAndConnectionSameName()              { doTest(true, false); }
  public void testActorAndConnectionDifferentName()         { doTest(true, false); }

  protected void doTest(boolean checkResult, boolean suppressErrors) {
    super.doTest(checkResult);
    if (!suppressErrors) {
      assertFalse(
        "PsiFile contains error elements",
        toParseTreeText(myFile, skipSpaces(), includeRanges()).contains("PsiErrorElement")
      );
    }
  }
}

