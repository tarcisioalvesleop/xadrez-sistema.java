package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		//parametros tabuleiro e cor da peça
		super(board, color);		
	}
	@Override
	public String toString() {
		return "R";
	}

}
