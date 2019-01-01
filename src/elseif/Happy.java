package elseif;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
String h= JOptionPane.showInputDialog("Are You HAPPY!!?");
if(h.equals("Yes.")){
	JOptionPane.showMessageDialog(null, "Then keep ding what you're doing!");	
}
else if(h.equals("No.")) {
	String a= JOptionPane.showInputDialog("Do you want to be happy?");

 if(a.equals("No.")) {
	JOptionPane.showMessageDialog(null, "Then keep doing what you're doing.");
 }

 else if(a.equals("Yes.")) {
JOptionPane.showMessageDialog(null, "Change something.");
 }
}
}
}
