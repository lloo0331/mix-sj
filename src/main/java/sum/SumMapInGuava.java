package sum;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

//统计字符串里的字符出现次数
public class SumMapInGuava {

    public static void main(String args[]){

        String s = "Mississippi";
        Multiset<String> multiset = HashMultiset.create();

        for (char c : s.toCharArray()) {
            multiset.add(c+"");
        }


        for(String key:multiset.elementSet()){
            System.out.println(key+":"+multiset.count(key));
        }

    }

}
