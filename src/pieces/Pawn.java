package pieces;
/**
 * 체스말 Pawn의 정보를 담고 있는 클래스  
 * @author Woonohyo & Jay
 *
 */

public class Pawn {
	private String color;
	public static final String white = "white";
	public static final String black = "black";
	
	/**
	 * 기본 생성시에는 색을 하얀색으로 강제 지정합니다.
	 */
	public Pawn() {
		this.color = white;
	}
	
	/**
	 * 색깔을 지정한 경우의 생성자 
	 * @param color -- white 혹은 black으로 체스 말의 색을 뜻합니다.
	 */
	public Pawn(String color) {
		this.color = color;
	}
	
	/**
	 * @return 체스말의 색을 리턴합니다. 
	 */
	String getColor() {
		return this.color;
	}

}
