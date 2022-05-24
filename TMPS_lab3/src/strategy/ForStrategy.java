package strategy;

import java.util.ArrayList;
import java.util.List;

public class ForStrategy extends AbstractStrategy {
    public void calculate(int n){
        List<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i < n; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        list.forEach(System.out::println);
    }
}
