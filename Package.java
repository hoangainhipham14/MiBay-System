import java.util.ArrayList;

public class Package {
	
	private int n;
	private Customer customer;
	private ArrayList<Product> productList = new ArrayList<Product>(n);
	
	public Package(Customer customer, Product product) {
		this.customer = customer;
		
		if (product == null) {
			throw new NullPointerException("Product is null");
		} else {
			this.productList.add(product);
		}
	}
	
	public boolean removeProduct(Product product) {
		
		Product currProduct;
		String productName;
		
		for (int i = 0; i < this.productList.size(); i++) {
			currProduct = this.productList.get(i);
			productName = currProduct.getName();
			if (productName.equals(product.getName())) {
				this.productList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean addProduct(Product product) {
		if (product == null) {
			return false;
		} else {
			this.productList.add(product);
			return true;
		}
	
	}
	

}
