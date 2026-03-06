import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("n = ");
        int n=input.nextInt();
        System.out.println("m = ");
        int m=input.nextInt();

        int suma=0;
        System.out.println("Date matrice A:");
        int[][] A=new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j) {
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
                if (i == 0 || j == 0 || i == n-1 || j == m-1)
                {
                    suma+=A[i][j];
                }
            }
        }

        System.out.println("Suma de pe rama matricei este "+suma);
    }
}