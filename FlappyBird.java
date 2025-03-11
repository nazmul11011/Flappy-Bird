import javax.swing.*;
import java.awt.*;

public class FlappyBird extends JPanel {
    int boardWidth= 360;
    int boardHeight=640;

    Image background;
    Image bird;
    Image topPipe;
    Image bottomPipe;

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));
//        setBackground(Color.blue);

        background = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        bird = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipe = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipe = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        g.drawImage(background,0,0,boardWidth,boardHeight,null);
    }
}
