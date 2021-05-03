
public class Utilies {
	 static boolean citizenShipValidity(String number) {
		return number.length()==11;
	}
	
	public static void runCampaigns(campaignBase[] campaigns, String message) {
		for (campaignBase x : campaigns) {
			x.addCampaign(" Kampanya eklendi");
		}
	}
	

}
