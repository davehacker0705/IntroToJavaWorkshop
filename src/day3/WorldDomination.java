package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String david = JOptionPane.showInputDialog("Enter your name");
		// 2. If they say "yes", tell them they will rule the world.
if(david.equals("david")){
	System.out.println("you have great name");
}
		// 3. Otherwise, wish them good luck washing dishes.
else{
	System.out.println("Tell your parents to change your name");
}
	}
}

