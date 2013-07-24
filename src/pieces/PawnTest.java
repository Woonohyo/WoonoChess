package pieces;
import junit.framework.TestCase;
import static pieces.Pawn.*;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn pawn1 = new Pawn(SWHITEPAWN);
		String color1 = pawn1.getColor();
		assertEquals("white", color1);
		
		Pawn pawn2 = new Pawn(SBLACKPAWN);
		String color2 = pawn2.getColor();
		assertEquals("black", color2);
		
		Pawn pawn3 = new Pawn();
		String color3 = pawn3.getColor();
		assertEquals("white", color3);
		
		
	}

}