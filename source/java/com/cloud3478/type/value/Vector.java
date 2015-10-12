package java.com.cloud3478.type.value;

public class Vector {

	private final double x, y;

	public static final Vector of(double x, double y){
		return new Vector(x,y);
	}
	
	private Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

	public double sum() {
		return x + y;
	}

	public double difference() {
		return x - y;
	}

	public double range() {
		return Math.abs(x - y);
	}

	public double average() {
		return (x + y) / 2;
	}

	public double distanceTo(Vector v) {
		return Vector.of(v.x() - x, v.y() - y).magnitude();
	}

	public double distanceTo(double a, double b) {
		return Vector.of(a - x, b - y).magnitude();
	}

	public double magnitudeSquared() {
		return (x * x) + (y * y);
	}

	public double magnitude() {
		return Math.sqrt(magnitudeSquared());
	}

	public Vector withMagnitude(final double magnitude) {
		final double m = this.magnitude() / magnitude;
		if ((0 == m) || (1 == m)){
			return this;
		}
		else{
			return this.scaledBy(1 / m);
		}
	}

	public Vector translatedBy(Vector v) {
		return Vector.of(x + v.x(), y + v.y());
	}

	public Vector translatedBy(double a, double b) {
		return Vector.of(x + a, y + b);
	}

	public Vector negated() {
		return Vector.of(-x, -y);
	}

	public Vector swapped() {
		return Vector.of(y, x);
	}

	public Vector scaledBy(double amt) {
		return Vector.of(amt * x, amt * y);
	}

	public Vector scaledBy(Vector amt) {
		return Vector.of(amt.x() * x, amt.y() * y);
	}

	public Vector normalized() {
		return this.withMagnitude(1);
	}

	public Vector withX(final double x) {
		return Vector.of(x, y());
	}

	public Vector withY(final double y) {
		return Vector.of(x(), y);
	}

	public Vector plus(Vector v) {
		return Vector.of(x + v.x(), y + v.y());
	}

	public Vector minus(Vector v) {
		return Vector.of(x - v.x(), y - v.y());
	}

	public Vector truncated() {
		return Vector.of(Math.floor(x), Math.floor(y));
	}

	public Vector rounded() {
		return  Vector.of(Math.round(x), Math.round(y));
	}

}
