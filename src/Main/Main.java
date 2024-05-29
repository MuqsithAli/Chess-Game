package Main;

import Piece.Pawn;
import Piece.Queen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
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
    public static Color darkSquare = new Color(118, 150, 86);
    public static Color lightSquare = new Color(238, 238, 210);
    public static Stack<JLabel> clickedStack = new Stack<>(); // 0 -> Chess Piece, 1 -> movable Cell

    Main() {
        JFrame frame = new JFrame("Chess");
        frame.setLayout(new GridLayout(8, 8));
        board = new JLabel[8][8];

        // Load the image icon
        blackRook1 = blackRook2 = new ImageIcon(getClass().getResource("/Images/black_rook.png"));
        whiteRook1 = whiteRook2 = new ImageIcon(getClass().getResource("/Images/white_rook.png"));
        blackKnight1 = blackKnight2 = new ImageIcon(getClass().getResource("/Images/black_knight.png"));
        whiteKnight1 = whiteKnight2 = new ImageIcon(getClass().getResource("/Images/white_knight.png"));
        blackBishop1 = blackBishop2 = new ImageIcon(getClass().getResource("/Images/black_bishop.png"));
        whiteBishop1 = whiteBishop2 = new ImageIcon(getClass().getResource("/Images/white_bishop.png"));
        blackQueen = new ImageIcon(getClass().getResource("/Images/black_queen.png"));
        whiteQueen = new ImageIcon(getClass().getResource("/Images/white_queen.png"));
        blackKing = new ImageIcon(getClass().getResource("/Images/black_king.png"));
        whiteKing = new ImageIcon(getClass().getResource("/Images/white_king.png"));
        whitePawn1 = whitePawn2 = whitePawn3 = whitePawn4 = whitePawn5 = whitePawn6 = whitePawn7 = whitePawn8 = new ImageIcon(getClass().getResource("/Images/white_pawn.png"));
        blackPawn1 = blackPawn2 = blackPawn3 = blackPawn4 = blackPawn5 = blackPawn6 = blackPawn7 = blackPawn8 = new ImageIcon(getClass().getResource("/Images/black_pawn.png"));

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
        Image image1 = blackRook1.getImage();
        Image scaledImage1 = image1.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackRook1 = new ImageIcon(scaledImage1);
        board[0][0].setIcon(blackRook1);

        Image image2 = blackRook2.getImage();
        Image scaledImage2 = image2.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackRook2 = new ImageIcon(scaledImage2);
        board[0][7].setIcon(blackRook2);

        Image image3 = blackKnight1.getImage();
        Image scaledImage3 = image3.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackKnight1 = new ImageIcon(scaledImage3);
        board[0][1].setIcon(blackKnight1);

        Image image4 = blackKnight2.getImage();
        Image scaledImage4 = image4.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackKnight2 = new ImageIcon(scaledImage4);
        board[0][6].setIcon(blackKnight2);

        Image image5 = blackBishop1.getImage();
        Image scaledImage5 = image5.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackBishop1 = new ImageIcon(scaledImage5);
        board[0][2].setIcon(blackBishop1);

        Image image6 = blackBishop2.getImage();
        Image scaledImage6 = image6.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackBishop2 = new ImageIcon(scaledImage6);
        board[0][5].setIcon(blackBishop2);

        Image image7 = blackQueen.getImage();
        Image scaledImage7 = image7.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackQueen = new ImageIcon(scaledImage7);
        board[0][3].setIcon(blackQueen);
//
        Image image8 = blackKing.getImage();
        Image scaledImage8 = image8.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackKing = new ImageIcon(scaledImage8);
        board[0][4].setIcon(blackKing);

        Image image9 = blackPawn1.getImage();
        Image scaledImage9 = image9.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn1 = new ImageIcon(scaledImage9);
        board[1][0].setIcon(blackPawn1);

        Image image10 = blackPawn2.getImage();
        Image scaledImage10 = image10.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn2 = new ImageIcon(scaledImage10);
        board[1][1].setIcon(blackPawn2);

        Image image11 = blackPawn3.getImage();
        Image scaledImage11 = image11.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn3 = new ImageIcon(scaledImage11);
        board[1][2].setIcon(blackPawn3);

        Image image12 = blackPawn4.getImage();
        Image scaledImage12 = image12.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn4 = new ImageIcon(scaledImage12);
        board[1][3].setIcon(blackPawn4);

        Image image13 = blackPawn5.getImage();
        Image scaledImage13 = image13.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn5 = new ImageIcon(scaledImage13);
        board[1][4].setIcon(blackPawn5);

        Image image14 = blackPawn6.getImage();
        Image scaledImage14 = image14.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn6 = new ImageIcon(scaledImage14);
        board[1][5].setIcon(blackPawn6);

        Image image15 = blackPawn7.getImage();
        Image scaledImage15 = image15.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn7 = new ImageIcon(scaledImage15);
        board[1][6].setIcon(blackPawn7);

        Image image16 = blackPawn8.getImage();
        Image scaledImage16 = image16.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        blackPawn8 = new ImageIcon(scaledImage16);
        board[1][7].setIcon(blackPawn8);

        Image image17 = whiteRook1.getImage();
        Image scaledImage17 = image17.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteRook1 = new ImageIcon(scaledImage17);
        board[7][0].setIcon(whiteRook1);

        Image image18 = whiteRook2.getImage();
        Image scaledImage18 = image18.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteRook2 = new ImageIcon(scaledImage18);
        board[7][7].setIcon(whiteRook2);

        Image image19 = whiteKnight1.getImage();
        Image scaledImage19 = image19.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteKnight1 = new ImageIcon(scaledImage19);
        board[7][1].setIcon(whiteKnight1);

        Image image20 = whiteKnight2.getImage();
        Image scaledImage20 = image20.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteKnight2 = new ImageIcon(scaledImage20);
        board[7][6].setIcon(whiteKnight2);

        Image image21 = whiteBishop1.getImage();
        Image scaledImage21 = image21.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteBishop1 = new ImageIcon(scaledImage21);
        board[7][2].setIcon(whiteBishop1);

        Image image22 = whiteBishop2.getImage();
        Image scaledImage22 = image22.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteBishop2 = new ImageIcon(scaledImage22);
        board[7][5].setIcon(whiteBishop2);

        Image image23 = whiteQueen.getImage();
        Image scaledImage23 = image23.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteQueen = new ImageIcon(scaledImage23);
        board[7][3].setIcon(whiteQueen);

        Image image24 = whiteKing.getImage();
        Image scaledImage24 = image24.getScaledInstance(65, 65, Image.SCALE_SMOOTH); // Adjust the size as needed
        whiteKing = new ImageIcon(scaledImage24);
        board[7][4].setIcon(whiteKing);

        Image image25 = whitePawn1.getImage();
        Image scaledImage25 = image25.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn1 = new ImageIcon(scaledImage25);
        board[6][0].setIcon(whitePawn1);

        Image image26 = whitePawn2.getImage();
        Image scaledImage26 = image26.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn2 = new ImageIcon(scaledImage26);
        board[6][1].setIcon(whitePawn2);

        Image image27 = whitePawn3.getImage();
        Image scaledImage27 = image27.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn3 = new ImageIcon(scaledImage27);
        board[6][2].setIcon(whitePawn3);

        Image image28 = whitePawn4.getImage();
        Image scaledImage28 = image28.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn4 = new ImageIcon(scaledImage28);
        board[6][3].setIcon(whitePawn4);

        Image image29 = whitePawn5.getImage();
        Image scaledImage29 = image29.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn5 = new ImageIcon(scaledImage29);
        board[6][4].setIcon(whitePawn5);

        Image image30 = whitePawn6.getImage();
        Image scaledImage30 = image30.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn6 = new ImageIcon(scaledImage30);
        board[6][5].setIcon(whitePawn6);

        Image image31 = whitePawn7.getImage();
        Image scaledImage31 = image31.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn7 = new ImageIcon(scaledImage31);
        board[6][6].setIcon(whitePawn7);

        Image image32 = whitePawn8.getImage();
        Image scaledImage32 = image32.getScaledInstance(46, 58, Image.SCALE_SMOOTH); // Adjust the size as needed
        whitePawn8 = new ImageIcon(scaledImage32);
        board[6][7].setIcon(whitePawn8);
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
        clickedStack.push(clickedCell);
        //Highlight the selected piece
        if (clickedCell.getBorder() == null && clickedCell.getIcon() != null) {
            clickedCell.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        } else {
            clickedCell.setBorder(null);
        }
        System.out.println(clickedStack.size());
        if (clickedStack.size() == 2) {
            movePiece(clickedStack.get(0), clickedStack.get(1));
            clickedStack.pop();
            clickedStack.pop();
        }

        String pieceColor = getColor((ImageIcon) clickedCell.getIcon());
        String pieceType = getType((ImageIcon) clickedCell.getIcon());
//        System.out.println(pieceColor+" "+pieceType);
        if (pieceType == "pawn") {
            Pawn pawn = new Pawn(row, col, pieceColor);
            pawn.highlightCells(row, col);
        }
        if(pieceType == "queen"){
            Queen queen = new Queen(row, col, pieceColor);
            queen.highlightCells(row, col);
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

    }

    public static void movePiece(JLabel source, JLabel destination) {
        if (source != destination
                && source.getIcon() != null
                && !getColor((ImageIcon) source.getIcon()).equals(getColor((ImageIcon) destination.getIcon()))
                && !(getColor((ImageIcon) source.getIcon()).equals("white") && getType((ImageIcon) destination.getIcon()).equals("king") && getColor((ImageIcon) destination.getIcon()).equals("black"))
                && !(getColor((ImageIcon) source.getIcon()).equals("black") && getType((ImageIcon) destination.getIcon()).equals("king") && getColor((ImageIcon) destination.getIcon()).equals("white"))
                && movableCells(source).contains(destination)
        ) {
            destination.setIcon(source.getIcon());
            source.setIcon(null);
        }
        destination.setBorder(null);
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
}
