package Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Main.Main.*;
import static Main.Main.board;

public class Bishop {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public Bishop(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }
        } else {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    ans.add(board[i][j]);
                    break;
                }
                ans.add(board[i][j]);
            }
        }

        return ans;
    }

    public void highlightCells(int row, int col) {
        //unselect rest
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i + j) % 2 != 0) {
                    board[i][j].setBackground(darkSquare); // Dark square color
                } else {
                    board[i][j].setBackground(lightSquare); // Light square color
                }
            }
        }
        if (Objects.equals(this.color, "white")) {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
        } else {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white")) {
                    board[i][j].setBackground(redHighlight);
                    board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board[i][j].setBackground(blueHighlight);
                board[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
        }
    }
}
