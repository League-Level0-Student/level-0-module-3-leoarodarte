
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 16";
		String dadsBirthday = "December 16";
		String myBirthday = "October 23";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday= JOptionPane.showInputDialog("What do you want? Leo's birthday, mom's birthday or dad's birthday.");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom" print mom's birthday.
		if(birthday.equals("mom")){
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(birthday.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		

		// 6. if user asked for your name
			// print myBirthday
		else if(birthday.equals("Leo")) {
		System.out.println(myBirthday);
	}else {
		System.out.println("Sorry, I don't remember that person's birthday.");
	}
	}
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	 
	
