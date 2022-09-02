package com.chessEngine.pieces;

import java.awt.Color;

import com.chessEngine.pieces.ChessPiece;

public abstract class ChessPiece implements Piece{
	
	public enum Color{BLACK,
					WHITE}
					
	public enum Type{KING,
					QUEEN,
					ROOK,
					BISHOP,
					KNIGHT,
					PAWN}
	
	private Color myColor;
	private Type myType;
	
	//column and row in the perspective of an array: 00, 01, 02...
	private int column;
	private int row;
	
	//value only for reference
	private int value;
	
	public ChessPiece(Color color, Type type, int row, int column, int value) {
		myColor = color;
		myType = type;
		this.column = column;
		this.row = row;
		this.value = value;
				
	}
	
    public String getColor() {
    	if (myColor == Color.WHITE) {
			return "white";
		}
    	else {
			return "black";
		}
    }
    
    public String getType(){
    	return myType.toString();
    }
    
    public boolean checkMove(int toRow, int toCol);
    
    public void move(int toRow, int toCol);
    
    
}