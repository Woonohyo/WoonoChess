package pieces;
import chess.Board;
import junit.framework.TestCase;

public class PiecesTest extends TestCase {
	public void testCreate() throws Exception {
		Pieces pawn1 = Pieces.create(Pieces.Color.WHITE,Pieces.Piece.PAWN);
		assertEquals("WHITE", pawn1.getColor());
		assertEquals("PAWN", pawn1.getName());
	}
	public void testCount() throws Exception {
		Board board = new Board();
		board.initialize();
		
		assertEquals(16, Pieces.getWhiteCounter());
		assertEquals(16, Pieces.getBlackCounter());
	}
	
	public void testWhichColor() throws Exception {
		Pieces pawn1 = Pieces.create(Pieces.Color.WHITE, Pieces.Piece.PAWN);
		Pieces pawn2 = Pieces.create(Pieces.Color.BLACK, Pieces.Piece.PAWN);
		Pieces queen1 = Pieces.create(Pieces.Color.WHITE, Pieces.Piece.QUEEN);
		
		assertEquals(true, pawn1.isWhite());
		assertEquals(true, pawn2.isBlack());
		assertEquals(false, queen1.isBlack());
			
	}
}