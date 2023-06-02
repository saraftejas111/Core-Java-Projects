package dec_08.scanner;

import java.net.MulticastSocket;
import java.util.Scanner;

public class DemoScanner { 
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the Choice No bet 1 to 7\nto see your Lucky Day");
	int a=sc.nextInt();


	switch (a) {
	case 1:
		System.out.println("Tuesday\n\nMars in Astrology symbolizes the principle of assertive energy.\nAries is the sign of the zodiac ruled by Mars.\nThanks to fiery Mars, \nwe associate Aries with qualities of leadership and courage.\nUse Tuesday to initiate a pioneering activity that requires gumption and strength.");
		
		break ;
	case 2:
		System.out.println("Sunday\n\nSunday is the first day of the week and commences the preparations\nfor the week ahead. Sunday is also the day of rest and worship. \nThe Sun is the ruler of this wonderful day. Those born on Sunday shine in their life, \nlike the Sun. Astrologically; it is believed that people born on \nSunday are lucky ducks.");
		break ;
	case 3:
		System.out.println("Friday\n\nFriday is the day of Venus which governs some interesting aspects of life  \nlove, balance, affection, beauty, partnership, romance, refinement, art, pleasures, \nluxuries and comforts. \nFriday born people are highly social and artistic.");
		
		break ;
	case 4:
		System.out.println("Monday\n\nAccording to astrology, this day comes under the \ncategory of quiet and calm days. Monday is considered as the symbol of goodness & integrity. This day is associated with Lord Shiva. The natives born on this day receives the auspiciousness and mildness as per the day itself. This day also represents moon.");
		break ;
	case 5:
		System.out.println("Wednesday\n\nThis day is favorable to start writing and intellectual tasks. \nYou could start attaining education in the field of banking. \nYou can start your law studies or studies related to technical, \nastrology and transportation on Wednesday.");
		
		break ;
	case 6:
		System.out.println("Thursday\n\nThursday is considered as the fifth day of the week across several traditions on the earth. This day \nis ruled by the most influential planet in astrology \nnamely Jupiter. Astrology sees this as the most \nbeneficial planet that brings highly auspicious results to people's lives.");
		break ;
	case 7:
		System.out.println("saturday\n\nDonate black til, mustard oil to any temple if Saturn is not good in horoscope also Shani Shanti Pooja is done on this day. \nIf you want to start a new job then do Join on Saturday if possible. \nIf you are suffering from evil eye effect then do utara with \nlemon on the evening of shaniwaar and throw it on any chouraha.");
		
		break ;
		default:
		System.out.println("out of range");
	
	
	}
	}

}
