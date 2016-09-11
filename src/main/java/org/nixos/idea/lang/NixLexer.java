/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.nixos.idea.lang;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import java.util.Stack;
import static org.nixos.idea.psi.NixTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Nix.flex</tt>
 */
public class NixLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int IND_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\64\1\50\1\24\1\4\1\22\1\34\1\46\1\25\1\36"+
    "\1\37\1\6\1\51\1\52\1\21\1\26\1\5\12\7\1\33\1\45\1\27\1\35\1\30\1\43\1\44"+
    "\32\32\1\41\1\0\1\42\1\0\1\20\1\0\1\15\1\32\1\57\1\32\1\13\1\14\1\32\1\54"+
    "\1\53\2\32\1\16\1\62\1\55\1\60\1\63\1\61\1\11\1\17\1\10\1\12\1\32\1\56\3\32"+
    "\1\23\1\47\1\40\1\31\201\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\5\1\6\10\7"+
    "\1\10\1\11\1\12\1\13\1\1\1\14\1\15\1\16"+
    "\1\1\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\1\1\31\1\32\1\33\3\7"+
    "\1\34\1\35\1\36\1\37\1\35\1\40\1\41\1\0"+
    "\1\42\2\0\2\7\2\0\6\7\1\43\1\44\1\45"+
    "\2\0\1\46\1\47\1\0\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\2\7\1\57\1\0\1\60\2\0"+
    "\1\61\1\62\1\0\1\7\1\63\1\7\1\64\4\7"+
    "\1\65\1\45\1\0\1\66\1\0\1\67\1\70\3\7"+
    "\1\71\1\72\1\37\1\73\1\74\1\75\1\7\1\76"+
    "\3\7\1\77\5\7\1\100\1\7\1\101\1\102\1\103"+
    "\1\104\1\105";

  private static int [] zzUnpackAction() {
    int [] result = new int[132];
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
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\237"+
    "\0\u0173\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6"+
    "\0\u031b\0\u0350\0\u0385\0\237\0\237\0\u03ba\0\u03ef\0\u0424"+
    "\0\u0459\0\u048e\0\237\0\u04c3\0\237\0\237\0\237\0\237"+
    "\0\237\0\237\0\237\0\237\0\u04f8\0\u052d\0\u0562\0\u0597"+
    "\0\237\0\u05cc\0\u0601\0\u0636\0\u066b\0\u06a0\0\237\0\u06d5"+
    "\0\u070a\0\u073f\0\237\0\u0774\0\u07a9\0\u07de\0\u0813\0\u0848"+
    "\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb\0\u09f0"+
    "\0\u0a25\0\237\0\237\0\u0a5a\0\u0a8f\0\u0ac4\0\237\0\237"+
    "\0\u0af9\0\237\0\237\0\237\0\237\0\u0813\0\u0212\0\u0b2e"+
    "\0\u0b63\0\u0b98\0\u0212\0\u0bcd\0\237\0\u0c02\0\u0c37\0\237"+
    "\0\u0c6c\0\u0ca1\0\u0cd6\0\u08e7\0\u0d0b\0\u0212\0\u0d40\0\u0d75"+
    "\0\u0daa\0\u0ddf\0\u0212\0\237\0\u0a5a\0\u0813\0\u0e14\0\237"+
    "\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\237\0\237\0\237\0\237"+
    "\0\u0212\0\u0212\0\u0f1d\0\u0212\0\u0f52\0\u0f87\0\u0fbc\0\u0212"+
    "\0\u0ff1\0\u1026\0\u105b\0\u1090\0\u10c5\0\u0212\0\u10fa\0\u112f"+
    "\0\u1164\0\u0212\0\u0212\0\u0212";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[132];
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
    "\1\4\3\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\14\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\14\1\33\1\4\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\2\14\1\53\1\14\1\54\3\14\1\5"+
    "\22\55\1\56\1\55\1\57\40\55\22\60\1\61\2\60"+
    "\1\62\37\60\66\0\3\5\60\0\1\5\1\6\2\0"+
    "\62\6\5\0\1\63\1\64\13\65\4\0\1\65\3\0"+
    "\1\65\16\0\1\65\1\0\11\65\6\0\1\66\1\0"+
    "\1\11\12\67\4\0\1\67\3\0\1\67\16\0\1\67"+
    "\1\0\11\67\6\0\1\66\1\0\2\14\1\70\6\14"+
    "\1\21\1\14\3\0\1\71\1\72\3\0\1\14\1\73"+
    "\15\0\1\72\1\0\1\14\1\74\7\14\6\0\1\66"+
    "\1\0\4\14\1\75\4\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\11\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\7\14\1\76\1\14\1\21\1\14"+
    "\3\0\1\71\1\72\3\0\1\14\1\73\15\0\1\72"+
    "\1\0\11\14\6\0\1\66\1\0\6\14\1\77\2\14"+
    "\1\21\1\14\3\0\1\71\1\72\3\0\1\14\1\73"+
    "\15\0\1\72\1\0\11\14\6\0\1\66\1\0\10\14"+
    "\1\100\1\21\1\14\3\0\1\71\1\72\3\0\1\14"+
    "\1\73\15\0\1\72\1\0\11\14\6\0\1\66\1\0"+
    "\4\14\1\101\4\14\1\21\1\14\3\0\1\71\1\72"+
    "\3\0\1\14\1\73\15\0\1\72\1\0\11\14\6\0"+
    "\1\66\1\0\13\21\3\0\1\71\1\67\3\0\1\21"+
    "\16\0\1\67\1\0\11\21\6\0\1\66\1\0\13\67"+
    "\4\0\1\67\1\0\1\102\1\0\1\67\16\0\1\67"+
    "\1\0\11\67\24\0\1\103\66\0\1\104\44\0\1\66"+
    "\1\0\13\67\4\0\1\105\3\0\1\67\16\0\1\67"+
    "\1\0\11\67\10\0\13\106\4\0\1\106\3\0\1\106"+
    "\2\0\1\107\13\0\1\106\1\0\11\106\36\0\1\110"+
    "\34\0\1\111\114\0\1\112\75\0\1\113\65\0\1\114"+
    "\52\0\1\115\34\0\1\66\1\0\13\67\4\0\1\67"+
    "\3\0\1\67\16\0\1\116\1\0\11\67\6\0\1\66"+
    "\1\0\5\14\1\117\3\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\2\14"+
    "\1\120\4\14\1\121\1\14\6\0\1\66\1\0\11\14"+
    "\1\21\1\14\3\0\1\71\1\72\3\0\1\14\1\73"+
    "\15\0\1\72\1\0\1\122\10\14\6\0\1\66\1\0"+
    "\2\14\1\123\6\14\1\21\1\14\3\0\1\71\1\72"+
    "\3\0\1\14\1\73\15\0\1\72\1\0\11\14\1\0"+
    "\22\55\1\124\1\55\1\0\63\55\1\125\1\0\40\55"+
    "\22\60\1\126\2\60\1\127\62\60\1\130\1\60\1\0"+
    "\61\60\1\0\2\60\1\131\37\60\6\64\1\132\56\64"+
    "\5\0\1\66\1\0\13\65\4\0\1\65\3\0\1\65"+
    "\16\0\1\65\1\0\11\65\10\0\13\65\4\0\1\65"+
    "\3\0\1\65\16\0\1\65\1\0\11\65\6\0\1\66"+
    "\1\0\13\67\4\0\1\67\3\0\1\67\16\0\1\67"+
    "\1\0\11\67\6\0\1\66\1\0\3\14\1\133\5\14"+
    "\1\21\1\14\3\0\1\71\1\72\3\0\1\14\1\73"+
    "\15\0\1\72\1\0\11\14\10\0\13\71\3\0\1\71"+
    "\4\0\1\71\20\0\11\71\6\0\1\66\1\0\11\72"+
    "\1\67\1\72\4\0\1\72\3\0\1\72\1\73\15\0"+
    "\1\72\1\0\11\72\6\0\16\134\2\0\2\134\2\0"+
    "\5\134\5\0\2\134\1\0\1\134\1\0\14\134\6\0"+
    "\1\66\1\0\4\14\1\135\4\14\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\11\14\6\0\1\66\1\0\11\14\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\4\14\1\136\1\14\1\137\2\14\6\0\1\66\1\0"+
    "\10\14\1\140\1\21\1\14\3\0\1\71\1\72\3\0"+
    "\1\14\1\73\15\0\1\72\1\0\11\14\6\0\1\66"+
    "\1\0\7\14\1\141\1\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\10\14\1\142\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\11\14\6\0\1\66\1\0\1\14\1\143\7\14\1\21"+
    "\1\14\3\0\1\71\1\72\3\0\1\14\1\73\15\0"+
    "\1\72\1\0\11\14\3\0\1\144\61\0\1\145\5\0"+
    "\1\66\1\0\13\67\4\0\1\146\3\0\1\67\16\0"+
    "\1\67\1\0\11\67\6\0\1\147\1\0\13\106\4\0"+
    "\1\106\1\0\1\150\1\0\1\106\16\0\1\106\1\0"+
    "\11\106\10\0\13\151\4\0\1\151\3\0\1\151\16\0"+
    "\1\151\1\0\11\151\6\0\1\66\1\0\11\14\1\21"+
    "\1\14\3\0\1\71\1\72\3\0\1\14\1\73\15\0"+
    "\1\72\1\0\1\14\1\152\7\14\6\0\1\66\1\0"+
    "\11\14\1\21\1\14\3\0\1\71\1\72\3\0\1\14"+
    "\1\73\15\0\1\72\1\0\10\14\1\153\6\0\1\66"+
    "\1\0\1\14\1\154\7\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\1\0\23\55\2\0\40\55\23\60\1\0\1\60\1\0"+
    "\61\60\1\0\2\60\1\0\37\60\22\0\1\155\2\0"+
    "\1\156\1\157\36\0\5\64\1\160\57\64\5\0\1\66"+
    "\1\0\4\14\1\161\4\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\11\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\2\14"+
    "\1\162\6\14\6\0\1\66\1\0\3\14\1\163\5\14"+
    "\1\21\1\14\3\0\1\71\1\72\3\0\1\14\1\73"+
    "\15\0\1\72\1\0\11\14\6\0\1\66\1\0\4\14"+
    "\1\164\4\14\1\21\1\14\3\0\1\71\1\72\3\0"+
    "\1\14\1\73\15\0\1\72\1\0\11\14\6\0\1\66"+
    "\1\0\10\14\1\133\1\21\1\14\3\0\1\71\1\72"+
    "\3\0\1\14\1\73\15\0\1\72\1\0\11\14\6\0"+
    "\1\66\1\0\4\14\1\165\4\14\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\11\14\10\0\13\106\4\0\1\106\3\0\1\106\16\0"+
    "\1\106\1\0\11\106\6\0\1\111\1\0\13\151\4\0"+
    "\1\151\3\0\1\151\16\0\1\151\1\0\11\151\6\0"+
    "\1\66\1\0\4\14\1\166\4\14\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\11\14\6\0\1\66\1\0\11\14\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\5\14\1\167\3\14\6\0\1\66\1\0\11\14\1\21"+
    "\1\14\3\0\1\71\1\72\3\0\1\14\1\73\15\0"+
    "\1\72\1\0\1\14\1\170\7\14\6\0\1\66\1\0"+
    "\11\14\1\21\1\14\3\0\1\71\1\72\3\0\1\14"+
    "\1\73\15\0\1\72\1\0\1\171\10\14\6\0\1\66"+
    "\1\0\2\14\1\172\6\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\2\14\1\173\6\14\1\21\1\14"+
    "\3\0\1\71\1\72\3\0\1\14\1\73\15\0\1\72"+
    "\1\0\11\14\6\0\1\66\1\0\2\14\1\174\6\14"+
    "\1\21\1\14\3\0\1\71\1\72\3\0\1\14\1\73"+
    "\15\0\1\72\1\0\11\14\6\0\1\66\1\0\2\14"+
    "\1\175\6\14\1\21\1\14\3\0\1\71\1\72\3\0"+
    "\1\14\1\73\15\0\1\72\1\0\11\14\6\0\1\66"+
    "\1\0\1\14\1\176\7\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\11\14\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\1\177"+
    "\10\14\6\0\1\66\1\0\1\14\1\200\7\14\1\21"+
    "\1\14\3\0\1\71\1\72\3\0\1\14\1\73\15\0"+
    "\1\72\1\0\11\14\6\0\1\66\1\0\4\14\1\201"+
    "\4\14\1\21\1\14\3\0\1\71\1\72\3\0\1\14"+
    "\1\73\15\0\1\72\1\0\11\14\6\0\1\66\1\0"+
    "\1\14\1\202\7\14\1\21\1\14\3\0\1\71\1\72"+
    "\3\0\1\14\1\73\15\0\1\72\1\0\11\14\6\0"+
    "\1\66\1\0\10\14\1\203\1\21\1\14\3\0\1\71"+
    "\1\72\3\0\1\14\1\73\15\0\1\72\1\0\11\14"+
    "\6\0\1\66\1\0\10\14\1\204\1\21\1\14\3\0"+
    "\1\71\1\72\3\0\1\14\1\73\15\0\1\72\1\0"+
    "\11\14\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4505];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\3\1\1\11\13\1\2\11\5\1\1\11"+
    "\1\1\10\11\4\1\1\11\5\1\1\11\3\1\1\11"+
    "\1\0\1\1\2\0\2\1\2\0\6\1\2\11\1\1"+
    "\2\0\2\11\1\0\4\11\6\1\1\0\1\11\2\0"+
    "\1\11\1\1\1\0\11\1\1\11\1\0\1\1\1\0"+
    "\1\11\4\1\4\11\24\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[132];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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
  public NixLexer() {
    this((java.io.Reader)null);
  }

  enum StrState { IN_STRING, IN_IND_STRING };

  private Stack<StrState> interpol;
  public CharSequence yylval_id, yylval_path, yylval_uri, yylval_expr;
  public void backToString() { yybegin(STRING); }
  public void backToIndString() { yybegin(IND_STRING); }

  public synchronized void assureInterpol() {
    if(interpol == null)
        interpol = new Stack<StrState>();
  }
  public synchronized void showState() {
    try {
      p(peek().toString());
    } catch (Exception e) {p("OUTSIDE");}
  }
  public synchronized void push(StrState sst) {
    assureInterpol();
    interpol.push(sst);
  }
  public synchronized StrState pop() throws Exception {
    assureInterpol();
    return interpol.pop();
  }
  public synchronized StrState peek() throws Exception {
    assureInterpol();
    return interpol.peek();
  };
  public void ps(String msg) {p(msg);showState();}
  public static void p(String msg) { System.out.println(msg);}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public NixLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
    return zzBuffer.charAt(zzStartRead+pos);
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

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 70: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 71: break;
          case 3: 
            { return SCOMMENT;
            }
          case 72: break;
          case 4: 
            { return DIVIDE;
            }
          case 73: break;
          case 5: 
            { return TIMES;
            }
          case 74: break;
          case 6: 
            { return INT;
            }
          case 75: break;
          case 7: 
            { yylval_id=yytext();return ID;
            }
          case 76: break;
          case 8: 
            { return MINUS;
            }
          case 77: break;
          case 9: 
            { return DOLLAR;
            }
          case 78: break;
          case 10: 
            { return LCURLY;
            }
          case 79: break;
          case 11: 
            { yybegin(STRING);return FNUTT;
            }
          case 80: break;
          case 12: 
            { return DOT;
            }
          case 81: break;
          case 13: 
            { return LT;
            }
          case 82: break;
          case 14: 
            { return GT;
            }
          case 83: break;
          case 15: 
            { return COLON;
            }
          case 84: break;
          case 16: 
            { return ASSIGN;
            }
          case 85: break;
          case 17: 
            { return LPAREN;
            }
          case 86: break;
          case 18: 
            { return RPAREN;
            }
          case 87: break;
          case 19: 
            { try {
      StrState st = pop();
      if(st == StrState.IN_STRING) {
        backToString();
      } else if (st == StrState.IN_IND_STRING) {
        backToIndString();
      }
    } catch (Exception e){}
    return RCURLY;
            }
          case 88: break;
          case 20: 
            { return LBRAC;
            }
          case 89: break;
          case 21: 
            { return RBRAC;
            }
          case 90: break;
          case 22: 
            { return IS;
            }
          case 91: break;
          case 23: 
            { return NAMED;
            }
          case 92: break;
          case 24: 
            { return SEMI;
            }
          case 93: break;
          case 25: 
            { return NOT;
            }
          case 94: break;
          case 26: 
            { return PLUS;
            }
          case 95: break;
          case 27: 
            { return COMMA;
            }
          case 96: break;
          case 28: 
            { yylval_expr=yytext();
        return STR;
            }
          case 97: break;
          case 29: 
            { zzBufferL=yytext();
            }
          case 98: break;
          case 30: 
            { yybegin(YYINITIAL);
        return FNUTT;
            }
          case 99: break;
          case 31: 
            { yylval_expr = yytext();
        return IND_STR;
            }
          case 100: break;
          case 32: 
            { yylval_expr = "'";
        return IND_STR;
            }
          case 101: break;
          case 33: 
            { return UPDATE;
            }
          case 102: break;
          case 34: 
            { yylval_path=yytext();return PATH;
            }
          case 103: break;
          case 35: 
            { return IMPL;
            }
          case 104: break;
          case 36: 
            { return DOLLAR_CURLY;
            }
          case 105: break;
          case 37: 
            { yybegin(IND_STRING);
        return IND_STRING_OPEN;
            }
          case 106: break;
          case 38: 
            { return LEQ;
            }
          case 107: break;
          case 39: 
            { return GEQ;
            }
          case 108: break;
          case 40: 
            { return EQ;
            }
          case 109: break;
          case 41: 
            { return AND;
            }
          case 110: break;
          case 42: 
            { return OR;
            }
          case 111: break;
          case 43: 
            { return NEQ;
            }
          case 112: break;
          case 44: 
            { return CONCAT;
            }
          case 113: break;
          case 45: 
            { return IF;
            }
          case 114: break;
          case 46: 
            { return IN;
            }
          case 115: break;
          case 47: 
            { return OR_KW;
            }
          case 116: break;
          case 48: 
            { yybegin(YYINITIAL);
        push(StrState.IN_STRING);
        return DOLLAR_CURLY;
            }
          case 117: break;
          case 49: 
            { yybegin(YYINITIAL);
        push(StrState.IN_IND_STRING);
        return DOLLAR_CURLY;
            }
          case 118: break;
          case 50: 
            { yybegin(YYINITIAL);
        return IND_STRING_CLOSE;
            }
          case 119: break;
          case 51: 
            { yylval_uri=yytext();return URI;
            }
          case 120: break;
          case 52: 
            { return REC;
            }
          case 121: break;
          case 53: 
            { return LET;
            }
          case 122: break;
          case 54: 
            { return ELLIPSIS;
            }
          case 123: break;
          case 55: 
            { yylval_path=yytext();return SPATH;
            }
          case 124: break;
          case 56: 
            { yylval_path=yytext();return HPATH;
            }
          case 125: break;
          case 57: 
            { yylval_expr = "$";
        return IND_STR;
            }
          case 126: break;
          case 58: 
            { yylval_expr = "''";
        return IND_STR;
            }
          case 127: break;
          case 59: 
            { return MCOMMENT;
            }
          case 128: break;
          case 60: 
            { return BOOL;
            }
          case 129: break;
          case 61: 
            { return THEN;
            }
          case 130: break;
          case 62: 
            { return ELSE;
            }
          case 131: break;
          case 63: 
            { return WITH;
            }
          case 132: break;
          case 64: 
            { return ASSERT;
            }
          case 133: break;
          case 65: 
            { return IMPORT;
            }
          case 134: break;
          case 66: 
            { return REQUIRE;
            }
          case 135: break;
          case 67: 
            { return INHERIT;
            }
          case 136: break;
          case 68: 
            { return IMPORTS;
            }
          case 137: break;
          case 69: 
            { return REQUIRES;
            }
          case 138: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
