package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	public void add(Product product){
		
		// Sadece db erişim kodları buraya yazilir.
		
		System.out.println("Hibernate ile veri tabanina eklendi");
	}
	
}
