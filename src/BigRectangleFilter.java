import java.awt.*;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {

        boolean isBig = false;

        if (x instanceof Rectangle) {
            Rectangle rect = (Rectangle) x;


            if (((rect.getHeight() + rect.getWidth()) * 2) > 10) {
                isBig = true;
            } else {
                isBig = false;
            }
        }

        if (isBig){
            return true;
        }else{
            return false;
        }

    }
}
