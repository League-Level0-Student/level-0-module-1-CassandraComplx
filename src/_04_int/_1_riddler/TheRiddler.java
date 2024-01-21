package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int count = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog("When is a door no longer a door?");
System.out.println(input);
if (input.equals("When its ajar")) {
	JOptionPane.showMessageDialog(null, "correct");
	count+=1;
}

else {
	JOptionPane.showMessageDialog(null, "incorrect");
}



		// 4. If they got the answer right, pop up "correct!" and increase the score by one

String input1 = JOptionPane.showInputDialog("What do you buy to eat but never consume?");
System.out.println(input1);
if (input1.equals("Cutlery")) {
	JOptionPane.showMessageDialog(null, "correct");
	count+=1;
}

else {
	JOptionPane.showMessageDialog(null, "incorrect");
	count-=1;
}


String input2 = JOptionPane.showInputDialog("What kind of room has no walls, door or windows?");
System.out.println(input2);
if (input2.equals("A mushroom")) {
	JOptionPane.showMessageDialog(null, "correct");
	count+=1;
}

else {
	JOptionPane.showMessageDialog(null, "incorrect");
	count-=1;
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
String story =
	"Your final score is "+count+" points";
	JOptionPane.showMessageDialog(null, story);
	}
}

