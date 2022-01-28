package absfactorypatternexample;

public class Rectangle extends Shape{

	public Rectangle() {
		super(ShapeSides.FOUR);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		System.out.println("This is rectangle calculate method");
		
	}

	@Override
	public String toString() {
		return "Rectangle []";
	}

	
}
