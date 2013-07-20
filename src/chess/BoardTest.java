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
		assertEquals("........", sbRows.get(0).toString());
		assertEquals("pppppppp", sbRows.get(1).toString());
		assertEquals("........", sbRows.get(2).toString());
		assertEquals("........", sbRows.get(3).toString());
		assertEquals("........", sbRows.get(4).toString());
		assertEquals("........", sbRows.get(5).toString());
		assertEquals("PPPPPPPP", sbRows.get(6).toString());
		assertEquals("........", sbRows.get(7).toString());
		
		StringBuilder printBoard = new StringBuilder();
		
		for(int i = 0; i < 8; i++){
			printBoard.append(sbRows.get(i));
			printBoard.append(NEWLINE);
		}
		
		System.out.println(printBoard.toString());
		
	}

}
