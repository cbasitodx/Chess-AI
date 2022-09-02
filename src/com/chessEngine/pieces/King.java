package com.chessEngine.pieces;

import com.chessEngine.pieces.ChessPiece;

public class King extends ChessPiece{
	
	private boolean firstMove = true;
	
	public King(Color color, int row, int column) {
		super(color, KING, row, column, 100)
	}
	
	//Pre: you know that where you are moving the King is not the initial place.
	public boolean checkMove(int toRow, int toCol) {
		return Math.abs(this.row - toRow) <= 1 && Math.abs(this.column - toCol) <= 1;
	}
	
	public void move(int toRow, int toCol) {
		this.row = toRow;
		this.column = toCol;
	}
}
