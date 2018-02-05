import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Map {

   /*
   public static <X,Y> LinkedList<Y> map(Function<X,Y> f, LinkedList<X> list) {

        LinkedList<Y> res = new LinkedList<>();
        for (X x : list){
            res.add(f.apply(x));
        }
        return res;

    }
    */

    public static <X,Y> LinkedList<Y> map(Function<X,Y> f, LinkedList<X> list) {

        LinkedList<Y> res = new LinkedList<>();


        list.forEach((X x) -> res.add(f.apply(x)));

        return res;

    }
}
