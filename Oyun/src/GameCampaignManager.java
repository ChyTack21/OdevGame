
public class GameCampaignManager {
	
	public GameCampaignManager() {
			
	}
	
	public void add(GameCampaign gameCampaign,Games game)   {
	
	    gameCampaign.setDiscountPrice(game.getGamePrice()-(game.getGamePrice()*(gameCampaign.getPercofDiscount()/100)));	
		System.out.println(game.getGameName()+" adlý oyun %"+gameCampaign.getPercofDiscount()+" indirime girmiþtir "+"("+gameCampaign.getDiscountName()+") yeni fiyat: "+gameCampaign.getDiscountPrice()+"TL");
		
		
	}
	
	public void delete(GameCampaign gameCampaign, Games game) {
		
		gameCampaign.setDiscountPrice(game.getGamePrice());
		System.out.println(gameCampaign.getDiscountName()+" adlý kampanya sona ermiþtir."+game.getGameName()+" adlý oyunun fiyatý: "+
		gameCampaign.getDiscountPrice());
		
	}
		
	public void updateCampaign(int updatePrice ,GameCampaign gameCampaign,Games game) {
		
		gameCampaign.setPercofDiscount(updatePrice);
		
		System.out.println(gameCampaign.getDiscountName()+ " adlý kampanyada indirim oraný %"+gameCampaign.getPercofDiscount()+" olarak güncellenmiþtir");
		gameCampaign.setDiscountPrice(game.getGamePrice()-(game.getGamePrice()*(gameCampaign.getPercofDiscount()/100)));	
		System.out.println(game.getGameName()+" adlý oyunun yeni fiyatý :"+gameCampaign.getDiscountPrice());
		
	} 	
		
	
	
	
	
	
	
	
	
	

}
