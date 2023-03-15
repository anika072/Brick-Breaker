
package brickbreaker;

import javax.swing.*;
import static javax.swing.DropMode.ON;

public class BrickBreaker {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breackout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
    
}
