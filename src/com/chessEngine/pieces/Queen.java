package com.chessEngine.pieces;

import com.chessEngine.pieces.ChessPiece;

public class Queen extends ChessPiece{
	
	public Queen(Color color, int row, int column) {
		super(color, QUEEN, row, column, 10)
	}

	/*
	Pre: you know that where you are moving the Queen is not the initial place.
	I dont know if in the trayect there are any piece

	The Queen moves like the Bishop and the Rook
	 */
	public boolean checkMove(int toRow, int toCol) {
		return (Math.abs(toRow - this.row) == Math.abs(toCol - this.column)) || 
				(toRow == this.row || toCol == this.column);
	}
	
	public void move(int toRow, int toCol) {
		this.row = toRow;
		this.column = toCol;
	}
}
