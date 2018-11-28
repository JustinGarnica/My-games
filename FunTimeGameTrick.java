/*
Author: Justin Garnica
Date: 11/13/2018

make an escape game.  
*/
import java.util.Scanner;

public class FunTimeGameTrick {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like to play a game? (Y/N) ");
		String start = input.next();
		
		if(start.equals("Y")){
			System.out.print("\"Hello, it's me, I saved a great seat for you in my van, Would you like to come along?\" (Y/N) ");
			String one = input.next();
			
			if(one.equals("Y")){
				System.out.print("You Get in the van and notice an odd smell coming from behind a curtain. \nGreat, I have some candy just for you. \nWould you like some? (Y/N) ");
				String two = input.next();
				
				if(two.equals("Y")){
					System.out.print("You ate the candy, it tasted salty, you collapse on the floor of the van and shake violently.\n \"You sad child, don't you know you should never take candy from strangers?\" \nGAME OVER ");
				
				}else if (two.equals("N")) {
					System.out.print("You politely refuse the candy. \n\"Ok, I'll be right back I just need to grab some things, be good now.\" \n you hear a click as the doors lock \n the smell behind the curtain is exceedingly strong now.  \n would you like to investigate? (Y/N) ");
					String five = input.next();
				}if () {
					code
				}
			
			}else if (one.equals("N")) {
				System.out.print("\"Oh, you don't? That's too bad, I guess we can just play out here then. Here have a treat.\" \nAccept the treat? (Y/N)");
				String four = input.next();
				
			}
	
		}else if (start.equals("N")) {
			System.out.print("Your loss. \nGame over");
		}
			
		
	}
}