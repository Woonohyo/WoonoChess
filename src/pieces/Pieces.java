package pieces;

/**
 * 체스말 Pawn의 정보를 담고 있는 클래스
 * 
 * @author Woonohyo & Minju
 * 
 */
public class Pieces {
	private Color color;
	private Piece name;
	private char symbol;
	private static int blackCounter;
	private static int whiteCounter;

	static public final char KING_SYMBOL = 'k';
	static public final char QUEEN_SYMBOL = 'q';
	static public final char BISHOP_SYMBOL = 'b';
	static public final char KNIGHT_SYMBOL = 'n';
	static public final char ROOK_SYMBOL = 'r';
	static public final char PAWN_SYMBOL = 'p';
	static public final char BLANK_SYMBOL = '.';
	
	public enum Color {
		WHITE, BLACK, BLANK
	};
	
	public enum Piece {
		PAWN, KNIGHT, ROOK, BISHOP, QUEEN, KING, BLANK
	};

	private Pieces(Color color, Piece piece) {
		this.color = color;
		this.name = piece;

		if (piece == Piece.PAWN) {
			this.symbol = PAWN_SYMBOL;
			if (color == Color.BLACK)
				this.symbol = Character.toUpperCase(PAWN_SYMBOL);
		}

		if (piece == Piece.ROOK) {
			this.symbol = ROOK_SYMBOL;
			if (color == Color.BLACK)
				this.symbol = Character.toUpperCase(ROOK_SYMBOL);

		}

		if (piece == Piece.KNIGHT) {
			this.symbol = KNIGHT_SYMBOL;
			if (color == Color.BLACK)
				this.symbol = Character.toUpperCase(KNIGHT_SYMBOL);
		}

		if (piece == Piece.BISHOP) {
			this.symbol = BISHOP_SYMBOL;
			if (color == Color.BLACK)
				this.symbol = Character.toUpperCase(BISHOP_SYMBOL);
		}

		if (piece == Piece.QUEEN) {
			this.symbol = QUEEN_SYMBOL;
			if (color == Color.BLACK)
				this.symbol = Character.toUpperCase(QUEEN_SYMBOL);
		}

		if (piece == Piece.KING) {
			this.symbol = KING_SYMBOL;
			if (color == Color.BLACK)
				this.symbol = Character.toUpperCase(KING_SYMBOL);
		}

		if (piece == Piece.BLANK) {
			this.symbol = BLANK_SYMBOL;
		}
	}

	/**
	 * @return 체스말의 색을 리턴합니다.
	 */
	String getColor() {
		return this.color.toString();
	}

	public char getSymbol() {
		return symbol;
	}

	public static Pieces create(Color color, Piece piece) {
		if (color == Color.WHITE)
			whiteCounter++;
		else if (color == Color.BLACK)
			blackCounter++;

		return new Pieces(color, piece);
	}

	public String getName() {
		return this.name.toString();
	}

	public static int getWhiteCounter() {
		return whiteCounter;
	}

	public static int getBlackCounter() {
		return blackCounter;
	}

	public boolean isWhite() {
		if ( this.color == Color.WHITE )
			return true;
		else
			return false;
	}

	public boolean isBlack() {
		if ( this.color == Color.BLACK )
			return true;
		else
			return false;
	}
}
