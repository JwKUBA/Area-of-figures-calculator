
public class Circle implements Shape {

	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(double r) {
		setR(r);
	}

	public double calculateArea() {
		return Shape.PI * r * r;
	}

	public double calculatePerimetr() {
		return 2 * Shape.PI * r;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ko�o, ");
		sb.append("Promie� : " + r + ",");
		sb.append("pole: " + calculateArea() + ", ");
		sb.append("obw�d: " + calculatePerimetr());
		return sb.toString();
	}
}
