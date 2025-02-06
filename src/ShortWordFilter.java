public class ShortWordFilter implements Filter{

    @Override
    public boolean accept(Object x) {

        String str = "";
        int length = str.length();

        if(length < 5){
            return true;
        }else{
            return false;
        }
    }
}
