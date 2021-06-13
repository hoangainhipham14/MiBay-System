
public class Product {
	
	private String name;
	private double weight;
	private double cost; 
	
	public Product(String name, double weight, double cost) throws EmptyStringException, InvalidInputException {
		if (name == null) {
			throw new NullPointerException("name is null");
		} else if (name.isEmpty()) {
			throw new EmptyStringException("name is empty");
		}
		else {
			this.name = name;
		}

		if (weight <= 0) {
			throw new InvalidInputException("weight is smaller than 0");
		} else {
			this.weight = weight;
		}
		
		if (cost <= 0) {
			throw new InvalidInputException("cost is smaller than 1");
		} else {
			this.cost = cost;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
