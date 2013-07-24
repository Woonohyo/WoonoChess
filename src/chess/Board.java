package chess;
import java.util.ArrayList;
import static pieces.Pawn.*;
import pieces.Pawn;

/**
 * 체스 보드판을 생성합니다.
 * 체스 말의 개수와, 가지고 있는 Pawn의 목록을 배열로 저장합니다.
 * @author Woonohyo & Minju
 */

public class Board {
	public int numChessman = 0;
	public int numPawn = 0;
	public static final int boardSize = 8;
	ArrayList<ArrayList<Pawn>> rows = new ArrayList<ArrayList<Pawn>>();

	/**
	 * 체스 보드에 쓰일 여덟개의 row를 생성합니다.
	 */
	public void initialize() {
		rowInit();
		
		for ( int idx = 0; idx < boardSize; idx++) {
			if (idx == 1) rowFiller(idx, SWHITEPAWN);
			else if (idx == 6) rowFiller(idx, SBLACKPAWN);
			else rowFiller(idx, SBLANKPAWN);
		}
	}
	
	public void rowInit () {
		for ( int idx = 0; idx < boardSize; idx++) {
			rows.add(new ArrayList<Pawn>());
		}
	}
	
	public void rowFiller (int num, String sColor) {
		for ( int idx = 0; idx < boardSize; idx++) {
				rows.get(num).add(new Pawn(sColor));
				if (sColor == SWHITEPAWN || sColor == SBLACKPAWN) {
					numChessman++;
					numPawn++;
				}
		}
	}
}