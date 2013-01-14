// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.parser;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static de.docksnet.puml.psi.BnfTypes.*;
import static de.docksnet.puml.parser.GrammarParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PumlParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("de.docksnet.puml.parser.PumlParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == BNF_ACTOR_DEF) {
      result_ = actor_def(builder_, level_ + 1);
    }
    else if (root_ == BNF_FILE_BODY) {
      result_ = file_body(builder_, level_ + 1);
    }
    else if (root_ == BNF_LINK_DEF) {
      result_ = link_def(builder_, level_ + 1);
    }
    else if (root_ == BNF_UML_BODY) {
      result_ = uml_body(builder_, level_ + 1);
    }
    else {
      Marker marker_ = builder_.mark();
      result_ = parse_root_(root_, builder_, level_);
      while (builder_.getTokenType() != null) {
        builder_.advanceLexer();
      }
      marker_.done(root_);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // actor id
  public static boolean actor_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "actor_def")) return false;
    if (!nextTokenIs(builder_, BNF_ACTOR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeTokens(builder_, 1, BNF_ACTOR, BNF_ID);
    pinned_ = result_; // pin = 1
    if (result_ || pinned_) {
      marker_.done(BNF_ACTOR_DEF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // '@startuml' uml_body '@enduml'
  public static boolean file_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_body")) return false;
    if (!nextTokenIs(builder_, BNF_START_UML)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeToken(builder_, BNF_START_UML);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, uml_body(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, BNF_END_UML) && result_;
    if (result_ || pinned_) {
      marker_.done(BNF_FILE_BODY);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // actor_def | link_def
  static boolean line(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "line")) return false;
    if (!nextTokenIs(builder_, BNF_ACTOR) && !nextTokenIs(builder_, BNF_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = actor_def(builder_, level_ + 1);
    if (!result_) result_ = link_def(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // id '--' id
  public static boolean link_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "link_def")) return false;
    if (!nextTokenIs(builder_, BNF_ID)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeToken(builder_, BNF_ID);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, "--"));
    result_ = pinned_ && consumeToken(builder_, BNF_ID) && result_;
    if (result_ || pinned_) {
      marker_.done(BNF_LINK_DEF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // file_body
  static boolean root(PsiBuilder builder_, int level_) {
    return file_body(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // line *
  public static boolean uml_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uml_body")) return false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<uml body>");
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!line(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "uml_body");
        break;
      }
      offset_ = next_offset_;
    }
    marker_.done(BNF_UML_BODY);
    exitErrorRecordingSection(builder_, level_, true, false, _SECTION_GENERAL_, null);
    return true;
  }

}
