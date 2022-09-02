package com.chessEngine.pieces;

import com.chessEngine.pieces.ChessPiece;

public class Bishop extends ChessPiece{
    
	public Bishop(Color color, int row, int column) {
		super(color, BISHOP, row, column, 3)
	}

	/*
	Pre: you know that where you are moving the BISHOP is not the initial place.
	I dont know if in the trayect there are any piece

	If the Bishop can move to there, it must be in the diagonal, change in the row is equal to the change 
	in the column
	 */
	public boolean checkMove(int toRow, int toCol) {
		return Math.abs(toRow - this.row) == Math.abs(toCol - this.column);
	}
	
	public void move(int toRow, int toCol) {
		this.row = toRow;
		this.column = toCol;
	}
}
