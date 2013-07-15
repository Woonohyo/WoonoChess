import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		final String white = "white";
		final String black = "black";

		Pawn pawn1 = new Pawn(white);
		String color1 = pawn1.getColor();
		assertEquals("white", color1);
		
		Pawn pawn2 = new Pawn(black);
		String color2 = pawn2.getColor();
		assertEquals("black", color2);
		
		Pawn pawn3 = new Pawn();
		String color3 = pawn3.getColor();
		assertEquals("white", color3);
		
		
	}

}