import java.io.*;
import java.util.Arrays;

public class Main
{
    static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);

        System.out.println("n = ");
        String s1=bfr.readLine();
        int n=Integer.parseInt(s1);

        System.out.println("m = ");
        String s2=bfr.readLine();
        int m=Integer.parseInt(s2);

        System.out.printf("Introduceti multimea A(%d - elemente): ",n);
        int[] A=new int[n];
        java.util.Scanner input=new java.util.Scanner(System.in);
        for (int i = 0; i < A.length; i++)
        {
            A[i] = input.nextInt();
        }

        System.out.printf("Introduceti multimea B(%d - elemente): ",m);
        int[] B=new int[m];
        java.util.Scanner input2=new java.util.Scanner(System.in);
        for (int i = 0; i < B.length; i++)
        {
            B[i] = input2.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int[] inters = new int[Math.min(n, m)];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] == B[j]) {
                if (k == 0 || inters[k - 1] != A[i]) {
                    inters[k++] = A[i];
                }
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.print("Vectorul intersectie: ");
        if (k == 0) {
            System.out.println("Multimea este vida.");
        } else {
            for (int t = 0; t < k; t++) {
                System.out.print(inters[t] + " ");
            }
            System.out.println();
        }
    }
}