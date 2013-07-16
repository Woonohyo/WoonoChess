import java.util.ArrayList;


public class Board {
	public int numChessman = 0;
	ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	
	Board() {
	}

	public void addChessman(Pawn pawn) {
		pawns.add(pawn);
		numChessman++;
	}
}
