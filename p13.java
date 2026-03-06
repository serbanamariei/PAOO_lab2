import java.io.*;

public class Main{
    String buf="";

    public void citeste(String fisier){
        int c;
        FileReader f=null;
        try{
            f=new FileReader(fisier);
            while((c=f.read())!=-1){
                buf=buf+(char)c;
            }
            f.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Fisierul nu a fost gasit");
        }
        catch(IOException e)
        {
            System.out.println("Eroare la citire");
        }
    }

    public void afiseaza()
    {
        System.out.println("Continutul fisierului este:");
        System.out.println(buf);
    }

    public static void main(String args[])
    {
        Main c=new Main();
        c.citeste("in.txt");
        c.afiseaza();
    }
}