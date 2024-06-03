package Piece;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Main.Main.*;

public class Pawn {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public Pawn(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty") && canMove(row, col, row - 1, col)) {
                    ans.add(board[row - 1][col]);

                    if (row == 6 && getColor((ImageIcon) board[row - 2][col].getIcon()).equals("empty") && canMove(row, col, row - 2, col)) {
                        ans.add(board[row - 2][col]);
                    }
                }
            }
            if ((row - 1 >= 0 && col - 1 >= 0)) {
                if (getColor((ImageIcon) board[row - 1][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board[row - 1][col - 1].getIcon()).equals("king") && canMove(row, col, row - 1, col - 1)) {
                    ans.add(board[row - 1][col - 1]);
                }
            }
            if ((row - 1 >= 0 && col + 1 < board.length)) {
                if (getColor((ImageIcon) board[row - 1][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board[row - 1][col + 1].getIcon()).equals("king") && canMove(row, col, row - 1, col + 1)) {
                    ans.add(board[row - 1][col + 1]);
                }
            }
        } else {
            //check vacancy of forward cell
            if (row + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty") && canMove(row, col, row + 1, col)) {
                    ans.add(board[row + 1][col]);

                    //check initial position of pawn in order to advance 2 steps forward
                    if (row == 1 && getColor((ImageIcon) board[row + 2][col].getIcon()).equals("empty") && canMove(row, col, row + 2, col)) {
                        ans.add(board[row + 2][col]);
                    }
                }
            }

            //handle IOB
            if (col - 1 >= 0 && row + 1 < board.length) {
                //check if left diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board[row + 1][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board[row + 1][col - 1].getIcon()).equals("king") && canMove(row, col, row + 1, col - 1)) {
                    ans.add(board[row + 1][col - 1]);
                }
            }

            //Handle IOB
            if (col + 1 < board.length && row + 1 < board.length) {
                //check if right diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board[row + 1][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board[row + 1][col + 1].getIcon()).equals("king") && canMove(row, col, row + 1, col + 1)) {
                    ans.add(board[row + 1][col + 1]);
                }
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
            //check vacancy of forward cell
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty") && canMove(row, col, row - 1, col)) {
                    board[row - 1][col].setBackground(blueHighlight);
                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));

                    //check initial position of pawn in order to advance 2 steps forward
                    if (row == 6 && getColor((ImageIcon) board[row - 2][col].getIcon()).equals("empty") && canMove(row, col, row - 2, col)) {
                        board[row - 2][col].setBackground(blueHighlight);
                        board[row - 2][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }

            //handle IOB
            if (col - 1 >= 0 && row - 1 >= 0) {
                //check if left diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board[row - 1][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board[row - 1][col - 1].getIcon()).equals("king") && canMove(row, col, row - 1, col - 1)) {
                    board[row - 1][col - 1].setBackground(redHighlight);
                    board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //Handle IOB
            if (col + 1 < board.length && row - 1 >= 0) {
                //check if right diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board[row - 1][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board[row - 1][col + 1].getIcon()).equals("king") && canMove(row, col, row - 1, col + 1)) {
                    board[row - 1][col + 1].setBackground(redHighlight);
                    board[row - 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        } else {
            //check vacancy of forward cell
            if (row + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty") && canMove(row, col, row + 1, col)) {
                    board[row + 1][col].setBackground(blueHighlight);
                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));

                    //check initial position of pawn in order to advance 2 steps forward
                    if (row == 1 && getColor((ImageIcon) board[row + 2][col].getIcon()).equals("empty") && canMove(row, col, row + 2, col)) {
                        board[row + 2][col].setBackground(blueHighlight);
                        board[row + 2][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }

            //handle IOB
            if (col - 1 >= 0 && row + 1 < board.length) {
                //check if left diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board[row + 1][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board[row + 1][col - 1].getIcon()).equals("king") && canMove(row, col, row + 1, col - 1)) {
                    board[row + 1][col - 1].setBackground(redHighlight);
                    board[row + 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //Handle IOB
            if (col + 1 < board.length && row + 1 < board.length) {
                //check if right diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board[row + 1][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board[row + 1][col + 1].getIcon()).equals("king") && canMove(row, col, row + 1, col + 1)) {
                    board[row + 1][col + 1].setBackground(redHighlight);
                    board[row + 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }
    }

    public boolean canMove(int prevRow, int prevCol, int row, int col) {
        if (Objects.equals(this.color, "white")) {
            ImageIcon temp = (ImageIcon) board[row][col].getIcon();
            board[row][col].setIcon(whitePawn1);
            board[prevRow][prevCol].setIcon(null);
            if (isCheck("white", board)) {
                board[row][col].setIcon(temp);
                board[prevRow][prevCol].setIcon(whitePawn1);
                return false;
            } else {
                board[row][col].setIcon(temp);
                board[prevRow][prevCol].setIcon(whitePawn1);
                return true;
            }
        } else {
            ImageIcon temp = (ImageIcon) board[row][col].getIcon();
            board[row][col].setIcon(blackPawn1);
            board[prevRow][prevCol].setIcon(null);
            if (isCheck("black", board)) {
                board[row][col].setIcon(temp);
                board[prevRow][prevCol].setIcon(blackPawn1);
                return false;
            } else {
                board[row][col].setIcon(temp);
                board[prevRow][prevCol].setIcon(blackPawn1);
                return true;
            }
        }
    }
}