package chess;

import java.util.ArrayList;
import pieces.Pieces;
import static chess.Board.COLUMN_SIZE;
import static pieces.Pieces.Color.*;
import static pieces.Pieces.Type.*;

public class Row {
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
}
