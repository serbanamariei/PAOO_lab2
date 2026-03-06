import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);

        System.out.println("n = ");
        int n=Integer.parseInt(bfr.readLine());

        int[] v=new int[n];
        java.util.Scanner input=new java.util.Scanner(System.in);
        for(int i=0;i<n;++i)
        {
            System.out.println("v["+i+"] = ");
            v[i]=input.nextInt();
        }

        int ok=1;
        for(int i=0;i<n-1;++i)
        {
            if(v[i]>v[i+1])
            {
                ok=0;
                break;
            }
        }
        if(ok==1) System.out.println("Sirul este crescator\n");
        else System.out.println("Sirul NU este crescator\n");
    }
}