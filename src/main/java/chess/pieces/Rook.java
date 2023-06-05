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
public class Rook extends ChessPiece {
    
    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        if (super.getColor() == Color.BLACK) {
            return "\u265c";
        }
        return "\u2656";
    }
}
