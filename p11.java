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

        int linie=-1;
        int maxim=-1;
        int nr;
        System.out.println("Date matrice A:");
        int[][] A=new int[n][m];
        for(int i=0;i<n;++i)
        {
            nr=0;
            for(int j=0;j<m;++j) {
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
                if (A[i][j]!=0)
                {
                    nr++;
                }
            }
            if(maxim==-1)
            {
                maxim=nr;
                linie=i;
            }
            else if(nr>maxim)
            {
                maxim=nr;
                linie=i;
            }
        }

        if(linie==-1)
        {
            System.out.println("Nu exista elemente nenule!");
        }
        else
        {
            System.out.println("Linia cu cele mai multe elemente nenule este:  "+linie);
        }
    }
}