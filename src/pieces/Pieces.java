package pieces;

/**
 * 체스말 Pawn의 정보를 담고 있는 클래스
 * 
 * @author Woonohyo & Jay
 * 
 */
public class Pieces {
	private Color color;
	private Type type;
	private char symbol;
	private double point;
	private static int blackCounter;
	private static int whiteCounter;

	public enum Color {                                 //왜 여기 static을 안써도 되나요?
		WHITE, BLACK, NONE
	};
	
	public enum Type {
		PAWN('p', 1), KNIGHT('n', 2.5), ROOK('r', 5), BISHOP('b', 3), QUEEN('q', 9), KING('k', 0), BLANK('.', 0);
		
		private char symbol;
		private double point;
		
		private Type(char symbol, double point) {
			this.symbol = symbol;
			this.point = point;
		}
		
		public char getSymbol() {
			return symbol;
		}
		
		public double getPoint() {
			return point;
		}
	};

	private Pieces(Color color, Type type) {
		this.color = color;
		this.type = type;
		this.symbol = type.getSymbol();
		this.point = type.getPoint();

		if (color == Color.BLACK) {
			this.symbol = Character.toUpperCase(type.getSymbol());
		}
		
	}

	/**
	 * @return 체스말의 색을 리턴합니다.(enum -> String 형변환)
	 */
	public String getColor() {
		return this.color.toString();
	}

	public char getSymbol() {
		return symbol;
	}
	
	public double getPoint() {
		return point;
	}

	public static Pieces create(Color color, Type type) {
		if (color == Color.WHITE)
			whiteCounter++;
		else if (color == Color.BLACK)
			blackCounter++;

		return new Pieces(color, type);
	}

	public String getType() {
		return this.type.toString();
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

	public static Pieces noPiece() {
		return new Pieces(Color.NONE, Type.BLANK);
	}

	public static Pieces createWhitePawn() {
		return new Pieces(Color.WHITE, Type.PAWN);
	}

	public static Pieces createBlackPawn() {
		return new Pieces(Color.BLACK, Type.PAWN);
	}

	public static Pieces createWhiteRook() {
		return new Pieces(Color.WHITE, Type.ROOK);	
		}

	public static Pieces createBlackRook() {
		return new Pieces(Color.BLACK, Type.ROOK);
	}

	public static Pieces createWhiteKnight() {
		return new Pieces(Color.WHITE, Type.KNIGHT);
	}

	public static Pieces createBlackKnight() {
		return new Pieces(Color.BLACK, Type.KNIGHT);
	}

	public static Pieces createWhiteBishop() {
		return new Pieces(Color.WHITE, Type.BISHOP);
	}

	public static Pieces createBlackBishop() {
		return new Pieces(Color.BLACK, Type.BISHOP);
	}

	public static Pieces createWhiteQueen() {
		return new Pieces(Color.WHITE, Type.QUEEN);
	}

	public static Pieces createBlackQueen() {
		return new Pieces(Color.BLACK, Type.QUEEN);
	}

	public static Pieces createWhiteKing() {
		return new Pieces(Color.WHITE, Type.KING);
	}

	public static Pieces createBlackKing() {
		return new Pieces(Color.BLACK, Type.KING);
	}
	
	public static Pieces createWhite(Type type) {
		if (type == Type.PAWN)
			return new Pieces(Color.WHITE, Type.PAWN);
		else if (type == Type.ROOK)
			return new Pieces(Color.WHITE, Type.ROOK);
		else if (type == Type.KNIGHT)
			return new Pieces(Color.WHITE, Type.KNIGHT);
		else if (type == Type.BISHOP)
			return new Pieces(Color.WHITE, Type.BISHOP);
		else if (type == Type.QUEEN)
			return new Pieces(Color.WHITE, Type.QUEEN);
		else if (type == Type.KING)
			return new Pieces(Color.WHITE, Type.KING);
		else
			return null;
	}
	
	public static Pieces createBlack(Type type) {
		if (type == Type.PAWN)
			return new Pieces(Color.BLACK, Type.PAWN);
		else if (type == Type.ROOK)
			return new Pieces(Color.BLACK, Type.ROOK);
		else if (type == Type.KNIGHT)
			return new Pieces(Color.BLACK, Type.KNIGHT);
		else if (type == Type.BISHOP)
			return new Pieces(Color.BLACK, Type.BISHOP);
		else if (type == Type.QUEEN)
			return new Pieces(Color.BLACK, Type.QUEEN);
		else if (type == Type.KING)
			return new Pieces(Color.BLACK, Type.KING);
		else
			return null;
	}
}
