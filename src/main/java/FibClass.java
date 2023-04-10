/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class FibClass {

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2); // 2 recursive calls n times, 2^n
    } // O(2^n)

    static int fibIter(int n) {

        int i, f[] = new int[n + 2];
        f[0] = f[1] = 0;

        for (i = 2; i <= n; i++) { // n
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    } // O(n)

}
