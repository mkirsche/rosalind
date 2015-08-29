import java.util.*;
public class p009 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	String s = input.next(), t = input.next();
	for(int i = 0; i+t.length() <= s.length(); i++)
	{
		if(s.substring(i, i+t.length()).equals(t)) System.out.print((i+1)+" ");
	}
}
}

