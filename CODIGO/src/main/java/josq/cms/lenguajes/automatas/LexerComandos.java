// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/main/lenguajes/LexerComandos.jflex

// meta characters:  |  (  )  {  }  [  ]  < >  \  .  *  +  ?  ^  $  / . " ~ !

// codigo antes de la clase lexer
package josq.cms.lenguajes.automatas;

import java.io.Reader;

//import java_cup.runtime.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.SymbolFactory;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.DefaultSymbolFactory;

import josq.cms.archivos.MiArchivo;
import josq.cms.lenguajes.automatas.ParserAccionesSym;
import josq.cms.lenguajes.automatas.modelos.jflex.Punto;
import josq.cms.lenguajes.controladores.EjecutarComandos;


@SuppressWarnings("fallthrough")
public class LexerComandos implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int MI_ID = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\1\0\1\4\1\0\1\5\7\0\1\6\1\5\1\7"+
    "\1\0\12\10\1\0\1\11\5\0\1\12\1\10\1\13"+
    "\1\14\1\15\1\16\1\17\1\10\1\20\2\10\1\21"+
    "\1\22\1\23\1\24\1\25\1\10\1\26\1\27\1\30"+
    "\1\31\1\32\4\10\4\0\1\33\1\0\1\12\1\10"+
    "\1\13\1\14\1\15\1\16\1\17\1\10\1\20\2\10"+
    "\1\21\1\22\1\23\1\24\1\25\1\10\1\26\1\27"+
    "\1\30\1\31\1\32\4\10\u0185\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\6\6\1"+
    "\1\7\1\10\24\0\1\11\14\0\1\12\1\13\3\0"+
    "\1\14\2\0\1\15\4\0\1\16\6\0\1\17\3\0"+
    "\1\20\13\0\1\21\1\0\1\22\2\0\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
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
    "\0\0\0\34\0\70\0\70\0\124\0\70\0\70\0\70"+
    "\0\70\0\160\0\214\0\250\0\304\0\340\0\374\0\70"+
    "\0\u0118\0\u0134\0\u0150\0\u016c\0\u0188\0\u01a4\0\u01c0\0\u01dc"+
    "\0\u01f8\0\u0214\0\u0230\0\u024c\0\u0268\0\u0284\0\u02a0\0\u02bc"+
    "\0\u02d8\0\u02f4\0\u0310\0\u032c\0\u0348\0\70\0\u0364\0\u0380"+
    "\0\u039c\0\u03b8\0\u03d4\0\u03f0\0\u040c\0\u0428\0\u0444\0\u0460"+
    "\0\u047c\0\u0498\0\70\0\70\0\u04b4\0\u04d0\0\u04ec\0\70"+
    "\0\u0508\0\u0524\0\70\0\u0540\0\u055c\0\u0578\0\u0594\0\70"+
    "\0\u05b0\0\u05cc\0\u05e8\0\u0604\0\u0620\0\u063c\0\70\0\u0658"+
    "\0\u0674\0\u0690\0\70\0\u06ac\0\u06c8\0\u06e4\0\u0700\0\u071c"+
    "\0\u0738\0\u0754\0\u0770\0\u078c\0\u07a8\0\u07c4\0\70\0\u07e0"+
    "\0\70\0\u07fc\0\u0818\0\70";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\3\1\7\1\10\1\3"+
    "\1\11\1\3\1\12\4\3\1\13\1\3\1\14\2\3"+
    "\1\15\2\3\1\16\1\3\1\17\2\3\2\4\1\5"+
    "\1\20\1\21\1\7\1\10\1\3\1\11\21\3\1\21"+
    "\36\0\1\4\55\0\1\22\31\0\1\23\26\0\1\24"+
    "\30\0\1\25\41\0\1\26\3\0\1\27\27\0\1\30"+
    "\20\0\1\21\2\0\1\21\1\0\22\21\22\0\1\31"+
    "\1\32\22\0\1\33\44\0\1\34\27\0\1\35\6\0"+
    "\1\36\35\0\1\37\17\0\1\40\33\0\1\41\12\0"+
    "\1\42\31\0\1\43\35\0\1\44\23\0\1\45\45\0"+
    "\1\46\22\0\1\47\41\0\1\50\36\0\1\51\26\0"+
    "\1\52\24\0\1\53\36\0\1\54\37\0\1\55\40\0"+
    "\1\56\17\0\1\57\41\0\1\60\22\0\1\61\42\0"+
    "\1\62\41\0\1\63\30\0\1\64\37\0\1\65\26\0"+
    "\1\66\31\0\1\67\35\0\1\70\22\0\1\71\37\0"+
    "\1\72\41\0\1\73\21\0\1\74\36\0\1\75\46\0"+
    "\1\76\32\0\1\77\30\0\1\100\36\0\1\101\27\0"+
    "\1\102\22\0\1\103\54\0\1\104\33\0\1\105\30\0"+
    "\1\106\31\0\1\107\32\0\1\110\33\0\1\111\1\0"+
    "\1\112\21\0\1\113\42\0\1\114\21\0\1\115\41\0"+
    "\1\116\40\0\1\117\25\0\1\120\44\0\1\121\34\0"+
    "\1\122\22\0\1\123\33\0\1\124\34\0\1\125\35\0"+
    "\1\126\34\0\1\127\21\0\1\130\33\0\1\131\47\0"+
    "\1\132\22\0\1\133\45\0\1\134\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2100];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\1\1\4\11\6\1\1\11\1\1\24\0"+
    "\1\11\14\0\2\11\3\0\1\11\2\0\1\11\4\0"+
    "\1\11\6\0\1\11\3\0\1\11\13\0\1\11\1\0"+
    "\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public LexerComandos(Reader myReader, DefaultSymbolFactory myFactory) { this(myReader); this.myFactory = myFactory; }

    private DefaultSymbolFactory myFactory;

    private Symbol symbol(String name, int sym) {
        int izq = (int)yychar+1;
        int der = (int)yychar+yylength();
        Symbol mySymbol = myFactory.newSymbol(name, sym, izq, der);
        return mySymbol;
    }
    private Symbol symbol(String name, int sym, Object val) {
        int izq = (int)yychar+1;
        int der = (int)yychar+yylength();
        Symbol mySymbol = myFactory.newSymbol(name, sym, izq, der, val);
        return mySymbol;
    }

    // para errores lexicos
    public Punto getPunto(){ return new Punto(yycolumn+1, yyline+1, yylength(), (int)yychar+1); };
    StringBuilder log(String text) 
    {
        EjecutarComandos.logSintaxis.append(text); 
        return EjecutarComandos.logSintaxis; 
    }

    // para cambio de contexto lexico



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerComandos(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
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
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(ParserComandosSym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { log("@lexer: ").append(getPunto().toString()).append("\n"); return symbol("",ParserComandosSym.error);
            }
          // fall through
          case 20: break;
          case 2:
            { 
            }
          // fall through
          case 21: break;
          case 3:
            { yybegin(MI_ID); return symbol("",ParserComandosSym.COMI);
            }
          // fall through
          case 22: break;
          case 4:
            { return symbol("",ParserComandosSym.COMA);
            }
          // fall through
          case 23: break;
          case 5:
            { return symbol("",ParserComandosSym.DOT);
            }
          // fall through
          case 24: break;
          case 6:
            { return symbol("",ParserComandosSym.PUNCOM);
            }
          // fall through
          case 25: break;
          case 7:
            { yybegin(YYINITIAL); return symbol("",ParserComandosSym.COMI);
            }
          // fall through
          case 26: break;
          case 8:
            { return symbol("",ParserComandosSym.ID,yytext());
            }
          // fall through
          case 27: break;
          case 9:
            { return symbol("",ParserComandosSym.MENU);
            }
          // fall through
          case 28: break;
          case 10:
            { return symbol("",ParserComandosSym.TODOS);
            }
          // fall through
          case 29: break;
          case 11:
            { return symbol("",ParserComandosSym.VIDEO);
            }
          // fall through
          case 30: break;
          case 12:
            { return symbol("",ParserComandosSym.IMAGEN);
            }
          // fall through
          case 31: break;
          case 13:
            { return symbol("",ParserComandosSym.TITULO);
            }
          // fall through
          case 32: break;
          case 14:
            { return symbol("",ParserComandosSym.PARRAFO);
            }
          // fall through
          case 33: break;
          case 15:
            { return symbol("",ParserComandosSym.CONSULT);
            }
          // fall through
          case 34: break;
          case 16:
            { return symbol("",ParserComandosSym.COMP);
            }
          // fall through
          case 35: break;
          case 17:
            { return symbol("",ParserComandosSym.SITE_VIEWS);
            }
          // fall through
          case 36: break;
          case 18:
            { return symbol("",ParserComandosSym.PAGE_VIEWS);
            }
          // fall through
          case 37: break;
          case 19:
            { return symbol("",ParserComandosSym.PAGE_POP);
            }
          // fall through
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}