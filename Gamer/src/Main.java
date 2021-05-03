import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		
		Date date=Date.valueOf("2015-3-15");
		
		campaignBase[] kampanya= {new buyOneSecondFree(),new fiftyPercent()};
		
		
		Player player= new Player("Hakan","Þentürk",1975,"12345678917",date);
		Game game= new Game(1,"Borsada kaybedenler",150,10);
		
		DataManagerInvoice oyunmanager=new DataManagerInvoice<Player>(player,kampanya);
		
		if (Utilies.citizenShipValidity(player.getCitizenShipIdentity())) {
			oyunmanager.Add(game,player);	
		}else System.out.println("TcKimlikNo geçersiz");
		
		
		DataManagerBase base= new DataManagerBase<>();
		
		
		base.Add(game);
		base.Add(player);
	}

}
