package de.docksnet.puml;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.PumlTypes;
import com.intellij.psi.TokenType;

%%

%public
%class _PumlLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

EOL=\r|\n|\r\n
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

ALPHA=[:letter:]
DIGIT=[:digit:]

ID_BODY={ALPHA} | {DIGIT} | "_"
ID=({ID_BODY}) * | "(" ({ID_BODY}|{LINE_WS}|\\) * ")" | ":" ({ID_BODY}|{LINE_WS}|\\) * ":"

QUOTE=\"
CHAR={ALPHA} | {DIGIT} | "_" | {LINE_WS}
CHAR2=[^\n\r\f\\\"]
STRING={QUOTE}({CHAR2}|{LINE_WS}|{EOL})*{QUOTE}

%%

<YYINITIAL> {
    "@startuml"{LINE_WS}*{EOL} {yybegin(YYINITIAL); return PumlTypes.UML_START; }
    "@enduml"{LINE_WS}*{EOL}? {yybegin(YYINITIAL); return PumlTypes.UML_END; }

    "actor" {yybegin(YYINITIAL); return PumlTypes.ACTOR; }
    "usecase" {yybegin(YYINITIAL); return PumlTypes.USECASE; }


    "as" {yybegin(YYINITIAL); return PumlTypes.AS; }

     {ID} {yybegin(YYINITIAL); return PumlTypes.ID; }

     "->" {yybegin(YYINITIAL); return PumlTypes.ARROW; }

     {LINE_WS} {yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE; }
     {EOL} {yybegin(YYINITIAL); return PumlTypes.EOL; }

      [^] {yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER; }

}
