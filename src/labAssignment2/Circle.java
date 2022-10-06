package labAssignment2;

import javax.swing.JOptionPane;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r=Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle :"));
		
        double  area=(22*r*r)/7 ;
       System.out.println("The Results of Area and Perimeter of the Circle :"+"\n"); 
       System.out.println("Radius : " +r +"\n");
       
        System.out.println("Area of Circle is: " + area+"\n");    
        
        double  c=(22*2*r)/7 ;
        
   	 	System.out.println("Perimeter of Circle is: " +c);    

	}

}
