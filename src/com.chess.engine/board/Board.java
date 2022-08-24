package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public interface Board{
    
    /*
     *
     * Responsabilities of the Board interface:
     * 
     * > Represent (and create) a board of n x m dimensions
     * 
     * > Write the current board in some notation file at the end of every match
     * 
     * > Add, change and eliminate pieces on the board (via some notation)
     * 
     * > Set the winner to the current board
     * 
     * > Reset the current board
     * 
     */

    //(Setter) Creates the board adding the initial {pieces} to the empty board
    public void createBoard(String[] pieces);

    //(Setter) Adds {piece} to {position} (if and only if the position is not occupied and is in range)
    public void addPiece(Piece piece, String position);

    //(Setter) Moves piece on {initPos} to {endPos} on the board (if and only if the movement is valid and the position is in range)
    public void movePiece(String initPos, String endPos);

    //(Setter) Deletes a piece at {position} on the board (if and only if there is a piece in the place and the place is in range)
    public void deletePiece(String position);

    //(Setter) Sets the winner to the current board
    public void setWinner(Enum player);

    //(Setter) Resets the board
    public void resetBoard();

    //(Getter) Returns the current state of the board as a 2d array
    public String[][] getBoard();

    //(Getter) Returns the current state of the board as a string
    public String toString();


}
