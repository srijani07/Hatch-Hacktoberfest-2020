//This program uses StringTokenizer class to count tokens (words) and identify and print each word from a given sentence
import java.util.*;
class token
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s,w;
        int i,l;
        System.out.println("Enter a sentence");
        s=in.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        l=st.countTokens();
        System.out.println("No. of words:"+l);
        for(i=0;i<l;i++)
        {
            w=st.nextToken();
            System.out.println(w);
        }
    }
}
