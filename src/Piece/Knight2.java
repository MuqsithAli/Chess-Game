package Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Main.Main2.*;

public class Knight2 {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public Knight2(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            //upper right
            if (row - 2 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col + 1)) {
                    ans.add(board2[row - 2][col + 1]);
                }
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("king") && canMove(row, col, row - 2, col + 1)) {
                    ans.add(board2[row - 2][col + 1]);
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col - 1)) {
                    ans.add(board2[row - 2][col - 1]);
                }
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("king") && canMove(row, col, row - 2, col - 1)) {
                    ans.add(board2[row - 2][col - 1]);
                }
            }

            //lower right
            if (row + 2 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col + 1)) {
                    ans.add(board2[row + 2][col + 1]);
                }
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("king") && canMove(row, col, row + 2, col + 1)) {
                    ans.add(board2[row + 2][col + 1]);
                }
            }

            //lower left
            if (row + 2 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col - 1)) {
                    ans.add(board2[row + 2][col - 1]);
                }
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("king") && canMove(row, col, row + 2, col - 1)) {
                    ans.add(board2[row + 2][col - 1]);
                }
            }

            //left down
            if (row + 1 < board2.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col - 2)) {
                    ans.add(board2[row + 1][col - 2]);
                }
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("king") && canMove(row, col, row + 1, col - 2)) {
                    ans.add(board2[row + 1][col - 2]);
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col - 2)) {
                    ans.add(board2[row - 1][col - 2]);
                }
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("king") && canMove(row, col, row - 1, col - 2)) {
                    ans.add(board2[row - 1][col - 2]);
                }
            }

            //right down
            if (row + 1 < board2.length && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col + 2)) {
                    ans.add(board2[row + 1][col + 2]);
                }
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("king") && canMove(row, col, row + 1, col + 2)) {
                    ans.add(board2[row + 1][col + 2]);
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col + 2)) {
                    ans.add(board2[row - 1][col + 2]);
                }
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("king") && canMove(row, col, row - 1, col + 2)) {
                    ans.add(board2[row - 1][col + 2]);
                }
            }
        } else {
            //upper right
            if (row - 2 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col + 1)) {
                    ans.add(board2[row - 2][col + 1]);
                }
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("king") && canMove(row, col, row - 2, col + 1)) {
                    ans.add(board2[row - 2][col + 1]);
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col - 1)) {
                    ans.add(board2[row - 2][col - 1]);
                }
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("king") && canMove(row, col, row - 2, col - 1)) {
                    ans.add(board2[row - 2][col - 1]);
                }
            }

            //lower right
            if (row + 2 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col + 1)) {
                    ans.add(board2[row + 2][col + 1]);
                }
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("king") && canMove(row, col, row + 2, col + 1)) {
                    ans.add(board2[row + 2][col + 1]);
                }
            }

            //lower left
            if (row + 2 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col - 1)) {
                    ans.add(board2[row + 2][col - 1]);
                }
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("king") && canMove(row, col, row + 2, col - 1)) {
                    ans.add(board2[row + 2][col - 1]);
                }
            }

            //left down
            if (row + 1 < board2.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col - 2)) {
                    ans.add(board2[row + 1][col - 2]);
                }
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("king") && canMove(row, col, row + 1, col - 2)) {
                    ans.add(board2[row + 1][col - 2]);
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col - 2)) {
                    ans.add(board2[row - 1][col - 2]);
                }
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("king") && canMove(row, col, row - 1, col - 2)) {
                    ans.add(board2[row - 1][col - 2]);
                }
            }

            //right down
            if (row + 1 < board2.length && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col + 2)) {
                    ans.add(board2[row + 1][col + 2]);
                }
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("king") && canMove(row, col, row + 1, col + 2)) {
                    ans.add(board2[row + 1][col + 2]);
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col + 2)) {
                    ans.add(board2[row - 1][col + 2]);
                }
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("king") && canMove(row, col, row - 1, col + 2)) {
                    ans.add(board2[row - 1][col + 2]);
                }
            }
        }
        return ans;
    }

    public void highlightCells(int row, int col) {
        //unselect rest
        for (int i = 0; i < board2.length; i++) {
            for (int j = 0; j < board2.length; j++) {
                if ((i + j) % 2 != 0) {
                    board2[i][j].setBackground(darkSquare); // Dark square color
                } else {
                    board2[i][j].setBackground(lightSquare); // Light square color
                }
            }
        }
        if (Objects.equals(this.color, "white")) {
            //upper right
            if (row - 2 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col + 1)) {
                    board2[row - 2][col + 1].setBackground(blueHighlight);
                    board2[row - 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("king") && canMove(row, col, row - 2, col + 1)) {
                    board2[row - 2][col + 1].setBackground(redHighlight);
                    board2[row - 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col - 1)) {
                    board2[row - 2][col - 1].setBackground(blueHighlight);
                    board2[row - 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("king") && canMove(row, col, row - 2, col - 1)) {
                    board2[row - 2][col - 1].setBackground(redHighlight);
                    board2[row - 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //lower right
            if (row + 2 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col + 1)) {
                    board2[row + 2][col + 1].setBackground(blueHighlight);
                    board2[row + 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("king") && canMove(row, col, row + 2, col + 1)) {
                    board2[row + 2][col + 1].setBackground(redHighlight);
                    board2[row + 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //lower left
            if (row + 2 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col - 1)) {
                    board2[row + 2][col - 1].setBackground(blueHighlight);
                    board2[row + 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("king") && canMove(row, col, row + 2, col - 1)) {
                    board2[row + 2][col - 1].setBackground(redHighlight);
                    board2[row + 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //left down
            if (row + 1 < board2.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col - 2)) {
                    board2[row + 1][col - 2].setBackground(blueHighlight);
                    board2[row + 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("king") && canMove(row, col, row + 1, col - 2)) {
                    board2[row + 1][col - 2].setBackground(redHighlight);
                    board2[row + 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col - 2)) {
                    board2[row - 1][col - 2].setBackground(blueHighlight);
                    board2[row - 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("king") && canMove(row, col, row - 1, col - 2)) {
                    board2[row - 1][col - 2].setBackground(redHighlight);
                    board2[row - 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //right down
            if (row + 1 < board2.length && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col + 2)) {
                    board2[row + 1][col + 2].setBackground(blueHighlight);
                    board2[row + 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("king") && canMove(row, col, row + 1, col + 2)) {
                    board2[row + 1][col + 2].setBackground(redHighlight);
                    board2[row + 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col + 2)) {
                    board2[row - 1][col + 2].setBackground(blueHighlight);
                    board2[row - 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("king") && canMove(row, col, row - 1, col + 2)) {
                    board2[row - 1][col + 2].setBackground(redHighlight);
                    board2[row - 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        } else {
            //upper right
            if (row - 2 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col + 1)) {
                    board2[row - 2][col + 1].setBackground(blueHighlight);
                    board2[row - 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("king") && canMove(row, col, row - 2, col + 1)) {
                    board2[row - 2][col + 1].setBackground(redHighlight);
                    board2[row - 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row - 2, col - 1)) {
                    board2[row - 2][col - 1].setBackground(blueHighlight);
                    board2[row - 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("king")) {
                    board2[row - 2][col - 1].setBackground(redHighlight);
                    board2[row - 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //lower right
            if (row + 2 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col + 1)) {
                    board2[row + 2][col + 1].setBackground(blueHighlight);
                    board2[row + 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("king") && canMove(row, col, row + 2, col + 1)) {
                    board2[row + 2][col + 1].setBackground(redHighlight);
                    board2[row + 2][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //lower left
            if (row + 2 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("empty") && canMove(row, col, row + 2, col - 1)) {
                    board2[row + 2][col - 1].setBackground(blueHighlight);
                    board2[row + 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("king") && canMove(row, col, row + 2, col - 1)) {
                    board2[row + 2][col - 1].setBackground(redHighlight);
                    board2[row + 2][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //left down
            if (row + 1 < board2.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col - 2)) {
                    board2[row + 1][col - 2].setBackground(blueHighlight);
                    board2[row + 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("king")) {
                    board2[row + 1][col - 2].setBackground(redHighlight);
                    board2[row + 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col - 2)) {
                    board2[row - 1][col - 2].setBackground(blueHighlight);
                    board2[row - 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("king") && canMove(row, col, row - 1, col - 2)) {
                    board2[row - 1][col - 2].setBackground(redHighlight);
                    board2[row - 1][col - 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //right down
            if (row + 1 < board2.length && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row + 1, col + 2)) {
                    board2[row + 1][col + 2].setBackground(blueHighlight);
                    board2[row + 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("king") && canMove(row, col, row + 1, col + 2)) {
                    board2[row + 1][col + 2].setBackground(redHighlight);
                    board2[row + 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("empty") && canMove(row, col, row - 1, col + 2)) {
                    board2[row - 1][col + 2].setBackground(blueHighlight);
                    board2[row - 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("white") && !getType((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("king") && canMove(row, col, row - 1, col + 2)) {
                    board2[row - 1][col + 2].setBackground(redHighlight);
                    board2[row - 1][col + 2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }
    }
    public boolean canMove(int prevRow, int prevCol, int row, int col){
        if(Objects.equals(this.color, "white")){
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(whiteKnight1);
            board2[prevRow][prevCol].setIcon(null);
            if(isCheck("white", board2)){
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whiteKnight1);
                return false;
            }
            else{
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whiteKnight1);
                return true;
            }
        }
        else{
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(blackKnight1);
            board2[prevRow][prevCol].setIcon(null);
            if(isCheck("black", board2)){
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackKnight1);
                return false;
            }
            else{
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackKnight1);
                return true;
            }
        }
    }
}
