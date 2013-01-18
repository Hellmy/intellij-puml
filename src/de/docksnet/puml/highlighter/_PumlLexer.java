/* The following code was generated by JFlex 1.4.3 on 18.01.13 14:04 */

package de.docksnet.puml.highlighter;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.docksnet.puml.psi.BnfTypes;
import de.docksnet.puml.psi.BnfTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 18.01.13 14:04 from the specification file
 * <tt>C:/dev/projects/intellij/intellij-puml/src/de/docksnet/puml/highlighter/puml.flex</tt>
 */
public class _PumlLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\1\1\0\1\2\1\1\22\0\1\42\1\0\1\10"+
    "\5\0\1\4\1\6\6\0\12\3\1\7\5\0\1\31\32\3\1\0"+
    "\1\5\2\0\1\3\1\0\1\11\1\12\1\16\1\32\1\24\1\27"+
    "\1\40\1\41\1\26\1\30\1\35\1\20\1\21\1\23\1\17\1\22"+
    "\1\3\1\15\1\13\1\14\1\25\1\33\1\37\1\34\1\36\1\3"+
    "\57\0\1\3\12\0\1\3\4\0\1\3\5\0\27\3\1\0\37\3"+
    "\1\0\u01ca\3\4\0\14\3\16\0\5\3\7\0\1\3\1\0\1\3"+
    "\201\0\5\3\1\0\2\3\2\0\4\3\10\0\1\3\1\0\3\3"+
    "\1\0\1\3\1\0\24\3\1\0\123\3\1\0\213\3\10\0\236\3"+
    "\11\0\46\3\2\0\1\3\7\0\47\3\110\0\33\3\5\0\3\3"+
    "\55\0\53\3\25\0\12\3\4\0\2\3\1\0\143\3\1\0\1\3"+
    "\17\0\2\3\7\0\2\3\12\3\3\3\2\0\1\3\20\0\1\3"+
    "\1\0\36\3\35\0\131\3\13\0\1\3\16\0\12\3\41\3\11\0"+
    "\2\3\4\0\1\3\5\0\26\3\4\0\1\3\11\0\1\3\3\0"+
    "\1\3\27\0\31\3\253\0\66\3\3\0\1\3\22\0\1\3\7\0"+
    "\12\3\4\0\12\3\1\0\7\3\1\0\7\3\5\0\10\3\2\0"+
    "\2\3\2\0\26\3\1\0\7\3\1\0\1\3\3\0\4\3\3\0"+
    "\1\3\20\0\1\3\15\0\2\3\1\0\3\3\4\0\12\3\2\3"+
    "\23\0\6\3\4\0\2\3\2\0\26\3\1\0\7\3\1\0\2\3"+
    "\1\0\2\3\1\0\2\3\37\0\4\3\1\0\1\3\7\0\12\3"+
    "\2\0\3\3\20\0\11\3\1\0\3\3\1\0\26\3\1\0\7\3"+
    "\1\0\2\3\1\0\5\3\3\0\1\3\22\0\1\3\17\0\2\3"+
    "\4\0\12\3\25\0\10\3\2\0\2\3\2\0\26\3\1\0\7\3"+
    "\1\0\2\3\1\0\5\3\3\0\1\3\36\0\2\3\1\0\3\3"+
    "\4\0\12\3\1\0\1\3\21\0\1\3\1\0\6\3\3\0\3\3"+
    "\1\0\4\3\3\0\2\3\1\0\1\3\1\0\2\3\3\0\2\3"+
    "\3\0\3\3\3\0\14\3\26\0\1\3\25\0\12\3\25\0\10\3"+
    "\1\0\3\3\1\0\27\3\1\0\12\3\1\0\5\3\3\0\1\3"+
    "\32\0\2\3\6\0\2\3\4\0\12\3\25\0\10\3\1\0\3\3"+
    "\1\0\27\3\1\0\12\3\1\0\5\3\3\0\1\3\40\0\1\3"+
    "\1\0\2\3\4\0\12\3\1\0\2\3\22\0\10\3\1\0\3\3"+
    "\1\0\51\3\2\0\1\3\20\0\1\3\21\0\2\3\4\0\12\3"+
    "\12\0\6\3\5\0\22\3\3\0\30\3\1\0\11\3\1\0\1\3"+
    "\2\0\7\3\72\0\60\3\1\0\2\3\14\0\7\3\11\0\12\3"+
    "\47\0\2\3\1\0\1\3\2\0\2\3\1\0\1\3\2\0\1\3"+
    "\6\0\4\3\1\0\7\3\1\0\3\3\1\0\1\3\1\0\1\3"+
    "\2\0\2\3\1\0\4\3\1\0\2\3\11\0\1\3\2\0\5\3"+
    "\1\0\1\3\11\0\12\3\2\0\2\3\42\0\1\3\37\0\12\3"+
    "\26\0\10\3\1\0\44\3\33\0\5\3\163\0\53\3\24\0\1\3"+
    "\12\3\6\0\6\3\4\0\4\3\3\0\1\3\3\0\2\3\7\0"+
    "\3\3\4\0\15\3\14\0\1\3\1\0\12\3\6\0\46\3\12\0"+
    "\53\3\1\0\1\3\3\0\u0149\3\1\0\4\3\2\0\7\3\1\0"+
    "\1\3\1\0\4\3\2\0\51\3\1\0\4\3\2\0\41\3\1\0"+
    "\4\3\2\0\7\3\1\0\1\3\1\0\4\3\2\0\17\3\1\0"+
    "\71\3\1\0\4\3\2\0\103\3\45\0\20\3\20\0\125\3\14\0"+
    "\u026c\3\2\0\21\3\1\0\32\3\5\0\113\3\25\0\15\3\1\0"+
    "\4\3\16\0\22\3\16\0\22\3\16\0\15\3\1\0\3\3\17\0"+
    "\64\3\43\0\1\3\4\0\1\3\3\0\12\3\46\0\12\3\6\0"+
    "\130\3\10\0\51\3\1\0\1\3\5\0\106\3\12\0\35\3\51\0"+
    "\12\3\36\3\2\0\5\3\13\0\54\3\25\0\7\3\10\0\12\3"+
    "\46\0\27\3\11\0\65\3\53\0\12\3\6\0\12\3\15\0\1\3"+
    "\135\0\57\3\21\0\7\3\4\0\12\3\51\0\36\3\15\0\2\3"+
    "\12\3\6\0\46\3\32\0\44\3\34\0\12\3\3\0\3\3\12\3"+
    "\44\3\153\0\4\3\1\0\4\3\16\0\300\3\100\0\u0116\3\2\0"+
    "\6\3\2\0\46\3\2\0\6\3\2\0\10\3\1\0\1\3\1\0"+
    "\1\3\1\0\1\3\1\0\37\3\2\0\65\3\1\0\7\3\1\0"+
    "\1\3\3\0\3\3\1\0\7\3\3\0\4\3\2\0\6\3\4\0"+
    "\15\3\5\0\3\3\1\0\7\3\164\0\1\3\15\0\1\3\20\0"+
    "\15\3\145\0\1\3\4\0\1\3\2\0\12\3\1\0\1\3\3\0"+
    "\5\3\6\0\1\3\1\0\1\3\1\0\1\3\1\0\4\3\1\0"+
    "\13\3\2\0\4\3\5\0\5\3\4\0\1\3\64\0\2\3\u0a7b\0"+
    "\57\3\1\0\57\3\1\0\205\3\6\0\4\3\21\0\46\3\12\0"+
    "\66\3\11\0\1\3\20\0\27\3\11\0\7\3\1\0\7\3\1\0"+
    "\7\3\1\0\7\3\1\0\7\3\1\0\7\3\1\0\7\3\1\0"+
    "\7\3\120\0\1\3\u01d5\0\2\3\52\0\5\3\5\0\2\3\4\0"+
    "\126\3\6\0\3\3\1\0\132\3\1\0\4\3\5\0\51\3\3\0"+
    "\136\3\21\0\33\3\65\0\20\3\u0200\0\u19b6\3\112\0\u51cc\3\64\0"+
    "\u048d\3\103\0\56\3\2\0\u010d\3\3\0\20\3\12\3\2\3\24\0"+
    "\57\3\20\0\31\3\10\0\106\3\61\0\11\3\2\0\147\3\2\0"+
    "\4\3\1\0\2\3\16\0\12\3\120\0\10\3\1\0\3\3\1\0"+
    "\4\3\1\0\27\3\35\0\64\3\16\0\62\3\34\0\12\3\30\0"+
    "\6\3\3\0\1\3\4\0\12\3\34\3\12\0\27\3\31\0\35\3"+
    "\7\0\57\3\34\0\1\3\12\3\46\0\51\3\27\0\3\3\1\0"+
    "\10\3\4\0\12\3\6\0\27\3\3\0\1\3\5\0\60\3\1\0"+
    "\1\3\3\0\2\3\2\0\5\3\2\0\1\3\1\0\1\3\30\0"+
    "\3\3\43\0\6\3\2\0\6\3\2\0\6\3\11\0\7\3\1\0"+
    "\7\3\221\0\43\3\15\0\12\3\6\0\u2ba4\3\14\0\27\3\4\0"+
    "\61\3\u2104\0\u012e\3\2\0\76\3\2\0\152\3\46\0\7\3\14\0"+
    "\5\3\5\0\1\3\1\0\12\3\1\0\15\3\1\0\5\3\1\0"+
    "\1\3\1\0\2\3\1\0\2\3\1\0\154\3\41\0\u016b\3\22\0"+
    "\100\3\2\0\66\3\50\0\14\3\164\0\5\3\1\0\207\3\23\0"+
    "\12\3\7\0\32\3\6\0\32\3\13\0\131\3\3\0\6\3\2\0"+
    "\6\3\2\0\6\3\2\0\3\3\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\3\2\16\1\1\2\3\1"+
    "\1\0\1\1\2\0\1\4\1\1\1\5\23\1\1\6"+
    "\1\7\13\1\1\10\1\1\1\11\1\1\2\0\10\1"+
    "\1\12\3\1\1\13\3\1\1\14\3\1\1\15\7\1"+
    "\1\16\4\1\1\17\7\1\1\20\3\1\2\0\11\1"+
    "\1\21\4\1\1\22\1\23\1\0\12\1\1\24\1\25"+
    "\1\26\1\27\2\1\1\30\1\1\1\31\1\1\1\32"+
    "\1\33\4\1\2\0\1\34\4\1\1\35\1\1\1\36"+
    "\2\1\1\37\1\1\1\40\1\1\1\0\1\41\2\1"+
    "\1\42\3\1\1\43\6\1\1\44\4\1\2\0\2\1"+
    "\1\45\4\1\1\46\1\1\1\0\1\47\1\50\1\51"+
    "\2\1\1\52\1\53\10\1\1\54\2\0\2\1\1\55"+
    "\4\1\1\0\4\1\1\56\1\1\1\57\1\60\1\1"+
    "\1\61\1\0\1\62\1\1\1\63\1\64\1\65\2\1"+
    "\1\0\1\66\5\1\1\0\2\1\1\67\1\0\1\70"+
    "\1\71\1\1\1\72\1\73\1\74\1\1\1\75\1\0"+
    "\1\1\1\76\1\0\1\77\13\0\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[289];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\322\0\365"+
    "\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01c7\0\u01ea\0\u020d"+
    "\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc\0\u02df\0\u0302\0\u0325"+
    "\0\u0348\0\214\0\43\0\257\0\322\0\43\0\u036b\0\151"+
    "\0\u038e\0\u03b1\0\u03d4\0\u03f7\0\u041a\0\u043d\0\u0460\0\u0483"+
    "\0\u04a6\0\u04c9\0\u04ec\0\u050f\0\u0532\0\u0555\0\u0578\0\u059b"+
    "\0\u05be\0\u05e1\0\u0604\0\151\0\151\0\u0627\0\u064a\0\u066d"+
    "\0\u0690\0\u06b3\0\u06d6\0\u06f9\0\u071c\0\u073f\0\u0762\0\u0785"+
    "\0\151\0\u07a8\0\151\0\u07cb\0\u07ee\0\u0811\0\u0834\0\u0857"+
    "\0\u087a\0\u089d\0\u08c0\0\u08e3\0\u0906\0\u0929\0\151\0\u094c"+
    "\0\u096f\0\u0992\0\151\0\u09b5\0\u09d8\0\u09fb\0\u0a1e\0\u0a41"+
    "\0\u0a64\0\u0a87\0\151\0\u0aaa\0\u0acd\0\u0af0\0\u0b13\0\u0b36"+
    "\0\u0b59\0\u0b7c\0\151\0\u0b9f\0\u0bc2\0\u0be5\0\u0c08\0\u0c2b"+
    "\0\u0c4e\0\u0c71\0\u0c94\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20\0\u0d43"+
    "\0\u0d66\0\u0d89\0\u0dac\0\u0dcf\0\u0df2\0\u0e15\0\u0e38\0\u0e5b"+
    "\0\u0e7e\0\u0ea1\0\u0ec4\0\u0ee7\0\u0f0a\0\u0f2d\0\151\0\u0f50"+
    "\0\u0f73\0\u0f96\0\u0fb9\0\u0fdc\0\151\0\u0fff\0\u1022\0\u1045"+
    "\0\u1068\0\u108b\0\u10ae\0\u10d1\0\u10f4\0\u1117\0\u113a\0\u115d"+
    "\0\151\0\151\0\151\0\151\0\u1180\0\u11a3\0\151\0\u11c6"+
    "\0\151\0\u11e9\0\151\0\151\0\u120c\0\u122f\0\u1252\0\u1275"+
    "\0\u1298\0\u12bb\0\151\0\u12de\0\u1301\0\u1324\0\u1347\0\151"+
    "\0\u136a\0\151\0\u138d\0\u13b0\0\151\0\u13d3\0\151\0\u13f6"+
    "\0\u1419\0\151\0\u143c\0\u145f\0\151\0\u1482\0\u14a5\0\u14c8"+
    "\0\151\0\u14eb\0\u150e\0\u1531\0\u1554\0\u1577\0\u159a\0\151"+
    "\0\u15bd\0\u15e0\0\u1603\0\u1626\0\u1649\0\u166c\0\u168f\0\u16b2"+
    "\0\151\0\u16d5\0\u16f8\0\u171b\0\u173e\0\151\0\u1761\0\u1784"+
    "\0\151\0\151\0\151\0\u17a7\0\u17ca\0\151\0\151\0\u17ed"+
    "\0\u1810\0\u1833\0\u1856\0\u1879\0\u189c\0\u18bf\0\u18e2\0\151"+
    "\0\u1905\0\u1928\0\u194b\0\u196e\0\151\0\u1991\0\u19b4\0\u19d7"+
    "\0\u19fa\0\u1a1d\0\u1a40\0\u1a63\0\u1a86\0\u1aa9\0\151\0\u1acc"+
    "\0\151\0\151\0\u1aef\0\151\0\u1b12\0\43\0\u1b35\0\151"+
    "\0\151\0\151\0\u1b58\0\u1b7b\0\u1b9e\0\151\0\u1bc1\0\u1be4"+
    "\0\u1c07\0\u1c2a\0\u1c4d\0\u1c70\0\u1c93\0\u1cb6\0\151\0\u1cd9"+
    "\0\151\0\151\0\u1cfc\0\151\0\151\0\43\0\u1d1f\0\151"+
    "\0\u1d42\0\u1d65\0\151\0\u1d88\0\151\0\u1dab\0\u1dce\0\u1df1"+
    "\0\u1e14\0\u1e37\0\u1e5a\0\u1e7d\0\u1ea0\0\u1ec3\0\u1ee6\0\u1f09"+
    "\0\43";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[289];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\2\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\4"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\4\1\26"+
    "\1\27\5\4\1\30\1\31\1\3\44\0\2\3\37\0"+
    "\1\3\3\0\1\4\5\0\20\4\1\0\10\4\3\0"+
    "\2\32\1\0\1\32\1\33\2\0\20\32\1\0\11\32"+
    "\2\0\2\34\1\0\1\34\1\0\1\33\1\0\20\34"+
    "\1\0\11\34\5\35\1\0\2\35\1\36\32\35\3\0"+
    "\1\4\5\0\1\4\1\37\1\40\2\4\1\41\1\4"+
    "\1\42\4\4\1\43\3\4\1\0\10\4\4\0\1\4"+
    "\5\0\4\4\1\44\1\4\1\45\11\4\1\0\10\4"+
    "\4\0\1\4\5\0\3\4\1\46\14\4\1\0\3\4"+
    "\1\47\3\4\1\50\4\0\1\4\5\0\6\4\1\51"+
    "\6\4\1\52\2\4\1\0\10\4\4\0\1\4\5\0"+
    "\6\4\1\53\4\4\1\54\1\4\1\55\2\4\1\0"+
    "\10\4\4\0\1\4\5\0\4\4\1\56\1\4\1\57"+
    "\1\60\3\4\1\61\4\4\1\0\10\4\4\0\1\4"+
    "\5\0\1\4\1\62\7\4\1\63\1\64\3\4\1\65"+
    "\1\4\1\0\1\4\1\66\6\4\4\0\1\4\5\0"+
    "\6\4\1\67\4\4\1\70\1\4\1\71\2\4\1\0"+
    "\10\4\4\0\1\4\5\0\1\72\17\4\1\0\10\4"+
    "\4\0\1\4\5\0\1\73\5\4\1\74\4\4\1\75"+
    "\4\4\1\0\10\4\4\0\1\4\5\0\7\4\1\76"+
    "\2\4\1\77\5\4\1\0\10\4\4\0\1\4\5\0"+
    "\2\4\1\100\6\4\1\101\6\4\1\0\10\4\4\0"+
    "\1\4\5\0\12\4\1\102\3\4\1\103\1\4\1\0"+
    "\10\4\4\0\1\4\5\0\6\4\1\104\11\4\1\0"+
    "\10\4\14\0\1\105\10\0\1\106\21\0\1\4\5\0"+
    "\6\4\1\107\4\4\1\110\4\4\1\0\10\4\4\0"+
    "\1\4\5\0\4\4\1\111\13\4\1\0\10\4\4\0"+
    "\1\4\5\0\13\4\1\112\1\4\1\113\2\4\1\0"+
    "\10\4\4\0\1\4\5\0\2\4\1\114\15\4\1\0"+
    "\10\4\4\0\1\4\5\0\3\4\1\115\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\2\4\1\116\1\117\14\4"+
    "\1\0\10\4\4\0\1\4\5\0\3\4\1\120\14\4"+
    "\1\0\10\4\4\0\1\4\5\0\13\4\1\121\4\4"+
    "\1\0\10\4\4\0\1\4\5\0\3\4\1\122\14\4"+
    "\1\0\2\4\1\123\5\4\4\0\1\4\5\0\1\124"+
    "\17\4\1\0\10\4\4\0\1\4\5\0\15\4\1\125"+
    "\2\4\1\0\10\4\4\0\1\4\5\0\6\4\1\126"+
    "\11\4\1\0\10\4\4\0\1\4\5\0\11\4\1\127"+
    "\6\4\1\0\10\4\4\0\1\4\5\0\3\4\1\130"+
    "\14\4\1\0\10\4\4\0\1\4\5\0\3\4\1\131"+
    "\14\4\1\0\10\4\4\0\1\4\5\0\3\4\1\132"+
    "\12\4\1\133\1\4\1\0\10\4\4\0\1\4\5\0"+
    "\20\4\1\0\6\4\1\134\1\4\4\0\1\4\5\0"+
    "\13\4\1\135\1\4\1\136\2\4\1\0\10\4\4\0"+
    "\1\4\5\0\10\4\1\137\7\4\1\0\10\4\4\0"+
    "\1\4\5\0\1\140\17\4\1\0\10\4\4\0\1\4"+
    "\5\0\12\4\1\141\5\4\1\0\10\4\4\0\1\4"+
    "\5\0\17\4\1\142\1\0\10\4\4\0\1\4\5\0"+
    "\3\4\1\143\14\4\1\0\10\4\4\0\1\4\5\0"+
    "\13\4\1\144\4\4\1\0\10\4\4\0\1\4\5\0"+
    "\6\4\1\145\11\4\1\0\10\4\4\0\1\4\5\0"+
    "\16\4\1\146\1\4\1\0\10\4\4\0\1\4\5\0"+
    "\12\4\1\147\5\4\1\0\10\4\4\0\1\4\5\0"+
    "\4\4\1\150\1\151\12\4\1\0\6\4\1\152\1\4"+
    "\4\0\1\4\5\0\10\4\1\153\7\4\1\0\10\4"+
    "\4\0\1\4\5\0\3\4\1\154\14\4\1\0\10\4"+
    "\4\0\1\4\5\0\20\4\1\0\5\4\1\155\2\4"+
    "\4\0\1\4\5\0\2\4\1\156\15\4\1\0\10\4"+
    "\4\0\1\4\5\0\14\4\1\157\3\4\1\0\1\160"+
    "\7\4\4\0\1\4\5\0\13\4\1\161\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\3\4\1\162\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\6\4\1\163\11\4\1\0"+
    "\10\4\15\0\1\164\51\0\1\165\22\0\1\4\5\0"+
    "\20\4\1\0\5\4\1\166\2\4\4\0\1\4\5\0"+
    "\1\167\1\4\1\170\15\4\1\0\10\4\4\0\1\4"+
    "\5\0\6\4\1\171\11\4\1\0\10\4\4\0\1\4"+
    "\5\0\1\172\17\4\1\0\10\4\4\0\1\4\5\0"+
    "\20\4\1\0\1\173\7\4\4\0\1\4\5\0\3\4"+
    "\1\174\14\4\1\0\10\4\4\0\1\4\5\0\6\4"+
    "\1\175\6\4\1\176\2\4\1\0\10\4\4\0\1\4"+
    "\5\0\6\4\1\177\11\4\1\0\10\4\4\0\1\4"+
    "\5\0\6\4\1\200\11\4\1\0\10\4\4\0\1\4"+
    "\5\0\1\201\17\4\1\0\10\4\4\0\1\4\5\0"+
    "\3\4\1\202\14\4\1\0\10\4\4\0\1\4\5\0"+
    "\3\4\1\203\14\4\1\0\10\4\4\0\1\4\5\0"+
    "\12\4\1\204\5\4\1\0\10\4\4\0\1\4\5\0"+
    "\20\4\1\0\5\4\1\205\2\4\4\0\1\4\5\0"+
    "\20\4\1\0\10\4\1\206\3\0\1\4\5\0\7\4"+
    "\1\207\10\4\1\0\10\4\4\0\1\4\5\0\1\210"+
    "\17\4\1\0\10\4\4\0\1\4\5\0\14\4\1\211"+
    "\3\4\1\0\10\4\4\0\1\4\5\0\20\4\1\0"+
    "\7\4\1\212\4\0\1\4\5\0\1\213\17\4\1\0"+
    "\10\4\4\0\1\4\5\0\3\4\1\214\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\11\4\1\215\6\4\1\0"+
    "\10\4\4\0\1\4\5\0\2\4\1\216\15\4\1\0"+
    "\10\4\4\0\1\4\5\0\3\4\1\217\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\220\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\4\4\1\221\13\4\1\0"+
    "\10\4\4\0\1\4\5\0\11\4\1\222\6\4\1\0"+
    "\10\4\4\0\1\4\5\0\3\4\1\223\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\20\4\1\0\3\4\1\224"+
    "\4\4\4\0\1\4\5\0\3\4\1\225\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\20\4\1\0\3\4\1\226"+
    "\4\4\4\0\1\4\5\0\13\4\1\227\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\230\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\231\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\11\4\1\232\6\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\233\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\10\4\1\234\7\4\1\0"+
    "\10\4\4\0\1\4\5\0\15\4\1\235\2\4\1\0"+
    "\10\4\4\0\1\4\5\0\5\4\1\236\12\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\237\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\3\4\1\240\14\4\1\0"+
    "\10\4\12\0\1\241\63\0\1\242\13\0\1\4\5\0"+
    "\12\4\1\243\5\4\1\0\10\4\4\0\1\4\5\0"+
    "\5\4\1\244\12\4\1\0\10\4\4\0\1\4\5\0"+
    "\3\4\1\245\14\4\1\0\10\4\4\0\1\4\5\0"+
    "\14\4\1\246\3\4\1\0\10\4\4\0\1\4\5\0"+
    "\20\4\1\0\1\247\7\4\4\0\1\4\5\0\13\4"+
    "\1\250\4\4\1\0\10\4\4\0\1\4\5\0\4\4"+
    "\1\251\13\4\1\0\10\4\4\0\1\4\5\0\4\4"+
    "\1\252\13\4\1\0\10\4\4\0\1\4\5\0\20\4"+
    "\1\0\1\4\1\253\6\4\4\0\1\4\5\0\12\4"+
    "\1\254\5\4\1\0\10\4\4\0\1\4\5\0\20\4"+
    "\1\0\3\4\1\255\4\4\4\0\1\4\5\0\6\4"+
    "\1\256\11\4\1\0\10\4\4\0\1\4\5\0\13\4"+
    "\1\257\4\4\1\0\10\4\4\0\1\4\5\0\11\4"+
    "\1\260\6\4\1\0\10\4\15\0\1\261\31\0\1\4"+
    "\5\0\13\4\1\262\4\4\1\0\10\4\4\0\1\4"+
    "\5\0\3\4\1\263\14\4\1\0\10\4\4\0\1\4"+
    "\5\0\4\4\1\264\13\4\1\0\10\4\4\0\1\4"+
    "\5\0\3\4\1\265\14\4\1\0\10\4\4\0\1\4"+
    "\5\0\3\4\1\266\14\4\1\0\10\4\4\0\1\4"+
    "\5\0\15\4\1\267\2\4\1\0\10\4\4\0\1\4"+
    "\5\0\6\4\1\270\11\4\1\0\10\4\4\0\1\4"+
    "\5\0\2\4\1\271\15\4\1\0\10\4\4\0\1\4"+
    "\5\0\13\4\1\272\4\4\1\0\10\4\4\0\1\4"+
    "\5\0\5\4\1\273\12\4\1\0\10\4\4\0\1\4"+
    "\5\0\15\4\1\274\2\4\1\0\10\4\4\0\1\4"+
    "\5\0\1\275\17\4\1\0\10\4\4\0\1\4\5\0"+
    "\2\4\1\276\15\4\1\0\10\4\4\0\1\4\5\0"+
    "\1\277\17\4\1\0\10\4\4\0\1\4\5\0\16\4"+
    "\1\300\1\4\1\0\10\4\4\0\1\4\5\0\1\301"+
    "\17\4\1\0\10\4\4\0\1\4\5\0\4\4\1\302"+
    "\13\4\1\0\10\4\4\0\1\4\5\0\1\4\1\303"+
    "\11\4\1\304\4\4\1\0\10\4\16\0\1\305\52\0"+
    "\1\306\20\0\1\4\5\0\3\4\1\307\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\4\4\1\310\13\4\1\0"+
    "\10\4\4\0\1\4\5\0\11\4\1\311\6\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\312\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\1\313\17\4\1\0\10\4"+
    "\4\0\1\4\5\0\1\314\17\4\1\0\10\4\4\0"+
    "\1\4\5\0\14\4\1\315\3\4\1\0\10\4\4\0"+
    "\1\4\5\0\10\4\1\316\7\4\1\0\10\4\4\0"+
    "\1\4\5\0\1\317\17\4\1\0\10\4\20\0\1\320"+
    "\26\0\1\4\5\0\13\4\1\321\4\4\1\0\10\4"+
    "\4\0\1\4\5\0\12\4\1\322\5\4\1\0\10\4"+
    "\4\0\1\4\5\0\13\4\1\323\4\4\1\0\10\4"+
    "\4\0\1\4\5\0\5\4\1\324\12\4\1\0\10\4"+
    "\4\0\1\4\5\0\12\4\1\325\5\4\1\0\10\4"+
    "\4\0\1\4\5\0\4\4\1\326\13\4\1\0\10\4"+
    "\4\0\1\4\5\0\3\4\1\327\14\4\1\0\10\4"+
    "\4\0\1\4\5\0\3\4\1\330\1\4\1\331\12\4"+
    "\1\0\10\4\4\0\1\4\5\0\20\4\1\0\6\4"+
    "\1\332\1\4\4\0\1\4\5\0\11\4\1\333\6\4"+
    "\1\0\10\4\4\0\1\4\5\0\20\4\1\0\6\4"+
    "\1\334\1\4\4\0\1\4\5\0\2\4\1\335\15\4"+
    "\1\0\10\4\4\0\1\4\5\0\16\4\1\336\1\4"+
    "\1\0\10\4\4\0\1\4\5\0\6\4\1\337\11\4"+
    "\1\0\10\4\4\0\1\4\5\0\4\4\1\340\13\4"+
    "\1\0\10\4\15\0\1\341\47\0\1\342\24\0\1\4"+
    "\5\0\15\4\1\343\2\4\1\0\10\4\4\0\1\4"+
    "\5\0\6\4\1\344\11\4\1\0\10\4\4\0\1\4"+
    "\5\0\4\4\1\345\13\4\1\0\10\4\4\0\1\4"+
    "\5\0\5\4\1\346\12\4\1\0\10\4\4\0\1\4"+
    "\5\0\3\4\1\347\14\4\1\0\10\4\4\0\1\4"+
    "\5\0\10\4\1\350\7\4\1\0\10\4\4\0\1\4"+
    "\5\0\4\4\1\351\13\4\1\0\10\4\43\0\1\352"+
    "\3\0\1\4\5\0\1\353\17\4\1\0\10\4\4\0"+
    "\1\4\5\0\13\4\1\354\4\4\1\0\10\4\4\0"+
    "\1\4\5\0\15\4\1\355\2\4\1\0\10\4\4\0"+
    "\1\4\5\0\15\4\1\356\2\4\1\0\10\4\4\0"+
    "\1\4\5\0\13\4\1\357\4\4\1\0\10\4\4\0"+
    "\1\4\5\0\1\360\17\4\1\0\10\4\4\0\1\4"+
    "\5\0\13\4\1\361\4\4\1\0\10\4\4\0\1\4"+
    "\5\0\13\4\1\362\4\4\1\0\10\4\4\0\1\4"+
    "\5\0\1\363\17\4\1\0\10\4\4\0\1\4\5\0"+
    "\20\4\1\0\2\4\1\364\5\4\26\0\1\365\35\0"+
    "\1\366\25\0\1\4\5\0\20\4\1\0\1\4\1\367"+
    "\6\4\4\0\1\4\5\0\20\4\1\0\4\4\1\370"+
    "\3\4\4\0\1\4\5\0\3\4\1\371\14\4\1\0"+
    "\10\4\4\0\1\4\5\0\13\4\1\372\4\4\1\0"+
    "\10\4\4\0\1\4\5\0\1\4\1\373\16\4\1\0"+
    "\10\4\4\0\1\4\5\0\1\374\17\4\1\0\10\4"+
    "\13\0\1\375\33\0\1\4\5\0\7\4\1\376\10\4"+
    "\1\0\10\4\4\0\1\4\5\0\12\4\1\377\5\4"+
    "\1\0\10\4\4\0\1\4\5\0\6\4\1\u0100\11\4"+
    "\1\0\10\4\4\0\1\4\5\0\11\4\1\u0101\6\4"+
    "\1\0\10\4\4\0\1\4\5\0\5\4\1\u0102\12\4"+
    "\1\0\10\4\4\0\1\4\5\0\5\4\1\u0103\12\4"+
    "\1\0\10\4\22\0\1\u0104\24\0\1\4\5\0\1\u0105"+
    "\17\4\1\0\10\4\4\0\1\4\5\0\13\4\1\u0106"+
    "\4\4\1\0\10\4\4\0\1\4\5\0\10\4\1\u0107"+
    "\7\4\1\0\10\4\20\0\1\u0108\26\0\1\4\5\0"+
    "\3\4\1\u0109\14\4\1\0\10\4\4\0\1\4\5\0"+
    "\12\4\1\u010a\5\4\1\0\10\4\4\0\1\4\5\0"+
    "\1\u010b\17\4\1\0\10\4\4\0\1\4\5\0\13\4"+
    "\1\u010c\4\4\1\0\10\4\4\0\1\4\5\0\13\4"+
    "\1\u010d\4\4\1\0\10\4\21\0\1\u010e\25\0\1\4"+
    "\5\0\3\4\1\u010f\14\4\1\0\10\4\4\0\1\4"+
    "\5\0\4\4\1\u0110\13\4\1\0\10\4\15\0\1\u0111"+
    "\31\0\1\4\5\0\12\4\1\u0112\5\4\1\0\10\4"+
    "\4\0\1\4\5\0\13\4\1\u0113\4\4\1\0\10\4"+
    "\15\0\1\u0114\31\0\1\4\5\0\3\4\1\u0115\14\4"+
    "\1\0\10\4\20\0\1\u0116\44\0\1\u0117\63\0\1\u0118"+
    "\32\0\1\u0119\36\0\1\u011a\31\0\1\u011b\51\0\1\u011c"+
    "\34\0\1\u011d\40\0\1\u011e\54\0\1\u011f\33\0\1\u0120"+
    "\46\0\1\u0121\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7980];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\27\1\1\0\1\11\2\0\1\11\46\1"+
    "\2\0\55\1\2\0\20\1\1\0\32\1\2\0\16\1"+
    "\1\0\23\1\2\0\11\1\1\0\20\1\2\0\7\1"+
    "\1\0\12\1\1\0\1\11\6\1\1\0\6\1\1\0"+
    "\3\1\1\0\5\1\1\11\2\1\1\0\2\1\1\0"+
    "\1\1\13\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[289];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private int yyline;
    private int yycolumn;

    public IElementType newSym(String debug) {
        return new BnfTokenType(yyline, yycolumn, debug);
    }


  public _PumlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _PumlLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1652) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL.charAt(zzCurrentPosL)) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL.charAt(zzMarkedPosL) == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL.charAt(zzMarkedPosL) == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_AS;
          }
        case 65: break;
        case 6: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ON;
          }
        case 66: break;
        case 43: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OBJECT;
          }
        case 67: break;
        case 38: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_BOTTOM;
          }
        case 68: break;
        case 37: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_GROUP;
          }
        case 69: break;
        case 60: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_AT__STARTUML;
          }
        case 70: break;
        case 59: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_INTERFACE;
          }
        case 71: break;
        case 45: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_HEADER;
          }
        case 72: break;
        case 42: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_CENTER;
          }
        case 73: break;
        case 15: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_PAR;
          }
        case 74: break;
        case 25: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_NOTE;
          }
        case 75: break;
        case 34: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_RIGHT;
          }
        case 76: break;
        case 62: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_DEACTIVATE;
          }
        case 77: break;
        case 50: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_AT__ENDUML;
          }
        case 78: break;
        case 29: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_HIDE;
          }
        case 79: break;
        case 35: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_CLASS;
          }
        case 80: break;
        case 48: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_USECASE;
          }
        case 81: break;
        case 30: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ACTOR;
          }
        case 82: break;
        case 49: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_FOOTBOX;
          }
        case 83: break;
        case 20: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OVER;
          }
        case 84: break;
        case 36: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ENDIF;
          }
        case 85: break;
        case 22: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_LEFT;
          }
        case 86: break;
        case 51: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_DESTROY;
          }
        case 87: break;
        case 17: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ALSO;
          }
        case 88: break;
        case 14: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OPT;
          }
        case 89: break;
        case 24: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_PAGE;
          }
        case 90: break;
        case 31: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_BREAK;
          }
        case 91: break;
        case 64: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_TOP_TO_BOTTOM_DIRECTION;
          }
        case 92: break;
        case 39: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ROTATE;
          }
        case 93: break;
        case 9: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_IF;
          }
        case 94: break;
        case 57: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_PARTITION;
          }
        case 95: break;
        case 13: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_REF;
          }
        case 96: break;
        case 27: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ENUM;
          }
        case 97: break;
        case 18: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_SKIN;
          }
        case 98: break;
        case 26: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ELSE;
          }
        case 99: break;
        case 56: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_COMPONENT;
          }
        case 100: break;
        case 28: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_DOWN;
          }
        case 101: break;
        case 19: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_SHOW;
          }
        case 102: break;
        case 3: 
          { yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 103: break;
        case 52: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ABSTRACT;
          }
        case 104: break;
        case 16: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_END;
          }
        case 105: break;
        case 21: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_LOOP;
          }
        case 106: break;
        case 7: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_OF;
          }
        case 107: break;
        case 32: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_STATE;
          }
        case 108: break;
        case 40: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_RETURN;
          }
        case 109: break;
        case 2: 
          { yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 110: break;
        case 8: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_UP;
          }
        case 111: break;
        case 47: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_NEWPAGE;
          }
        case 112: break;
        case 61: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_AUTONUMBER;
          }
        case 113: break;
        case 11: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_BOX;
          }
        case 114: break;
        case 12: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_TOP;
          }
        case 115: break;
        case 63: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_PARTICIPANT;
          }
        case 116: break;
        case 4: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_STRING;
          }
        case 117: break;
        case 54: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_CRITICAL;
          }
        case 118: break;
        case 58: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_NAMESPACE;
          }
        case 119: break;
        case 53: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ACTIVATE;
          }
        case 120: break;
        case 46: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_PACKAGE;
          }
        case 121: break;
        case 33: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_TITLE;
          }
        case 122: break;
        case 23: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_LINK;
          }
        case 123: break;
        case 41: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_CREATE;
          }
        case 124: break;
        case 44: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_FOOTER;
          }
        case 125: break;
        case 55: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_SKINPARAM;
          }
        case 126: break;
        case 1: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ID;
          }
        case 127: break;
        case 10: 
          { yybegin(YYINITIAL); return BnfTypes.BNF_ALT;
          }
        case 128: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
