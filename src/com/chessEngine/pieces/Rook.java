package com.chessEngine.pieces;

import com.chessEngine.pieces.ChessPiece;

public class Rook extends ChessPiece{
    
	private boolean firstMove = true;
	
	public Rook(Color color, int row, int column) {
		super(color, ROOK, row, column, 5)
	}
	
	/*
	Pre: you know that where you are moving the ROOK is not the initial place.
	I dont know if in the trayect there are any piece
		
	If the Rook can move to there, or its in the same row, or its in the same column
	 */
	public boolean checkMove(int toRow, int toCol) {
		return toRow == this.row || toCol == this.column;
	}
	
	public void move(int toRow, int toCol) {
		this.row = toRow;
		this.column = toCol;
	}
}
