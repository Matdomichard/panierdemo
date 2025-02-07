package entity;

public class ArticleEntity {
	
	private int id;
	private String name; 
	private double price;
	private ArticleType type;

	
	// construceurs
	
	public ArticleEntity() {
		super();
	}
	public ArticleEntity(int id, String name, double price, ArticleType type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ArticleType getType() {
		return type;
	}
	public void setType(ArticleType type) {
		this.type = type;
	}

}
