import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {


     Function<Integer,Integer> incrementByOneFunction=number->number*10;
        System.out.println(incrementByOneFunction.apply(5));

         BiFunction<Integer,Integer, Integer> byFuncMult=(param1, param2)->param1*param2;
        System.out.println(byFuncMult.apply(5,111));
    }


}
