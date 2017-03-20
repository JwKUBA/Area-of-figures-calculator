import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
	private Scanner sc;

	public ShapeCalculator() {
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
	}

	public void closeScanner() {
		sc.close();
	}

	public Rectangle readRectangleData() throws InputMismatchException {
		System.out.println("podaj informacje o prostok�cie. ");
		System.out.println("podaj d�ugos� boku A");

		double a = 0;
		double b = 0;

		try {
			a = sc.nextDouble();
			sc.nextLine();
			System.out.println(" Podaj dlugo�� boku B: ");
			b = sc.nextDouble();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}
		return new Rectangle(a, b);
	}

	public Circle readCircleData() throws InputMismatchException {
		System.out.println("Podaj informacje o kole");
		System.out.println("Podaj promien ko�a r :");
		double r = 0;

		try {
			r = sc.nextDouble();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}
		return new Circle(r);
	}

	public Triangle readTriangleData() throws InputMismatchException {

		System.out.println("Podaj informacje o tr�jk�cie");
		System.out.println("Podaj d�ugosc boku A : ");
		double a = 0;
		double b = 0;
		double c = 0;
		double h = 0;

		try {
			a = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj d�ugosc boku B: ");
			b = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj d�ugosc boku C: ");
			c = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj wysoko�� opadaj�c� na bok A: ");
			h = sc.nextDouble();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}
		return new Triangle(a, b, c, h);

	}

	public Shape createShape() throws NoSuchElementException, InputMismatchException {

		try {
			int shapeType = sc.nextInt();
			sc.nextLine();
			switch (shapeType) {
			case Shape.RECTANGLE:
				return readRectangleData();
			case Shape.TRIANGLE:
				return readTriangleData();
			case Shape.CIRCLE:
				return readCircleData();
			default:
				throw new NoSuchElementException();
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;

		}

	}

}
