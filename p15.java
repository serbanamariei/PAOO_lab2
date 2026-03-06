import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(new File("src/in_p15.txt"));
            String maxCuv="";
            int[] frecv=new int[26];

            while(sc.hasNext())
            {
                String cuv=sc.next();

                if(cuv.length()>maxCuv.length())
                {
                    maxCuv=cuv;
                }

                cuv=cuv.toLowerCase();
                for(int i=0;i<cuv.length();i++)
                {
                    char c=cuv.charAt(i);
                    if(c>='a'&&c<='z')
                    {
                        frecv[c-'a']++;
                    }
                }
            }
            sc.close();

            int maxF=0;
            char literaMax=' ';
            for(int i=0;i<26;i++)
            {
                if(frecv[i]>maxF)
                {
                    maxF=frecv[i];
                    literaMax=(char)(i+'a');
                }
            }

            System.out.println("Cel mai lung cuvant:"+maxCuv);
            System.out.println("Cea mai des utilizata litera:"+literaMax+" (de "+maxF+" ori)");

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu a fost gasit in src/");
        }
    }
}