// This is a generated file. Not intended for manual editing.
package de.docksnet.puml.parser;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static de.docksnet.puml.psi.PumlTypes.*;
import static de.docksnet.puml.GeneratedParserUtilBase.*;
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
    if (root_ == ACTOR_DEF) {
      result_ = actorDef(builder_, level_ + 1);
    }
    else if (root_ == USECASE_DEF) {
      result_ = usecaseDef(builder_, level_ + 1);
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
    return pumlFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ACTOR ID AS ID EOL
  public static boolean actorDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "actorDef")) return false;
    if (!nextTokenIs(builder_, ACTOR)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, ACTOR, ID, AS, ID, EOL);
    if (result_) {
      marker_.done(ACTOR_DEF);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // (actorDef|usecaseDef|COMMENT|EOL)
  static boolean entry_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "entry_")) return false;
    return entry__0(builder_, level_ + 1);
  }

  // actorDef|usecaseDef|COMMENT|EOL
  private static boolean entry__0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "entry__0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = actorDef(builder_, level_ + 1);
    if (!result_) result_ = usecaseDef(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = consumeToken(builder_, EOL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // UML_START entry_* UML_END
  static boolean pumlFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pumlFile")) return false;
    if (!nextTokenIs(builder_, UML_START)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, UML_START);
    result_ = result_ && pumlFile_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, UML_END);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // entry_*
  private static boolean pumlFile_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pumlFile_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!entry_(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "pumlFile_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // USECASE ID AS ID EOL
  public static boolean usecaseDef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "usecaseDef")) return false;
    if (!nextTokenIs(builder_, USECASE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, USECASE, ID, AS, ID, EOL);
    if (result_) {
      marker_.done(USECASE_DEF);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

}
