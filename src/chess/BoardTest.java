package chess;
import util.StringUtil;
import junit.framework.TestCase;
import pieces.Pieces.Type;
import pieces.Pieces.Color;


public class BoardTest extends TestCase {
	private Board myBoard;

	public void setUp() {
		myBoard = new Board();
	}
	
	public void testCreate() throws Exception {
		myBoard.initialize();
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(StringUtil.appendNewLine("RNBQKBNR") +
					StringUtil.appendNewLine("PPPPPPPP") + 
					blankRank + blankRank + blankRank + blankRank +
					StringUtil.appendNewLine("pppppppp") +
					StringUtil.appendNewLine("rnbqkbnr"), 
					myBoard.print());
	}
	
	public void testCounting() throws Exception {
		myBoard.initialize();
		assertEquals(8, myBoard.countPieces(Color.WHITE, Type.PAWN));
		assertEquals(1, myBoard.countPieces(Color.BLACK, Type.KING));
		assertEquals(2, myBoard.countPieces(Color.BLACK, Type.KNIGHT));
	}
	
	public void testGetPiece() throws Exception {
		myBoard.initialize();
		assertEquals('R', myBoard.getPiece("a8"));
		assertEquals('P', myBoard.getPiece("d7"));
	}
}
