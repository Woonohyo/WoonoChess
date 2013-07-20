package chess;

import java.util.ArrayList;

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

		StringBuilder row2 = new StringBuilder();
		ArrayList<Pawn> secondRow = myBoard.rows.get(1);
		for (int i = 0; i < 8; i++) {
			row2.append(secondRow.get(i).getSymbol());
		}

		
		StringBuilder row7 = new StringBuilder();
		ArrayList<Pawn> seventhRow = myBoard.rows.get(6);
		for (int i = 0; i < 8; i++){
			row7.append(seventhRow.get(i).getSymbol());
		}

		assertEquals("pppppppp", row2.toString());
		assertEquals("PPPPPPPP", row7.toString());
	}

}
