
public class Pawn {
	private String color;
	final String white = "white";
	final String black = "black";
	
	Pawn() {
		this.color = white;
	}
	
	Pawn(String color) {
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}

}
