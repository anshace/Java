import java.util.*;

  public class Base{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
        int decimal = 0,change=0;
        for(int i=0,copy=n;copy!=0;i++)
        {
			decimal+=(copy % 10) * Math.pow(sourceBase,i);
			copy/=10;
		}
		System.out.println(decimal);
        for(int i=0,copy=decimal;copy!=0;i++)
        {
			change+=(copy % destBase) * Math.pow( 10,i);
			copy/=destBase;
		}
      System.out.println(change);
   }
}
