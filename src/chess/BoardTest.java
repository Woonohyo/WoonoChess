package chess;
import util.StringUtil;
import junit.framework.TestCase;


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
}
