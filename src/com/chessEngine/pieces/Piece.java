package com.chessEngine.pieces;

public interface Piece {
	
    boolean checkMove(int toRow, int toCol);

    void move(int toRow, int toCol);

}
