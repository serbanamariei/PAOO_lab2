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

        int a=1;
        int b=0;
        int cp=0, cneg=0, cnul=0;
        int[] d=new int[n*m];
        int t=0;
        System.out.println("Date matrice A:");
        int[][] A=new int[n][m];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j) {
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();

                if(i%2==0 && j%2==1)
                {
                    a*=A[i][j];
                }

                if(A[i][j]>0 && A[i][j]%2==1)
                {
                    b+=A[i][j];
                }

                if(A[i][j]>0)
                {
                    cp++;
                } else if (A[i][j]<0) {
                    cneg++;
                }
                else cnul++;

                if(i%2==0 && j%3==0)
                {
                    d[t]=A[i][j];
                    t++;
                }
            }
        }

        System.out.println("Produs nr aflate pe linii pare si coloane impare:  "+a);
        System.out.println("Suma elemente pozitive impare:  "+b);
        System.out.println("Numar elemente pozitive:  "+cp+"/ Nr elem negative: "+cneg+"/ Nr elem nule: "+cnul);
        System.out.println("Elem aflate pe linii pare si coloane divizibile cu 3:  ");
        for(int i=0;i<t;++i) System.out.println(d[i]+" ");
    }
}