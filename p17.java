import java.io.*;

public class Main
{
    static int[] voc=new int[5];

    public void citeste(String fisier)
    {
        int c;
        FileReader f=null;
        try
        {
            f=new FileReader(fisier);
            while((c=f.read())!=-1)
            {
                if((char)c=='a'||(char)c=='A') voc[0]++;
                else if((char)c=='e'||(char)c=='E') voc[1]++;
                else if((char)c=='i'||(char)c=='I') voc[2]++;
                else if((char)c=='o'||(char)c=='O') voc[3]++;
                else if((char)c=='u'||(char)c=='U') voc[4]++;
            }
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

    public static void main(String[] args) throws IOException
    {
        Main text=new Main();
        text.citeste("input.txt");
        int maxim=voc[0];
        int index=0;
        for(int i=1;i<=4;++i)
            if(voc[i]>maxim) {
                maxim=voc[i];
                index=i;
            }
        char c=' ';
        if(index==0) c='a';
        else if(index==1) c='e';
        else if(index==2) c='i';
        else if(index==3) c='o';
        else c='u';

        System.out.println("Cea mai des intalnita vocala este "+c);
    }
}