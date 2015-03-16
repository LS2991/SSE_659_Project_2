package TheBuilderPattern;

public class Part {
	String name;
	int price;
	
	public Part() {
		name = "none";
		price = 0;
	}
	
	public Part(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		int numSpaces = 30;
		int length = name.length();
		int newSpacing;
		String spaces = "";
		newSpacing = numSpaces - length;
		
		if(newSpacing < 0) 
			newSpacing *= -1;
		for(int x = 0; x < newSpacing; x++)
			spaces += " ";
		
		return (name + spaces + price);
	}
}

