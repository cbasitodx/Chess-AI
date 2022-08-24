package com.chess.engine.board;

import com.chess.engine.board.Board;

public class ChessBoard implements Board{

    public enum Players{
        BLACK,
        WHITE,
        NONE
    }
    
    public int dims;

    public boolean[][] graphicsBoard;

    public char[][] gameBoard;

    public Players winner = Players.NONE; //Set default to NONE because no one is winning the current match

    public ChessBoard(int dims)
    {
        this.dims = dims;

        this.graphicsBoard = new boolean[this.dims][this.dims];
        this.gameBoard = new char[this.dims][this.dims];

        //Initialises the game board to an empty board and fills the graphic board

        boolean shadedTile = false;

        boolean pairBoard = this.dims % 2 == 0;

        for(int i = 0; i < this.dims; i++)
        {
            for(int j = 0; j < this.dims; j++)
            {   
                shadedTile = !shadedTile;

                this.gameBoard[i][j] = '*';
                this.graphicsBoard[i][j] = shadedTile;
            }
            if(pairBoard)
            {
                shadedTile = !shadedTile;
            }
        }
    }

    private boolean inBounds()
    {
        return false;
    }

    public void createBoard(String[] pieces)
    {
        
    }

    public void addPiece(Piece piece, String position)
    {

    }

    public void movePiece(String initPos, String endPos)
    {

    }

    public void deletePiece(String position)
    {

    }

    public void setWinner(Enum player)
    {

    }

    public void resetBoard()
    {
        
    }

    public String[][] getBoard()
    {
        return this.gameBoard;
    }

    public String toString()
    {
        String board = "[ \n";

        for(int i = 0; i < numOfRows; i++)
        {
            for(int j = 0; j < numOfCols; j++)
            {
                board += " " + gameBoard[i][j];
            }
            board += "\n";
        }
        board += "]";

        return board;
    }

}
