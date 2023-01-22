import java.io.*;
import java.util.*;

public class CutRope
{	
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	int length=sc.nextInt();
    	int a= sc.nextInt();
    	int b= sc.nextInt();
    	int c= sc.nextInt();
    	System.out.println(solution(length,a,b,c));
    	sc.close();
	}

	static int solution(int l,int a,int b,int c)
	{
		if (l==0)
			return 1;
		if(l<0)
			return -1;
		int res=Math.max(solution(l-a,a,b,c),Math.max(solution(l-b,a,b,c),solution(l-c,a,b,c)));
		System.out.println(res);
		return res+;
				
	}
}