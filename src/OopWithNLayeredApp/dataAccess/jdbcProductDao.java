package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product;

// Veri tabani erişim paketleri.

public class jdbcProductDao implements ProductDao { // Dao = Data Access Object
	
	public void add(Product product) {
		
		// Sadece db erişim kodları buraya yazilir.
		
		System.out.println("JDBC ile veri tabanina eklendi");
	}

}
