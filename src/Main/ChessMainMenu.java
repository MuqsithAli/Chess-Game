package Main;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ChessMainMenu extends JFrame {

    public ChessMainMenu() {
        // Set the title of the window
        setTitle("Chess Game Main Menu");

        // Set the size of the window
        setSize(600, 400);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a layered pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(600, 400));
        add(layeredPane);

        // Load and set the cover picture
        ImageIcon coverImage = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/KingsGame.png"))); // Ensure the path is correct
        JLabel coverLabel = new JLabel(coverImage);
        coverLabel.setBounds(0, 0, 600, 400);
        layeredPane.add(coverLabel, JLayeredPane.DEFAULT_LAYER);

        // Create a panel for the buttons with left alignment
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false); // Make the button panel transparent
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBounds(10, 300, 580, 50); // Adjust the position and size as needed

        // Create and add the 8x8 game button
        JButton button8x8 = new JButton("Play 8x8 Game");
        button8x8.addActionListener(e -> {
            new Main();
            this.dispose();
        });
        buttonPanel.add(button8x8);

        // Create and add the 16x16 game button
        JButton button16x16 = new JButton("Play 16x16 Game");
        button16x16.addActionListener(e -> {
            new Main2();
            this.dispose();
        });
        buttonPanel.add(button16x16);

        // Add the button panel to the layered pane
        layeredPane.add(buttonPanel, JLayeredPane.PALETTE_LAYER);

        // Make the window visible
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Run the main menu
        SwingUtilities.invokeLater(() -> new ChessMainMenu());
    }
}
