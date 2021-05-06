
public class GameCampaign {

	private double percofDiscount;
	private String discountName;
	private double discountPrice;
	public GameCampaign(int percofDiscount, String discountName) {
		
		this.percofDiscount = percofDiscount;
		this.discountName = discountName;
		
	}
	
	public double getPercofDiscount() {
		return percofDiscount;
	}
	public void setPercofDiscount(int percofDiscount) {
		this.percofDiscount = percofDiscount;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	
	
	
	
}
