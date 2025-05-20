# 🐤 Flappy Bird Game (Java Swing)

This is a simple clone of the classic Flappy Bird game, built using **Java** and **Swing** for GUI rendering. The game mimics the basic mechanics of the original Flappy Bird: tap to fly, avoid obstacles, and score points.

![ScreenShot](https://i.postimg.cc/sXBJqW9R/Screenshot-2025-05-19-093543.png)

## 🚀 Features

- Pixel-style graphics using image assets.
- Gravity-based bird movement.
- Dynamic pipe generation with random gaps.
- Score tracking system.
- Game over detection and restart on spacebar.

## 🎮 How to Play

- Press `SPACE` to make the bird fly upward.
- Avoid hitting the pipes or the ground.
- When the game ends, press `SPACE` again to restart.

## 🧱 Project Structure

```plaintext

├── Main.java           # Main entry point, sets up the JFrame window.
├── FlappyBird.java     # Core game logic, rendering, physics, and input.
├── flappybird.png      # Image asset for the bird.
├── flappybirdbg.png    # Background image.
├── toppipe.png         # Top pipe image.
├── bottompipe.png      # Bottom pipe image.
```

## 📊 Class Diagram

<details>
  <summary></summary><code>

```mermaid
classDiagram
    class Main {
        +main(String[] args)
    }

    class FlappyBird {
        -int boardWidth
        -int boardHeight
        -Image background
        -Image birdImg
        -Image topPipeImg
        -Image bottomPipeImg
        -int birdX
        -int birdY
        -int birdWidth
        -int birdHeight
        -int pipeX
        -int pipeY
        -int pipeWidth
        -int pipeHeight
        -int velocityX
        -int velocityY
        -int gravity
        -boolean gameOver
        -double score
        -Bird bird
        -ArrayList~Pipe~ pipes
        -Timer gameLoop
        -Timer placePipesTimer
        -Random random
        +FlappyBird()
        +void placePipes()
        +void draw(Graphics g)
        +void paintComponent(Graphics g)
        +void move()
        +boolean collision(Bird, Pipe)
        +void actionPerformed(ActionEvent)
        +void keyPressed(KeyEvent)
        +void keyTyped(KeyEvent)
        +void keyReleased(KeyEvent)
    }

    class Bird {
        -int x
        -int y
        -int width
        -int height
        -Image img
        +Bird(int x, int y, int width, int height, Image img)
    }

    class Pipe {
        -int x
        -int y
        -int width
        -int height
        -Image img
        -boolean passed
        +Pipe(int x, int y, int width, int height, Image img)
    }

    Main --> FlappyBird
    FlappyBird --> Bird
    FlappyBird --> Pipe
```
</code>
</details>

## 🛠️ Requirements

* Java Development Kit (JDK) 8 or above.
* An IDE like IntelliJ IDEA, Eclipse, or just use `javac` and `java` CLI tools.

## 📦 How to Run
1. Clone or download the repository.
2. Compile the files:

   ```
   javac Main.java FlappyBird.java
   ```
3. Run the game:

   ```
   java Main
   ```

![https://www.plantuml.com/plantuml/png/hLHBZzCm4BxdL_YO5Lk9CqAhBOX7nI8gTYMwGXmcpf2EweTbJx84n7ydjWbnLE20wAN-7lFvYrFtEZ1uxhMgmecC0mzQI0KXR9azDJtZJbfpIrzHFAwgf8Xdv5lnhHBJvn4P5b-MvRWi7wZbumAFIDsHCzvfw52GxZACUNKAkXGf97-bWBpCmvVYr-15zNrkioU7_xDDOwr2CC9DuTXcBkxnxmrVAd1kB4vj4oSQ2xxza6kjkDTBjqsEQq2UEczxqwxOAN2dkv9YwsBLDJkbCbjT27cpE7zOm_iIdhUZibpct9HwMCFxDLo5PAeCYSUIaXVBWCfAul5mJXNPdOTXOZAnzHx66mhyD3xcLTebPEcED7hHWSORQrt9EGKIepyadANvzSU1TyFCjhPl58eWhSVyarXUQdsHcS5IMsIkQI33pwrsrg3X-fK7ToGPH5UQMWyFVv2q7N0Ed1jAgnG5igPEPmYN-IeqvHn8dWnxz9-jrzZMsuHV36XOO6ayuRZt6CBaUOFZxmrte_kR_1uLmZgWk0HlWSnyJGC3anJvoIQ-lcLFflluIO3lGXfAzitcghmyJuJq28oXAiZe-QdsuLoAHp9BrJMQDlxL_G00](https://www.plantuml.com/plantuml/png/hLHBZzCm4BxdL_YO5Lk9CqAhBOX7nI8gTYMwGXmcpf2EweTbJx84n7ydjWbnLE20wAN-7lFvYrFtEZ1uxhMgmecC0mzQI0KXR9azDJtZJbfpIrzHFAwgf8Xdv5lnhHBJvn4P5b-MvRWi7wZbumAFIDsHCzvfw52GxZACUNKAkXGf97-bWBpCmvVYr-15zNrkioU7_xDDOwr2CC9DuTXcBkxnxmrVAd1kB4vj4oSQ2xxza6kjkDTBjqsEQq2UEczxqwxOAN2dkv9YwsBLDJkbCbjT27cpE7zOm_iIdhUZibpct9HwMCFxDLo5PAeCYSUIaXVBWCfAul5mJXNPdOTXOZAnzHx66mhyD3xcLTebPEcED7hHWSORQrt9EGKIepyadANvzSU1TyFCjhPl58eWhSVyarXUQdsHcS5IMsIkQI33pwrsrg3X-fK7ToGPH5UQMWyFVv2q7N0Ed1jAgnG5igPEPmYN-IeqvHn8dWnxz9-jrzZMsuHV36XOO6ayuRZt6CBaUOFZxmrte_kR_1uLmZgWk0HlWSnyJGC3anJvoIQ-lcLFflluIO3lGXfAzitcghmyJuJq28oXAiZe-QdsuLoAHp9BrJMQDlxL_G00)