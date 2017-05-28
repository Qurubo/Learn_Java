package Book.Chapter_8.Classes;

/**
 * Created by qurub on 29.05.2017.
 */
public class PairTest {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> pair = ArrayAlg.minmax(words);
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
        int[] numbers = {245, 228, 345, 321, 1000, 1488, 255};
        Pair<Integer> n = ArrayAlg.minmax(numbers);
        System.out.println("min = " + n.getFirst());
        System.out.println("max = " + n.getSecond());
    }
}
