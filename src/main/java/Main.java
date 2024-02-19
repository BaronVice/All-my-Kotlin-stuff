import static extensionfuncs.DLC.*;

import casts.Casts;
import funcs.MyUtils;
import loops.Utils;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Utils.regularForLoop();
        sep();
        Utils.forIndexing();
        sep();
        Utils.weirdForRange();
        sep();
        System.out.println(MyUtils.recognize('a'));
        System.out.println(MyUtils.recognize('4'));
        System.out.println(MyUtils.recognize('-'));
        sep();
//        try{
//            Exc.russianRoulette();
//            Exc.russianRoulette();
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

        System.out.println(randomChar("Shrek"));
        System.out.println(repeat("Shrek", 10));
        Map<Integer, Integer> map = mapWhereKeyIsIndex(List.of(100, 321, 4999));
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.printf("%d - %d%n", e.getKey(), e.getValue());
        }

        sep();
        System.out.println(Casts.betterStringToUpper("123"));
    }

    public static void sep(){
        MyUtils.displayChars('-');
    }
}
