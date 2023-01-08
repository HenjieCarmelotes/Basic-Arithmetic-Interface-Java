package interfaceproject;

public class AdditionQuestion implements Question {
	
	private double a, b; // The numbers in the problem.
	
	public AdditionQuestion() { // constructor
		a = (int)(Math.random() * 50 + 1);
		b = (int)(Math.random() * 50);
	}
	public String getQuestion() {
		return "What is " + a + " + " + b + " ?";
	}
	
	public double getCorrectAnswer() {
		return a + b;
	}

} //end of AdditionQuestion
