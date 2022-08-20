import java.util.*;

public class Main {
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
    }

    public static void doTask1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (Objects.nonNull(num) && num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    public static void doTask2() {
        List<Integer> nums = new ArrayList<>(List.of(12, 20, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums) {
            if (Objects.nonNull(num) && num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);
    }

    public static void doTask3() {
        List<String> listOfWords = new ArrayList<>(List.of("test", "Test", "testing", "test", "Testing", "Test"));
        Set<String> set = new HashSet<>(listOfWords);
        System.out.println(set);
    }

    public static void doTask4() {
        List<String> listOfWords = new ArrayList<>(List.of("test", "Test", "testing", "test", "Testing", "Test"));
        Set<String> set = new HashSet<>(listOfWords);
        System.out.println(listOfWords.size() - set.size());
    }
}