package chess;
import java.util.ArrayList;
import static util.StringUtil.NEWLINE;
import chess.Row;
import pieces.Pieces;

/**
 * 체스 보드판을 생성합니다.
 * 체스 말의 개수와, 가지고 있는 Pawn의 목록을 배열로 저장합니다.
 * @author Woonohyo & Jay
 */

public class Board {
	public static final int COLUMN_SIZE = 8;
	public static final int ROW_SIZE = 8;
	ArrayList<ArrayList<Pieces>> Board = new ArrayList<ArrayList<Pieces>>();
	
	public Board(){
	}
	
	public void initialize() {
		Board.add(Row.CreateBlackMain());
		Board.add(Row.CreateBlackPawns());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateWhitePawns());
		Board.add(Row.CreateWhiteMain());
	}

	public String print() {
		StringBuilder sb1 = new StringBuilder();
		for ( int i = 0; i < ROW_SIZE; i++) {
			sb1.append(Row.getSymbols(Board.get(i)));
			sb1.append(NEWLINE);
		}
		return sb1.toString();
	}

}