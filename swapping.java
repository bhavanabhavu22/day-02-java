import java.util.*;
public class swapping
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int g=sc.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("after swapping \n boy=%d \n girl=%d",b,g);
        System.out.println(res);
    }
}

