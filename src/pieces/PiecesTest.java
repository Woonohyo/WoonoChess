package pieces;
import chess.Board;
import junit.framework.TestCase;
import static pieces.Pieces.*;

public class PiecesTest extends TestCase {
	public void testCreate() throws Exception {
		Pieces pawn1 = Pieces.create(WHITE_COLOR,PAWN);
		assertEquals("white", pawn1.getColor());
		assertEquals("Pawn", pawn1.getName());
	}
	public void testCount() throws Exception {
		Board board = new Board();
		board.initialize();
		
		assertEquals(16, Pieces.getWhiteCounter());
		assertEquals(16, Pieces.getBlackCounter());
	}
	
	public void testWhichColor() throws Exception {
		Pieces pawn1 = Pieces.create(WHITE_COLOR, PAWN);
		Pieces pawn2 = Pieces.create(BLACK_COLOR, PAWN);
		Pieces queen1 = Pieces.create(WHITE_COLOR, QUEEN);
		
		assertEquals(true, pawn1.isWhite());
		assertEquals(true, pawn2.isBlack());
		assertEquals(false, queen1.isBlack());
			
	}
}