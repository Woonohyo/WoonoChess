package pieces;
import pieces.Pieces.Type;
import pieces.Pieces.Color;
import chess.Board;
import junit.framework.TestCase;

public class PiecesTest extends TestCase {
	public void testCreate() throws Exception {
		Pieces pawn1 = Pieces.create(Pieces.Color.WHITE,Pieces.Type.PAWN);
		assertEquals("WHITE", pawn1.getColor());
		assertEquals("PAWN", pawn1.getType());
	}
	public void testCount() throws Exception {
		Board board = new Board();
		board.initialize();
		
		assertEquals(16, Pieces.getWhiteCounter());
		assertEquals(16, Pieces.getBlackCounter());
	}
	
	public void testWhichColor() throws Exception {
		Pieces pawn1 = Pieces.create(Color.WHITE, Type.PAWN);
		Pieces pawn2 = Pieces.create(Pieces.Color.BLACK, Type.PAWN);
		Pieces queen1 = Pieces.create(Pieces.Color.WHITE, Type.QUEEN);
		
		assertEquals(true, pawn1.isWhite());
		assertEquals(true, pawn2.isBlack());
		assertEquals(false, queen1.isBlack());
			
	}
	
	public void testFactoryCreate() throws Exception {
		verifyCreation(Pieces.createWhitePawn(), Pieces.createBlackPawn(), 
				Pieces.Type.PAWN, Pieces.Type.PAWN.getSymbol());
		
		verifyCreation(Pieces.createWhiteRook(), Pieces.createBlackRook(), 
				Pieces.Type.ROOK, Pieces.Type.ROOK.getSymbol());
		
		verifyCreation(Pieces.createWhiteKnight(), Pieces.createBlackKnight(), 
				Pieces.Type.KNIGHT, Pieces.Type.KNIGHT.getSymbol());
		
		verifyCreation(Pieces.createWhiteBishop(), Pieces.createBlackBishop(), 
				Pieces.Type.BISHOP, Pieces.Type.BISHOP.getSymbol());
		
		verifyCreation(Pieces.createWhiteQueen(), Pieces.createBlackQueen(), 
				Pieces.Type.QUEEN, Pieces.Type.QUEEN.getSymbol());
		
		verifyCreation(Pieces.createWhiteKing(), Pieces.createBlackKing(), 
				Pieces.Type.KING, Pieces.Type.KING.getSymbol());
		
		Pieces blank = Pieces.noPiece();
		assertEquals('.', blank.getSymbol());
		assertEquals("BLANK", blank.getType());
	}
	
	public void testFactoryCreate2() throws Exception {
		verifyCreation(Pieces.createWhite(Type.PAWN), Pieces.createBlack(Type.PAWN), 
				Pieces.Type.PAWN, Pieces.Type.PAWN.getSymbol());
		
		verifyCreation(Pieces.createWhite(Type.ROOK), Pieces.createBlack(Type.ROOK), 
				Pieces.Type.ROOK, Pieces.Type.ROOK.getSymbol());
		
		verifyCreation(Pieces.createWhite(Type.KNIGHT), Pieces.createBlack(Type.KNIGHT), 
				Pieces.Type.KNIGHT, Pieces.Type.KNIGHT.getSymbol());
		
		verifyCreation(Pieces.createWhite(Type.BISHOP), Pieces.createBlack(Type.BISHOP), 
				Pieces.Type.BISHOP, Pieces.Type.BISHOP.getSymbol());
		
		verifyCreation(Pieces.createWhite(Type.QUEEN), Pieces.createBlack(Type.QUEEN), 
				Pieces.Type.QUEEN, Pieces.Type.QUEEN.getSymbol());
		
		verifyCreation(Pieces.createWhite(Type.KING), Pieces.createBlack(Type.KING), 
				Pieces.Type.KING, Pieces.Type.KING.getSymbol());
		
		Pieces blank = Pieces.noPiece();
		assertEquals('.', blank.getSymbol());
		assertEquals("BLANK", blank.getType());
	}
	
	private void verifyCreation(
			Pieces whitePiece, 
			Pieces blackPiece, 
			Pieces.Type type, 
			char symbol) {
		
		assertTrue(whitePiece.isWhite());
		assertEquals(type.toString(), whitePiece.getType());
		assertEquals(symbol, whitePiece.getSymbol());
		
		assertTrue(blackPiece.isBlack());
		assertEquals(type.toString(), blackPiece.getType());
		assertEquals(Character.toUpperCase(symbol), Character.toUpperCase(blackPiece.getSymbol()));
	}
}