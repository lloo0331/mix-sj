package sum;

import java.util.HashMap;
import java.util.Map;

//统计字符串里的字符出现次数
public class FreqInJava {

    public static void main(String args[]){

        String s = "Mississippi";
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            int count = map.getOrDefault(c,0);
            map.put(c,count+1);
        }

        map.forEach((c,i)->{
            System.out.print(c+":"+i+";");
        });

    }

}
