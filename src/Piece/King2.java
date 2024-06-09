package Piece;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

import static Main.Main2.*;

//completing king
public class King2 {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public King2(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            //check for castling
            if(canCastle("right")){
                ans.add(board2[14][12]);
            }
            if(canCastle("left")){
                ans.add(board2[14][2]);
            }


            //check if forward cell is empty and ensure we are 1 square away from opposite king
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    ans.add(board2[row - 1][col]);
                }


                //check if forward cell has a opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("black") && isSafe(row - 1, col)) {
                    ans.add(board2[row - 1][col]);
                }
            }


            //check if backward cell is empty and ensure we are 1 square away from opposite king
            if (row + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    ans.add(board2[row + 1][col]);
                }


                //check if backward cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("black") && isSafe(row + 1, col)) {
                    ans.add(board2[row + 1][col]);
                }
            }

            //check if left cell is empty and ensure we are 1 square away from opposite king
            if (col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("empty")
                        && isSafe(row, col - 1)
                ) {
                    ans.add(board2[row][col - 1]);
                }


                //check if left cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("black") && isSafe(row, col - 1)) {
                    ans.add(board2[row][col - 1]);
                }
            }

            //check if right cell is empty and ensure we are 1 square away from opposite king
            if (col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("empty")
                        && isSafe(row, col + 1)
                ) {
                    ans.add(board2[row][col + 1]);
                }


                //check if right cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("black") && isSafe(row, col + 1)) {
                    ans.add(board2[row][col + 1]);
                }
            }

            //check if upper left diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col - 1)
                ) {
                    ans.add(board2[row - 1][col - 1]);
                }
            }

            //check if upper left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("black")
                        && isSafe(row - 1, col - 1)
                ) {
                    ans.add(board2[row - 1][col - 1]);
                }
            }

            //check if upper right diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col + 1)
                ) {
                    ans.add(board2[row - 1][col + 1]);
                }
            }

            //check if upper right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("black")
                        && isSafe(row - 1, col + 1)
                ) {
                    ans.add(board2[row - 1][col + 1]);
                }
            }

            //check if lower right diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col + 1)
                ) {
                    ans.add(board2[row + 1][col + 1]);
                }
            }


            //check if lower right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("black")
                        && isSafe(row + 1, col + 1)
                ) {
                    ans.add(board2[row + 1][col + 1]);
                }
            }

            //check if lower left diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col - 1)
                ) {
                    ans.add(board2[row + 1][col - 1]);
                }
            }


            //check if lower left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("black")
                        && isSafe(row + 1, col - 1)
                ) {
                    ans.add(board2[row + 1][col - 1]);
                }
            }
        } else {
            //check for castling
            if(canCastle("right")){
                ans.add(board2[0][12]);
            }
            if(canCastle("left")){
                ans.add(board2[0][2]);
            }


            //check if forward cell is empty and ensure we are 1 square away from opposite king
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    ans.add(board2[row - 1][col]);
                }


                //check if forward cell has a opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("white") && isSafe(row - 1, col)) {
                    ans.add(board2[row - 1][col]);
                }
            }


            //check if backward cell is empty and ensure we are 1 square away from opposite king
            if (row + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    ans.add(board2[row + 1][col]);
                }


                //check if backward cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("white") && isSafe(row + 1, col)) {
                    ans.add(board2[row + 1][col]);
                }
            }

            //check if left cell is empty and ensure we are 1 square away from opposite king
            if (col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("empty")
                        && isSafe(row, col - 1)
                ) {
                    ans.add(board2[row][col - 1]);
                }


                //check if left cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("white") && isSafe(row, col - 1)) {
                    ans.add(board2[row][col - 1]);
                }
            }

            //check if right cell is empty and ensure we are 1 square away from opposite king
            if (col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("empty")
                        && isSafe(row, col + 1)
                ) {
                    ans.add(board2[row][col + 1]);
                }


                //check if right cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("white") && isSafe(row, col + 1)) {
                    ans.add(board2[row][col + 1]);
                }
            }


            //check if upper left diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col - 1)
                ) {
                    ans.add(board2[row - 1][col - 1]);
                }
            }


            //check if upper left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("white")
                        && isSafe(row - 1, col - 1)
                ) {
                    ans.add(board2[row - 1][col - 1]);
                }
            }

            //check if upper right diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col + 1)
                ) {
                    ans.add(board2[row - 1][col + 1]);
                }
            }


            //check if upper right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("white")
                        && isSafe(row - 1, col + 1)
                ) {
                    ans.add(board2[row - 1][col + 1]);
                }
            }

            //check if lower right diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col + 1)
                ) {
                    ans.add(board2[row + 1][col + 1]);
                }
            }


            //check if lower right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("white")
                        && isSafe(row + 1, col + 1)
                ) {
                    ans.add(board2[row + 1][col + 1]);
                }
            }

            //check if lower left diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col - 1)
                ) {
                    ans.add(board2[row + 1][col - 1]);
                }
            }


            //check if lower left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("white")
                        && isSafe(row + 1, col - 1)
                ) {
                    ans.add(board2[row + 1][col - 1]);
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
            //check for castling
            if(canCastle("right")){
                board2[14][12].setBackground(purpleHighLight);
                board2[14][12].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
            if(canCastle("left")){
                board2[14][2].setBackground(purpleHighLight);
                board2[14][2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }


            //check if forward cell is empty and ensure we are 1 square away from opposite king
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    board2[row - 1][col].setBackground(blueHighlight);
                    board2[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if forward cell has a opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("black") && isSafe(row - 1, col)) {
                    board2[row - 1][col].setBackground(redHighlight);
                    board2[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if backward cell is empty and ensure we are 1 square away from opposite king
            if (row + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    board2[row + 1][col].setBackground(blueHighlight);
                    board2[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if backward cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("black") && isSafe(row + 1, col)) {
                    board2[row + 1][col].setBackground(redHighlight);
                    board2[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if left cell is empty and ensure we are 1 square away from opposite king
            if (col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("empty")
                        && isSafe(row, col - 1)
                ) {
                    board2[row][col - 1].setBackground(blueHighlight);
                    board2[row][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if left cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("black") && isSafe(row, col - 1)) {
                    board2[row][col - 1].setBackground(redHighlight);
                    board2[row][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if right cell is empty and ensure we are 1 square away from opposite king
            if (col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("empty")
                        && isSafe(row, col + 1)
                ) {
                    board2[row][col + 1].setBackground(blueHighlight);
                    board2[row][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if right cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("black") && isSafe(row, col + 1)) {
                    board2[row][col + 1].setBackground(redHighlight);
                    board2[row][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if upper left diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col - 1)
                ) {
                    board2[row - 1][col - 1].setBackground(blueHighlight);
                    board2[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if upper left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("black")
                        && isSafe(row - 1, col - 1)
                ) {
                    board2[row - 1][col - 1].setBackground(redHighlight);
                    board2[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if upper right diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col + 1)
                ) {
                    board2[row - 1][col + 1].setBackground(blueHighlight);
                    board2[row - 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if upper right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("black")
                        && isSafe(row - 1, col + 1)
                ) {
                    board2[row - 1][col + 1].setBackground(redHighlight);
                    board2[row - 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if lower right diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col + 1)
                ) {
                    board2[row + 1][col + 1].setBackground(blueHighlight);
                    board2[row + 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if lower right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("black")
                        && isSafe(row + 1, col + 1)
                ) {
                    board2[row + 1][col + 1].setBackground(redHighlight);
                    board2[row + 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if lower left diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col - 1)
                ) {
                    board2[row + 1][col - 1].setBackground(blueHighlight);
                    board2[row + 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if lower left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("black")
                        && isSafe(row + 1, col - 1)
                ) {
                    board2[row + 1][col - 1].setBackground(redHighlight);
                    board2[row + 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        } else {
            //check for castling
            if(canCastle("right")){
                board2[0][12].setBackground(purpleHighLight);
                board2[0][12].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
            if(canCastle("left")){
                board2[0][2].setBackground(purpleHighLight);
                board2[0][2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }


            //check if forward cell is empty and ensure we are 1 square away from opposite king
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    board2[row - 1][col].setBackground(blueHighlight);
                    board2[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if forward cell has a opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("white") && isSafe(row - 1, col)) {
                    board2[row - 1][col].setBackground(redHighlight);
                    board2[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if backward cell is empty and ensure we are 1 square away from opposite king
            if (row + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    board2[row + 1][col].setBackground(blueHighlight);
                    board2[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if backward cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("white") && isSafe(row + 1, col)) {
                    board2[row + 1][col].setBackground(redHighlight);
                    board2[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if left cell is empty and ensure we are 1 square away from opposite king
            if (col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("empty")
                        && isSafe(row, col - 1)
                ) {
                    board2[row][col - 1].setBackground(blueHighlight);
                    board2[row][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if left cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("white") && isSafe(row, col - 1)) {
                    board2[row][col - 1].setBackground(redHighlight);
                    board2[row][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if right cell is empty and ensure we are 1 square away from opposite king
            if (col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("empty")
                        && isSafe(row, col + 1)
                ) {
                    board2[row][col + 1].setBackground(blueHighlight);
                    board2[row][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }


                //check if right cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("white") && isSafe(row, col + 1)) {
                    board2[row][col + 1].setBackground(redHighlight);
                    board2[row][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if upper left diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col - 1)
                ) {
                    board2[row - 1][col - 1].setBackground(blueHighlight);
                    board2[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if upper left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("white")
                        && isSafe(row - 1, col - 1)
                ) {
                    board2[row - 1][col - 1].setBackground(redHighlight);
                    board2[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if upper right diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col + 1)
                ) {
                    board2[row - 1][col + 1].setBackground(blueHighlight);
                    board2[row - 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if upper right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("white")
                        && isSafe(row - 1, col + 1)
                ) {
                    board2[row - 1][col + 1].setBackground(redHighlight);
                    board2[row - 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if lower right diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col + 1)
                ) {
                    board2[row + 1][col + 1].setBackground(blueHighlight);
                    board2[row + 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if lower right diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("white")
                        && isSafe(row + 1, col + 1)
                ) {
                    board2[row + 1][col + 1].setBackground(redHighlight);
                    board2[row + 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //check if lower left diagonal is empty and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row + 1, col - 1)
                ) {
                    board2[row + 1][col - 1].setBackground(blueHighlight);
                    board2[row + 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }


            //check if lower left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("white")
                        && isSafe(row + 1, col - 1)
                ) {
                    board2[row + 1][col - 1].setBackground(redHighlight);
                    board2[row + 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }
    }

    public boolean isSafe(int row, int col) {
        if (Objects.equals(this.color, "white")) {
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("pawn")) {
                    return false;
                }
            }
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("pawn")) {
                    return false;
                }
            }
            if (row - 1 >= 0 && col - 1 >= 0) {
                if(getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row - 1 >= 0) {
                if(getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (col - 1 >= 0) {
                if(getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("black") && getType((ImageIcon) board2[row][col - 1].getIcon()).equals("king")){
                    return false;
                }
            }

            if (col + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("black") && getType((ImageIcon) board2[row][col + 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row + 1 < board2.length && col - 1 >= 0) {
                if(getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("black") && getType((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("black") && getType((ImageIcon) board2[row + 1][col].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("black") && getType((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("king")){
                    return false;
                }
            }
            //check diagonals
            //left upper diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right upper diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board2.length; i--, j++) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left lower diagonal
            for (int i = row + 1, j = col - 1; i < board2.length && j >= 0; i++, j--) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right lower diagonal
            for (int i = row + 1, j = col + 1; i < board2.length && j < board2.length; i++, j++) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //check vertical and horizontal
            //up
            for (int i = row - 1; i >= 0; i--) {
                if(getType((ImageIcon) board2[i][col].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") && (getType((ImageIcon) board2[i][col].getIcon()).equals("rook") || getType((ImageIcon) board2[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //down
            for (int i = row + 1; i < board2.length; i++) {
                if(getType((ImageIcon) board2[i][col].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") && (getType((ImageIcon) board2[i][col].getIcon()).equals("rook") || getType((ImageIcon) board2[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left
            for (int j = col - 1; j >= 0; j--) {
                if(getType((ImageIcon) board2[row][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][j].getIcon()).equals("black") && (getType((ImageIcon) board2[row][j].getIcon()).equals("rook") || getType((ImageIcon) board2[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right
            for (int j = col + 1; j < board2.length; j++) {
                if(getType((ImageIcon) board2[row][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][j].getIcon()).equals("black") && (getType((ImageIcon) board2[row][j].getIcon()).equals("rook") || getType((ImageIcon) board2[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //detect Knights
            //upper right
            if (row - 2 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower right
            if (row + 2 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower left
            if (row + 2 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left down
            if (row + 1 < board2.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("black") && getType((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right down
            if (row + 1 < board2.length && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("black") && getType((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("black") && getType((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }
        } else {
            if (row + 1 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("pawn")) {
                    return false;
                }
            }
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("pawn")) {
                    return false;
                }
            }
            if (row - 1 >= 0 && col - 1 >= 0) {
                if(getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("white") && getType((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row - 1 >= 0) {
                if(getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("white") && getType((ImageIcon) board2[row - 1][col].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row - 1 >= 0 && col + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("white") && getType((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (col - 1 >= 0) {
                if(getColor((ImageIcon) board2[row][col - 1].getIcon()).equals("white") && getType((ImageIcon) board2[row][col - 1].getIcon()).equals("king")){
                    return false;
                }
            }

            if (col + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row][col + 1].getIcon()).equals("white") && getType((ImageIcon) board2[row][col + 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row + 1 < board2.length && col - 1 >= 0) {
                if(getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col].getIcon()).equals("king")){
                    return false;
                }
            }
            if (row + 1 < board2.length && col + 1 < board2.length) {
                if(getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("king")){
                    return false;
                }
            }
            //check diagonals
            //left upper diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right upper diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board2.length; i--, j++) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left lower diagonal
            for (int i = row + 1, j = col - 1; i < board2.length && j >= 0; i++, j--) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right lower diagonal
            for (int i = row + 1, j = col + 1; i < board2.length && j < board2.length; i++, j++) {
                if(getType((ImageIcon) board2[i][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && (getType((ImageIcon) board2[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board2[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //check vertical and horizontal
            //up
            for (int i = row - 1; i >= 0; i--) {
                if(getType((ImageIcon) board2[i][col].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") && (getType((ImageIcon) board2[i][col].getIcon()).equals("rook") || getType((ImageIcon) board2[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //down
            for (int i = row + 1; i < board2.length; i++) {
                if(getType((ImageIcon) board2[i][col].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") && (getType((ImageIcon) board2[i][col].getIcon()).equals("rook") || getType((ImageIcon) board2[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left
            for (int j = col - 1; j >= 0; j--) {
                if(getType((ImageIcon) board2[row][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][j].getIcon()).equals("white") && (getType((ImageIcon) board2[row][j].getIcon()).equals("rook") || getType((ImageIcon) board2[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right
            for (int j = col + 1; j < board2.length; j++) {
                if(getType((ImageIcon) board2[row][j].getIcon()).equals("king")){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][j].getIcon()).equals("white") && (getType((ImageIcon) board2[row][j].getIcon()).equals("rook") || getType((ImageIcon) board2[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board2[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }


            //detect Knights
            //upper right
            if (row - 2 >= 0 && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board2[row - 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board2[row - 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower right
            if (row + 2 < board2.length && col + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board2[row + 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower left
            if (row + 2 < board2.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board2[row + 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left down
            if (row + 1 < board2.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("white") && getType((ImageIcon) board2[row - 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right down
            if (row + 1 < board2.length && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("white") && getType((ImageIcon) board2[row + 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board2.length) {
                if (getColor((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("white") && getType((ImageIcon) board2[row - 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean canCastle(String direction){
        if(Objects.equals(this.color, "white")){
            if(direction.equals("right")){
                if(!isCheck("white", board2) && (board2[14][13].getIcon()==whiteRook2 || board2[14][13].getIcon()==whiteRook1 || board2[14][13].getIcon()==whiteRook3 || board2[14][13].getIcon()==whiteRook4) &&  this.row == 14 && this.col == 7 && board2[14][8].getIcon()==null && board2[14][9].getIcon() == null && board2[14][10].getIcon() == null && board2[14][11].getIcon() == null && board2[14][12].getIcon() == null && isSafe(14, 8) && isSafe(14, 9) && isSafe(14, 10) && isSafe(14, 11) && isSafe(14, 12) && !whiteKingMoved && !whiteRook2Moved){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(!isCheck("white", board2) && (board2[14][1].getIcon()==whiteRook1 || board2[14][1].getIcon()==whiteRook2 || board2[14][1].getIcon()==whiteRook3 || board2[14][1].getIcon()==whiteRook4) && this.row == 14 && this.col == 7 && board2[14][2].getIcon()==null && board2[14][3].getIcon() == null && board2[14][4].getIcon() == null && board2[14][5].getIcon() == null && board2[14][6].getIcon() == null && isSafe(14, 3) && isSafe(14, 2)  && isSafe(14, 4) && isSafe(14, 5) && isSafe(14, 6) && !whiteKingMoved && !whiteRook1Moved){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            if(direction.equals("right")){
                if(!isCheck("black", board2) && (board2[0][13].getIcon()==blackRook2 || board2[0][13].getIcon()==blackRook1 || board2[0][13].getIcon()==blackRook3 || board2[0][13].getIcon()==blackRook4) &&  this.row == 0 && this.col == 7 && board2[0][8].getIcon()==null && board2[0][9].getIcon() == null && board2[0][10].getIcon() == null && board2[0][11].getIcon() == null && board2[0][12].getIcon() == null && isSafe(0, 8) && isSafe(0, 9) && isSafe(0, 10) && isSafe(0, 11) && isSafe(0, 12) && !blackKingMoved && !blackRook2Moved){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(!isCheck("black", board2) && (board2[0][1].getIcon()==blackRook1 || board2[0][1].getIcon()==blackRook2 || board2[0][1].getIcon()==blackRook3 || board2[0][1].getIcon()==blackRook4) && this.row == 0 && this.col == 7 && board2[0][2].getIcon()==null && board2[0][3].getIcon() == null && board2[0][4].getIcon() == null && board2[0][5].getIcon() == null && board2[0][6].getIcon() == null && isSafe(0, 3) && isSafe(0, 2)  && isSafe(0, 4) && isSafe(0, 5) && isSafe(0, 6) && !blackKingMoved && !blackRook1Moved){
                    return true;
                }
                else{
                    return false;
                }
            }
            }
    }
}
