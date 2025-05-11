package OopWithNLayeredApp;

import OopWithNLayeredApp.business.ProductManager;
import OopWithNLayeredApp.core.logging.DatabaseLogger;
import OopWithNLayeredApp.core.logging.FileLogger;
import OopWithNLayeredApp.core.logging.Logger;
import OopWithNLayeredApp.core.logging.MailLogger;
import OopWithNLayeredApp.dataAccess.HibernateProductDao;
import OopWithNLayeredApp.dataAccess.jdbcProductDao;
import OopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Product product1 = new Product(1,"Laptop",15000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()}; // İstege gore boşta bırakılabilir.
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}

}
