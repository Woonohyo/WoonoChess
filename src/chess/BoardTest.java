package chess;

import java.util.ArrayList;

import pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	private static final String NEWLINE = System.getProperty("line.separator");
	private Board myBoard;
	private Pawn pawn1, pawn2;

	public void setUp() {
		myBoard = new Board();
		pawn1 = new Pawn(Pawn.sWhite, Pawn.whitePawn);
		pawn2 = new Pawn(Pawn.sBlack, Pawn.blackPawn);
	}

	public void testCreate() throws Exception {
		myBoard.initialize();
		ArrayList<StringBuilder> sbRows = new ArrayList<StringBuilder>();
		
		StringBuilder row1 = new StringBuilder();
		StringBuilder row2 = new StringBuilder();
		StringBuilder row3 = new StringBuilder();
		StringBuilder row4 = new StringBuilder();
		StringBuilder row5 = new StringBuilder();
		StringBuilder row6 = new StringBuilder();
		StringBuilder row7 = new StringBuilder();
		StringBuilder row8 = new StringBuilder();

		ArrayList<Pawn> firstRow = myBoard.rows.get(0);
		for (int i = 0; i < 8; i++){
			row1.append(firstRow.get(i).getSymbol());
		}
		
		ArrayList<Pawn> secondRow = myBoard.rows.get(1);
		for (int i = 0; i < 8; i++) {
			row2.append(secondRow.get(i).getSymbol());
		}
		
		ArrayList<Pawn> thirdRow = myBoard.rows.get(2);
		for (int i = 0; i < 8; i++){
			row3.append(thirdRow.get(i).getSymbol());
		}
		
		ArrayList<Pawn> fourthRow = myBoard.rows.get(3);
		for (int i = 0; i < 8; i++){
			row4.append(fourthRow.get(i).getSymbol());
		}
		
		ArrayList<Pawn> fifthRow = myBoard.rows.get(4);
		for (int i = 0; i < 8; i++){
			row5.append(fifthRow.get(i).getSymbol());
		}
		
		ArrayList<Pawn> sixthRow = myBoard.rows.get(5);
		for (int i = 0; i < 8; i++){
			row6.append(sixthRow.get(i).getSymbol());
		}

		ArrayList<Pawn> seventhRow = myBoard.rows.get(6);
		for (int i = 0; i < 8; i++){
			row7.append(seventhRow.get(i).getSymbol());
		}
		
		ArrayList<Pawn> eighthRow = myBoard.rows.get(7);
		for (int i = 0; i < 8; i++){
			row8.append(eighthRow.get(i).getSymbol());
		}
		
		sbRows.add(row1);
		sbRows.add(row2);
		sbRows.add(row3);
		sbRows.add(row4);
		sbRows.add(row5);
		sbRows.add(row6);
		sbRows.add(row7);
		sbRows.add(row8);
		
		assertEquals(16, myBoard.numChessman);		
		assertEquals("........", row1.toString());
		assertEquals("pppppppp", row2.toString());
		assertEquals("........", row3.toString());
		assertEquals("........", row4.toString());
		assertEquals("........", row5.toString());
		assertEquals("........", row6.toString());
		assertEquals("PPPPPPPP", row7.toString());
		assertEquals("........", row8.toString());
		
		StringBuilder printBoard = new StringBuilder();
		
		for(int i = 0; i < 8; i++){
			printBoard.append(sbRows.get(i));
			printBoard.append(NEWLINE);
		}
		
		System.out.println(printBoard.toString());
		
	}

}
