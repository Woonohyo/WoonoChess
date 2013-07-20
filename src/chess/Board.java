package chess;
import java.util.ArrayList;

import pieces.Pawn;

/**
 * 체스 보드판을 생성합니다.
 * 체스 말의 개수와, 가지고 있는 Pawn의 목록을 배열로 저장합니다.
 * @author Woonohyo & Jay
 */

public class Board {
	public int numChessman = 0;
	ArrayList<ArrayList<Pawn>> rows = new ArrayList<ArrayList<Pawn>>();

	/**
	 * 체스 보드에 쓰일 여덟개의 row를 생성합니다.
	 */
	public void initialize() {
		int i;
		ArrayList<Pawn> firstRow = new ArrayList<Pawn>();
		rows.add(firstRow);
		
		ArrayList<Pawn> secondRow = new ArrayList<Pawn>();
		rows.add(secondRow);
		for ( i = 0; i < 8; i++) {
			secondRow.add(new Pawn(Pawn.sWhite, Pawn.whitePawn));
			numChessman++;
		}
		
		ArrayList<Pawn> thirdRow = new ArrayList<Pawn>();
		rows.add(thirdRow);

		ArrayList<Pawn> fourthRow = new ArrayList<Pawn>();
		rows.add(fourthRow);

		ArrayList<Pawn> fifthRow = new ArrayList<Pawn>();
		rows.add(fifthRow);
		
		ArrayList<Pawn> sixthRow = new ArrayList<Pawn>();
		rows.add(sixthRow);
		
		ArrayList<Pawn> seventhRow = new ArrayList<Pawn>();
		rows.add(seventhRow);
		for ( i = 0; i < 8; i++) {
			seventhRow.add(new Pawn(Pawn.sBlack, Pawn.blackPawn));
			numChessman++;
		}
		
		ArrayList<Pawn> eighthRow = new ArrayList<Pawn>();
		rows.add(eighthRow);
	}
}