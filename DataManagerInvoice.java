
public class DataManagerInvoice<T>  implements DataManager<T>{
	
	private campaignBase[] campaigns;
	
	public DataManagerInvoice(T entity,campaignBase[] campaigns) {
		this.campaigns = campaigns;
	}

	public void Add(T entity, T gamer){
		Utilies.runCampaigns(campaigns, "");
		System.out.println(gamer + "oyuncusuna " +entity +" satýldý" );
	}

	@Override
	public void Add(T entity) {
		// TODO Auto-generated method stub
		
	}

	
	
}
