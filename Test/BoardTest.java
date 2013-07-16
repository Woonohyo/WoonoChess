import java.util.ArrayList;

import junit.framework.TestCase;


public class BoardTest extends TestCase {

	public void testCreate() throws Exception {
		Board myBoard = new Board();		
	}
	
	public void testNumbering() throws Exception {
		Board myBoard = new Board();
		int numberChessman = myBoard.numChessman;
	}
	
	public void testAdd() throws Exception {
		Pawn pawn1 = new Pawn();
		Board myBoard = new Board();
		myBoard.addChessman(pawn1);
		assertEquals(1, myBoard.numChessman);
		assertTrue(myBoard.pawns.contains(pawn1));
	}
}


