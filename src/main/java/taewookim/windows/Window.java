package taewookim.windows;

import taewookim.Main;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Graphics g;

    public Window(int n) {
        this.setSize(500, 500);
        this.setLocation(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.g = this.getGraphics();
        int max = 500;
        for(int i = 0; i<max; i++) {
            double per = ((double)i)/((double)max);
            double x = 0;
            double y = 0;
            for(int j = 0; j<n;j++) {
                double k = j*2.0D*Math.PI*per;
                x+=Main.AnfX(j)*Math.sin(k) + Main.BnfX(j)*Math.cos(k);
                y+=Main.AnfY(j)*Math.sin(k) + Main.BnfY(j)*Math.cos(k);
            }
            x*=3;
            y*=3;
            System.out.println(x + "   " + y);
            g.fillRect((int)x, (int)y, 1, 1);
        }
    }
}
