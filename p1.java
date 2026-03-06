import java.io.*;

public class Main
{
    static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);

        System.out.println("Introduceti nr de elem: ");
        String s1=bfr.readLine();
        int n=Integer.parseInt(s1);

        System.out.println("Introduceti vectorul: ");
        int[] v=new int[n];
        java.util.Scanner input=new java.util.Scanner(System.in);
        for (int i = 0; i < v.length; i++)
        {
            v[i] = input.nextInt();
        }

        int minim=v[0];
        for(int i=1;i<v.length;++i)
        {
            if(v[i]<minim)
            {
                minim=v[i];
            }
        }

        System.out.println("Minimul din vector: "+minim);
    }
}