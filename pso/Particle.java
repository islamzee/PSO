public class Particle {
	private double fitnessValue;
	private Velocity velocity;
	private Position position;

	public Particle() {
		super();
	}

	public Particle(double fitnessValue, Velocity velocity, Position position) {
		super();
		this.fitnessValue = fitnessValue;
		this.velocity = velocity;
		this.position = position;
	}

	public Velocity getVelocity() {
		return velocity;
	}

	public void setVelocity(Velocity velocity) {
		this.velocity = velocity;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public double getFitnessValue() {
		fitnessValue = ProblemSet.evaluate(position);
		return fitnessValue;
	}
}
