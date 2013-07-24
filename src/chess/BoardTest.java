package chess;
import java.util.ArrayList;
import static chess.Board.boardSize;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	public static final String NEWLINE = System.getProperty("line.separator");
	private Board myBoard;

	public void setUp() {
		myBoard = new Board();
	}

	public void testCreate() throws Exception {
		myBoard.initialize();
		
		ArrayList<StringBuilder> sbRows = new ArrayList<StringBuilder>();
		
		for ( int rowIdx = 0; rowIdx < boardSize; rowIdx++) {
			for (int colIdx = 0; colIdx < 8; colIdx++) {
				sbRows.add(new StringBuilder());
				sbRows.get(rowIdx).append(myBoard.rows.get(rowIdx).get(colIdx).getSymbol());
			}
		}
		
		assertEquals(16, myBoard.numChessman);
		assertEquals(16, myBoard.numPawn);
		
		for ( int idx = 0; idx < boardSize; idx++) {
			if ( idx == 1) {
				assertEquals("pppppppp", sbRows.get(idx).toString());	
				continue;
			}
			
			if ( idx == 6) {
				assertEquals("PPPPPPPP", sbRows.get(idx).toString());
				continue;
			}
			
			assertEquals("........", sbRows.get(idx).toString());
		}

		StringBuilder printBoard = new StringBuilder();
		
		for(int idx = 0; idx < boardSize; idx++) {
			printBoard.append(sbRows.get(idx));
			printBoard.append(NEWLINE);
		}
		
		System.out.println(printBoard.toString());
	}
}
