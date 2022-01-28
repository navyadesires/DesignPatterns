package absfactorypatternexample;

public abstract class Shape {
	
	public ShapeSides noOfSides;
	
	public Shape(ShapeSides s) {
		this.noOfSides = s;
	}
	
	public abstract void calculate();

	public ShapeSides getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(ShapeSides noOfSides) {
		this.noOfSides = noOfSides;
	}
	
	

}
