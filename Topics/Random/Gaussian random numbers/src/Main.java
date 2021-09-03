import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        Random random = new Random(k);
        int p = 1;
        while(true){
            double o = random.nextGaussian();
            if(o > m){
                random.setSeed(++k);
                p = 1;
            } else {
                if(p == n){
                    System.out.println(k);
                    break;
                }
                p++;
            }
        }

    }
}