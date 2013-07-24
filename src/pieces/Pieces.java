package pieces;

/**
 * 체스말 Pawn의 정보를 담고 있는 클래스
 * 
 * @author Woonohyo & Minju
 * 
 */
public class Pieces {
	private String color;
	private char symbol;
	private String name;
	private static int blackCounter;
	private static int whiteCounter;

	static public final String WHITE_COLOR = "white";
	static public final String BLACK_COLOR = "black";
	static public final String BLANK_COLOR = "";

	static public final String PAWN = "Pawn";
	static public final String ROOK = "Rook";
	static public final String KNIGHT = "Knight";
	static public final String BISHOP = "Bishop";
	static public final String QUEEN = "Queen";
	static public final String KING = "King";

	static public final char KING_SYMBOL = 'k';
	static public final char QUEEN_SYMBOL = 'q';
	static public final char BISHOP_SYMBOL = 'b';
	static public final char KNIGHT_SYMBOL = 'n';
	static public final char ROOK_SYMBOL = 'r';
	static public final char PAWN_SYMBOL = 'p';
	static public final char BLANK_SYMBOL = '.';

	private Pieces(String color, String name) {
		this.color = color;
		this.name = name;

		if (name == PAWN) {
			this.symbol = PAWN_SYMBOL;
			if (color == BLACK_COLOR)
				this.symbol = Character.toUpperCase(PAWN_SYMBOL);
		}

		if (name == ROOK) {
			this.symbol = ROOK_SYMBOL;
			if (color == BLACK_COLOR)
				this.symbol = Character.toUpperCase(ROOK_SYMBOL);

		}

		if (name == KNIGHT) {
			this.symbol = KNIGHT_SYMBOL;
			if (color == BLACK_COLOR)
				this.symbol = Character.toUpperCase(KNIGHT_SYMBOL);
		}

		if (name == BISHOP) {
			this.symbol = BISHOP_SYMBOL;
			if (color == BLACK_COLOR)
				this.symbol = Character.toUpperCase(BISHOP_SYMBOL);
		}

		if (name == QUEEN) {
			this.symbol = QUEEN_SYMBOL;
			if (color == BLACK_COLOR)
				this.symbol = Character.toUpperCase(QUEEN_SYMBOL);
		}

		if (name == KING) {
			this.symbol = KING_SYMBOL;
			if (color == BLACK_COLOR)
				this.symbol = Character.toUpperCase(KING_SYMBOL);
		}

		if (name == BLANK_COLOR) {
			this.symbol = BLANK_SYMBOL;
		}
	}

	/**
	 * @return 체스말의 색을 리턴합니다.
	 */
	String getColor() {
		return this.color;
	}

	public char getSymbol() {
		return symbol;
	}

	public static Pieces create(String color, String name) {
		if (color == WHITE_COLOR)
			whiteCounter++;
		else if (color == BLACK_COLOR)
			blackCounter++;

		return new Pieces(color, name);
	}

	public String getName() {
		return this.name;
	}

	public static int getWhiteCounter() {
		return whiteCounter;
	}

	public static int getBlackCounter() {
		return blackCounter;
	}

}
