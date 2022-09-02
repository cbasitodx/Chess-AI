package com.chessEngine.pieces;

import com.chessEngine.pieces.ChessPiece;

public class Pawn extends ChessPiece{
    
	private boolean firstMove = true;
	
	public Pawn(Color color, int row, int column) {
		super(color, PAWN, row, column, 1)
	}
	
	
	public boolean checkMove(int toRow, int toCol) {
		//When you eat a piece with the pawn, its a diagonal with 1 range.
		//I dont consider if in the small diagonal there is any piece.
		if(Math.abs(toRow - this.row) == 1) {
			if(Math.abs(toCol - this.column) == 1) {
				return true;
			}
			return true;
		}
		else if(firstMove) {
			return Math.abs(toRow - this.row) == 2;
		}
	}
	
	public void move(int toRow, int toCol) {
		this.row = toRow;
		this.column = toCol;
	}
}
