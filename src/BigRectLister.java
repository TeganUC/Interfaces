import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args){

        Random random = new Random();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        BigRectangleFilter bigRects = new BigRectangleFilter();

        for(int i = 0; i < 10; i++){

            int width = random.nextInt(5);
            int height = random.nextInt(5);

            Rectangle rect = new Rectangle();
            rect.setBounds(0, 0, width, height);
            rectangles.add(rect);

            if(bigRects.accept(rect)){
                System.out.println("This rectangle is very big. Width: " + rect.getWidth() + " Height: " + rect.getHeight() + " Perimeter: " + (2*(rect.getWidth() + rect.getHeight())));
            }
        }
    }
}