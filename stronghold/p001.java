import java.util.*;
public class p001 {
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
  String s = input.next();
  int[] res = new int[4];
  for(char c : s.toCharArray())
  {
    if(c == 'A') res[0]++;
    else if(c == 'C') res[1]++;
    else if(c == 'G') res[2]++;
    else res[3]++;
  }
  System.out.println(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
}
}
