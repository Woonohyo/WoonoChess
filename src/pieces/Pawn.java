package pieces;
/**
 * 체스말 Pawn의 정보를 담고 있는 클래스  
 * @author Woonohyo & Minju
 *
 */

public class Pawn {
	private String color;
	private char represent;
	static public final String sWhite = "white";
	static public final String sBlack = "black";
	static public final char whitePawn = 'p';
	static public final char blackPawn = 'P';
	
	/**
	 * 기본 생성시에는 색을 하얀색으로 강제 지정합니다.
	 */
	public Pawn() {
		this.color = sWhite;
		this.represent = whitePawn;
	}
	
	/**
	 * 색깔을 지정한 경우의 생성자 
	 * @param color -- white 혹은 black으로 체스 말의 색을 뜻합니다.
	 * @param whitepawn2 
	 */
	public Pawn(String color, char represent) {
		this.color = color;
		this.represent = represent;
	}
	
	/**
	 * @return 체스말의 색을 리턴합니다. 
	 */
	String getColor() {
		return this.color;
	}

}
