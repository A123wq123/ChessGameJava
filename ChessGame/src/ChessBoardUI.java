// This file is the code for the UI part of a chess board, this does NOT include the squares, they have their own
// class for this purpose.

import javax.swing.*;
import java.awt.*;

public class ChessBoardUI {

    // The canvas on which we will work to implement the UI.
    JFrame frame;
    int numberOfRows = 8;

    public ChessBoardUI() {
        frame = new JFrame(); // Create the JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setTitle("ChessGame");

        // This makes it so the JFrame now obeys under the GridLayout Format (gives us a grid).
        frame.setLayout(new GridLayout(4, 4));

        // This will add the squares to the JFrame
        for (int row = 0; row < numberOfRows; row++) {
            for (int collumn = 0; collumn < numberOfRows; collumn++) {
                
            }
        }

        frame.setVisible(true); // Without this line the frame is not visible

        // The following two lines are to add a picture as the APP logo while running the code.
        //ImageIcon ChessAppImage = new ImageIcon("AppImage.png");
        //frame.setIconImage(ChessAppImage.getImage());

    }

    public void AddSquareUI() {

    }
}
