package absfactorypatternexample;

public class ShapeFactory {
	
	public static Shape getShape(ShapeSides ss) {
		Shape s = null;
		switch(ss) {
			case ZERO:
				s = new Circle();
			case THREE:
				s = new Triangle();
			case FOUR:
				s = new Rectangle();
			default :
				break;	
		}
		return s;
	}

}
