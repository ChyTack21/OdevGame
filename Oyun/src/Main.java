
public class Main {

	public static void main(String[] args) {
	
		Logger[] loggers= {new email()};
		
		playerManager pmanager = new playerManager(loggers);
		Player player =new Player("1","emircan","oðuztürk","21072000","11263785654");
	    pmanager.add(player);
        pmanager.verification(player);
        Edevlet edevlet=new Edevlet();
        edevlet.Edevlet(player);
        Games game1 = new Games ("g1","GTA 5",129);
        Games game2 = new Games ("g2","Forza Horizon 4",145);
        Games game3 = new Games ("g3","CyberPunk 2077",350);
        Games game4 = new Games ("g4","Minecraft Pocket Edition",39);
        Games game5 = new Games ("g5","Fry Cry 6",269);
        Games games[]= {game1,game2,game3,game4,game5};
        
        GameManager gameManager = new GameManager();
        gameManager.addMultiple(games);
        GameCampaign gameCampaign1= new GameCampaign(50,"bahar indirimi");
        GameCampaign gameCampaign2= new GameCampaign(60,"BlackFriday indirmi");
        GameCampaignManager gameCampaignManager = new GameCampaignManager();
        gameCampaignManager.add(gameCampaign2,game2);
        gameCampaignManager.delete(gameCampaign2,game2);
        gameCampaignManager.updateCampaign(90,gameCampaign2,game2);
	}
	

}
