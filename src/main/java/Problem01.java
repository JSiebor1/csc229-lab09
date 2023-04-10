/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static void func1(int n) {
        int i = 1, j = 1, k = 1;
        int x = 0, y = 0;

        for (; i <= n; i++) { // n
            for (; j <= n; j = j * 2) { //logn
                //System.out.print("A'");
                x++;
            }
        } // nlogn
        // +
        // n^2
        for (; k <= j * j; k++) { // j = n^2
            //System.out.print("A'");
            y++;
        }

        System.out.print(" \n x= " + x + " y= " + y);
    } // nlogn + n^2
    // O(n^2)

    public static void func2(int n) {
        int k, j, i = n;
        while (i > 1) { // logn
            j = 1;
            while (j < n) { // logn
                k = 0;      // 
                while (k < n) { // n/2
                    k = k + 2;

                }
                j = j * 2;
            }
            i = i / 2;
        }
    } // logn*logn*(n/2)
    // n*(logn)^2

    // also discuss T(n) = 3 T(n/4) + n
    /*
    Using Master Theorem, a=3, b=4, c=1, f(n) = n
    log_4(3) < 1, case 3, O(f(n))
    O(n)
     */
}
