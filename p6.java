import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);
        System.out.println("n = ");
        int n=Integer.parseInt(bfr.readLine());

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("valori v:\n");
        int[] v=new int[100];
        int[] v2=new int[100];
        for(int i=0;i<n;++i)
        {
            System.out.println("v["+i+"] = ");
            v[i]=input.nextInt();

            v2[i]=v[i]*v[i];
        }

        System.out.println("v^2: ");
        for(int i=0;i<n;++i)
        {
            System.out.println(v2[i]+" ");
        }
    }
}