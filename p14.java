import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        try{
            File f=new File("in.txt");
            Scanner sc=new Scanner(f);

            int n=sc.nextInt();
            int suma=0;

            for(int i=0;i<n;i++)
            {
                suma=suma+sc.nextInt();
            }

            System.out.println("Suma numerelor este:"+suma);
            sc.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Fisierul in.txt nu a fost gasit");
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Formatul fisierului este incorect");
        }
    }
}