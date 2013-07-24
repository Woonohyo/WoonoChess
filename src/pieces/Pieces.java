package pieces;
/**
 * 체스말 Pawn의 정보를 담고 있는 클래스  
 * @author Woonohyo & Minju
 *
 */

public class Pieces {
	private String color;
	private char symbol;
	private String name;
	static public final String SWHITEPAWN = "white";
	static public final String SBLACKPAWN = "black";
	static public final String SBLANKPAWN = ".";
	static public final char WHITESYMBOL = 'p';
	static public final char BLANKSYMBOL = '.';

	/**
	 * 기본 생성시에는 색을 하얀색으로 강제 지정합니다.
	 */
	private Pieces(String color, String name) {
		this.color = color;
		this.name = name;
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
		// TODO Auto-generated method stub
		return new Pieces(color, name);
	}


	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
