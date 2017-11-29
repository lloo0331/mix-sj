package util;

public class PrecoditionUtil {

    public static void func(VoidTest v,Exception newException) throws Exception{

        try{
            v.execFunc();
        }catch(Exception e){
            throw newException;
        }


    }

}
