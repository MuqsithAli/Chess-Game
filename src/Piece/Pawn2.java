package Piece;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Main.Main2.*;

public class Pawn2 {
    public int row = -1;
    public int col = -1;
    public String color = "";

    public Pawn2(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            // check for enpasante
            if (row == 3) {
                if (col == 0) {
                    // right
                    if (getColor((ImageIcon) board2[2][1].getIcon()).equals("empty") && canMove(row, col, 2, 1)
                            && blackEnpasante2) {
                        ans.add(board2[2][1]);
                    }
                } else if (col == 1) {
                    // left
                    if (getColor((ImageIcon) board2[2][0].getIcon()).equals("empty") && canMove(row, col, 2, 0)
                            && blackEnpasante1) {
                        ans.add(board2[2][0]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][2].getIcon()).equals("empty") && canMove(row, col, 2, 2)
                            && blackEnpasante3) {
                        ans.add(board2[2][2]);
                    }
                } else if (col == 2) {
                    // left
                    if (getColor((ImageIcon) board2[2][1].getIcon()).equals("empty") && canMove(row, col, 2, 1)
                            && blackEnpasante2) {
                        ans.add(board2[2][1]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][3].getIcon()).equals("empty") && canMove(row, col, 2, 3)
                            && blackEnpasante4) {
                        ans.add(board2[2][3]);
                    }
                } else if (col == 3) {
                    // left
                    if (getColor((ImageIcon) board2[2][2].getIcon()).equals("empty") && canMove(row, col, 2, 2)
                            && blackEnpasante3) {
                        ans.add(board2[2][2]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][4].getIcon()).equals("empty") && canMove(row, col, 2, 4)
                            && blackEnpasante5) {
                        ans.add(board2[2][4]);
                    }
                } else if (col == 4) {
                    // left
                    if (getColor((ImageIcon) board2[2][3].getIcon()).equals("empty") && canMove(row, col, 2, 3)
                            && blackEnpasante4) {
                        ans.add(board2[2][3]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][5].getIcon()).equals("empty") && canMove(row, col, 2, 5)
                            && blackEnpasante6) {
                        ans.add(board2[2][5]);
                    }
                } else if (col == 5) {
                    // left
                    if (getColor((ImageIcon) board2[2][4].getIcon()).equals("empty") && canMove(row, col, 2, 4)
                            && blackEnpasante5) {
                        ans.add(board2[2][4]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][6].getIcon()).equals("empty") && canMove(row, col, 2, 6)
                            && blackEnpasante7) {
                        ans.add(board2[2][6]);
                    }
                } else if (col == 6) {
                    // left
                    if (getColor((ImageIcon) board2[2][5].getIcon()).equals("empty") && canMove(row, col, 2, 5)
                            && blackEnpasante6) {
                        ans.add(board2[2][5]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][7].getIcon()).equals("empty") && canMove(row, col, 2, 7)
                            && blackEnpasante8) {
                        ans.add(board2[2][7]);
                    }
                } else if (col == 7) {
                    // left
                    if (getColor((ImageIcon) board2[2][6].getIcon()).equals("empty") && canMove(row, col, 2, 6)
                            && blackEnpasante7) {
                        ans.add(board2[2][6]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][8].getIcon()).equals("empty") && canMove(row, col, 2, 8)
                            && blackEnpasante9) {
                        ans.add(board2[2][8]);
                    }
                } else if (col == 8) {
                    // left
                    if (getColor((ImageIcon) board2[2][7].getIcon()).equals("empty") && canMove(row, col, 2, 7)
                            && blackEnpasante8) {
                        ans.add(board2[2][7]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][9].getIcon()).equals("empty") && canMove(row, col, 2, 9)
                            && blackEnpasante10) {
                        ans.add(board2[2][9]);
                    }
                } else if (col == 9) {
                    // left
                    if (getColor((ImageIcon) board2[2][8].getIcon()).equals("empty") && canMove(row, col, 2, 8)
                            && blackEnpasante9) {
                        ans.add(board2[2][8]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][10].getIcon()).equals("empty") && canMove(row, col, 2, 10)
                            && blackEnpasante11) {
                        ans.add(board2[2][10]);
                    }
                } else if (col == 10) {
                    // left
                    if (getColor((ImageIcon) board2[2][9].getIcon()).equals("empty") && canMove(row, col, 2, 9)
                            && blackEnpasante10) {
                        ans.add(board2[2][9]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][11].getIcon()).equals("empty") && canMove(row, col, 2, 11)
                            && blackEnpasante12) {
                        ans.add(board2[2][11]);
                    }
                } else if (col == 11) {
                    // left
                    if (getColor((ImageIcon) board2[2][10].getIcon()).equals("empty") && canMove(row, col, 2, 10)
                            && blackEnpasante11) {
                        ans.add(board2[2][10]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][12].getIcon()).equals("empty") && canMove(row, col, 2, 12)
                            && blackEnpasante13) {
                        ans.add(board2[2][12]);
                    }
                } else if (col == 12) {
                    // left
                    if (getColor((ImageIcon) board2[2][11].getIcon()).equals("empty") && canMove(row, col, 2, 11)
                            && blackEnpasante12) {
                        ans.add(board2[2][11]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][13].getIcon()).equals("empty") && canMove(row, col, 2, 13)
                            && blackEnpasante14) {
                        ans.add(board2[2][13]);
                    }
                } else if (col == 13) {
                    // left
                    if (getColor((ImageIcon) board2[2][12].getIcon()).equals("empty") && canMove(row, col, 2, 12)
                            && blackEnpasante13) {
                        ans.add(board2[2][12]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[2][14].getIcon()).equals("empty") && canMove(row, col, 2, 14)
                            && blackEnpasante15) {
                        ans.add(board2[2][14]);
                    }
                } else if (col == 14) {
                    // left
                    if (getColor((ImageIcon) board2[2][13].getIcon()).equals("empty") && canMove(row, col, 2, 13)
                            && blackEnpasante14) {
                        ans.add(board2[2][13]);
                    }
                }
            }
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("empty")
                        && canMove(row, col, row - 1, col)) {
                    ans.add(board2[row - 1][col]);

                    if (row == 13 && getColor((ImageIcon) board2[row - 2][col].getIcon()).equals("empty")
                            && canMove(row, col, row - 2, col)) {
                        ans.add(board2[row - 2][col]);
                    }
                }
            }
            if ((row - 1 >= 0 && col - 1 >= 0)) {
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("black")
                        && !getType((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("king")
                        && canMove(row, col, row - 1, col - 1)) {
                    ans.add(board2[row - 1][col - 1]);
                }
            }
            if ((row - 1 >= 0 && col + 1 < board2.length)) {
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("black")
                        && !getType((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("king")
                        && canMove(row, col, row - 1, col + 1)) {
                    ans.add(board2[row - 1][col + 1]);
                }
            }
        } else {
            // check for enpasante
            if (row == 11) {
                if (col == 0) {
                    // right
                    if (getColor((ImageIcon) board2[12][1].getIcon()).equals("empty") && canMove(row, col, 12, 1)
                            && whiteEnpasante2) {
                        ans.add(board2[12][1]);
                    }
                } else if (col == 1) {
                    // left
                    if (getColor((ImageIcon) board2[12][0].getIcon()).equals("empty") && canMove(row, col, 12, 0)
                            && whiteEnpasante1) {
                        ans.add(board2[12][0]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][2].getIcon()).equals("empty") && canMove(row, col, 12, 2)
                            && whiteEnpasante3) {
                        ans.add(board2[12][2]);
                    }
                } else if (col == 2) {
                    // left
                    if (getColor((ImageIcon) board2[12][1].getIcon()).equals("empty") && canMove(row, col, 12, 1)
                            && whiteEnpasante2) {
                        ans.add(board2[12][1]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][3].getIcon()).equals("empty") && canMove(row, col, 12, 3)
                            && whiteEnpasante4) {
                        ans.add(board2[12][3]);
                    }
                } else if (col == 3) {
                    // left
                    if (getColor((ImageIcon) board2[12][2].getIcon()).equals("empty") && canMove(row, col, 12, 2)
                            && whiteEnpasante3) {
                        ans.add(board2[12][2]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][4].getIcon()).equals("empty") && canMove(row, col, 12, 4)
                            && whiteEnpasante5) {
                        ans.add(board2[12][4]);
                    }
                } else if (col == 4) {
                    // left
                    if (getColor((ImageIcon) board2[12][3].getIcon()).equals("empty") && canMove(row, col, 12, 3)
                            && whiteEnpasante4) {
                        ans.add(board2[12][3]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][5].getIcon()).equals("empty") && canMove(row, col, 12, 5)
                            && whiteEnpasante6) {
                        ans.add(board2[12][5]);
                    }
                } else if (col == 5) {
                    // left
                    if (getColor((ImageIcon) board2[12][4].getIcon()).equals("empty") && canMove(row, col, 12, 4)
                            && whiteEnpasante5) {
                        ans.add(board2[12][4]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][6].getIcon()).equals("empty") && canMove(row, col, 12, 6)
                            && whiteEnpasante7) {
                        ans.add(board2[12][6]);
                    }
                } else if (col == 6) {
                    // left
                    if (getColor((ImageIcon) board2[12][5].getIcon()).equals("empty") && canMove(row, col, 12, 5)
                            && whiteEnpasante6) {
                        ans.add(board2[12][5]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][7].getIcon()).equals("empty") && canMove(row, col, 12, 7)
                            && whiteEnpasante8) {
                        ans.add(board2[12][7]);
                    }
                } else if (col == 7) {
                    // left
                    if (getColor((ImageIcon) board2[12][6].getIcon()).equals("empty") && canMove(row, col, 12, 6)
                            && whiteEnpasante7) {
                        ans.add(board2[12][6]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][8].getIcon()).equals("empty") && canMove(row, col, 12, 8)
                            && whiteEnpasante9) {
                        ans.add(board2[12][8]);
                    }
                } else if (col == 8) {
                    // left
                    if (getColor((ImageIcon) board2[12][7].getIcon()).equals("empty") && canMove(row, col, 12, 7)
                            && whiteEnpasante8) {
                        ans.add(board2[12][7]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][9].getIcon()).equals("empty") && canMove(row, col, 12, 9)
                            && whiteEnpasante10) {
                        ans.add(board2[12][9]);
                    }
                } else if (col == 9) {
                    // left
                    if (getColor((ImageIcon) board2[12][8].getIcon()).equals("empty") && canMove(row, col, 12, 8)
                            && whiteEnpasante9) {
                        ans.add(board2[12][8]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][10].getIcon()).equals("empty") && canMove(row, col, 12, 10)
                            && whiteEnpasante11) {
                        ans.add(board2[12][10]);
                    }
                } else if (col == 10) {
                    // left
                    if (getColor((ImageIcon) board2[12][9].getIcon()).equals("empty") && canMove(row, col, 12, 9)
                            && whiteEnpasante10) {
                        ans.add(board2[12][9]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][11].getIcon()).equals("empty") && canMove(row, col, 12, 11)
                            && whiteEnpasante12) {
                        ans.add(board2[12][11]);
                    }
                } else if (col == 11) {
                    // left
                    if (getColor((ImageIcon) board2[12][10].getIcon()).equals("empty") && canMove(row, col, 12, 10)
                            && whiteEnpasante11) {
                        ans.add(board2[12][10]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][12].getIcon()).equals("empty") && canMove(row, col, 12, 12)
                            && whiteEnpasante13) {
                        ans.add(board2[12][12]);
                    }
                } else if (col == 12) {
                    // left
                    if (getColor((ImageIcon) board2[12][11].getIcon()).equals("empty") && canMove(row, col, 12, 11)
                            && whiteEnpasante12) {
                        ans.add(board2[12][11]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][13].getIcon()).equals("empty") && canMove(row, col, 12, 13)
                            && whiteEnpasante14) {
                        ans.add(board2[12][13]);
                    }
                } else if (col == 13) {
                    // left
                    if (getColor((ImageIcon) board2[12][12].getIcon()).equals("empty") && canMove(row, col, 12, 12)
                            && whiteEnpasante13) {
                        ans.add(board2[12][12]);
                    }
                    // right
                    if (getColor((ImageIcon) board2[12][14].getIcon()).equals("empty") && canMove(row, col, 12, 14)
                            && whiteEnpasante15) {
                        ans.add(board2[12][14]);
                    }
                } else if (col == 14) {
                    // left
                    if (getColor((ImageIcon) board2[12][13].getIcon()).equals("empty") && canMove(row, col, 12, 13)
                            && whiteEnpasante14) {
                        ans.add(board2[12][13]);
                    }
                }
            }
            // check vacancy of forward cell
            if (row + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("empty")
                        && canMove(row, col, row + 1, col)) {
                    ans.add(board2[row + 1][col]);

                    // check initial position of pawn in order to advance 2 steps forward
                    if (row == 1 && getColor((ImageIcon) board2[row + 2][col].getIcon()).equals("empty")
                            && canMove(row, col, row + 2, col)) {
                        ans.add(board2[row + 2][col]);
                    }
                }
            }

            // handle IOB
            if (col - 1 >= 0 && row + 1 < board2.length) {
                // check if left diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("white")
                        && !getType((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("king")
                        && canMove(row, col, row + 1, col - 1)) {
                    ans.add(board2[row + 1][col - 1]);
                }
            }

            // Handle IOB
            if (col + 1 < board2.length && row + 1 < board2.length) {
                // check if right diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("white")
                        && !getType((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("king")
                        && canMove(row, col, row + 1, col + 1)) {
                    ans.add(board2[row + 1][col + 1]);
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
            //check for enpasante
            if (row == 3) {
                if (col == 0) {
                    //right
                    if (getColor((ImageIcon) board2[2][1].getIcon()).equals("empty") && canMove(row, col, 2, 1) && blackEnpasante2) {
                        board2[2][1].setBackground(redHighlight);
                        board2[2][1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 1) {
                    //left
                    if (getColor((ImageIcon) board2[2][0].getIcon()).equals("empty") && canMove(row, col, 2, 0) && blackEnpasante1) {
                        board2[2][0].setBackground(redHighlight);
                        board2[2][0].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][2].getIcon()).equals("empty") && canMove(row, col, 2, 2) && blackEnpasante3) {
                        board2[2][2].setBackground(redHighlight);
                        board2[2][2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 2) {
                    //left
                    if (getColor((ImageIcon) board2[2][1].getIcon()).equals("empty") && canMove(row, col, 2, 1) && blackEnpasante2) {
                        board2[2][1].setBackground(redHighlight);
                        board2[2][1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][3].getIcon()).equals("empty") && canMove(row, col, 2, 3) && blackEnpasante4) {
                        board2[2][3].setBackground(redHighlight);
                        board2[2][3].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 3) {
                    //left
                    if (getColor((ImageIcon) board2[2][2].getIcon()).equals("empty") && canMove(row, col, 2, 2) && blackEnpasante3) {
                        board2[2][2].setBackground(redHighlight);
                        board2[2][2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][4].getIcon()).equals("empty") && canMove(row, col, 2, 4) && blackEnpasante5) {
                        board2[2][4].setBackground(redHighlight);
                        board2[2][4].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 4) {
                    //left
                    if (getColor((ImageIcon) board2[2][3].getIcon()).equals("empty") && canMove(row, col, 2, 3) && blackEnpasante4) {
                        board2[2][3].setBackground(redHighlight);
                        board2[2][3].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][5].getIcon()).equals("empty") && canMove(row, col, 2, 5) && blackEnpasante6) {
                        board2[2][5].setBackground(redHighlight);
                        board2[2][5].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 5) {
                    //left
                    if (getColor((ImageIcon) board2[2][4].getIcon()).equals("empty") && canMove(row, col, 2, 4) && blackEnpasante5) {
                        board2[2][4].setBackground(redHighlight);
                        board2[2][4].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][6].getIcon()).equals("empty") && canMove(row, col, 2, 6) && blackEnpasante7) {
                        board2[2][6].setBackground(redHighlight);
                        board2[2][6].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 6) {
                    //left
                    if (getColor((ImageIcon) board2[2][5].getIcon()).equals("empty") && canMove(row, col, 2, 5) && blackEnpasante6) {
                        board2[2][5].setBackground(redHighlight);
                        board2[2][5].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][7].getIcon()).equals("empty") && canMove(row, col, 2, 7) && blackEnpasante8) {
                        board2[2][7].setBackground(redHighlight);
                        board2[2][7].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 7) {
                    //left
                    if (getColor((ImageIcon) board2[2][6].getIcon()).equals("empty") && canMove(row, col, 2, 6) && blackEnpasante7) {
                        board2[2][6].setBackground(redHighlight);
                        board2[2][6].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][8].getIcon()).equals("empty") && canMove(row, col, 2, 8) && blackEnpasante9) {
                        board2[2][8].setBackground(redHighlight);
                        board2[2][8].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 8) {
                    //left
                    if (getColor((ImageIcon) board2[2][7].getIcon()).equals("empty") && canMove(row, col, 2, 7) && blackEnpasante8) {
                        board2[2][7].setBackground(redHighlight);
                        board2[2][7].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][9].getIcon()).equals("empty") && canMove(row, col, 2, 9) && blackEnpasante10) {
                        board2[2][9].setBackground(redHighlight);
                        board2[2][9].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 9) {
                    //left
                    if (getColor((ImageIcon) board2[2][8].getIcon()).equals("empty") && canMove(row, col, 2, 8) && blackEnpasante9) {
                        board2[2][8].setBackground(redHighlight);
                        board2[2][8].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][10].getIcon()).equals("empty") && canMove(row, col, 2, 10) && blackEnpasante11) {
                        board2[2][10].setBackground(redHighlight);
                        board2[2][10].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 10) {
                    //left
                    if (getColor((ImageIcon) board2[2][9].getIcon()).equals("empty") && canMove(row, col, 2, 9) && blackEnpasante10) {
                        board2[2][9].setBackground(redHighlight);
                        board2[2][9].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][11].getIcon()).equals("empty") && canMove(row, col, 2, 11) && blackEnpasante12) {
                        board2[2][11].setBackground(redHighlight);
                        board2[2][11].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 11) {
                    //left
                    if (getColor((ImageIcon) board2[2][10].getIcon()).equals("empty") && canMove(row, col, 2, 10) && blackEnpasante11) {
                        board2[2][10].setBackground(redHighlight);
                        board2[2][10].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][12].getIcon()).equals("empty") && canMove(row, col, 2, 12) && blackEnpasante13) {
                        board2[2][12].setBackground(redHighlight);
                        board2[2][12].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 12) {
                    //left
                    if (getColor((ImageIcon) board2[2][11].getIcon()).equals("empty") && canMove(row, col, 2, 11) && blackEnpasante12) {
                        board2[2][11].setBackground(redHighlight);
                        board2[2][11].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][13].getIcon()).equals("empty") && canMove(row, col, 2, 13) && blackEnpasante14) {
                        board2[2][13].setBackground(redHighlight);
                        board2[2][13].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 13) {
                    //left
                    if (getColor((ImageIcon) board2[2][12].getIcon()).equals("empty") && canMove(row, col, 2, 12) && blackEnpasante13) {
                        board2[2][12].setBackground(redHighlight);
                        board2[2][12].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[2][14].getIcon()).equals("empty") && canMove(row, col, 2, 14) && blackEnpasante15) {
                        board2[2][14].setBackground(redHighlight);
                        board2[2][14].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 14) {
                    //left
                    if (getColor((ImageIcon) board2[2][13].getIcon()).equals("empty") && canMove(row, col, 2, 13) && blackEnpasante14) {
                        board2[2][13].setBackground(redHighlight);
                        board2[2][13].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }
            //check vacancy of forward cell
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board2[row - 1][col].getIcon()).equals("empty") && canMove(row, col, row - 1, col)) {
                    board2[row - 1][col].setBackground(blueHighlight);
                    board2[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));

                    //check initial position of pawn in order to advance 2 steps forward
                    if (row == 13 && getColor((ImageIcon) board2[row - 2][col].getIcon()).equals("empty") && canMove(row, col, row - 2, col)) {
                        board2[row - 2][col].setBackground(blueHighlight);
                        board2[row - 2][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }

            //handle IOB
            if (col - 1 >= 0 && row - 1 >= 0) {
                //check if left diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 1][col - 1].getIcon()).equals("king") && canMove(row, col, row - 1, col - 1)) {
                    board2[row - 1][col - 1].setBackground(redHighlight);
                    board2[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //Handle IOB
            if (col + 1 < board2.length && row - 1 >= 0) {
                //check if right diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("black") && !getType((ImageIcon) board2[row - 1][col + 1].getIcon()).equals("king") && canMove(row, col, row - 1, col + 1)) {
                    board2[row - 1][col + 1].setBackground(redHighlight);
                    board2[row - 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }
        else{
            //check for enpasante
            if (row == 11) {
                if (col == 0) {
                    //right
                    if (getColor((ImageIcon) board2[12][1].getIcon()).equals("empty") && canMove(row, col, 12, 1) && whiteEnpasante2) {
                        board2[12][1].setBackground(redHighlight);
                        board2[12][1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 1) {
                    //left
                    if (getColor((ImageIcon) board2[12][0].getIcon()).equals("empty") && canMove(row, col, 12, 0) && whiteEnpasante1) {
                        board2[12][0].setBackground(redHighlight);
                        board2[12][0].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][2].getIcon()).equals("empty") && canMove(row, col, 12, 2) && whiteEnpasante3) {
                        board2[12][2].setBackground(redHighlight);
                        board2[12][2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 2) {
                    //left
                    if (getColor((ImageIcon) board2[12][1].getIcon()).equals("empty") && canMove(row, col, 12, 1) && whiteEnpasante2) {
                        board2[12][1].setBackground(redHighlight);
                        board2[12][1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][3].getIcon()).equals("empty") && canMove(row, col, 12, 3) && whiteEnpasante4) {
                        board2[12][3].setBackground(redHighlight);
                        board2[12][3].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 3) {
                    //left
                    if (getColor((ImageIcon) board2[12][2].getIcon()).equals("empty") && canMove(row, col, 12, 2) && whiteEnpasante3) {
                        board2[12][2].setBackground(redHighlight);
                        board2[12][2].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][4].getIcon()).equals("empty") && canMove(row, col, 12, 4) && whiteEnpasante5) {
                        board2[12][4].setBackground(redHighlight);
                        board2[12][4].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 4) {
                    //left
                    if (getColor((ImageIcon) board2[12][3].getIcon()).equals("empty") && canMove(row, col, 12, 3) && whiteEnpasante4) {
                        board2[12][3].setBackground(redHighlight);
                        board2[12][3].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][5].getIcon()).equals("empty") && canMove(row, col, 12, 5) && whiteEnpasante6) {
                        board2[12][5].setBackground(redHighlight);
                        board2[12][5].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 5) {
                    //left
                    if (getColor((ImageIcon) board2[12][4].getIcon()).equals("empty") && canMove(row, col, 12, 4) && whiteEnpasante5) {
                        board2[12][4].setBackground(redHighlight);
                        board2[12][4].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][6].getIcon()).equals("empty") && canMove(row, col, 12, 6) && whiteEnpasante7) {
                        board2[12][6].setBackground(redHighlight);
                        board2[12][6].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 6) {
                    //left
                    if (getColor((ImageIcon) board2[12][5].getIcon()).equals("empty") && canMove(row, col, 12, 5) && whiteEnpasante6) {
                        board2[12][5].setBackground(redHighlight);
                        board2[12][5].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][7].getIcon()).equals("empty") && canMove(row, col, 12, 7) && whiteEnpasante8) {
                        board2[12][7].setBackground(redHighlight);
                        board2[12][7].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 7) {
                    //left
                    if (getColor((ImageIcon) board2[12][6].getIcon()).equals("empty") && canMove(row, col, 12, 6) && whiteEnpasante7) {
                        board2[12][6].setBackground(redHighlight);
                        board2[12][6].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][8].getIcon()).equals("empty") && canMove(row, col, 12, 8) && whiteEnpasante9) {
                        board2[12][8].setBackground(redHighlight);
                        board2[12][8].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 8) {
                    //left
                    if (getColor((ImageIcon) board2[12][7].getIcon()).equals("empty") && canMove(row, col, 12, 7) && whiteEnpasante8) {
                        board2[12][7].setBackground(redHighlight);
                        board2[12][7].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][9].getIcon()).equals("empty") && canMove(row, col, 12, 9) && whiteEnpasante10) {
                        board2[12][9].setBackground(redHighlight);
                        board2[12][9].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 9) {
                    //left
                    if (getColor((ImageIcon) board2[12][8].getIcon()).equals("empty") && canMove(row, col, 12, 8) && whiteEnpasante9) {
                        board2[12][8].setBackground(redHighlight);
                        board2[12][8].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][10].getIcon()).equals("empty") && canMove(row, col, 12, 10) && whiteEnpasante11) {
                        board2[12][10].setBackground(redHighlight);
                        board2[12][10].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 10) {
                    //left
                    if (getColor((ImageIcon) board2[12][9].getIcon()).equals("empty") && canMove(row, col, 12, 9) && whiteEnpasante10) {
                        board2[12][9].setBackground(redHighlight);
                        board2[12][9].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][11].getIcon()).equals("empty") && canMove(row, col, 12, 11) && whiteEnpasante12) {
                        board2[12][11].setBackground(redHighlight);
                        board2[12][11].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 11) {
                    //left
                    if (getColor((ImageIcon) board2[12][10].getIcon()).equals("empty") && canMove(row, col, 12, 10) && whiteEnpasante11) {
                        board2[12][10].setBackground(redHighlight);
                        board2[12][10].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][12].getIcon()).equals("empty") && canMove(row, col, 12, 12) && whiteEnpasante13) {
                        board2[12][12].setBackground(redHighlight);
                        board2[12][12].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 12) {
                    //left
                    if (getColor((ImageIcon) board2[12][11].getIcon()).equals("empty") && canMove(row, col, 12, 11) && whiteEnpasante12) {
                        board2[12][11].setBackground(redHighlight);
                        board2[12][11].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][13].getIcon()).equals("empty") && canMove(row, col, 12, 13) && whiteEnpasante14) {
                        board2[12][13].setBackground(redHighlight);
                        board2[12][13].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 13) {
                    //left
                    if (getColor((ImageIcon) board2[12][12].getIcon()).equals("empty") && canMove(row, col, 12, 12) && whiteEnpasante13) {
                        board2[12][12].setBackground(redHighlight);
                        board2[12][12].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                    //right
                    if (getColor((ImageIcon) board2[12][14].getIcon()).equals("empty") && canMove(row, col, 12, 14) && whiteEnpasante15) {
                        board2[12][14].setBackground(redHighlight);
                        board2[12][14].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                } else if (col == 14) {
                    //left
                    if (getColor((ImageIcon) board2[12][13].getIcon()).equals("empty") && canMove(row, col, 12, 13) && whiteEnpasante14) {
                        board2[12][13].setBackground(redHighlight);
                        board2[12][1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }
            //check vacancy of forward cell
            if (row + 1 < board2.length) {
                if (getColor((ImageIcon) board2[row + 1][col].getIcon()).equals("empty") && canMove(row, col, row + 1, col)) {
                    board2[row + 1][col].setBackground(blueHighlight);
                    board2[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));

                    //check initial position of pawn in order to advance 2 steps forward
                    if (row == 1 && getColor((ImageIcon) board2[row + 2][col].getIcon()).equals("empty") && canMove(row, col, row + 2, col)) {
                        board2[row + 2][col].setBackground(blueHighlight);
                        board2[row + 2][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }

            //handle IOB
            if (col - 1 >= 0 && row + 1 < board2.length) {
                //check if left diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 1][col - 1].getIcon()).equals("king") && canMove(row, col, row + 1, col - 1)) {
                    board2[row + 1][col - 1].setBackground(redHighlight);
                    board2[row + 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }

            //Handle IOB
            if (col + 1 < board2.length && row + 1 < board2.length) {
                //check if right diagonal cell contains an enemy piece
                if (getColor((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("white") && !getType((ImageIcon) board2[row + 1][col + 1].getIcon()).equals("king") && canMove(row, col, row + 1, col + 1)) {
                    board2[row + 1][col + 1].setBackground(redHighlight);
                    board2[row + 1][col + 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }
    }

    public boolean canMove(int prevRow, int prevCol, int row, int col) {
        if (Objects.equals(this.color, "white")) {
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(whitePawn1);
            board2[prevRow][prevCol].setIcon(null);
            if (isCheck("white", board2)) {
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whitePawn1);
                return false;
            } else {
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(whitePawn1);
                return true;
            }
        } else {
            ImageIcon temp = (ImageIcon) board2[row][col].getIcon();
            board2[row][col].setIcon(blackPawn1);
            board2[prevRow][prevCol].setIcon(null);
            if (isCheck("black", board2)) {
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackPawn1);
                return false;
            } else {
                board2[row][col].setIcon(temp);
                board2[prevRow][prevCol].setIcon(blackPawn1);
                return true;
            }
        }
    }
}