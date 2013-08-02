package chess;
import java.util.ArrayList;

import static util.StringUtil.NEWLINE;
import chess.Row;
import pieces.Pieces;
import pieces.Pieces.Color;
import pieces.Pieces.Type;

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
	public void blankInitialize() {
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
	
	}

	public String print() {
		StringBuilder sb1 = new StringBuilder();
		for ( int i = 0; i < ROW_SIZE; i++) {
			sb1.append(Row.getSymbols(Board.get(i)));
			sb1.append(NEWLINE);
		}
		return sb1.toString();
	}

	public int countPieces(Color color, Type type) {
		int num=0;
		
		for(int rowIdx=0; rowIdx<ROW_SIZE; rowIdx++){
			for(int colIdx=0; colIdx<COLUMN_SIZE; colIdx++){
				if(Board.get(rowIdx).get(colIdx).getColor() == color.toString() && 
						Board.get(rowIdx).get(colIdx).getType() == type.toString())
					num++;
			}
		}
		
		return num;
	}

	public char getPiece(String coordinate) {
		char array[] = coordinate.toCharArray();
		int colIdx = (int)array[0];
		int rowIdx = Character.getNumericValue(array[1]);
		
		return Board.get(ROW_SIZE - rowIdx).get(colIdx - 97).getSymbol();
	}

	public void setPiece(String coordinate, Pieces chessman) {
		char array[] = coordinate.toCharArray();
		int colIdx = (int)array[0];
		int rowIdx = Character.getNumericValue(array[1]);
		
		Board.get(ROW_SIZE - rowIdx).set(colIdx - 97, chessman);
		
	}

	public double getPoints(Color color) {
		double point = 0;
		int numOfPawn = 0;
		
		if ( color == Color.WHITE ) {
			for( int rowIdx = 0; rowIdx < ROW_SIZE; rowIdx++ ){
				for( int colIdx = 0; colIdx < COLUMN_SIZE; colIdx++ ){
					if(Character.isLowerCase(Board.get(rowIdx).get(colIdx).getSymbol())) {
						point = point + Board.get(rowIdx).get(colIdx).getPoint();
						System.out.println(point);
					}
					if( Board.get(colIdx).get(rowIdx).getSymbol() == 'p' ) {
						numOfPawn++;
						System.out.println(numOfPawn);
					}
					if ( numOfPawn > 1) {
						point = point - (0.5 * numOfPawn);
					}
				}
				numOfPawn = 0;
				System.out.println(point);
			}
		}
				
		else if ( color == Color.BLACK) {
			for(int rowIdx = 0; rowIdx < ROW_SIZE; rowIdx++){
				for( int colIdx = 0; colIdx < COLUMN_SIZE; colIdx++ ){
					if(!(Character.isLowerCase(Board.get(rowIdx).get(colIdx).getSymbol())))
						point = point + Board.get(rowIdx).get(colIdx).getPoint();
					if( Board.get(colIdx).get(rowIdx).getSymbol() == 'p' )
						numOfPawn++;
					if ( numOfPawn > 1)
						point = point - (0.5 * numOfPawn);
				}
			}
		}
		
		
		return point;
	}
}