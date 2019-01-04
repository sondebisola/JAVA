package practise;

import java.util.Scanner;

//A == >=90
//B == >=80<90
//C == >=70<80
public class IfElseDemo {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scnr = new Scanner(System.in);
	int Score;
	
	Score = scnr.nextInt();
	
	if (Score >90) {
	System.out.println("Congratulations!! you got an A "+Score);
	}
	else if (Score <90 && Score >=80) {
	System.out.println("Congratulations!! you got an B "+Score);}
	else if (Score <80 && Score >=70) {
		System.out.println("Congratulations!! you got an C "+Score);}
	else if (Score <70 && Score >=60) {
		System.out.println("Congratulations!! you got an D "+Score);}
	else {
	System.out.println("Try again Queen");
	}
}

}
