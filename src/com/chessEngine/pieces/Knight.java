package com.chessEngine.pieces;

import com.chessEngine.pieces.ChessPiece;

public class Knight extends ChessPiece{
    
	public Knight(Color color, int row, int column) {
		super(color, KNIGHT, row, column, 3)
	}
	
	//For the Knight, there are only eight moves, in resume 2 in diferent directions
	public boolean checkMove(int toRow, int toCol) {
		return Math.abs(this.row - toRow) == 2 && Math.abs(this.column - toCol) == 1 ||
				Math.abs(this.row - toRow) == 1 && Math.abs(this.column - toCol) == 2;
	}
	
	public void move(int toRow, int toCol) {
		this.row = toRow;
		this.column = toCol;
	}
}
