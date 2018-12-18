package extra;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		
	
String h = JOptionPane.showInputDialog("What is your Zodiak sign.");
if(h.equals("Cancer")) {
	JOptionPane.showMessageDialog(null, "Cancer traits. Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. \nThey are very emotional and sensitive, and care deeply about matters of the family and their home.Cancer traits. \nDeeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. \nThey are very emotional and sensitive, and care deeply about matters of the family and their home.");
}
else if(h.equals("Scorpio")) {
	JOptionPane.showMessageDialog(null, "Scorpio is a Water sign and lives to experience and express emotions. Although emotions are very important for Scorpio, they manifest them differently \nthan other water signs. In any case, you can be sure that the Scorpio will keep your secrets, whatever they may be.");
}
else if(h.equals("Libra")) {
	JOptionPane.showMessageDialog(null, "People born under the sign of Libra are peaceful, fair, and they hate being alone. Partnership is very important for them, as their mirror and someone giving them the ability to be the mirror themselves. \nThese individuals are fascinated by balance and symmetry, they are in a constant chase for justice and equality, realizing through life that the only thing that should be truly important to themselves in their \nown inner core of personality. This is someone ready to do nearly anything to avoid conflict, keeping the peace whenever possible.");
}
else if(h.equals("Leo")) {
	JOptionPane.showMessageDialog(null,"People born under the sign of Leo are natural born leaders. They are dramatic, creative,\n self-confident, dominant and extremely difficult to resist, able to achieve anything they want to in any area of life they commit to. There is a specific strength to a Leo and \ntheir \"king of the jungle\" status. Leo often has many friends for they are generous and loyal. Self-confident and attractive, this is a Sun \nsign capable of uniting different groups of people and leading them as one towards a shared cause, and their healthy sense of humor makes collaboration with other people even easier." );
}else {
	JOptionPane.showMessageDialog(null, "That's not a Zodiak sign!");
}
}
}
