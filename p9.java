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
        System.out.println("x = ");
        int x=input.nextInt();

        int nr=0;
        System.out.println("Date matrice A:");
        int[][] A=new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                System.out.println("A["+i+"]["+j+"] = ");
                A[i][j]=input.nextInt();
                if(A[i][j]==x) nr++;
            }
        }

        System.out.println("x"+"("+x+") apare de "+nr+" ori");
    }
}