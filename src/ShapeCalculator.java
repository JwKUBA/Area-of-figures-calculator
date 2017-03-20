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
		System.out.println("podaj informacje o prostok¹cie. ");
		System.out.println("podaj d³ugosæ boku A");

		double a = 0;
		double b = 0;

		try {
			a = sc.nextDouble();
			sc.nextLine();
			System.out.println(" Podaj dlugoœæ boku B: ");
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
		System.out.println("Podaj promien ko³a r :");
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

		System.out.println("Podaj informacje o trójk¹cie");
		System.out.println("Podaj d³ugosc boku A : ");
		double a = 0;
		double b = 0;
		double c = 0;
		double h = 0;

		try {
			a = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj d³ugosc boku B: ");
			b = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj d³ugosc boku C: ");
			c = sc.nextDouble();
			sc.nextLine();
			System.out.println("Podaj wysokoœæ opadaj¹c¹ na bok A: ");
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
