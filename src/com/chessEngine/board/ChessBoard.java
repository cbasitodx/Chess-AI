package com.chessEngine.board;

import com.chessEngine.pieces.*;

public class ChessBoard implements Board{

    //public enum Players{
    //    BLACK,
    //    WHITE,
    //    NONE
    //}
    
    private int dims = 8; //Set by default to 8
    private boolean[][] graphicsBoard;
    private ChessPiece[][] gameBoard;
    //private Players winner = Players.NONE; //Set default to NONE because no one is winning the current match

    public ChessBoard()
    {
        this.graphicsBoard = new boolean[this.dims][this.dims];
        this.gameBoard = new ChessPiece[this.dims][this.dims]; //Initialising the game board to null

        //Initialises and fills the graphic board
        boolean shadedTile = false;

        boolean evenBoard = this.dims % 2 == 0; //Conditional that checks if the dimension of the board is even or not

        for(int i = 0; i < this.dims; i++)
        {
            for(int j = 0; j < this.dims; j++)
            {   
                shadedTile = !shadedTile;
                this.graphicsBoard[i][j] = shadedTile;
            }
            if(evenBoard)
            {
                shadedTile = !shadedTile;
            }
        }
    }

    private boolean inBounds(int rowPos, int colPos)
    {
        return (rowPos >= 0 && rowPos < this.dims) && (colPos >= 0 && colPos < this.dims);
    }

    public void initBoard(String[] pieces)
    {
        this.gameBoard = GameParser.initBoard(pieces, this.gameBoard);
    }

    public void addPiece(Piece piece, String position) //throws Exception
    {
        //int[] boardPos = GameParser.toBoardCoords(position);
        //int rowPos = boardPos[0];
        //int colPos = boardPos[1];
        //
        //if(inBounds(rowPos, colPos))
        //{
        //  gameBoard[rowPos][colPos] = piece;
        //}
        //else
        //{
        //  throw Exception;
        //}
    }

    public void movePiece(String initPos, String endPos) //throws Exception
    {
        //int[] initBoardPos = GameParser.toBoardCoords(initPos);
        //int[] endBoardPos = GameParser.toBoardCoords(endPos);
        //
        //int initRowPos = initBoardPos[0];
        //int initColPos = initBoardPos[1];
        //
        ////int endRowPos = endBoardPos[0];
        ////int endColPos = endBoardPos[1];
        //
        //piece = gameBoard[initRowPos][initColPos] 
        //
        //if((piece != null) && (inBounds(initRowPos, initColPos) && (inBounds(endRowPos, endColPos))))
        //{
        //  if(gameBoard[endRowPos][endColPos] != null)
        //  {
        //      gameBoard[endRowPos][endColPos] = null; //If the position the piece is trying to move is occupied by another piece, kill it (set the piece to null)
        //  }
        //  piece.move(endRowPos, endColPos);
        //}
        //else
        //{
        //  throw Exception;
        //}
    }

    public void deletePiece(String position) //throws Exception
    {

    }

    //public void setWinner(Enum player){}

    public void resetBoard()
    {
        
    }

    public Piece[][] getBoard()
    {
        return this.gameBoard;
    }

    public String toString()
    {
        String board = "[ \n";
        ChessPiece currentTile = null;

        for(int i = 0; i < dims; i++)
        {
            for(int j = 0; j < dims; j++)
            {   
                currentTile = gameBoard[i][j]; 
                if(currentTile instanceof King)
                {
                    board += " " + "K";
                }
                else if(currentTile instanceof Queen)
                {
                    board += " " + "Q";
                }
                else if(currentTile instanceof King)
                {
                    board += " " + "K";
                }
                else if(currentTile instanceof Bishop)
                {
                    board += " " + "B";
                }
                else if(currentTile instanceof Knight)
                {
                    board += " " + "K";
                }
                else if(currentTile instanceof Pawn)
                {
                    board += " " + "p";
                }
                else if(currentTile instanceof Rook)
                {
                    board += " " + "R";
                }
                else
                {
                    board += " " + "*";
                }
            }
            board += "\n";
        }
        board += "]";

        return board;
    }
}
