
// this is the problem to be solved
// to find an x and a y that minimize the function below:
// f(x, y) = (2.8125 - x + x * y^4)^2 + (2.25 - x + x * y^2)^2 + (1.5 - x + x*y)^2
// where 1 <= x <= 4, and -1 <= y <= 1

// you can modify the function depends on your needs
// if your problem space is greater than 2-dimensional space
// you need to introduce a new variable (other than x and y)

public class ProblemSet {
	
	//CONSTRAINTS
	public static final double LOC_X_LOW = 1;
	public static final double LOC_X_HIGH = 4;
	public static final double LOC_Y_LOW = -1;
	public static final double LOC_Y_HIGH = 1;
	public static final double VEL_LOW = -1;
	public static final double VEL_HIGH = 1;

	public static final double ERR_TOLERANCE = 1E-20; // the smaller the tolerance, the more accurate the result,
	                                                  // but the number of iteration is increased

	public static double evaluate(Position position) {
		double result = 0;
		double x = position.getPos()[0]; // the "x" part of the position
		double y = position.getPos()[1]; // the "y" part of the position

		result = Math.pow(2.8125 - x + x * Math.pow(y, 4), 2) +
				Math.pow(2.25 - x + x * Math.pow(y, 2), 2) +
				Math.pow(1.5 - x + x * y, 2);

		return result;
	}
}
