package de.docksnet.puml.highlighter;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.BnfTypes;

%%

%public
%class _PumlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%eof{ return;
%eof}

EOL=\r|\n|\r\n|\u2028|\u2029|\u000B|\u000C|\u0085
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

ALPHA=[:letter:]
DIGIT=[:digit:]

ID_BODY={ALPHA} | {DIGIT} | "_"
ID=({ID_BODY}) *

START_UML="@startuml" {LINE_WS}* {EOL}
END_UML="@enduml"

%%

<YYINITIAL> {
  {WHITE_SPACE} {yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE; }


  {START_UML} {yybegin(YYINITIAL); return BnfTypes.BNF_START_UML; }
  {END_UML} {yybegin(YYINITIAL); return BnfTypes.BNF_END_UML; }

  "actor" {yybegin(YYINITIAL); return BnfTypes.BNF_ACTOR; }

  "-" {yybegin(YYINITIAL); return BnfTypes.BNF_DASH; }

  {ID} {yybegin(YYINITIAL); return BnfTypes.BNF_ID; }

  [^] {yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER; }

}
