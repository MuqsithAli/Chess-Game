package Main;

import Piece.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Main implements MouseListener {
    public static JLabel[][] board;
    public static ImageIcon blackRook1;
    public static ImageIcon whiteRook1;
    public static ImageIcon blackRook2;
    public static ImageIcon whiteRook2;
    public static ImageIcon blackKnight1;
    public static ImageIcon whiteKnight1;
    public static ImageIcon blackKnight2;
    public static ImageIcon whiteKnight2;
    public static ImageIcon blackBishop1;
    public static ImageIcon whiteBishop1;
    public static ImageIcon blackBishop2;
    public static ImageIcon whiteBishop2;
    public static ImageIcon blackQueen;
    public static ImageIcon whiteQueen;
    public static ImageIcon blackKing;
    public static ImageIcon whiteKing;
    public static ImageIcon blackPawn1;
    public static ImageIcon blackPawn2;
    public static ImageIcon blackPawn3;
    public static ImageIcon blackPawn4;
    public static ImageIcon blackPawn5;
    public static ImageIcon blackPawn6;
    public static ImageIcon blackPawn7;
    public static ImageIcon blackPawn8;
    public static ImageIcon whitePawn1;
    public static ImageIcon whitePawn2;
    public static ImageIcon whitePawn3;
    public static ImageIcon whitePawn4;
    public static ImageIcon whitePawn5;
    public static ImageIcon whitePawn6;
    public static ImageIcon whitePawn7;
    public static ImageIcon whitePawn8;
    public static Color blueHighlight = new Color(135, 206, 235);
    public static Color redHighlight = new Color(228, 119, 119);
    public static Color pinkHighLight = new Color(252, 168, 210);
    public static Color purpleHighLight = new Color(148, 107, 219);
    public static Color darkSquare = new Color(118, 150, 86);
    public static Color lightSquare = new Color(238, 238, 210);
    public static Stack<JLabel> clickedStack = new Stack<>(); // 0 -> Chess Piece, 1 -> movable Cell
    public static boolean whiteKingMoved = false;
    public static boolean whiteRook1Moved = false;
    public static boolean whiteRook2Moved = false;
    public static boolean blackKingMoved = false;
    public static boolean blackRook1Moved = false;
    public static boolean blackRook2Moved = false;
    public static boolean blackEnpasante1 = false;
    public static boolean blackEnpasante2 = false;
    public static boolean blackEnpasante3 = false;
    public static boolean blackEnpasante4 = false;
    public static boolean blackEnpasante5 = false;
    public static boolean blackEnpasante6 = false;
    public static boolean blackEnpasante7 = false;
    public static boolean blackEnpasante8 = false;
    public static boolean whiteEnpasante1 = false;
    public static boolean whiteEnpasante2 = false;
    public static boolean whiteEnpasante3 = false;
    public static boolean whiteEnpasante4 = false;
    public static boolean whiteEnpasante5 = false;
    public static boolean whiteEnpasante6 = false;
    public static boolean whiteEnpasante7 = false;
    public static boolean whiteEnpasante8 = false;
    public static String player = "white";
    public static int uselessHalfMoves = 0;

    Main() {
        JFrame frame = new JFrame("Chess");
        frame.setLayout(new GridLayout(8, 8));
        board = new JLabel[8][8];

        // Load the image icon
        blackRook1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/black_rook.png")));
        blackRook2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/black_rook.png")));
        whiteRook1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/white_rook.png")));
        whiteRook2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/white_rook.png")));
        blackKnight1 = blackKnight2 = new ImageIcon(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("/Images/black_knight.png"))));
        whiteKnight1 = whiteKnight2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/white_knight.png")));
        blackBishop1 = blackBishop2 = new ImageIcon(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("/Images/black_bishop.png")))))));
        whiteBishop1 = whiteBishop2 = new ImageIcon(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("/Images/white_bishop.png")))));
        blackQueen = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/black_queen.png")));
        whiteQueen = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/white_queen.png")));
        blackKing = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/black_king.png")));
        whiteKing = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/white_king.png")));
        whitePawn1 = whitePawn2 = whitePawn3 = whitePawn4 = whitePawn5 = whitePawn6 = whitePawn7 = whitePawn8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/white_pawn.png")));
        blackPawn1 = blackPawn2 = blackPawn3 = blackPawn4 = blackPawn5 = blackPawn6 = blackPawn7 = blackPawn8 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/black_pawn.png")));

        Image image1 = blackRook1.getImage();
        Image scaledImage1 = image1.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackRook1 = new ImageIcon(scaledImage1);

        Image image2 = blackRook2.getImage();
        Image scaledImage2 = image2.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackRook2 = new ImageIcon(scaledImage2);

        Image image3 = blackKnight1.getImage();
        Image scaledImage3 = image3.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackKnight1 = new ImageIcon(scaledImage3);

        Image image4 = blackKnight2.getImage();
        Image scaledImage4 = image4.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackKnight2 = new ImageIcon(scaledImage4);

        Image image5 = blackBishop1.getImage();
        Image scaledImage5 = image5.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackBishop1 = new ImageIcon(scaledImage5);

        Image image6 = blackBishop2.getImage();
        Image scaledImage6 = image6.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackBishop2 = new ImageIcon(scaledImage6);

        Image image7 = blackQueen.getImage();
        Image scaledImage7 = image7.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackQueen = new ImageIcon(scaledImage7);

        Image image8 = blackKing.getImage();
        Image scaledImage8 = image8.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackKing = new ImageIcon(scaledImage8);

        Image image9 = blackPawn1.getImage();
        Image scaledImage9 = image9.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn1 = new ImageIcon(scaledImage9);

        Image image10 = blackPawn2.getImage();
        Image scaledImage10 = image10.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn2 = new ImageIcon(scaledImage10);

        Image image11 = blackPawn3.getImage();
        Image scaledImage11 = image11.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn3 = new ImageIcon(scaledImage11);

        Image image12 = blackPawn4.getImage();
        Image scaledImage12 = image12.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn4 = new ImageIcon(scaledImage12);

        Image image13 = blackPawn5.getImage();
        Image scaledImage13 = image13.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn5 = new ImageIcon(scaledImage13);

        Image image14 = blackPawn6.getImage();
        Image scaledImage14 = image14.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn6 = new ImageIcon(scaledImage14);

        Image image15 = blackPawn7.getImage();
        Image scaledImage15 = image15.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn7 = new ImageIcon(scaledImage15);

        Image image16 = blackPawn8.getImage();
        Image scaledImage16 = image16.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn8 = new ImageIcon(scaledImage16);

        Image image17 = whiteRook1.getImage();
        Image scaledImage17 = image17.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteRook1 = new ImageIcon(scaledImage17);

        Image image18 = whiteRook2.getImage();
        Image scaledImage18 = image18.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteRook2 = new ImageIcon(scaledImage18);

        Image image19 = whiteKnight1.getImage();
        Image scaledImage19 = image19.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteKnight1 = new ImageIcon(scaledImage19);

        Image image20 = whiteKnight2.getImage();
        Image scaledImage20 = image20.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteKnight2 = new ImageIcon(scaledImage20);

        Image image21 = whiteBishop1.getImage();
        Image scaledImage21 = image21.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteBishop1 = new ImageIcon(scaledImage21);

        Image image22 = whiteBishop2.getImage();
        Image scaledImage22 = image22.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteBishop2 = new ImageIcon(scaledImage22);

        Image image23 = whiteQueen.getImage();
        Image scaledImage23 = image23.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteQueen = new ImageIcon(scaledImage23);

        Image image24 = whiteKing.getImage();
        Image scaledImage24 = image24.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteKing = new ImageIcon(scaledImage24);

        Image image25 = whitePawn1.getImage();
        Image scaledImage25 = image25.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn1 = new ImageIcon(scaledImage25);

        Image image26 = whitePawn2.getImage();
        Image scaledImage26 = image26.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn2 = new ImageIcon(scaledImage26);

        Image image27 = whitePawn3.getImage();
        Image scaledImage27 = image27.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn3 = new ImageIcon(scaledImage27);

        Image image28 = whitePawn4.getImage();
        Image scaledImage28 = image28.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn4 = new ImageIcon(scaledImage28);

        Image image29 = whitePawn5.getImage();
        Image scaledImage29 = image29.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn5 = new ImageIcon(scaledImage29);

        Image image30 = whitePawn6.getImage();
        Image scaledImage30 = image30.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn6 = new ImageIcon(scaledImage30);

        Image image31 = whitePawn7.getImage();
        Image scaledImage31 = image31.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn7 = new ImageIcon(scaledImage31);

        Image image32 = whitePawn8.getImage();
        Image scaledImage32 = image32.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn8 = new ImageIcon(scaledImage32);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new JLabel();
                board[i][j].setHorizontalAlignment(JLabel.CENTER);
                board[i][j].setOpaque(true); // Ensure the background color is visible
                board[i][j].addMouseListener(this);

                if ((i + j) % 2 != 0) {
                    board[i][j].setBackground(darkSquare); // Dark square color
                } else {
                    board[i][j].setBackground(lightSquare); // Light square color
                }

                frame.add(board[i][j]);
            }
        }

        // Set frame properties
        frame.setSize(650, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialiseBoard();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public static void initialiseBoard() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j].setBackground((i + j) % 2 != 0 ? darkSquare : lightSquare);
                board[i][j].setIcon(null);
                board[i][j].setBorder(null);
//                board[i][j].setText(i + ", " + j);
//                board[i][j].setFont(new Font("Arial", Font.PLAIN, 12));
            }
        }
        board[0][0].setIcon(blackRook1);
        board[0][7].setIcon(blackRook2);
        board[0][1].setIcon(blackKnight1);
        board[0][6].setIcon(blackKnight2);
        board[0][2].setIcon(blackBishop1);
        board[0][5].setIcon(blackBishop2);
        board[0][3].setIcon(blackQueen);
        board[0][4].setIcon(blackKing);
        board[1][0].setIcon(blackPawn1);
        board[1][1].setIcon(blackPawn2);
        board[1][2].setIcon(blackPawn3);
        board[1][3].setIcon(blackPawn4);
        board[1][4].setIcon(blackPawn5);
        board[1][5].setIcon(blackPawn6);
        board[1][6].setIcon(blackPawn7);
        board[1][7].setIcon(blackPawn8);
        board[7][0].setIcon(whiteRook1);
        board[7][7].setIcon(whiteRook2);
        board[7][1].setIcon(whiteKnight1);
        board[7][6].setIcon(whiteKnight2);
        board[7][2].setIcon(whiteBishop1);
        board[7][5].setIcon(whiteBishop2);
        board[7][3].setIcon(whiteQueen);
        board[7][4].setIcon(whiteKing);
        board[6][0].setIcon(whitePawn1);
        board[6][1].setIcon(whitePawn2);
        board[6][2].setIcon(whitePawn3);
        board[6][3].setIcon(whitePawn4);
        board[6][4].setIcon(whitePawn5);
        board[6][5].setIcon(whitePawn6);
        board[6][6].setIcon(whitePawn7);
        board[6][7].setIcon(whitePawn8);


        //Perform Modifications below
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel clickedCell = (JLabel) e.getSource();
        int row = -1;
        int col = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != clickedCell) {
                    board[i][j].setBorder(null);
                    board[i][j].setBackground((i + j) % 2 != 0 ? darkSquare : lightSquare);
                } else {
                    row = i;
                    col = j;
                }
            }
        }
        if (clickedStack.isEmpty()) {
            if(player.equals(getColor((ImageIcon) clickedCell.getIcon()))){
                clickedStack.push(clickedCell);
            }
        } else {
            clickedStack.push(clickedCell);
        }
        //Highlight the selected piece
        if ((clickedCell.getBorder() == null && clickedCell.getIcon() != null && player.equals(getColor((ImageIcon) clickedCell.getIcon())) || clickedCell.getBackground() == pinkHighLight)) {
            clickedCell.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        } else {
            clickedCell.setBorder(null);
        }
        if (clickedStack.size() == 2) {
            movePiece(clickedStack.get(0), clickedStack.get(1));
            clickedStack.pop();
            clickedStack.pop();
        }

        String pieceColor = getColor((ImageIcon) clickedCell.getIcon());
        String pieceType = getType((ImageIcon) clickedCell.getIcon());
        if (pieceType.equals("pawn")) {
            Pawn pawn = new Pawn(row, col, pieceColor);
            pawn.highlightCells(row, col);
        }
        if (pieceType.equals("queen")) {
            Queen queen = new Queen(row, col, pieceColor);
            queen.highlightCells(row, col);
        }
        if (pieceType.equals("knight")) {
            Knight knight = new Knight(row, col, pieceColor);
            knight.highlightCells(row, col);
        }
        if (pieceType.equals("rook")) {
            Rook rook = new Rook(row, col, pieceColor);
            rook.highlightCells(row, col);
        }
        if (pieceType.equals("bishop")) {
            Bishop bishop = new Bishop(row, col, pieceColor);
            bishop.highlightCells(row, col);
        }
        if (pieceType.equals("king")) {
            King king = new King(row, col, pieceColor);
            king.highlightCells(row, col);
        }
        if (clickedCell.getBorder() == null && clickedCell.getIcon() != null) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j].setBorder(null);
                    if ((i + j) % 2 != 0) {
                        board[i][j].setBackground(darkSquare); // Dark square color
                    } else {
                        board[i][j].setBackground(lightSquare); // Light square color
                    }
                }
            }
        }
        if (isCheck("white", board)) {
            for (JLabel[] jLabels : board) {
                for (int j = 0; j < board.length; j++) {
                    if (getColor((ImageIcon) jLabels[j].getIcon()).equals("white") && getType((ImageIcon) jLabels[j].getIcon()).equals("king")) {
                        jLabels[j].setBackground(pinkHighLight);
                        jLabels[j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }
            if (isCheckMate("white")) {
                JOptionPane.showMessageDialog(null, "Black wins!");
                resetGame();
            }
        } else {
            if (checkDraw("white") == 1) {
                JOptionPane.showMessageDialog(null, "Draw by Stalemate!");
                resetGame();
            } else if (checkDraw("white") == 2) {
                JOptionPane.showMessageDialog(null, "Draw by Insufficient pieces!");
                resetGame();
            }
            else if (checkDraw("white") == 3) {
                JOptionPane.showMessageDialog(null, "Draw by 50-move rule");
                resetGame();
            }
        }
        if (isCheck("black", board)) {
            for (JLabel[] jLabels : board) {
                for (int j = 0; j < board.length; j++) {
                    if (getColor((ImageIcon) jLabels[j].getIcon()).equals("black") && getType((ImageIcon) jLabels[j].getIcon()).equals("king")) {
                        jLabels[j].setBackground(pinkHighLight);
                        jLabels[j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    }
                }
            }
            if (isCheckMate("black")) {
                JOptionPane.showMessageDialog(null, "White wins!");
                resetGame();
            }
        } else {
            if (checkDraw("black") == 1) {
                JOptionPane.showMessageDialog(null, "Draw by Stalemate!");
                resetGame();
            } else if (checkDraw("black") == 2) {
                JOptionPane.showMessageDialog(null, "Draw by Insufficient pieces!");
                resetGame();
            }
            else if (checkDraw("black") == 3) {
                JOptionPane.showMessageDialog(null, "Draw by 50-move rule");
                resetGame();
            }
        }
    }


    public static void movePiece(JLabel source, JLabel destination) {
        if (source != destination
                && source.getIcon() != null
                && getColor((ImageIcon) source.getIcon()).equals(player)
                && !getColor((ImageIcon) source.getIcon()).equals(getColor((ImageIcon) destination.getIcon()))
                && !(getColor((ImageIcon) source.getIcon()).equals("white") && getType((ImageIcon) destination.getIcon()).equals("king") && getColor((ImageIcon) destination.getIcon()).equals("black"))
                && !(getColor((ImageIcon) source.getIcon()).equals("black") && getType((ImageIcon) destination.getIcon()).equals("king") && getColor((ImageIcon) destination.getIcon()).equals("white"))
                && movableCells(source).contains(destination)
        ) {
            if(source.getIcon() == whitePawn1 || source.getIcon() == blackPawn1 || destination.getIcon() != null){
                uselessHalfMoves = 0;
            }
            else{
                uselessHalfMoves++;
            }
            if (blackEnpasante1 && source.getIcon() != whitePawn1 && destination != board[2][0]) {
                blackEnpasante1 = false;
            } else if (blackEnpasante2 && source.getIcon() != whitePawn1 && destination != board[2][1]) {
                blackEnpasante2 = false;
            } else if (blackEnpasante3 && source.getIcon() != whitePawn1 && destination != board[2][2]) {
                blackEnpasante3 = false;
            } else if (blackEnpasante4 && source.getIcon() != whitePawn1 && destination != board[2][3]) {
                blackEnpasante4 = false;
            } else if (blackEnpasante5 && source.getIcon() != whitePawn1 && destination != board[2][4]) {
                blackEnpasante5 = false;
            } else if (blackEnpasante6 && source.getIcon() != whitePawn1 && destination != board[2][5]) {
                blackEnpasante6 = false;
            } else if (blackEnpasante7 && source.getIcon() != whitePawn1 && destination != board[2][6]) {
                blackEnpasante7 = false;
            } else if (blackEnpasante8 && source.getIcon() != whitePawn1 && destination != board[2][7]) {
                blackEnpasante8 = false;
            }

            if (whiteEnpasante1 && source.getIcon() != blackPawn1 && destination != board[5][0]) {
                whiteEnpasante1 = false;
            } else if (whiteEnpasante2 && source.getIcon() != blackPawn1 && destination != board[5][1]) {
                whiteEnpasante2 = false;
            } else if (whiteEnpasante3 && source.getIcon() != blackPawn1 && destination != board[5][2]) {
                whiteEnpasante3 = false;
            } else if (whiteEnpasante4 && source.getIcon() != blackPawn1 && destination != board[5][3]) {
                whiteEnpasante4 = false;
            } else if (whiteEnpasante5 && source.getIcon() != blackPawn1 && destination != board[5][4]) {
                whiteEnpasante5 = false;
            } else if (whiteEnpasante6 && source.getIcon() != blackPawn1 && destination != board[5][5]) {
                whiteEnpasante6 = false;
            } else if (whiteEnpasante7 && source.getIcon() != blackPawn1 && destination != board[5][6]) {
                whiteEnpasante7 = false;
            } else if (whiteEnpasante8 && source.getIcon() != blackPawn1 && destination != board[5][7]) {
                whiteEnpasante8 = false;
            }
            if (source.getIcon() == blackPawn1) {
                if (source == board[1][0] && destination == board[3][0]) {
                    blackEnpasante1 = true;
                } else if (source == board[1][1] && destination == board[3][1]) {
                    blackEnpasante2 = true;
                } else if (source == board[1][2] && destination == board[3][2]) {
                    blackEnpasante3 = true;
                } else if (source == board[1][3] && destination == board[3][3]) {
                    blackEnpasante4 = true;
                } else if (source == board[1][4] && destination == board[3][4]) {
                    blackEnpasante5 = true;
                } else if (source == board[1][5] && destination == board[3][5]) {
                    blackEnpasante6 = true;
                } else if (source == board[1][6] && destination == board[3][6]) {
                    blackEnpasante7 = true;
                } else if (source == board[1][7] && destination == board[3][7]) {
                    blackEnpasante8 = true;
                }
            } else if (source.getIcon() == whitePawn1) {
                if (source == board[6][0] && destination == board[4][0]) {
                    whiteEnpasante1 = true;
                } else if (source == board[6][1] && destination == board[4][1]) {
                    whiteEnpasante2 = true;
                } else if (source == board[6][2] && destination == board[4][2]) {
                    whiteEnpasante3 = true;
                } else if (source == board[6][3] && destination == board[4][3]) {
                    whiteEnpasante4 = true;
                } else if (source == board[6][4] && destination == board[4][4]) {
                    whiteEnpasante5 = true;
                } else if (source == board[6][5] && destination == board[4][5]) {
                    whiteEnpasante6 = true;
                } else if (source == board[6][6] && destination == board[4][6]) {
                    whiteEnpasante7 = true;
                } else if (source == board[6][7] && destination == board[4][7]) {
                    whiteEnpasante8 = true;
                }
            }

            //movements
            if (blackEnpasante1 && source.getIcon() == whitePawn1 && destination == board[2][0]) {
                blackEnpasante1 = false;
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][0].setIcon(null);
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante2 && source.getIcon() == whitePawn1 && destination == board[2][1]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][1].setIcon(null);
                blackEnpasante2 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante3 && source.getIcon() == whitePawn1 && destination == board[2][2]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][2].setIcon(null);
                blackEnpasante3 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante4 && source.getIcon() == whitePawn1 && destination == board[2][3]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][3].setIcon(null);
                blackEnpasante4 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante5 && source.getIcon() == whitePawn1 && destination == board[2][4]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][4].setIcon(null);
                blackEnpasante5 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante6 && source.getIcon() == whitePawn1 && destination == board[2][5]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][5].setIcon(null);
                blackEnpasante6 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante7 && source.getIcon() == whitePawn1 && destination == board[2][6]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][6].setIcon(null);
                blackEnpasante7 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (blackEnpasante8 && source.getIcon() == whitePawn1 && destination == board[2][7]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[3][7].setIcon(null);
                blackEnpasante8 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            }

            if (whiteEnpasante1 && source.getIcon() == blackPawn1 && destination == board[5][0]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][0].setIcon(null);
                whiteEnpasante1 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante2 && source.getIcon() == blackPawn1 && destination == board[5][1]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][1].setIcon(null);
                whiteEnpasante2 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante3 && source.getIcon() == blackPawn1 && destination == board[5][2]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][2].setIcon(null);
                whiteEnpasante3 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante4 && source.getIcon() == blackPawn1 && destination == board[5][3]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][3].setIcon(null);
                whiteEnpasante4 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante5 && source.getIcon() == blackPawn1 && destination == board[5][4]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][4].setIcon(null);
                whiteEnpasante5 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante6 && source.getIcon() == blackPawn1 && destination == board[5][5]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][5].setIcon(null);
                whiteEnpasante6 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante7 && source.getIcon() == blackPawn1 && destination == board[5][6]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][6].setIcon(null);
                whiteEnpasante7 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            } else if (whiteEnpasante8 && source.getIcon() == blackPawn1 && destination == board[5][7]) {
                destination.setIcon(source.getIcon());
                source.setIcon(null);
                board[4][7].setIcon(null);
                whiteEnpasante8 = false;
                player = player.equals("white") ? "black" : "white";
                destination.setBorder(null);
                return;
            }

            if (source.getIcon() == blackPawn1) {
                if (source == board[1][0] && destination == board[3][0]) {
                    blackEnpasante1 = true;
                } else if (source == board[1][1] && destination == board[3][1]) {
                    blackEnpasante2 = true;
                } else if (source == board[1][2] && destination == board[3][2]) {
                    blackEnpasante3 = true;
                } else if (source == board[1][3] && destination == board[3][3]) {
                    blackEnpasante4 = true;
                } else if (source == board[1][4] && destination == board[3][4]) {
                    blackEnpasante5 = true;
                } else if (source == board[1][5] && destination == board[3][5]) {
                    blackEnpasante6 = true;
                } else if (source == board[1][6] && destination == board[3][6]) {
                    blackEnpasante7 = true;
                } else if (source == board[1][7] && destination == board[3][7]) {
                    blackEnpasante8 = true;
                }
            } else if (source.getIcon() == whitePawn1) {
                if (source == board[6][0] && destination == board[4][0]) {
                    whiteEnpasante1 = true;
                } else if (source == board[6][1] && destination == board[4][1]) {
                    whiteEnpasante2 = true;
                } else if (source == board[6][2] && destination == board[4][2]) {
                    whiteEnpasante3 = true;
                } else if (source == board[6][3] && destination == board[4][3]) {
                    whiteEnpasante4 = true;
                } else if (source == board[6][4] && destination == board[4][4]) {
                    whiteEnpasante5 = true;
                } else if (source == board[6][5] && destination == board[4][5]) {
                    whiteEnpasante6 = true;
                } else if (source == board[6][6] && destination == board[4][6]) {
                    whiteEnpasante7 = true;
                } else if (source == board[6][7] && destination == board[4][7]) {
                    whiteEnpasante8 = true;
                }
            }
            if (source.getIcon() == whiteKing) {
                whiteKingMoved = true;
            } else if (source.getIcon() == whiteRook1 && board[7][0] == source) {
                whiteRook1Moved = true;
            } else if (source.getIcon() == whiteRook1 && board[7][7] == source) {
                whiteRook2Moved = true;
            } else if (source.getIcon() == blackKing) {
                blackKingMoved = true;
            } else if (source.getIcon() == blackRook1 && board[0][0] == source) {
                blackRook1Moved = true;
            } else if (source.getIcon() == blackRook1 && board[0][7] == source) {
                blackRook2Moved = true;
            }
            if (source == board[7][4] && source.getIcon() == whiteKing && destination == board[7][6]) {
                destination.setIcon(whiteKing);
                source.setIcon(null);
                board[7][7].setIcon(null);
                board[7][5].setIcon(whiteRook2);
                player = Objects.equals(player, "white") ? "black" : "white";
                destination.setBorder(null);
                return;
            }
            if (source == board[7][4] && source.getIcon() == whiteKing && destination == board[7][1]) {
                destination.setIcon(whiteKing);
                source.setIcon(null);
                board[7][0].setIcon(null);
                board[7][2].setIcon(whiteRook1);
                player = Objects.equals(player, "white") ? "black" : "white";
                destination.setBorder(null);
                return;
            }
            if (source == board[0][4] && source.getIcon() == blackKing && destination == board[0][6]) {
                destination.setIcon(blackKing);
                source.setIcon(null);
                board[0][7].setIcon(null);
                board[0][5].setIcon(blackRook2);
                player = Objects.equals(player, "white") ? "black" : "white";
                destination.setBorder(null);
                return;
            }
            if (source == board[0][4] && source.getIcon() == blackKing && destination == board[0][1]) {
                destination.setIcon(blackKing);
                source.setIcon(null);
                board[0][0].setIcon(null);
                board[0][2].setIcon(blackRook1);
                player = Objects.equals(player, "white") ? "black" : "white";
                destination.setBorder(null);
                return;
            }
            destination.setIcon(source.getIcon());
            source.setIcon(null);
            if (canPromote(player)) {
                handlePromotion(player);
            }
            player = Objects.equals(player, "white") ? "black" : "white";
        }
        destination.setBorder(null);
    }


    public static void handlePromotion(String color) {
        if (color.equals("white")) {
            int row = 0;
            int x = 0;
            for (int j = 0; j < board.length; j++) {
                if (getColor((ImageIcon) board[0][j].getIcon()).equals("white") && getType((ImageIcon) board[0][j].getIcon()).equals("pawn")) {
                    x = j;
                    break;
                }
            }
            int col = x;
            JFrame promotionWindow = new JFrame("Pawn Promotion");
            promotionWindow.setSize(400, 80);
            promotionWindow.setLocationRelativeTo(null); // Center the window

            JPanel promotionPanel = new JPanel();
            promotionPanel.setLayout(new FlowLayout());
            JButton queenButton = new JButton("Queen");
            queenButton.addActionListener(e -> promotePawn(row, col, whiteQueen, promotionWindow));
            promotionPanel.add(queenButton);

            JButton rookButton = new JButton("Rook");
            rookButton.addActionListener(e -> promotePawn(row, col, whiteRook2, promotionWindow));
            promotionPanel.add(rookButton);

            JButton bishopButton = new JButton("Bishop");
            bishopButton.addActionListener(e -> promotePawn(row, col, whiteBishop2, promotionWindow));
            promotionPanel.add(bishopButton);

            JButton knightButton = new JButton("Knight");
            knightButton.addActionListener(e -> promotePawn(row, col, whiteKnight1, promotionWindow));
            promotionPanel.add(knightButton);

            promotionWindow.add(promotionPanel);
            promotionWindow.setVisible(true);
        } else {
            int row = 7;
            int x = 0;
            for (int j = 0; j < board.length; j++) {
                if (getColor((ImageIcon) board[7][j].getIcon()).equals("black") && getType((ImageIcon) board[7][j].getIcon()).equals("pawn")) {
                    x = j;
                    break;
                }
            }
            int col = x;
            JFrame promotionWindow = new JFrame("Pawn Promotion");
            promotionWindow.setSize(400, 80);
            promotionWindow.setLocationRelativeTo(null); // Center the window

            JPanel promotionPanel = new JPanel();
            promotionPanel.setLayout(new FlowLayout());
            JButton queenButton = new JButton("Queen");
            queenButton.addActionListener(e -> promotePawn(row, col, blackQueen, promotionWindow));
            promotionPanel.add(queenButton);

            JButton rookButton = new JButton("Rook");
            rookButton.addActionListener(e -> promotePawn(row, col, blackRook1, promotionWindow));
            promotionPanel.add(rookButton);

            JButton bishopButton = new JButton("Bishop");
            bishopButton.addActionListener(e -> promotePawn(row, col, blackBishop1, promotionWindow));
            promotionPanel.add(bishopButton);

            JButton knightButton = new JButton("Knight");
            knightButton.addActionListener(e -> promotePawn(row, col, blackKnight1, promotionWindow));
            promotionPanel.add(knightButton);

            promotionWindow.add(promotionPanel);
            promotionWindow.setVisible(true);
        }
    }

    public static void promotePawn(int row, int col, ImageIcon promotionPiece, JFrame promotionWindow) {
        board[row][col].setIcon(promotionPiece);
        promotionWindow.dispose(); // Close promotion window
    }

    public static boolean canPromote(String color) {
        if (color.equals("white")) {
            for (int col = 0; col < board.length; col++) {
                if (getColor((ImageIcon) board[0][col].getIcon()).equals("white") && getType((ImageIcon) board[0][col].getIcon()).equals("pawn")) {
                    return true;
                }
            }
            return false;
        } else {
            for (int col = 0; col < board.length; col++) {
                if (getColor((ImageIcon) board[7][col].getIcon()).equals("black") && getType((ImageIcon) board[7][col].getIcon()).equals("pawn")) {
                    return true;
                }
            }
            return false;
        }
    }


    public static List<JLabel> movableCells(JLabel source) {
        int row = -1;
        int col = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == source) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        if (getType((ImageIcon) source.getIcon()).equals("pawn")) {
            Pawn pawn = new Pawn(row, col, getColor((ImageIcon) source.getIcon()));
            return pawn.movableCells();
        }
        if (getType((ImageIcon) source.getIcon()).equals("queen")) {
            Queen queen = new Queen(row, col, getColor((ImageIcon) source.getIcon()));
            return queen.movableCells();
        }
        if (getType((ImageIcon) source.getIcon()).equals("knight")) {
            Knight knight = new Knight(row, col, getColor((ImageIcon) source.getIcon()));
            return knight.movableCells();
        }
        if (getType((ImageIcon) source.getIcon()).equals("rook")) {
            Rook rook = new Rook(row, col, getColor((ImageIcon) source.getIcon()));
            return rook.movableCells();
        }
        if (getType((ImageIcon) source.getIcon()).equals("bishop")) {
            Bishop bishop = new Bishop(row, col, getColor((ImageIcon) source.getIcon()));
            return bishop.movableCells();
        }
        if (getType((ImageIcon) source.getIcon()).equals("king")) {
            King king = new King(row, col, getColor((ImageIcon) source.getIcon()));
            return king.movableCells();
        }
        return new ArrayList<>();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static String getColor(ImageIcon i) {
        if (i == null) {
            return "empty";
        }
        if (compareImages(i.getImage(), blackRook1.getImage())
                || compareImages(i.getImage(), blackRook2.getImage())
                || compareImages(i.getImage(), blackBishop1.getImage())
                || compareImages(i.getImage(), blackBishop2.getImage())
                || compareImages(i.getImage(), blackKnight1.getImage())
                || compareImages(i.getImage(), blackKnight2.getImage())
                || compareImages(i.getImage(), blackKing.getImage())
                || compareImages(i.getImage(), blackQueen.getImage())
                || compareImages(i.getImage(), blackPawn2.getImage())
                || compareImages(i.getImage(), blackPawn3.getImage())
                || compareImages(i.getImage(), blackPawn4.getImage())
                || compareImages(i.getImage(), blackPawn5.getImage())
                || compareImages(i.getImage(), blackPawn6.getImage())
                || compareImages(i.getImage(), blackPawn7.getImage())
                || compareImages(i.getImage(), blackPawn8.getImage())
                || compareImages(i.getImage(), blackPawn1.getImage())) {
            return "black";
        }
        return "white";
    }

    public static String getType(ImageIcon i) {
        if (i == null) {
            return "empty";
        }
        if (compareImages(i.getImage(), blackRook2.getImage())
                || compareImages(i.getImage(), blackRook1.getImage())
                || compareImages(i.getImage(), whiteRook1.getImage())
                || compareImages(i.getImage(), whiteRook2.getImage())) {
            return "rook";
        }

        if (compareImages(i.getImage(), blackBishop1.getImage())
                || compareImages(i.getImage(), blackBishop2.getImage())
                || compareImages(i.getImage(), whiteBishop1.getImage())
                || compareImages(i.getImage(), whiteBishop2.getImage())) {
            return "bishop";
        }

        if (compareImages(i.getImage(), blackKnight2.getImage())
                || compareImages(i.getImage(), blackKnight1.getImage())
                || compareImages(i.getImage(), whiteKnight1.getImage())
                || compareImages(i.getImage(), whiteKnight2.getImage())) {
            return "knight";
        }

        if (compareImages(i.getImage(), blackQueen.getImage())
                || compareImages(i.getImage(), whiteQueen.getImage())) {
            return "queen";
        }

        if (compareImages(i.getImage(), blackKing.getImage())
                || compareImages(i.getImage(), whiteKing.getImage())) {
            return "king";
        }

        return "pawn";
    }

    public static boolean compareImages(Image img1, Image img2) {
        BufferedImage bufferedImage1 = toBufferedImage(img1);
        BufferedImage bufferedImage2 = toBufferedImage(img2);

        if (bufferedImage1.getWidth() != bufferedImage2.getWidth() ||
                bufferedImage1.getHeight() != bufferedImage2.getHeight()) {
            return false;
        }

        for (int y = 0; y < bufferedImage1.getHeight(); y++) {
            for (int x = 0; x < bufferedImage1.getWidth(); x++) {
                if (bufferedImage1.getRGB(x, y) != bufferedImage2.getRGB(x, y)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        BufferedImage bufferedImage = new BufferedImage(
                img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();

        return bufferedImage;
    }

    public static boolean isCheck(String color, JLabel[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals(color) && getType((ImageIcon) board[i][j].getIcon()).equals("king")) {
                    King king = new King(i, j, color);
                    if (!king.isSafe(i, j)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isCheckMate(String color) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getColor((ImageIcon) board[i][j].getIcon()).equals(color)) {
                    if (getType((ImageIcon) board[i][j].getIcon()).equals("king")) {
                        King king = new King(i, j, color);
                        if (!king.movableCells().isEmpty()) {
                            return false;
                        }
                    } else if (getType((ImageIcon) board[i][j].getIcon()).equals("queen")) {
                        Queen queen = new Queen(i, j, color);
                        if (!queen.movableCells().isEmpty()) {
                            return false;
                        }
                    } else if (getType((ImageIcon) board[i][j].getIcon()).equals("rook")) {
                        Rook rook = new Rook(i, j, color);
                        if (!rook.movableCells().isEmpty()) {
                            return false;
                        }
                    } else if (getType((ImageIcon) board[i][j].getIcon()).equals("knight")) {
                        Knight knight = new Knight(i, j, color);
                        if (!knight.movableCells().isEmpty()) {
                            return false;
                        }
                    } else if (getType((ImageIcon) board[i][j].getIcon()).equals("bishop")) {
                        Bishop bishop = new Bishop(i, j, color);
                        if (!bishop.movableCells().isEmpty()) {
                            return false;
                        }
                    } else {
                        Pawn pawn = new Pawn(i, j, color);
                        if (!pawn.movableCells().isEmpty()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void resetGame() {
        player = "white";
        whiteKingMoved = false;
        whiteRook1Moved = false;
        whiteRook2Moved = false;
        blackRook2Moved = false;
        blackRook1Moved = false;
        blackKingMoved = false;
        whiteEnpasante1 = false;
        whiteEnpasante2 = false;
        whiteEnpasante3 = false;
        whiteEnpasante4 = false;
        whiteEnpasante5 = false;
        whiteEnpasante6 = false;
        whiteEnpasante7 = false;
        whiteEnpasante8 = false;
        blackEnpasante1 = false;
        blackEnpasante2 = false;
        blackEnpasante3 = false;
        blackEnpasante4 = false;
        blackEnpasante5 = false;
        blackEnpasante6 = false;
        blackEnpasante7 = false;
        blackEnpasante8 = false;
        uselessHalfMoves = 0;
        initialiseBoard();
    }

    public static int checkDraw(String color) {
        if (Objects.equals(color, "white")) {
            //Stalemate
            if (!isCheck(color, board) && isCheckMate(color)) {
                return 1;
            }
            //Insufficient Material
            else if (insufficientMaterial(color)) {
                return 2;
            } else if (uselessHalfMoves == 100) {
                return 3;
            }
        } else {
            //Stalemate
            if (!isCheck(color, board) && isCheckMate(color)) {
                return 1;
            }
            //Insufficient Material
            else if (insufficientMaterial(color)) {
                return 2;
            }
            else if (uselessHalfMoves == 100) {
                return 3;
            }
        }
        return 0;
    }

    public static boolean insufficientMaterial(String color) {
        if (kingvsking() || kingAndBishopVsKing(color) || kingAndKnightVsKing(color) || kingAndBishopVsKingAndBishop()) {
            return true;
        }
        return false;
    }

    public static boolean kingvsking() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getType((ImageIcon) board[i][j].getIcon()).equals("king")) {
                    continue;
                }
                if (!getType((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean kingAndBishopVsKing(String color) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getType((ImageIcon) board[i][j].getIcon()).equals("king")) {
                    continue;
                }
                if (!(getColor((ImageIcon) board[i][j].getIcon()).equals(color) && getType((ImageIcon) board[i][j].getIcon()).equals("bishop")) && !getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean kingAndKnightVsKing(String color) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getType((ImageIcon) board[i][j].getIcon()).equals("king")) {
                    continue;
                }
                if (!(getColor((ImageIcon) board[i][j].getIcon()).equals(color) && getType((ImageIcon) board[i][j].getIcon()).equals("knight")) && !getColor((ImageIcon) board[i][j].getIcon()).equals("empty")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean kingAndBishopVsKingAndBishop() {
        int whiteRow = -1;
        int whiteCol = -1;
        int blackRow = -1;
        int blackCol = -1;
        int whiteBishops = 0;
        int blackBishops = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getType((ImageIcon) board[i][j].getIcon()).equals("king") ||
                        (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("bishop")) ||
                        (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("bishop"))
                        || getColor((ImageIcon) board[i][j].getIcon()).equals("empty")
                ) {
                    if (getColor((ImageIcon) board[i][j].getIcon()).equals("white") && getType((ImageIcon) board[i][j].getIcon()).equals("bishop")) {
                        whiteBishops++;
                        whiteRow = i;
                        whiteCol = j;
                    } else if (getColor((ImageIcon) board[i][j].getIcon()).equals("black") && getType((ImageIcon) board[i][j].getIcon()).equals("bishop")) {
                        blackBishops++;
                        blackRow = i;
                        blackCol = j;
                    }
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (whiteBishops > 1 || blackBishops > 1) {
            return false;
        }
        if (board[whiteRow][whiteCol].getBackground() != board[blackRow][blackCol].getBackground()) {
            return false;
        }
        return true;
    }
}