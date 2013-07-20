package chess;
import java.util.ArrayList;
import pieces.Pawn;
import static pieces.Pawn.*;

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
		for ( i = 0; i < 8; i++) {			
			firstRow.add(new Pawn(Pawn.sBlank));
		}
		
		ArrayList<Pawn> secondRow = new ArrayList<Pawn>();
		rows.add(secondRow);
		for ( i = 0; i < 8; i++) {
			secondRow.add(new Pawn(Pawn.sWhite));
			numChessman++;
		}
		
		ArrayList<Pawn> thirdRow = new ArrayList<Pawn>();
		rows.add(thirdRow);
		for ( i = 0; i < 8; i++) {			
			thirdRow.add(new Pawn(Pawn.sBlank));
		}

		ArrayList<Pawn> fourthRow = new ArrayList<Pawn>();
		rows.add(fourthRow);
		for ( i = 0; i < 8; i++) {			
			fourthRow.add(new Pawn(Pawn.sBlank));
		}

		ArrayList<Pawn> fifthRow = new ArrayList<Pawn>();
		rows.add(fifthRow);
		for ( i = 0; i < 8; i++) {			
			fifthRow.add(new Pawn(Pawn.sBlank));
		}
		
		ArrayList<Pawn> sixthRow = new ArrayList<Pawn>();
		rows.add(sixthRow);
		for ( i = 0; i < 8; i++) {			
			sixthRow.add(new Pawn(Pawn.sBlank));
		}
		
		ArrayList<Pawn> seventhRow = new ArrayList<Pawn>();
		rows.add(seventhRow);
		for ( i = 0; i < 8; i++) {
			seventhRow.add(new Pawn(Pawn.sBlack));
			numChessman++;
		}
		
		ArrayList<Pawn> eighthRow = new ArrayList<Pawn>();
		rows.add(eighthRow);
		for ( i = 0; i < 8; i++) {			
			eighthRow.add(new Pawn(Pawn.sBlank));
		}
	}
}