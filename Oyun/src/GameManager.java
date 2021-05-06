
public class GameManager {

	
	
	public void addMultiple(Games games[])
	{
	for (Games game: games) {
			
	System.out.println(game.getGameName()+": "+"sisteme eklendi");
	System.out.println("oyun ismi: "+game.getGameName()+" oyun fiyatı: "+game.getGamePrice()+"TL");
		}
	
	}
	public void add(Games game)	{
	System.out.println(game.getGameName()+": "+"sisteme eklendi");
		
	}
    public void delete(Games game)	{
    System.out.println(game.getGameName()+": "+"sistemden silindi");
		
	}
    public void update(Games game)	{
    System.out.println(game.getGameName()+": "+"sistemde güncellendi");	
		
	}
   
}
