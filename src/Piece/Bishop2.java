package Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Main.Main2.*;

public class Bishop2 {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public Bishop2(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board2.length; i--, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board2.length && j < board2.length; i++, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board2.length && j >= 0; i++, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }
        } else {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board2.length; i--, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board2.length && j < board2.length; i++, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board2.length && j >= 0; i++, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    ans.add(board2[i][j]);
                    break;
                }
                ans.add(board2[i][j]);
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
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board2.length; i--, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board2.length && j < board2.length; i++, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board2.length && j >= 0; i++, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
        } else {
            //upper right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board2.length; i--, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //upper left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //lower right diagonal
            for (int i = row + 1, j = col + 1; i < board2.length && j < board2.length; i++, j++) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
            //lower left diagonal
            for (int i = row + 1, j = col - 1; i < board2.length && j >= 0; i++, j--) {
                if(!canMove(row, col, i, j)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][j].getIcon()).equals("white") && getType((ImageIcon) board2[i][j].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][j].getIcon()).equals("white")) {
                    board2[i][j].setBackground(redHighlight);
                    board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][j].setBackground(blueHighlight);
                board2[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
        }
    }

    public boolean canMove(int prevRow, int prevCol, int row, int col){
        if(Objects.equals(this.color, "white")){
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(whiteBishop1);
            board2[prevRow][prevCol].setIcon(null);
            if(isCheck("white", board2)){
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whiteBishop1);
                return false;
            }
            else{
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whiteBishop2);
                return true;
            }
        }
        else{
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(blackBishop1);
            board2[prevRow][prevCol].setIcon(null);
            if(isCheck("black", board2)){
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackBishop1);
                return false;
            }
            else{
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackBishop1);
                return true;
            }
        }
    }
}
