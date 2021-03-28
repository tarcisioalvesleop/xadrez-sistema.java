package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//position = null;
	}
	
	protected Board getBoard() { 
		//somente class detntro do mesmo pacote ou sub classes terao acesso
		return board;
	}
	
	

}
