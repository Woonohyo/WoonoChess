import junit.framework.TestCase;


public class BoardTest extends TestCase {

	public void testCreate() throws Exception {
		Board myBoard = new Board();		
	}
	
	public void testNumbering() throws Exception {
		Board myBoard = new Board();
		int numberChessman = myBoard.numChessman;
		assertEquals(0, numberChessman);
	}
	
	public void testAdd() throws Exception {
		Pawn pawn = new Pawn();
		Pawn pawn1 = new Pawn();
		Pawn pawn2 = new Pawn(pawn.black);
		
		Board myBoard = new Board();
		
		myBoard.addChessman(pawn1);
		assertEquals(1, myBoard.numChessman);
		
		myBoard.addChessman(pawn2);
		assertEquals(2, myBoard.numChessman);
	
		assertTrue(myBoard.pawns.contains(pawn1));
		assertTrue(myBoard.pawns.contains(pawn2));
	}
}


