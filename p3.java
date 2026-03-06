import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);
        int n,m;
        System.out.println("n = ");
        n=Integer.parseInt(bfr.readLine());
        System.out.println("m = ");
        m=Integer.parseInt(bfr.readLine());

        int[] A=new int[n];
        int[] B=new int[m];
        int[] AB=new int[n+m];

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("Introduceti elementele din A:\n");
        for(int i=0;i<n;++i)
        {
            System.out.println("A["+i+"] = ");
            A[i]=input.nextInt();
        }
        System.out.println("Introduceti elementele din B:\n");
        for(int i=0;i<m;++i)
        {
            System.out.println("B["+i+"] = ");
            B[i]=input.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int i=0,j=0,t=0;
        while(i<A.length && j<B.length)
        {
            if(A[i]<B[j])
            {
                AB[t]=A[i];
                i++;
                t++;
            } else if (B[j]<A[i]) {
                AB[t]=B[j];
                j++;
                t++;
            }
            else
            {
                i++;
                j++;
            }
        }
        while(i<A.length)
        {
            AB[t]=A[i];
            t++;
            i++;
        }
        while(j<B.length)
        {
            AB[t]=B[j];
            t++;
            j++;
        }
        System.out.println("Diferenta dintre multimea A si multimea B:\n");
        for (int k=0;k<t;++k) {
            System.out.println(AB[k] + " ");
        }
    }
}