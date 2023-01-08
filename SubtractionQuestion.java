package interfaceproject;

public class SubtractionQuestion implements Question {
	
	private double a, b; // The numbers in the problem.
	
	public SubtractionQuestion() { // constructor
		a = (int)(Math.random() * 50 + 1);
		b = (int)(Math.random() * 50);
		if (a - b < 0) { // swap a and b so answer won't be negative
	          double temp = a;
	          a = b;
	          b = temp;
	       }
	}
	public String getQuestion() {
		return "What is " + a + " - " + b + " ?";
	}
	
	public double getCorrectAnswer() {
		return a - b;
	}

} //end of SubtractionQuestion
