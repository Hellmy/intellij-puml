package de.docksnet.puml.highlighter;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.BnfTypes;
import de.docksnet.puml.psi.BnfTokenType;

%%

%public
%class _PumlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%line
%column
%eof{ return;
%eof}

%{

    private int yyline;
    private int yycolumn;

    public IElementType newSym(String debug) {
        return new BnfTokenType(yyline, yycolumn, debug);
    }
%}

EOL=\r|\n|\r\n
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

ALPHA=[:letter:]
DIGIT=[:digit:]

ID_BODY={ALPHA} | {DIGIT} | "_"
ID=({ID_BODY}) *

QUOTE=\"
CHAR={ALPHA} | {DIGIT} | "_" | {LINE_WS}
STRING={QUOTE}({ALPHA}|{DIGIT}|{LINE_WS}|{EOL})*{QUOTE}

%%

<YYINITIAL> {
  {WHITE_SPACE} {yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE; }

    "abstract" {yybegin(YYINITIAL); return BnfTypes.BNF_ABSTRACT; }
    "actor" {yybegin(YYINITIAL); return BnfTypes.BNF_ACTOR; }
    "class" {yybegin(YYINITIAL); return BnfTypes.BNF_CLASS; }
    "component" {yybegin(YYINITIAL); return BnfTypes.BNF_COMPONENT; }
    "enum" {yybegin(YYINITIAL); return BnfTypes.BNF_ENUM; }
    "interface" {yybegin(YYINITIAL); return BnfTypes.BNF_INTERFACE; }
    "object" {yybegin(YYINITIAL); return BnfTypes.BNF_OBJECT; }
    "participant" {yybegin(YYINITIAL); return BnfTypes.BNF_PARTICIPANT; }
    "state" {yybegin(YYINITIAL); return BnfTypes.BNF_STATE; }
    "usecase" {yybegin(YYINITIAL); return BnfTypes.BNF_USECASE; }


    "@enduml" {yybegin(YYINITIAL); return BnfTypes.BNF_AT__ENDUML; }
    "@startuml" {yybegin(YYINITIAL); return BnfTypes.BNF_AT__STARTUML; }
    "activate" {yybegin(YYINITIAL); return BnfTypes.BNF_ACTIVATE; }
    "also" {yybegin(YYINITIAL); return BnfTypes.BNF_ALSO; }
    "alt" {yybegin(YYINITIAL); return BnfTypes.BNF_ALT; }
    "as" {yybegin(YYINITIAL); return BnfTypes.BNF_AS; }
    "autonumber" {yybegin(YYINITIAL); return BnfTypes.BNF_AUTONUMBER; }
    "bottom" {yybegin(YYINITIAL); return BnfTypes.BNF_BOTTOM; }
    "box" {yybegin(YYINITIAL); return BnfTypes.BNF_BOX; }
    "break" {yybegin(YYINITIAL); return BnfTypes.BNF_BREAK; }
    "center" {yybegin(YYINITIAL); return BnfTypes.BNF_CENTER; }
    "create" {yybegin(YYINITIAL); return BnfTypes.BNF_CREATE; }
    "critical" {yybegin(YYINITIAL); return BnfTypes.BNF_CRITICAL; }
    "deactivate" {yybegin(YYINITIAL); return BnfTypes.BNF_DEACTIVATE; }
    "destroy" {yybegin(YYINITIAL); return BnfTypes.BNF_DESTROY; }
    "down" {yybegin(YYINITIAL); return BnfTypes.BNF_DOWN; }
    "else" {yybegin(YYINITIAL); return BnfTypes.BNF_ELSE; }
    "end" {yybegin(YYINITIAL); return BnfTypes.BNF_END; }
    "endif" {yybegin(YYINITIAL); return BnfTypes.BNF_ENDIF; }
    "footbox" {yybegin(YYINITIAL); return BnfTypes.BNF_FOOTBOX; }
    "footer" {yybegin(YYINITIAL); return BnfTypes.BNF_FOOTER; }
    "group" {yybegin(YYINITIAL); return BnfTypes.BNF_GROUP; }
    "header" {yybegin(YYINITIAL); return BnfTypes.BNF_HEADER; }
    "hide" {yybegin(YYINITIAL); return BnfTypes.BNF_HIDE; }
    "if" {yybegin(YYINITIAL); return BnfTypes.BNF_IF; }
    "left" {yybegin(YYINITIAL); return BnfTypes.BNF_LEFT; }
    "link" {yybegin(YYINITIAL); return BnfTypes.BNF_LINK; }
    "loop" {yybegin(YYINITIAL); return BnfTypes.BNF_LOOP; }
    "namespace" {yybegin(YYINITIAL); return BnfTypes.BNF_NAMESPACE; }
    "newpage" {yybegin(YYINITIAL); return BnfTypes.BNF_NEWPAGE; }
    "note" {yybegin(YYINITIAL); return BnfTypes.BNF_NOTE; }
    "of" {yybegin(YYINITIAL); return BnfTypes.BNF_OF; }
    "on" {yybegin(YYINITIAL); return BnfTypes.BNF_ON; }
    "opt" {yybegin(YYINITIAL); return BnfTypes.BNF_OPT; }
    "over" {yybegin(YYINITIAL); return BnfTypes.BNF_OVER; }
    "package" {yybegin(YYINITIAL); return BnfTypes.BNF_PACKAGE; }
    "page" {yybegin(YYINITIAL); return BnfTypes.BNF_PAGE; }
    "par" {yybegin(YYINITIAL); return BnfTypes.BNF_PAR; }
    "partition" {yybegin(YYINITIAL); return BnfTypes.BNF_PARTITION; }
    "ref" {yybegin(YYINITIAL); return BnfTypes.BNF_REF; }
    "return" {yybegin(YYINITIAL); return BnfTypes.BNF_RETURN; }
    "right" {yybegin(YYINITIAL); return BnfTypes.BNF_RIGHT; }
    "rotate" {yybegin(YYINITIAL); return BnfTypes.BNF_ROTATE; }
    "show" {yybegin(YYINITIAL); return BnfTypes.BNF_SHOW; }
    "skin" {yybegin(YYINITIAL); return BnfTypes.BNF_SKIN; }
    "skinparam" {yybegin(YYINITIAL); return BnfTypes.BNF_SKINPARAM; }
    "title" {yybegin(YYINITIAL); return BnfTypes.BNF_TITLE; }
    "top" {yybegin(YYINITIAL); return BnfTypes.BNF_TOP; }
    "top to bottom direction" {yybegin(YYINITIAL); return BnfTypes.BNF_TOP_TO_BOTTOM_DIRECTION; }
    "up" {yybegin(YYINITIAL); return BnfTypes.BNF_UP; }


     {STRING} {yybegin(YYINITIAL); return BnfTypes.BNF_STRING; }

     {ID} {yybegin(YYINITIAL); return newSym("id"); }

      [^] {yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER; }

}
