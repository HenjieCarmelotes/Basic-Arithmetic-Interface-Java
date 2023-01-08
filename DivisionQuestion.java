package interfaceproject;

import java.text.DecimalFormat;

public class DivisionQuestion implements Question {
	
	private double a, b; // The numbers in the problem.
	
	public DivisionQuestion() { // constructor
		a = (int)(Math.random() * 50 + 1);
		b = (int)(Math.random() * 50 + 1);
		if (a - b < 0) { // swap a and b so answer won't be negative
	          double temp = a;
	          a = b;
	          b = temp;
	       }
	}
	public String getQuestion() {
		return "What is " + a + " / " + b + " ?";
	}
	
	public double getCorrectAnswer() {
		DecimalFormat df = new DecimalFormat("0.00");
		double qoutient = a/b;
		String answer = df.format(qoutient);
		return Double.parseDouble(answer);
	}

}
