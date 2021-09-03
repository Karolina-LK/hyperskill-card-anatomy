import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    private static int a = scanner.nextInt();
    private static int b = scanner.nextInt();
    private static int n = scanner.nextInt();
    private static int k = scanner.nextInt();
    private static int findMax = 0;
    private static int minOfMaxs = 0;
    private static int seed = a;

    public static void main(String[] args) {
        beginProject();
    }

    public static void beginProject() {
        for (int j = a; j <= b; j++) {
            random.setSeed(j);
            findMax = 0;
            for (int i = 0; i < n; i++) {
                int num = random.nextInt(k);
//                 System.out.println(num); // -> Test to see if we are actually getting amount of numbers
                if (findMax < num) {
                    findMax = num;
                }
            }
//             System.out.println("Max is: " + findMax); // -> The MAXIMUM of all random numbers between a & b
            if (minOfMaxs == 0) {
                minOfMaxs = findMax;
            } else {
                if (minOfMaxs > findMax) {
                    minOfMaxs = findMax;
                    seed = j;
                }
            }
//             System.out.println("minOfMax: " + minOfMaxs); // -> see if I am still getting the minimum of max numbers
        }
        System.out.println(seed);   // -> Get the seed
        System.out.println(minOfMaxs); // -> The MINIMUM of all MAXIMUM numbers
    }
}