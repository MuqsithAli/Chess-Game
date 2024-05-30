package Piece;

import javax.swing.*;

import java.awt.*;
import java.util.Objects;

import static Main.Main.*;

public class King {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public King(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public void highlightCells(int row, int col) {
        //forward
        if (Objects.equals(this.color, "white")) {
            //forward
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    if(row - 2 >= 0 && col - 1 >= 0 && col + 1 < board.length){
                        if((getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))){
                            return;
                        }
                        if(((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))){
                            return;
                        }
                    }
                    board[row - 1][col].setBackground(blueHighlight);
                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("black")) {
                    if(row - 2 >= 0 && col -1 >= 0 && col + 1 < board.length){
                        if((getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))){
                            return;
                        }
                    }
                    board[row - 1][col].setBackground(redHighlight);
                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

        } else {
            //forward
            if (row + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty") && !(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                    board[row + 1][col].setBackground(blueHighlight);
                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("white") && !(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                    board[row + 1][col].setBackground(redHighlight);
                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }
    }

    public boolean isSafe(int row, int col) {
        //detect pawns
        if (Objects.equals(this.color, "white")) {
            //check diagonals
            //left upper diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                }
            }
        }
        return true;
    }
}
