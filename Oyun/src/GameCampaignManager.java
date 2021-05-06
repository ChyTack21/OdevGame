
public class GameCampaignManager {
	
	public GameCampaignManager() {
			
	}
	
	public void add(GameCampaign gameCampaign,Games game)   {
	
	    gameCampaign.setDiscountPrice(game.getGamePrice()-(game.getGamePrice()*(gameCampaign.getPercofDiscount()/100)));	
		System.out.println(game.getGameName()+" adl� oyun %"+gameCampaign.getPercofDiscount()+" indirime girmi�tir "+"("+gameCampaign.getDiscountName()+") yeni fiyat: "+gameCampaign.getDiscountPrice()+"TL");
		
		
	}
	
	public void delete(GameCampaign gameCampaign, Games game) {
		
		gameCampaign.setDiscountPrice(game.getGamePrice());
		System.out.println(gameCampaign.getDiscountName()+" adl� kampanya sona ermi�tir."+game.getGameName()+" adl� oyunun fiyat�: "+
		gameCampaign.getDiscountPrice());
		
	}
		
	public void updateCampaign(int updatePrice ,GameCampaign gameCampaign,Games game) {
		
		gameCampaign.setPercofDiscount(updatePrice);
		
		System.out.println(gameCampaign.getDiscountName()+ " adl� kampanyada indirim oran� %"+gameCampaign.getPercofDiscount()+" olarak g�ncellenmi�tir");
		gameCampaign.setDiscountPrice(game.getGamePrice()-(game.getGamePrice()*(gameCampaign.getPercofDiscount()/100)));	
		System.out.println(game.getGameName()+" adl� oyunun yeni fiyat� :"+gameCampaign.getDiscountPrice());
		
	} 	
		
	
	
	
	
	
	
	
	
	

}
