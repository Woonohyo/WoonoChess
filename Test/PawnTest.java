import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;


public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		String white = "white";
		String black = "black";

		Pawn pawn1 = new Pawn(white);
		String color1 = pawn1.getColor();
		assertEquals("white", color1);
		
		Pawn pawn2 = new Pawn(black);
		String color2 = pawn2.getColor();
		assertEquals("black", color2);
		
		
		
	}

}