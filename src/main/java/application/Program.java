/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author gobboboy
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        List<ChessPiece> list = new ArrayList<>();
        while(true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
                    
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            if (capturedPiece != null) {
                list.add(capturedPiece);
            }
            System.out.print("Captured Pieces:");
            for (ChessPiece p : list) {
                System.out.print(" " + p);
            }
            System.out.println();
        }
    }
}
