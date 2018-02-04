public class Multipliziere implements Function<Integer,Integer> {

    Integer multiplicator;

    public Multipliziere(Integer y) {
        this.multiplicator = y;
    }

    @Override
    public Integer apply(Integer x) {
        return multiplicator*x;
    }
}
