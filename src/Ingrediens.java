
public class Ingrediens {
	private String id;
	private String name;
	private String amount;
	
	public Ingrediens(String id, String name, String amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public Ingrediens()
	{
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}
