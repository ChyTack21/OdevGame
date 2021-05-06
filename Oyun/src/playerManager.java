

public class playerManager {

	private Logger[] loggers;
	
	
	public playerManager(Logger[] loggers) {
		
		this.loggers =loggers;
	}


     public void add(Player player) {
    	 
    	 System.out.println("oyuncu kaydedildi: "+player.getFirstName());
    		for (Logger logger : loggers) {
    			logger.log(player.getFirstName());
    			
    		}
     }
    	 
 public void delete(Player player) {
    	 
    	 System.out.println("oyuncu silindi: "+player.getFirstName());
    		for (Logger logger : loggers) {
    			logger.log(player.getFirstName());
    			
    		}
     }
	
	public void verification(Player player) {
		System.out.println("(bilgiler doðrulanýyor) "+"\nisim:"+player.getFirstName()+"\nsoyad:"+player.getLastName()
		+"\nTc no:"+player.getIdentityNumber()+"\ndoðum yýlý:"+ player.getYearofBirth());
		
	}
	
	
}
