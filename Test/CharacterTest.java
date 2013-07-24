import static util.StringUtil.NEWLINE;
import junit.framework.TestCase;


public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertEquals(true, Character.isWhitespace('\n'));
		assertEquals(true, Character.isWhitespace('\t'));
		assertEquals(true, Character.isWhitespace(' '));
		
		assertEquals(false, Character.isUnicodeIdentifierStart('!'|'@'|'#'|'$'|'%'|'^'|'&'|'*'|'('|')'|'_'|'-'));
		assertEquals(false, Character.isUnicodeIdentifierStart('1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'|'0'));
		
		assertEquals(true, Character.isUnicodeIdentifierStart('민'|'주'));
	}
	
	public void testNewline() throws Exception {
		assertEquals("\n", NEWLINE);
	}

}
