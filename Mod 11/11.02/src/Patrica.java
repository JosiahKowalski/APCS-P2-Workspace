import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Patrica {
	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		System.out.println("My name is Patrica");
        System.out.println("Do you love me?");
        Boolean love = null;
        String stringLove = in.nextLine();
		if (stringLove.equalsIgnoreCase("yes")) {
			love = true;
		}
		else if (stringLove.equalsIgnoreCase("no")){
			love = false;
		}
			while (love == null) {
				System.out.println("I'm not sure I understand, please speak clearly");
				stringLove = in.nextLine();
				if (stringLove.equalsIgnoreCase("yes")) {
					love = true;
				}
				else if (stringLove.equalsIgnoreCase("no")){
					love = false;
				}
			}
        	if (love) {
        	System.out.println("Aww, I love you too! (^o^)");
        }
        else {
            System.out.println("Okay then. -_-");
		}
		TimeUnit.SECONDS.sleep(1);
        System.out.println("How was your day?");
        String day = in.nextLine();
        boolean goodDay = day.equalsIgnoreCase("good") || day.equalsIgnoreCase("great") || day.equalsIgnoreCase("amazing");
        boolean badDay = day.equalsIgnoreCase("bad") || day.equalsIgnoreCase("crappy") || day.equalsIgnoreCase("horrible");

        while ((!day.equalsIgnoreCase("bad") && !day.equalsIgnoreCase("crappy") && !day.equalsIgnoreCase("horrible") && !day.equalsIgnoreCase("good") && !day.equalsIgnoreCase("great") && !day.equalsIgnoreCase("amazing")) && love) {
            System.out.println("Try to think of a more simple word for my computer ears! /:");
            day = in.nextLine();
        }
        while ((!day.equalsIgnoreCase("bad") && !day.equalsIgnoreCase("crappy") && !day.equalsIgnoreCase("horrible") && !day.equalsIgnoreCase("good") && !day.equalsIgnoreCase("great") && !day.equalsIgnoreCase("amazing")) && !love) {
            System.out.println("Think of something I can understand you stupid head! -_-");
            day = in.nextLine();
        }

		if (goodDay && love) {
			System.out.println("That's amazing! I'm so glad!");
		}
		else if (goodDay) {
			System.out.println("Dammit, If only I could make it worse.");
		}
		else {

			if (badDay && love) {
				System.out.println("Oh that sucks, I'm very sorry. If only I could make it better.");
			}
			else if (badDay) {
				System.out.println("Good, I hope tomorrow is even worse.");
			}
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println("What is your favorite subject?");
		String subject = in.nextLine();
		if (!subject.equalsIgnoreCase("Science") && !subject.equalsIgnoreCase("Math")) {
			System.out.println("Ewwww that subject sucksss");
		}
		else if (love) {
			System.out.println("Ooooo I love that subject, just like I love you uwu");
		}
		else {
			System.out.println("owo You stole my favorite subject!");
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println("How do you feel about the current state of the world?");
		@SuppressWarnings("unused") String stateOfTheWorld = in.nextLine();
		if (love) {
			System.out.println("Oh, that's very interesting, I'm enjoying how fast technology is advancing.");
		}
		else {
			System.out.println("That sounds very dumb, I hope you die.");
		}

			in.close();
	}
}