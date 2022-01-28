package prototypepatternexample;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static class ModelType {
		public static final String Customer = "customer";
		public static final String FoodItem = "foodItem";
	}
	
	private static Map<String,IProtoTypeCreation> prototypesOfClasses =
													new HashMap<String,IProtoTypeCreation>();
	
	static {
		prototypesOfClasses.put(ModelType.Customer, new Customer());
		prototypesOfClasses.put(ModelType.FoodItem, new FoodItem());
	}
	
	public static IProtoTypeCreation getInstance(final String classInstance) throws CloneNotSupportedException{
		return (prototypesOfClasses.get(classInstance)).clone();
	}

}
