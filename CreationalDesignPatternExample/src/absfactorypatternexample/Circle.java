package absfactorypatternexample;

public class Circle extends Shape{

	public Circle() {
		super(ShapeSides.ZERO);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		System.out.println("This is Circle calculate method");
		
	}

}
