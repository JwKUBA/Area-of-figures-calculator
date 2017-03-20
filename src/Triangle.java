
public class Triangle implements Shape {

	private double height;
	private double a, b, c;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Triangle(double a, double b, double c, double h) {
		setA(a);
		setB(b);
		setC(c);
		setHeight(h);

	}

	public double calculateArea() {
		return a * height / 2;
	}

	public double calculatePerimetr() {
		return a + b + c;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Trojk¹t, ");
		sb.append("bok a : " + a + ",");
		sb.append("bok b : " + b + ",");
		sb.append("bok c : " + c + ",");
		sb.append("wysokoœæ : " + height + ",");
		sb.append("pole: " + calculateArea() + ", ");
		sb.append("obwód: " + calculatePerimetr());
		return sb.toString();
	}

}
