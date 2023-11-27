package taewookim;

import taewookim.windows.Window;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Vector;

public class Main {

    public static Vector<Integer> listx = new Vector<>();
    public static Vector<Integer> listy = new Vector<>();
    public static Vector<Integer> grapy = new Vector<>();

    public static void main(String[] args) throws InterruptedException {
        File file = new File("grapy.yml");
        Properties pro = new Properties();
        try {
            InputStream stream = new FileInputStream(file.toString());
            pro.load(stream);
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int size = Integer.parseInt(pro.getProperty("size"));
        for (int i = 0; i < size; i++) {
            listx.add(Integer.parseInt(pro.getProperty("x" + i)));
            listy.add(Integer.parseInt(pro.getProperty("y" + i)));
        }
        //여기서 시작

        //끝
        Window win = new Window(250);
    }

    public static double AnfX(double n) {
        int mi = listx.size();
        double result = 0;
        for(int i = 0; i<mi;i++) {
            double per = ((double)i)/((double)mi);
            result+=listx.get(i)*Math.sin(n*2*Math.PI*per);
        }
        return result/Math.PI/mi;
    }

    public static double BnfX(double n) {
        int mi = listx.size();
        double result = 0;
        for(int i = 0; i<mi;i++) {
            double per = ((double)i)/((double)mi);
            result+=listx.get(i)*Math.cos(n*2*Math.PI*per);
        }
        return result/Math.PI/mi;
    }

    public static double AnfY(double n) {
        int mi = listy.size();
        double result = 0;
        for(int i = 0; i<mi;i++) {
            double per = ((double)i)/((double)mi);
            result+=listy.get(i)*Math.sin(n*2*Math.PI*per);
        }
        return result/Math.PI/mi;
    }

    public static double BnfY(double n) {
        int mi = listy.size();
        double result = 0;
        for(int i = 0; i<mi;i++) {
            double per = ((double)i)/((double)mi);
            result+=listy.get(i)*Math.cos(n*2.0D*Math.PI*per);
        }
        return result/Math.PI/mi;
    }
}