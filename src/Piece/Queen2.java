package Piece;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Main.Main2.*;

public class Queen2 {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public Queen2(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            //forward
            for (int i = row - 1; i >= 0; i--) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black")) {
                    ans.add(board2[i][col]);
                    break;
                }
                ans.add(board2[i][col]);
            }

            //backward
            for (int i = row + 1; i < board2.length; i++) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black")) {
                    ans.add(board2[i][col]);
                    break;
                }
                ans.add(board2[i][col]);
            }

            //left
            for (int i = col - 1; i >= 0; i--) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black")) {
                    ans.add(board2[row][i]);
                    break;
                }
                ans.add(board2[row][i]);
            }

            //right
            for (int i = col + 1; i < board2.length; i++) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black")) {
                    ans.add(board2[row][i]);
                    break;
                }
                ans.add(board2[row][i]);
            }

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
        }
        else{
            //forward
            for (int i = row - 1; i >= 0; i--) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white")) {
                    ans.add(board2[i][col]);
                    break;
                }
                ans.add(board2[i][col]);
            }

            //backward
            for (int i = row + 1; i < board2.length; i++) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white")) {
                    ans.add(board2[i][col]);
                    break;
                }
                ans.add(board2[i][col]);
            }

            //left
            for (int i = col - 1; i >= 0; i--) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white")) {
                    ans.add(board2[row][i]);
                    break;
                }
                ans.add(board2[row][i]);
            }

            //right
            for (int i = col + 1; i < board2.length; i++) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white")) {
                    ans.add(board2[row][i]);
                    break;
                }
                ans.add(board2[row][i]);
            }

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
            //forward
            for (int i = row - 1; i >= 0; i--) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black")) {
                    board2[i][col].setBackground(redHighlight);
                    board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][col].setBackground(blueHighlight);
                board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //backward
            for (int i = row + 1; i < board2.length; i++) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black")) {
                    board2[i][col].setBackground(redHighlight);
                    board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][col].setBackground(blueHighlight);
                board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //left
            for (int i = col - 1; i >= 0; i--) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black")) {
                    board2[row][i].setBackground(redHighlight);
                    board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[row][i].setBackground(blueHighlight);
                board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //right
            for (int i = col + 1; i < board2.length; i++) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black")) {
                    board2[row][i].setBackground(redHighlight);
                    board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[row][i].setBackground(blueHighlight);
                board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

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
            //forward
            for (int i = row - 1; i >= 0; i--) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white")) {
                    board2[i][col].setBackground(redHighlight);
                    board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][col].setBackground(blueHighlight);
                board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //backward
            for (int i = row + 1; i < board2.length; i++) {
                if(!canMove(row, col, i, col)){
                    continue;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("black") || (getColor((ImageIcon) board2[i][col].getIcon()).equals("white") && getType((ImageIcon) board2[i][col].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[i][col].getIcon()).equals("white")) {
                    board2[i][col].setBackground(redHighlight);
                    board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[i][col].setBackground(blueHighlight);
                board2[i][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //left
            for (int i = col - 1; i >= 0; i--) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white")) {
                    board2[row][i].setBackground(redHighlight);
                    board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[row][i].setBackground(blueHighlight);
                board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

            //right
            for (int i = col + 1; i < board2.length; i++) {
                if(!canMove(row, col, row, i)){
                    continue;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("black") || (getColor((ImageIcon) board2[row][i].getIcon()).equals("white") && getType((ImageIcon) board2[row][i].getIcon()).equals("king"))) {
                    break;
                }
                if (getColor((ImageIcon) board2[row][i].getIcon()).equals("white")) {
                    board2[row][i].setBackground(redHighlight);
                    board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    break;
                }
                board2[row][i].setBackground(blueHighlight);
                board2[row][i].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }

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
            board2[row][col].setIcon(whiteQueen1);
            board2[prevRow][prevCol].setIcon(null);
            if(isCheck("white", board2)){
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whiteQueen1);
                return false;
            }
            else{
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whiteQueen1);
                return true;
            }
        }
        else{
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(blackQueen1);
            board2[prevRow][prevCol].setIcon(null);
            if(isCheck("black", board2)){
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackQueen1);
                return false;
            }
            else{
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackQueen1);
                return true;
            }
        }
    }
}
