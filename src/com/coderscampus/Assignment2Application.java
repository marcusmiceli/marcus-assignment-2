package com.coderscampus;

import java.util.Scanner;

import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Pick a number between 1 and 100");
		String userInput=scanner.nextLine();
		Integer convertedInput=Integer.parseInt(userInput);
		
		Random random = new Random();
		int answer = random.nextInt(100) + 1;
		
		int i = convertedInput;
		while ((i < 1)
			|| (i > 100)) {
			Scanner newScanner = new Scanner(System.in);
			System.out.println("Your guess is not between 1 and 100, please try again");
			// This can be in a method
			System.out.println("Pick a number between 1 and 100");
			String newUserInput=newScanner.nextLine();
			Integer newConvertedInput=Integer.parseInt(newUserInput);
			i = newConvertedInput;
			}
		
		
		int counter = 1;
		while (counter < 5) {
			if ((i < answer)
				&& (i<=100)
				&& (i>=1)){
				Scanner newScanner = new Scanner(System.in);
				System.out.println("Pick a higher number");
				String newUserInput=newScanner.nextLine();
				Integer newConvertedInput=Integer.parseInt(newUserInput);
				i = newConvertedInput;
				counter = counter + 1;
			}
			else if ((i > answer)
			&& (i<=100)
			&& (i>=1)){
				Scanner newScanner = new Scanner(System.in);
				System.out.println("Pick a lower number");
				String newUserInput=newScanner.nextLine();
				Integer newConvertedInput=Integer.parseInt(newUserInput);
				i = newConvertedInput;
				counter = counter + 1;
			}
			else if ((i < 1)
			|| (i > 100)){
				Scanner newScanner = new Scanner(System.in);
				System.out.println("Your guess is not between 1 and 100, please try again");
				// This can be in a method
				System.out.println("Pick a number between 1 and 100");
				String newUserInput=newScanner.nextLine();
				Integer newConvertedInput=Integer.parseInt(newUserInput);
				i = newConvertedInput;
			}
			else if (i == answer) {
				System.out.println("You win!");
				break;
			}
		}
		
		if (i != answer) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + answer);
		}
		else if ((i == answer)
				&& (counter==5)) {
				System.out.println("You win!");
			}
			
		}
		

	}

