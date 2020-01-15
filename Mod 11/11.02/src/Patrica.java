import java.util.Scanner;
public class Patrica {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("My name is Patrica");
        System.out.println("Do you love me?");
        String love = in.nextLine();
        while (!love.equalsIgnoreCase("yes") && !love.equalsIgnoreCase("no")) {
        	System.out.println("I'm not sure I understand, please speak clearly");
        	love = in.nextLine();
        }
        	if (love.equalsIgnoreCase("yes")) {
        	System.out.println("Aww, I love you too! (^o^)");
        }
        else if (love.equalsIgnoreCase("no")) {
            System.out.println("Okay then. -_-");
        }
        System.out.println("How was your day?");
        String day = in.nextLine();
        while ((!day.equalsIgnoreCase("bad") && !day.equalsIgnoreCase("crappy") && !day.equalsIgnoreCase("horrible") && !day.equalsIgnoreCase("good") && !day.equalsIgnoreCase("great") && !day.equalsIgnoreCase("amazing")) && love.equalsIgnoreCase("yes")) {
            System.out.println("Try to think of a more simple word for my computer ears! <.>");
            day = in.nextLine();
        }
        while ((!day.equalsIgnoreCase("bad") && !day.equalsIgnoreCase("crappy") && !day.equalsIgnoreCase("horrible") && !day.equalsIgnoreCase("good") && !day.equalsIgnoreCase("great") && !day.equalsIgnoreCase("amazing")) && love.equalsIgnoreCase("no")) {
            System.out.println("Think of something I can understand you stupid head! -_-");
            day = in.nextLine();
        }
		if ((day.equalsIgnoreCase("good") || day.equalsIgnoreCase("great") || day.equalsIgnoreCase("amazing")) && love.equalsIgnoreCase("yes")) {
			System.out.println("That's amazing! I'm so glad!");
		}
		else if ((day.equalsIgnoreCase("good") || day.equalsIgnoreCase("great") || day.equalsIgnoreCase("amazing")) && love.equalsIgnoreCase("no")) {
			System.out.println("Damnit, If only I could make it worse.");
		}
		else if ((day.equalsIgnoreCase("bad") || day.equalsIgnoreCase("crappy") || day.equalsIgnoreCase("horrible")) && love.equalsIgnoreCase("yes")) {
			System.out.println("Oh that sucks, I'm sorry. If only I could make it better.");
		}
		else if ((day.equalsIgnoreCase("bad") || day.equalsIgnoreCase("crappy") || day.equalsIgnoreCase("horrible")) && love.equalsIgnoreCase("no")) {
			System.out.println("Good, I hope tomorrow is even worse."); 
        }
		System.out.println("What is your favorite subject?");
		String subject = in.nextLine();
		if (!subject.equalsIgnoreCase("Science")) {
			System.out.println("Ewwwww that subject sucksss");
		}
		else if (love.equalsIgnoreCase("yes")) {
			System.out.println("Ooooo I love that subject, just like I love you uwu");
		}
		else {
			System.out.println("owo You stole my favorite subject!");
		}
			
		
			
	}
}