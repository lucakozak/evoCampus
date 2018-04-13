package Costumer;

public  class Costumer {
	
	private String name;
	private int tax;
	private int postCode;
	private int shopNumber;
	private String email;
	
	public Costumer(String name, int tax, int postCode, int shopNumber, String email) {
		this.name = name;
		this.tax = tax;
		this.postCode = postCode;
		this.shopNumber = shopNumber;
		this.email = email;
	}

	public  String getName() {
		return this.name;
	}
	
	public int getTax() {
		return this.tax;
	}
	
	public int getPostCode() {
		return this.postCode;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public int getShopNumber() {
		return this.shopNumber;
	}


	public boolean getRegularCostumer() {
		if (this.shopNumber > 100)
			return true;

		return false;
	}
}
