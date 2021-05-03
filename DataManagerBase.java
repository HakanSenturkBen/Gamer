
public class DataManagerBase<T> implements DataManager<T>{

	@Override
	public void Add(T entity) {
		System.out.println(entity +" database dosyasına eklendi" );
		
	}

}
