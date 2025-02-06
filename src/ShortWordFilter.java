public class ShortWordFilter implements Filter{

    @Override
    public boolean accept(Object x) {

        String str = x.toString();
        int length = str.length();

        if(length < 5){
            return true;
        }else{
            return false;
        }
    }
}
