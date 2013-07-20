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
		assertEquals(0, myBoard.numChessman);
	}
	
	public void testAdd() throws Exception {
		int testInteger = 7;
		
		myBoard.addChessman(pawn1);
		assertEquals(1, myBoard.numChessman);
		
		myBoard.addChessman(pawn2);
		assertEquals(2, myBoard.numChessman);
		
		// addChessman이란 메소드에서 사용하는 pawns라는 ArrayList는 Pawn 클래스만 추가할 수 있으므로, 
		// int 타입인 testInteger의 추가는 불가능하다.
		// myBoard.addChessman(testInteger); 
			
		assertTrue(myBoard.pawns.contains(pawn1));
		assertTrue(myBoard.pawns.contains(pawn2));
	}
}


