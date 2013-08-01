package chess;

import java.util.ArrayList;
import pieces.Pieces;
import static chess.Board.COLUMN_SIZE;

public class Row {
	public static ArrayList<Pieces> CreateBlackMain() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.ROOK));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.KNIGHT));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.BISHOP));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.QUEEN));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.KING));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.BISHOP));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.KNIGHT));
		row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.ROOK));
		
		return row;
	}
	
	public static ArrayList<Pieces> CreateBlackPawns() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(Pieces.Color.BLACK, Pieces.Piece.PAWN));
		
		return row;
	}

	public static ArrayList<Pieces> CreateBlankRow() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(Pieces.Color.BLANK, Pieces.Piece.BLANK));
		
		return row;
	}
	
	public static ArrayList<Pieces> CreateWhiteMain() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.ROOK));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.KNIGHT));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.BISHOP));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.QUEEN));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.KING));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.BISHOP));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.KNIGHT));
		row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.ROOK));
		
		return row;
	}

	public static ArrayList<Pieces> CreateWhitePawns() {
		ArrayList<Pieces> row = new ArrayList<Pieces>();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			row.add(Pieces.create(Pieces.Color.WHITE, Pieces.Piece.PAWN));
		
		return row;
	}

	public static String getSymbols(ArrayList<Pieces> row) {
		StringBuilder sb1 = new StringBuilder();
		
		for ( int i = 0; i < COLUMN_SIZE; i++)
			sb1.append(row.get(i).getSymbol());
		
		return sb1.toString();
	}
}
