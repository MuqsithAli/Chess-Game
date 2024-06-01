package Piece;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

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

    public List<JLabel> movableCells() {
        List<JLabel> ans = new ArrayList<>();
        if (Objects.equals(this.color, "white")) {
            //check if forward cell is empty and ensure we are 1 square away from opposite king
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    if (row - 2 >= 0) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                            ans.add(board[row-1][col]);
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")))) {
                                    ans.add(board[row-1][col]);
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                ans.add(board[row-1][col]);
                            }
                        }
                    } else {
                        ans.add(board[row-1][col]);
                    }
                }


                //check if forward cell has a opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("black") && isSafe(row - 1, col)) {
                    if (row - 2 >= 0) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                    ans.add(board[row-1][col]);
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")))) {
                                    ans.add(board[row-1][col]);
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                ans.add(board[row-1][col]);
                            }
                        }
                    } else {
                        ans.add(board[row-1][col]);
                    }
                }
            }


            //check if backward cell is empty and ensure we are 1 square away from opposite king
            if (row + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    if (row + 2 < board.length) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                    ans.add(board[row+1][col]);
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king"))) {
                                    ans.add(board[row+1][col]);
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                ans.add(board[row+1][col]);
                            }
                        }
                    } else {
                        ans.add(board[row+1][col]);
                    }
                }


                //check if backward cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("black") && isSafe(row + 1, col)) {
                    if (row + 2 < board.length) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                    ans.add(board[row+1][col]);
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king"))) {
                                    ans.add(board[row+1][col]);
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                ans.add(board[row+1][col]);
                            }
                        }
                    } else {
                        ans.add(board[row+1][col]);
                    }
                }
            }

            //check if upper left diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col - 1)
                ) {
                    if (row - 2 >= 0) {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col - 2].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                ans.add(board[row-1][col-1]);
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                ans.add(board[row-1][col-1]);
                            }
                        }
                    } else {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))) {
                                ans.add(board[row-1][col-1]);
                            }
                        } else {
                            ans.add(board[row-1][col-1]);
                        }
                    }
                }
            }

            //check if upper left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col - 1].getIcon()).equals("black")
                        && isSafe(row - 1, col - 1)
                ) {
                    if (row - 2 >= 0) {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col - 2].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                ans.add(board[row-1][col-1]);
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                ans.add(board[row-1][col-1]);
                            }
                        }
                    } else {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))) {
                                ans.add(board[row-1][col-1]);
                            }
                        } else {
                            ans.add(board[row-1][col-1]);
                        }
                    }
                }
            }
        } else {
            //forward
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    if (row - 2 >= 0 && col - 1 >= 0 && col + 1 < board.length) {
                        if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))) {
                            ans.add(board[row - 1][col]);
                        }
                    } else {
                        ans.add(board[row - 1][col]);
                    }
                }
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("white") && isSafe(row - 1, col)) {
                    if (row - 2 >= 0 && col - 1 >= 0 && col + 1 < board.length) {
                        if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))) {
                            ans.add(board[row - 1][col]);
                        }
                    } else {
                        ans.add(board[row - 1][col]);
                    }
                }
            }

            //backward
            if (row + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    if (row + 2 < board.length && col - 1 >= 0 && col + 1 < board.length) {
                        if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))
                                && !((getColor((ImageIcon) board[row + 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row + 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("pawn")))) {
                            ans.add(board[row + 1][col]);
                        }
                    } else {
                        ans.add(board[row + 1][col]);

                    }
                }
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("white") && isSafe(row + 1, col)) {
                    if (row + 2 < board.length && col - 1 >= 0 && col + 1 < board.length) {
                        if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))
                                && !((getColor((ImageIcon) board[row + 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row + 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("pawn")))
                        ) {
                            ans.add(board[row + 1][col]);
                        }
                    } else {
                        ans.add(board[row + 1][col]);
                    }
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
            //check if forward cell is empty and ensure we are 1 square away from opposite king
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    if (row - 2 >= 0) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                    board[row - 1][col].setBackground(blueHighlight);
                                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")))) {
                                    board[row - 1][col].setBackground(blueHighlight);
                                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                board[row - 1][col].setBackground(blueHighlight);
                                board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        }
                    } else {
                        board[row - 1][col].setBackground(blueHighlight);
                        board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }


                //check if forward cell has a opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("black") && isSafe(row - 1, col)) {
                    if (row - 2 >= 0) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                    board[row - 1][col].setBackground(redHighlight);
                                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king"))
                                        && !((getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("pawn")))) {
                                    board[row - 1][col].setBackground(redHighlight);
                                    board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("pawn")))) {
                                board[row - 1][col].setBackground(redHighlight);
                                board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        }
                    } else {
                        board[row - 1][col].setBackground(redHighlight);
                        board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }


            //check if backward cell is empty and ensure we are 1 square away from opposite king
            if (row + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty")
                        && isSafe(row + 1, col)
                ) {
                    if (row + 2 < board.length) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                    board[row + 1][col].setBackground(blueHighlight);
                                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king"))) {
                                    board[row + 1][col].setBackground(blueHighlight);
                                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                board[row + 1][col].setBackground(blueHighlight);
                                board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        }
                    } else {
                        board[row + 1][col].setBackground(blueHighlight);
                        board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }


                //check if backward cell has an opposite piece and ensure we are 1 square away from opposite king
                if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("black") && isSafe(row + 1, col)) {
                    if (row + 2 < board.length) {
                        if (col - 1 >= 0) {
                            if (col + 1 < board.length) {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                    board[row + 1][col].setBackground(redHighlight);
                                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            } else {
                                if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king"))) {
                                    board[row + 1][col].setBackground(redHighlight);
                                    board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                                }
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))) {
                                board[row + 1][col].setBackground(redHighlight);
                                board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        }
                    } else {
                        board[row + 1][col].setBackground(redHighlight);
                        board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }




            //check if upper left diagonal is empty and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col - 1].getIcon()).equals("empty")
                        && isSafe(row - 1, col - 1)
                ) {
                    if (row - 2 >= 0) {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col - 2].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                board[row - 1][col - 1].setBackground(blueHighlight);
                                board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                board[row - 1][col - 1].setBackground(blueHighlight);
                                board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        }
                    } else {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))) {
                                board[row - 1][col - 1].setBackground(blueHighlight);
                                board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        } else {
                            board[row - 1][col - 1].setBackground(blueHighlight);
                            board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        }
                    }
                }
            }


            //check if upper left diagonal has an opposite piece and ensure it is 1 square away from opposite king
            if (row - 1 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col - 1].getIcon()).equals("black")
                        && isSafe(row - 1, col - 1)
                ) {
                    if (row - 2 >= 0) {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col - 2].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 2].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                board[row - 1][col - 1].setBackground(redHighlight);
                                board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        } else {
                            if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row - 2][col].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col].getIcon()).equals("pawn")))) {
                                board[row - 1][col - 1].setBackground(redHighlight);
                                board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        }
                    } else {
                        if (col - 2 >= 0) {
                            if (!(getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("king") || getType((ImageIcon) board[row][col - 2].getIcon()).equals("king"))) {
                                board[row - 1][col - 1].setBackground(redHighlight);
                                board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        } else {
                            board[row - 1][col - 1].setBackground(redHighlight);
                            board[row - 1][col - 1].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        }
                    }
                }
            }
        } else {
            //forward
            if (row - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("empty")
                        && isSafe(row - 1, col)
                ) {
                    if (row - 2 >= 0 && col - 1 >= 0 && col + 1 < board.length) {
                        if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))) {
                            board[row - 1][col].setBackground(blueHighlight);
                            board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        }
                    } else {
                        board[row - 1][col].setBackground(blueHighlight);
                        board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
                if (getColor((ImageIcon) board[row - 1][col].getIcon()).equals("white") && isSafe(row - 1, col)) {
                    if (row - 2 >= 0 && col - 1 >= 0 && col + 1 < board.length) {
                        if (!(getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("king"))) {
                            board[row - 1][col].setBackground(redHighlight);
                            board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        }
                    } else {
                        board[row - 1][col].setBackground(redHighlight);
                        board[row - 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }

                }

                //backward
                if (row + 1 < board.length) {
                    if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("empty")
                            && isSafe(row + 1, col)
                    ) {
                        if (row + 2 < board.length && col - 1 >= 0 && col + 1 < board.length) {
                            if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row + 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row + 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("pawn")))) {
                                board[row + 1][col].setBackground(blueHighlight);
                                board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        } else {
                            board[row + 1][col].setBackground(blueHighlight);
                            board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        }
                    }
                    if (getColor((ImageIcon) board[row + 1][col].getIcon()).equals("white") && isSafe(row + 1, col)) {
                        if (row + 2 < board.length && col - 1 >= 0 && col + 1 < board.length) {
                            if (!(getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col].getIcon()).equals("king") || getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("king"))
                                    && !((getColor((ImageIcon) board[row + 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("pawn")) || (getColor((ImageIcon) board[row + 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("pawn")))) {
                                board[row + 1][col].setBackground(redHighlight);
                                board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                            }
                        } else {
                            board[row + 1][col].setBackground(redHighlight);
                            board[row + 1][col].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        }
                    }
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
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right upper diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left lower diagonal
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right lower diagonal
            for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //check vertical and horizontal
            //up
            for (int i = row - 1; i >= 0; i--) {
                if (getColor((ImageIcon) board[i][col].getIcon()).equals("black") && (getType((ImageIcon) board[i][col].getIcon()).equals("rook") || getType((ImageIcon) board[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //down
            for (int i = row + 1; i < board.length; i++) {
                if (getColor((ImageIcon) board[i][col].getIcon()).equals("black") && (getType((ImageIcon) board[i][col].getIcon()).equals("rook") || getType((ImageIcon) board[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left
            for (int j = col - 1; j >= 0; j--) {
                if (getColor((ImageIcon) board[row][j].getIcon()).equals("black") && (getType((ImageIcon) board[row][j].getIcon()).equals("rook") || getType((ImageIcon) board[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right
            for (int j = col + 1; j < board.length; j++) {
                if (getColor((ImageIcon) board[row][j].getIcon()).equals("black") && (getType((ImageIcon) board[row][j].getIcon()).equals("rook") || getType((ImageIcon) board[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //detect Knights
            //upper right
            if (row - 2 >= 0 && col + 1 < board.length) {
                if (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower right
            if (row + 2 < board.length && col + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 2][col + 1].getIcon()).equals("black") && getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower left
            if (row + 2 < board.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row + 2][col - 1].getIcon()).equals("black") && getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left down
            if (row + 1 < board.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board[row + 1][col - 2].getIcon()).equals("black") && getType((ImageIcon) board[row + 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col - 2].getIcon()).equals("black") && getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right down
            if (row + 1 < board.length && col + 2 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col + 2].getIcon()).equals("black") && getType((ImageIcon) board[row + 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board.length) {
                if (getColor((ImageIcon) board[row - 1][col + 2].getIcon()).equals("black") && getType((ImageIcon) board[row - 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }
        } else {
            //check diagonals
            //left upper diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right upper diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left lower diagonal
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right lower diagonal
            for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && (getType((ImageIcon) board[i][j].getIcon()).equals("bishop") || getType((ImageIcon) board[i][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //check vertical and horizontal
            //up
            for (int i = row - 1; i >= 0; i--) {
                if (getColor((ImageIcon) board[i][col].getIcon()).equals("white") && (getType((ImageIcon) board[i][col].getIcon()).equals("rook") || getType((ImageIcon) board[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //down
            for (int i = row + 1; i < board.length; i++) {
                if (getColor((ImageIcon) board[i][col].getIcon()).equals("white") && (getType((ImageIcon) board[i][col].getIcon()).equals("rook") || getType((ImageIcon) board[i][col].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[i][col].getIcon()).equals("empty")) {
                    break;
                }
            }

            //left
            for (int j = col - 1; j >= 0; j--) {
                if (getColor((ImageIcon) board[row][j].getIcon()).equals("white") && (getType((ImageIcon) board[row][j].getIcon()).equals("rook") || getType((ImageIcon) board[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }

            //right
            for (int j = col + 1; j < board.length; j++) {
                if (getColor((ImageIcon) board[row][j].getIcon()).equals("white") && (getType((ImageIcon) board[row][j].getIcon()).equals("rook") || getType((ImageIcon) board[row][j].getIcon()).equals("queen"))) {
                    return false;
                } else if (!getColor((ImageIcon) board[row][j].getIcon()).equals("empty")) {
                    break;
                }
            }


            //detect Knights
            //upper right
            if (row - 2 >= 0 && col + 1 < board.length) {
                if (getColor((ImageIcon) board[row - 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board[row - 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //upper left
            if (row - 2 >= 0 && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row - 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board[row - 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower right
            if (row + 2 < board.length && col + 1 < board.length) {
                if (getColor((ImageIcon) board[row + 2][col + 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col + 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //lower left
            if (row + 2 < board.length && col - 1 >= 0) {
                if (getColor((ImageIcon) board[row + 2][col - 1].getIcon()).equals("white") && getType((ImageIcon) board[row + 2][col - 1].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left down
            if (row + 1 < board.length && col - 2 >= 0) {
                if (getColor((ImageIcon) board[row + 1][col - 2].getIcon()).equals("white") && getType((ImageIcon) board[row + 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //left up
            if (row - 1 >= 0 && col - 2 >= 0) {
                if (getColor((ImageIcon) board[row - 1][col - 2].getIcon()).equals("white") && getType((ImageIcon) board[row - 1][col - 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right down
            if (row + 1 < board.length && col + 2 < board.length) {
                if (getColor((ImageIcon) board[row + 1][col + 2].getIcon()).equals("white") && getType((ImageIcon) board[row + 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }

            //right up
            if (row - 1 >= 0 && col + 2 < board.length) {
                if (getColor((ImageIcon) board[row - 1][col + 2].getIcon()).equals("white") && getType((ImageIcon) board[row - 1][col + 2].getIcon()).equals("knight")) {
                    return false;
                }
            }
        }
        return true;
    }
}
