import java.util.Scanner;

class Solution {
//
//    public String solution(String name, String surname, int age) {
//        String ageIntoString = String.valueOf(age);
//        return name.charAt(0) + "" + name.charAt(1) + "" + surname.charAt(0)
//                + "" + surname.charAt(1) + ageIntoString;
//    }

    public static void main(String[] args) {

        int[] A = new int[]{-1, 4, 8, 15};
        int max = 0;
        for(int i = 0; i < A.length; i++){
            if (A[i] % 4 == 0 && A[i] > max){
                max = A[i];
            }
        }
        System.out.println(max);


    }
}