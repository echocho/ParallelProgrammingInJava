package edu.coursera.parallel;

public class Q2 {
    public static <N> void main(String[] args) {
        int N = 10;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int c = 0;
        for (int i = 0; i < N; i++) {
            c = c + a[i];
        }
        System.out.println("sequential. c = " + c);

        c = 0;
//        forall(0, N, i -> {
//            c = 0;
//            c = c + a[i];
//        });
        System.out.println("parallel. c = " + c);
    }
}
