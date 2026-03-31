package java_8_new;

import java.util.List;

public class EvenOddList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = list.stream().filter(e -> e % 2 == 0).toList();
        List<Integer> odd = list.stream().filter(o -> o % 2 != 0).toList();
        System.out.println(even + "  " + odd);
    }
}
