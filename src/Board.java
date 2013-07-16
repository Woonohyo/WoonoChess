import java.util.ArrayList;

/**
 * 체스 보드판을 생성합니다.
 * 체스 말의 개수와, 가지고 있는 Pawn의 목록을 배열로 저장합니다.
 * @author Woonohyo & Jay
 */

public class Board {
	public int numChessman = 0;
	ArrayList<Pawn> pawns = new ArrayList<Pawn>();

	/**
	 * 체스 보드판에 체스말 Pawn을 추가합니다.
	 * @param pawn
	 */
	public void addChessman(Pawn pawn) {
		pawns.add(pawn);
		numChessman++;
	}
}
