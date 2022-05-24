package strategy;

import java.util.stream.Stream;

public class StreamStrategy extends AbstractStrategy {
    public void calculate(int limit) {
        Stream.iterate(new int[]{0,1},arr->new int[]{arr[1],arr[0]+arr[1]})
                .limit(limit)
                .map(m->m[0])
                .forEach(System.out::println);
    }
}