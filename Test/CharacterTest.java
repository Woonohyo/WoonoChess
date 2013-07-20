import junit.framework.TestCase;


public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
//		char NEWLINE = 
		assertEquals(true, Character.isWhitespace('\n'));
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace(' '));
		
		
		
	}

}
