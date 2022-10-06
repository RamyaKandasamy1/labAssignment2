package labAssignment2;

import javax.swing.JOptionPane;

public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		 System.out.println("Multiplication Table :" +number+"\n");
		 for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", number, i, number * i);
	            
	        }
	}

}
