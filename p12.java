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


        int maxim=-1;
        int nr;
        int linie=-1;
        System.out.println("Date matrice A:");
        int[][] A=new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j) {
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }

            nr=0;
            for(int j=0;j<m-1;++j)
            {
                int ok=1;
                for(int t=j+1;t<m;++t)
                {
                    if(A[i][j]==A[i][t])
                    {
                        ok=0;
                        break;
                    }
                }
                if(ok==1) nr++;
            }
            if(maxim==-1)
            {
                maxim=nr;
                linie=i;
            }
            else if(maxim<nr)
            {
                maxim=nr;
                linie=i;
            }
        }

        if(linie!=-1)
        {
            System.out.println("Linia cu cele mai multe elemente distincte este: "+(linie+1));
        }
    }
}