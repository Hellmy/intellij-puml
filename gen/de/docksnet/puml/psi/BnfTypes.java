// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface BnfTypes {
    IElementType BNF_STRING = new BnfTokenType("string");

    IElementType BNF_ABSTRACT = new BnfTokenType("abstract");
    IElementType BNF_ACTOR = new BnfTokenType("actor");
    IElementType BNF_CLASS = new BnfTokenType("class");
    IElementType BNF_COMPONENT = new BnfTokenType("component");
    IElementType BNF_ENUM = new BnfTokenType("enum");
    IElementType BNF_INTERFACE = new BnfTokenType("interface");
    IElementType BNF_OBJECT = new BnfTokenType("object");
    IElementType BNF_PARTICIPANT = new BnfTokenType("participant");
    IElementType BNF_STATE = new BnfTokenType("state");
    IElementType BNF_USECASE = new BnfTokenType("usecase");


    IElementType BNF_AT__ENDUML = new BnfTokenType("@enduml");
    IElementType BNF_AT__STARTUML = new BnfTokenType("@startuml");
    IElementType BNF_ACTIVATE = new BnfTokenType("activate");
    IElementType BNF_ALSO = new BnfTokenType("also");
    IElementType BNF_ALT = new BnfTokenType("alt");
    IElementType BNF_AS = new BnfTokenType("as");
    IElementType BNF_AUTONUMBER = new BnfTokenType("autonumber");
    IElementType BNF_BOTTOM = new BnfTokenType("bottom");
    IElementType BNF_BOX = new BnfTokenType("box");
    IElementType BNF_BREAK = new BnfTokenType("break");
    IElementType BNF_CENTER = new BnfTokenType("center");
    IElementType BNF_CREATE = new BnfTokenType("create");
    IElementType BNF_CRITICAL = new BnfTokenType("critical");
    IElementType BNF_DEACTIVATE = new BnfTokenType("deactivate");
    IElementType BNF_DESTROY = new BnfTokenType("destroy");
    IElementType BNF_DOWN = new BnfTokenType("down");
    IElementType BNF_ELSE = new BnfTokenType("else");
    IElementType BNF_END = new BnfTokenType("end");
    IElementType BNF_ENDIF = new BnfTokenType("endif");
    IElementType BNF_FOOTBOX = new BnfTokenType("footbox");
    IElementType BNF_FOOTER = new BnfTokenType("footer");
    IElementType BNF_GROUP = new BnfTokenType("group");
    IElementType BNF_HEADER = new BnfTokenType("header");
    IElementType BNF_HIDE = new BnfTokenType("hide");
    IElementType BNF_IF = new BnfTokenType("if");
    IElementType BNF_LEFT = new BnfTokenType("left");
    IElementType BNF_LINK = new BnfTokenType("link");
    IElementType BNF_LOOP = new BnfTokenType("loop");
    IElementType BNF_NAMESPACE = new BnfTokenType("namespace");
    IElementType BNF_NEWPAGE = new BnfTokenType("newpage");
    IElementType BNF_NOTE = new BnfTokenType("note");
    IElementType BNF_OF = new BnfTokenType("of");
    IElementType BNF_ON = new BnfTokenType("on");
    IElementType BNF_OPT = new BnfTokenType("opt");
    IElementType BNF_OVER = new BnfTokenType("over");
    IElementType BNF_PACKAGE = new BnfTokenType("package");
    IElementType BNF_PAGE = new BnfTokenType("page");
    IElementType BNF_PAR = new BnfTokenType("par");
    IElementType BNF_PARTITION = new BnfTokenType("partition");
    IElementType BNF_REF = new BnfTokenType("ref");
    IElementType BNF_RETURN = new BnfTokenType("return");
    IElementType BNF_RIGHT = new BnfTokenType("right");
    IElementType BNF_ROTATE = new BnfTokenType("rotate");
    IElementType BNF_SHOW = new BnfTokenType("show");
    IElementType BNF_SKIN = new BnfTokenType("skin");
    IElementType BNF_SKINPARAM = new BnfTokenType("skinparam");
    IElementType BNF_TITLE = new BnfTokenType("title");
    IElementType BNF_TOP = new BnfTokenType("top");
    IElementType BNF_TOP_TO_BOTTOM_DIRECTION = new BnfTokenType("top to bottom direction");
    IElementType BNF_UP = new BnfTokenType("up");

    IElementType BNF_ID = new BnfTokenType("id");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
