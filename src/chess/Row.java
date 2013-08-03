package chess;

import java.util.ArrayList;

import pieces.Pieces;
import pieces.Pieces.Color;
import static chess.Board.COLUMN_SIZE;
import static pieces.Pieces.Color.*;
import static pieces.Pieces.Type.*;

public class Row {
	
	static int[] numOfPawn = {0, 0, 0, 0, 0, 0, 0, 0};
	
	public static ArrayList<Pieces> CreateBlackMain() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		row.add(Pieces.create(BLACK, ROOK));
		row.add(Pieces.create(BLACK, KNIGHT));
		row.add(Pieces.create(BLACK, BISHOP));
		row.add(Pieces.create(BLACK, QUEEN));
		row.add(Pieces.create(BLACK, KING));
		row.add(Pieces.create(BLACK, BISHOP));
		row.add(Pieces.create(BLACK, KNIGHT));
		row.add(Pieces.create(BLACK, ROOK));
		
		return row;
	}
	
	public static ArrayList<Pieces> CreateBlackPawns() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(BLACK, PAWN));
		
		return row;
	}

	public static ArrayList<Pieces> CreateBlankRow() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(NONE, BLANK));
		
		return row;
	}
	
	public static ArrayList<Pieces> CreateWhiteMain() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		row.add(Pieces.create(WHITE, ROOK));
		row.add(Pieces.create(WHITE, KNIGHT));
		row.add(Pieces.create(WHITE, BISHOP));
		row.add(Pieces.create(WHITE, QUEEN));
		row.add(Pieces.create(WHITE, KING));
		row.add(Pieces.create(WHITE, BISHOP));
		row.add(Pieces.create(WHITE, KNIGHT));
		row.add(Pieces.create(WHITE, ROOK));
		
		return row;
	}

	public static ArrayList<Pieces> CreateWhitePawns() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(WHITE, PAWN));
		
		return row;
	}

	public static String getSymbols(ArrayList<Pieces> row) {
		StringBuilder sb1 = new StringBuilder();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			sb1.append(row.get(i).getSymbol());
		
		return sb1.toString();
	}
	
	public static double getRowPoints(ArrayList<Pieces> row, Color color) {
		double rowPoints = 0;
		
		for ( int colIdx = 0; colIdx < COLUMN_SIZE; colIdx++ ) {
			if ( color == Color.WHITE && Character.isLowerCase(row.get(colIdx).getSymbol()) ){
				rowPoints = rowPoints + row.get(colIdx).getPoint();
				if(row.get(colIdx).getSymbol() == 'p')
					numOfPawn[colIdx]++;
			}
			
			if ( color == Color.BLACK && Character.isUpperCase(row.get(colIdx).getSymbol()) ){
				rowPoints = rowPoints + row.get(colIdx).getPoint();
				if(row.get(colIdx).getSymbol() == 'P')
					numOfPawn[colIdx]++;
			}
		}
		
		return rowPoints;
	}

	public static double getPawnPoints() {
		double pawnPoints = 0;
		
		for(int i : numOfPawn){
			if( i > 1 ) pawnPoints += 0.5 * i;		
		}
		
		for(int j = 0; j < 8; j++)
			numOfPawn[j] = 0;
		
		return pawnPoints;
	}
}
