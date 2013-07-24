package chess;

import java.util.ArrayList;
import pieces.Pieces;
import static pieces.Pieces.*;
import static chess.Board.COLUMN_SIZE;

public class Row {
	public static ArrayList<Pieces> CreateBlackMain() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		row.add(Pieces.create(BLACK_COLOR, ROOK));
		row.add(Pieces.create(BLACK_COLOR, KNIGHT));
		row.add(Pieces.create(BLACK_COLOR, BISHOP));
		row.add(Pieces.create(BLACK_COLOR, QUEEN));
		row.add(Pieces.create(BLACK_COLOR, KING));
		row.add(Pieces.create(BLACK_COLOR, BISHOP));
		row.add(Pieces.create(BLACK_COLOR, KNIGHT));
		row.add(Pieces.create(BLACK_COLOR, ROOK));
		return row;
	}
	
	public static ArrayList<Pieces> CreateBlackPawns() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(BLACK_COLOR, PAWN));
		return row;
	}


	public static ArrayList<Pieces> CreateBlankRow() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(BLANK_COLOR, BLANK_COLOR));
		return row;
	}
	

	public static ArrayList<Pieces> CreateWhiteMain() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		row.add(Pieces.create(WHITE_COLOR, ROOK));
		row.add(Pieces.create(WHITE_COLOR, KNIGHT));
		row.add(Pieces.create(WHITE_COLOR, BISHOP));
		row.add(Pieces.create(WHITE_COLOR, QUEEN));
		row.add(Pieces.create(WHITE_COLOR, KING));
		row.add(Pieces.create(WHITE_COLOR, BISHOP));
		row.add(Pieces.create(WHITE_COLOR, KNIGHT));
		row.add(Pieces.create(WHITE_COLOR, ROOK));
		return row;
	}

	public static ArrayList<Pieces> CreateWhitePawns() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(WHITE_COLOR, PAWN));
		return row;
	}

	public static String getSymbols(ArrayList<Pieces> row) {
		StringBuilder sb1 = new StringBuilder();
		for ( int i = 0; i < COLUMN_SIZE; i++)
			sb1.append(row.get(i).getSymbol());
		return sb1.toString();
	}
}
