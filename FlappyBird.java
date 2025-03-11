import javax.swing.*;
import java.awt.*;

public class FlappyBird extends JPanel {
    int boardWidth = 360;
    int boardHeight =640;

    Image background;
    Image birdImg;
    Image topPipe;
    Image bottomPipe;

    int birdX = boardWidth/8;
    int birdY = boardHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }
    Bird bird;

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));
//        setBackground(Color.blue);

        background = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipe = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipe = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        bird = new Bird(birdImg);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        g.drawImage(background,0,0,boardWidth,boardHeight,null);

        g.drawImage(bird.img,bird.x,bird.y,bird.width,bird.height,null);
    }
}
