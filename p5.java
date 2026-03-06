import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);
        System.out.println("n = ");
        int n=Integer.parseInt(bfr.readLine());
        int[] x=new int[n];
        int[] y=new int[n];

        int j=0;
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("x: ");
        for(int i=0;i<n;++i)
        {
            System.out.println("x["+i+"] = ");
            x[i]=input.nextInt();
            if(x[i]>0)
            {
                y[j]=x[i];
                j++;
            }
        }
        System.out.println("y = ");
        for(int i=0;i<j;++i)
        {
            System.out.println(y[i]+" ");
        }
    }
}