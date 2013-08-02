package chess;
import util.StringUtil;
import junit.framework.TestCase;
import pieces.Pieces.Type;
import pieces.Pieces.Color;
import pieces.Pieces;


public class BoardTest extends TestCase {
	private Board myBoard;
	String blankRank = StringUtil.appendNewLine("........");


	public void setUp() {
		myBoard = new Board();
	}
	
	public void testCreate() throws Exception {
		myBoard.initialize();
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
	
	public void testSetPiece() throws Exception {
		myBoard.blankInitialize();

		assertEquals(
				blankRank + blankRank + blankRank + blankRank +
				blankRank + blankRank + blankRank + blankRank, 
					myBoard.print());
		myBoard.setPiece("a8", Pieces.createBlackKing());
		assertEquals('K', myBoard.getPiece("a8"));
	}
	
	public void testGetPoints() throws Exception {
		myBoard.blankInitialize();
		myBoard.setPiece("b8", Pieces.createBlackKing());
		myBoard.setPiece("c8", Pieces.createBlackRook());
		myBoard.setPiece("a7", Pieces.createBlackPawn());
		myBoard.setPiece("c7", Pieces.createBlackPawn());
		myBoard.setPiece("d7", Pieces.createBlackBishop());
		myBoard.setPiece("b6", Pieces.createBlackPawn());
		myBoard.setPiece("e6", Pieces.createBlackQueen());
		myBoard.setPiece("f4", Pieces.createWhiteKnight());
		myBoard.setPiece("g4", Pieces.createWhiteQueen());
		myBoard.setPiece("f3", Pieces.createWhitePawn());
		myBoard.setPiece("h3", Pieces.createWhitePawn());
		myBoard.setPiece("f2", Pieces.createWhitePawn());
		myBoard.setPiece("g2", Pieces.createWhitePawn());
		myBoard.setPiece("e1", Pieces.createWhiteRook());
		myBoard.setPiece("f1", Pieces.createWhiteKing());
		
		assertEquals(19.5, myBoard.getPoints(Color.WHITE));
		assertEquals(20.0, myBoard.getPoints(Color.BLACK));
	}
}