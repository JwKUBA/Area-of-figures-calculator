import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();

		ShapeCalculator shapeCalc = new ShapeCalculator();
		Shape shape = null;

		boolean readComplete = false;
		while (!readComplete) {
			try {
				main.printOptions();
				shape = shapeCalc.createShape();
				readComplete = true;
			} catch (InputMismatchException e) {
				System.out.println("Wprowadzi³eœ dane w z³ym formacie, spróbuj ponownie");
			} catch (NoSuchElementException e) {
				System.out.println("Wybrany identyfikator kszta³tu jest niepoprawny, spróbuj ponownie");
			}
			
		}
		
		System.out.println(shape);
		shapeCalc.closeScanner();
		
		
	}

	public void printOptions() {
		System.out.println("Wybierz figure dla której chcesz obliczyc pole i obwód:");
		System.out.println(Shape.RECTANGLE + " - prostok¹t");
		System.out.println(Shape.CIRCLE + " - ko³o");
		System.out.println(Shape.TRIANGLE + " - trójk¹t");
	}

}
