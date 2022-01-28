package absfactorypatternexample;

public class Triangle extends Shape{

	public Triangle() {
		super(ShapeSides.THREE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		System.out.println("This is Triange calculate method");
		
	}

}
