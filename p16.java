import java.io.*;

public class Main
{
    String buff="";

    public void citeste(String fisier)
    {
        int c;
        FileReader f=null;
        try{
            f=new FileReader(fisier);
            while((c=f.read())!=-1)
            {
                if((char)c>='a' && (char)c<='z')
                    buff=buff+Character.toUpperCase((char)c);
                else if((char)c>='A' && (char)c<='Z')
                    buff=buff+Character.toLowerCase((char)c);
                else
                    buff=buff+(char)c;
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

    public void scrie(String fisier)
    {
        FileWriter f=null;
        try
        {
            f=new FileWriter(fisier);
            f.write(buff);
            f.close();
        }
        catch(IOException e)
        {
            System.out.println("Eroare la scriere");
        }
    }

    public static void main(String[] args) throws IOException
    {
        Main text=new Main();
        text.citeste("input.txt");
        text.scrie("output.txt");
    }
}