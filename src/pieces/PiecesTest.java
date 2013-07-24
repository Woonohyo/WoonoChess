package pieces;
import junit.framework.TestCase;
import static pieces.Pieces.*;

public class PiecesTest extends TestCase {
	public void testCreate() throws Exception {
		Pieces pawn1 = Pieces.create(WHITE_COLOR,PAWN);
		assertEquals("white", pawn1.getColor());
		assertEquals("Pawn", pawn1.getName());
	}
}