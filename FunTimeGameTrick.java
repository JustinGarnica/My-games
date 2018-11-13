/*
Author: Justin Garnica
Date: 11/13/2018

make an escape game.  
*/
import java.util.Scanner;

public class FunTimeGameTrick {
	public static void main(String[] args) {
		
		System.out.print("Would you like to play a game? (Y/N) ");
		user = input.next().charAt(0).toUpperCase();
		
		if("Y" == true){
			System.out.print("Good I saved a great seat for you in my van. \nWould you like to come along? (Y/N)");
			user = input.next().charAt(0).toUpperCase()
			if("Y" == true){
				System.out.print("You Get in the van and notice an odd smell coming from behind a curtain. \nGreat, I have some candy just for you. \nWould you like some? (Y/N)");
				user = input.next().charAt(0).toUpperCase();
				if("Y" == true){
					System.out.print("You ate the candy, it tasted salty, you collapse on the floor of the van and shake violently.\n \"You sad child, don't you know you should never take candy from strangers?\" \nGAME OVER");
				}else if ("N" == true) {
					system.out.print("You politely refuse the candy. \n\"Ok, I'll be right back I just need to grab some things, be good now. \" \n you hear a click as the doors lock \n the smell behind the curtain is exceedingly strong now.  \n would you like to investigate? (Y/N)");
					user = input.next().charAt(0).toUpperCase();
				}
			}
	
		}
			
		
	}
}