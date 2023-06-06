/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author gobboboy
 */
public class King extends ChessPiece {
    
    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        if (super.getColor() == Color.BLACK) {
            return "\u265a";
        }
        return "\u2654";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
