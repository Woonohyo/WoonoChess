package chess;

import java.util.ArrayList;

import pieces.Pawn;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	private static final String NEWLINE = System.getProperty("line.separator");
	private Board myBoard;

	public void setUp() {
		myBoard = new Board();
	}

	public void testCreate() throws Exception {
		myBoard.initialize();
		
		ArrayList<StringBuilder> sbRows = new ArrayList<StringBuilder>();
		
		for ( int rowIdx = 0; rowIdx < 8; rowIdx++) {
			for (int colIdx = 0; colIdx < 8; colIdx++){
				sbRows.add(new StringBuilder());
				sbRows.get(rowIdx).append(myBoard.rows.get(rowIdx).get(colIdx).getSymbol());
			}
		}
		
		assertEquals(16, myBoard.numChessman);
		
		for ( int i = 0; i < 8; i++) {
			if 		( i == 1) 	assertEquals("pppppppp", sbRows.get(i).toString());	
			else if ( i == 6)	assertEquals("PPPPPPPP", sbRows.get(i).toString());
			else 				assertEquals("........", sbRows.get(i).toString());
		}

		StringBuilder printBoard = new StringBuilder();
		
		for(int i = 0; i < 8; i++){
			printBoard.append(sbRows.get(i));
			printBoard.append(NEWLINE);
		}
		
		System.out.println(printBoard.toString());
		
	}

}
