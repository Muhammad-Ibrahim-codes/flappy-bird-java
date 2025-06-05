import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardwidth = 360;
        int boardheight = 640;

        JFrame frame = new JFrame("Flappy bird");
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappybird = new FlappyBird();
        frame.add(flappybird);
        frame.pack();

        frame.setVisible(true);

    }
}