import java.util.LinkedList;

public class Map {

    public static <X,Y> LinkedList<Y> map(Function<X,Y> f, LinkedList<X> list) {

        LinkedList<Y> res = new LinkedList<>();
        for (X x : list){
            res.add(f.apply(x));
        }
        return res;

    }
}
