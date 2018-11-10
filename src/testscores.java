import javax.swing.JOptionPane;

public class testscores {
public static void main(String[]args) {
	String rubric=JOptionPane.showInputDialog(null, "what did you get on your math test recently?? (pls include deimal values)");
  double result=Double.parseDouble(rubric);
  if(result>=93 && result <=100) {
	  JOptionPane.showMessageDialog(null, "Great job!! you got an A on your math test");
	  }
  else if(result>=90 && result <=93) {
  JOptionPane.showMessageDialog(null, "A! wow, next time you should not do silly mistakes");
 
  }
  else if(result>=87 && result<=90) {
	  JOptionPane.showMessageDialog(null,"an A- is not bad but try harder, good job though");
  }
  else if(result>=83 && result<=87) {
	  JOptionPane.showMessageDialog(null,"maby you shoud give more effort into your homework");
  }
  else if(result<0 || result >200){
	  JOptionPane.showMessageDialog(null, " there are incorrect numbers. try again.");
  }
  else if(result>100) {
	  JOptionPane.showMessageDialog(null," Great! extra credit!!!!");
  }
  else { 
	  JOptionPane.showMessageDialog(null," Not good");
  }	  
	 
	  
  }

}

