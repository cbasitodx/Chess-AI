package com.chessEngine.board;

import com.chessEngine.pieces.Piece;

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


    /**
     * (Setter) Fills the empty chess board with pieces
     * @param pieces
     *        List of Strings representing the pieces and their initial positions (e.g {"Na5", "Kf3")
     * @return Nothing. It fills the empty board 
     */
    public void initBoard(String[] pieces);

    /**
     * (Setter) Adds a piece to a given position
     * @param piece
     *        Piece object to be added
     * @param position
     *        Position where {@code piece} will be added
     * @throws Exception if the position is occupied or if the position is out of the board range
     * @return Nothing. It adds a given piece to a position 
     */
    public void addPiece(Piece piece, String position); //throws Exception

    //(Setter) Moves piece on {initPos} to {endPos} on the board (if and only if the movement is valid and the position is in range)
    /**
     * (Setter) Moves the piece on {@code initPos} to {@code endPos} on the board
     * @param initPos
     *        Position of the piece we wish to move
     * @param endPos
     *        Final position of the selected piece
     * @throws Exception if the position is null or if the position is out of the board range
     * @return Nothing. It moves a piece in a position to another position 
     */
    public void movePiece(String initPos, String endPos); //throws Exception

    /**
     * (Setter) Deletes a piece in a given position
     * @param position
     *        Position of the piece to be deleted
     * @throws Exception if the position is null or if the position is out of the board range
     * @return Nothing. It removes a piece in a given position 
     */
    public void deletePiece(String position); //throws Exception

    //(Setter) Sets the winner to the current board
    //public void setWinner(Enum player);

    /**
     * (Setter) Resets the board
     * @return Nothing. It resets the whole board
     */
    public void resetBoard();

    //(Getter) Returns the current state of the board as a 2d array
    /**
     * (Getter) Returns the current state of the board as a 2d array
     * @return A 2d array of pieces
     */
    public Piece[][] getBoard();

    //(Getter) Returns the current state of the board as a string
    /**
     * (Getter) Returns the current state of the board as a String
     * @return A String that represents the current state of the board 
     */
    public String toString();
}
