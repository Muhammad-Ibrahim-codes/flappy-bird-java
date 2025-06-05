import javax.swing.*;

import java.awt.*;
// import java.awt.event.*;

// import java.util.ArrayList;
// import java.util.Random;

public class FlappyBird extends JPanel {
    int boardwidth = 360;
    int boardheight = 640;

    FlappyBird() {
        setPreferredSize(new Dimension(boardwidth, boardheight));
        setBackground(Color.BLUE);
    }
}
