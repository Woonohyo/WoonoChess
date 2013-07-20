package chess;
import pieces.Pawn;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	private Board myBoard;
	private Pawn pawn1, pawn2;
	
	public void setUp() {
		myBoard = new Board();
		pawn1 = new Pawn(Pawn.sWhite, Pawn.whitePawn);
		pawn2 = new Pawn(Pawn.sBlack, Pawn.blackPawn);
	}
	
	public void testCreate() throws Exception {
		myBoard.initialize();
		assertEquals(16, myBoard.numChessman);
		
		
	}
	
}


