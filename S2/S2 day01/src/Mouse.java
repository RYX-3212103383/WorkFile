/**
 * @author RYX
 */
public class Mouse {
	private int id;
	private String colour;
	private String type;
	private double price;

	public void show(Mouse mouse){
		System.out.println("id:"+getId());
		System.out.println("颜色:"+getColour());
		System.out.println("型号:"+getType());
		System.out.println("价格:"+getPrice());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
