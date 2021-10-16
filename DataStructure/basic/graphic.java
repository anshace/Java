import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class graphic
{
	public static void main(String[] args)
	{
		// the Scanner sc for taking the input.
    	Scanner sc = new Scanner(System.in);
    	// the main code
    	String name=JOptionPane.showInputDialog("enter the name");
    	JOptionPane.showMessageDialog(null,"hello"+name);
    	int age=Integer.valueOf(JOptionPane.showInputDialog("Enter your age"));
    	JOptionPane.showMessageDialog(null,"Your are currently "+age+" years Old.");

    	sc.close();
	}
}
