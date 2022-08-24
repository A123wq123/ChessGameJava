// This file is the code for the UI part of a chess board, this does NOT include the squares, they have their own
// class for this purpose.

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChessBoardUI {

    // The canvas on which we will work to implement the UI.
    JFrame frame;
    private static final int numberOfRows = 8;
    private final ArrayList<ChessSquareUI> list = new ArrayList<ChessSquareUI>();

    public ChessBoardUI() {
        frame = new JFrame(); // Create the JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setTitle("ChessGame");

        // This makes it so the JFrame now obeys under the GridLayout Format (gives us a grid).
        frame.setLayout(new GridLayout(8, 8));

        // This will add the squares to the JFrame
        this.addSquaresUI();
        this.addPieces();

        frame.setVisible(true); // Without this line the frame is not visible

        // The following two lines are to add a picture as the APP logo while running the code.
        // ImageIcon ChessAppImage = new ImageIcon("AppImage.png");
        // frame.setIconImage(ChessAppImage.getImage());

    }

    // This will add the squares to the JFrame
    // Going to remove the row and column of ChessSquareUI as it doesn't have it's place in UI, leaving for testing
    // purposes.
    private void addSquaresUI() {
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfRows; column++) {
                ChessSquareUI square = new ChessSquareUI(row, column);
                frame.add(square);
                list.add(square);
            }
        }
    }

    // the goal of this function will be to add the pieces to the UI. Issue is, I'm wondering if we add from here,
    // or if we should have the method (background code) be the one who decides where the pieces are.
    // EX: we check the method and if it says Tower then add tower on the square we are looking at.
    private void addPieces() {
        addWhitePieces();
        addBlackPieces();
    }

    private void addWhitePieces() {
        // Add Pawns
        for (int i = 0; i < numberOfRows; i++) {
            getSquareUI(6, i).setText(String.valueOf("\u2659"));
        }
        // Add towers
        for (int i  = 0; i < 2; i++) {
            getSquareUI(7, i*7).setText(String.valueOf("\u2656"));
        }
        // Add knights
        for (int i  = 0; i < 2; i++) {
            getSquareUI(7, 1+i*5).setText(String.valueOf("\u2658"));
        }
        // Add bishops
        for (int i  = 0; i < 2; i++) {
            getSquareUI(7, 2+i*3).setText(String.valueOf("\u2657"));
        }
        // Add queen
        getSquareUI(7,3).setText(String.valueOf("\u2655"));
        // Add king
        getSquareUI(7,4).setText(String.valueOf("\u2654"));
    }

    private void addBlackPieces() {
        // Add Pawns
        for (int i = 0; i < numberOfRows; i++) {
            getSquareUI(1, i).setText(String.valueOf("\u265F"));
        }
        // Add towers
        for (int i  = 0; i < 2; i++) {
            getSquareUI(0, i*7).setText(String.valueOf("\u265C"));
        }
        // Add knights
        for (int i  = 0; i < 2; i++) {
            getSquareUI(0, 1+i*5).setText(String.valueOf("\u265E"));
        }
        // Add bishops
        for (int i  = 0; i < 2; i++) {
            getSquareUI(0, 2+i*3).setText(String.valueOf("\u265D"));
        }
        // Add queen
        getSquareUI(0,3).setText(String.valueOf("\u265B"));
        // Add king
        getSquareUI(0,4).setText(String.valueOf("\u265A"));
    }

    // Gets us the square from the grid.
    private ChessSquareUI getSquareUI(int row, int column) {
        int index = numberOfRows * row + column;
        return list.get(index);
    }

}
