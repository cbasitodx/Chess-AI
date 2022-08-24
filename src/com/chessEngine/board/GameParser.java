package com.chessEngine.board;

import com.chessEngine.pieces.*;

public class GameParser {

    /**
     * @pre The parameter {@code coords} must be formatted as a coordinate in algebraic notation (AN)
     * @param coords
     *        Coordinate string in algebraic notation
     * @return an array containing the row coordinate and the column coordinate
     */
    public static int[] toBoardCoords(String coords)
    {
        char colCoord = coords.charAt(0);
        char rowCoord = coords.charAt(1);

        int[] boardCoords = new int[2];

        String characters = "abcdefgh";

        boardCoords[1] = characters.indexOf(Character.toLowerCase(colCoord)) - 1;

        boardCoords[0] = Character.getNumericValue(rowCoord) - 1;
        
        return boardCoords;
    }

    /**
     * @pre The parameter {@code pieces} must be formatted as a coordinate piece letter + algebraic notation (e.g Ka4) 
     * @param pieces
     *        Array of pieces and their position to be placed on the board
     * @return a matrix (2d array) representing the filled board
     */
    public static ChessPiece[][] initBoard(String[] pieces, Piece[][] gameBoard)
    {
        Piece[][] newBoard = gameBoard;

        for(int i = 0; i < pieces.length; i++)
        {

        }

        return newBoard;
    }

    //public static String toAlgebraicCoords(int[] coords)
    //{
    //    return null;
    //}
    
}