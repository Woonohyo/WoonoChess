public class Pawn {
	private String color;
	public final String white = "white";
	public final String black = "black";
	
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
