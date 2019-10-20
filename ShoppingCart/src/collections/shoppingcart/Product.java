package collections.shoppingcart;

public class Product {
	private Integer pid;
	private String name;
	private Double price;
	private Integer stock;
	public Product()
	{

	}

	public Product(Integer pid, String name, Double price, Integer stock) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}



}
