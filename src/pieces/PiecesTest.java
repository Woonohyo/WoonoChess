package pieces;
import junit.framework.TestCase;

public class PiecesTest extends TestCase {
	public void testCreate() throws Exception {

		Pieces pawn1 = Pieces.create("white","Pawn");
		assertEquals("white", pawn1.getColor());
		assertEquals("Pawn", pawn1.getName());		
	}
}