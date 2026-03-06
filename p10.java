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

        int maxim=0;
        int nr1;
        int ok=1;
        System.out.println("Date matrice A:");
        int[][] A=new int[n][m];
        for(int i=0;i<n;++i)
        {
            nr1=0;
            for(int j=0;j<m;++j) {
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
                if(A[i][j]!=1 && A[i][j]!=0)
                {
                    System.out.println("TREBUIE SA FIE 1 SAU 0!!!");
                    ok=0;
                    break;
                }
                if(A[i][j]==1)
                    nr1++;
            }
            if(ok==0) break;
            if(i==0)
            {
                maxim=nr1;
            }
            else if(maxim<nr1)
            {
                maxim=nr1;
            }
        }

        if(ok==1) {
            System.out.println("nr maxim de 1 de pe o linie: " + maxim + " ori");
        }
    }
}