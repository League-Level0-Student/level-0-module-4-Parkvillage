package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	
	public static int addition(int n1, int n2) {
		return n1+n2;
	
	}

	public static int subtraction(int n1, int n2) {
		return n1-n2;
	}
	public static int multiplication(int n1, int n2) {
		
		return n1*n2;
	}
	public static int divison(int n1,int n2) {
		
		
		return n1/n2;
	}
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
      String num1=JOptionPane.showInputDialog(null, "Welcome to the simple calculator, choose a number");
      String num2=JOptionPane.showInputDialog(null, "choose another number");	// 2. Customize pop-up to support add/subtract/multiply/divide operations.
      												 																	
		int operation = JOptionPane.showOptionDialog(null, "what operation would you like to possess", "choose an operation", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplicatuin", "division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		if(operation==0) {
		int a=	addition(Integer.parseInt(num1),Integer.parseInt(num2));
			JOptionPane.showMessageDialog(null, a);
		}
		
		else if(operation==1) {
		int b= subtraction(Integer.parseInt(num1),Integer.parseInt(num2));
		JOptionPane.showMessageDialog(null, b);
		}
		else if(operation==2) {
			int c= multiplication(Integer.parseInt(num1),Integer.parseInt(num2));
			JOptionPane.showMessageDialog(null, c);
			}
		else if(operation==3) {
			int d= divison(Integer.parseInt(num1),Integer.parseInt(num2));
			JOptionPane.showMessageDialog(null, d);
			}
		}
			
	}


	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

