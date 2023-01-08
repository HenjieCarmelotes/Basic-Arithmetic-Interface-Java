package interfaceproject;

public class MultiplicationQuestion implements Question {
	
	private double a, b; // The numbers in the problem.
	
	public MultiplicationQuestion() { // constructor
		a = (int)(Math.random() * 50 + 1);
		b = (int)(Math.random() * 50);
	}
	public String getQuestion() {
		return "What is " + a + " * " + b + " ?";
	}
	
	public double getCorrectAnswer() {
		return a * b;
	}

}
