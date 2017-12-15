package i_introduction._4_Lambdas;

import java.util.Collection;

import util.JavaCode;

public class JavaCode4 extends JavaCode {
    public boolean task4(Collection<Integer> collection) {
        return collection.stream()
                        .anyMatch(e -> e % 2 ==0);
    }
}