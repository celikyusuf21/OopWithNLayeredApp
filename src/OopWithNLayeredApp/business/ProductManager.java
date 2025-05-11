package OopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import OopWithNLayeredApp.core.logging.Logger;
import OopWithNLayeredApp.dataAccess.HibernateProductDao;
import OopWithNLayeredApp.dataAccess.ProductDao;
import OopWithNLayeredApp.dataAccess.jdbcProductDao;
import OopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		
		// İş Kuralları
		
		if(product.getUnitPrice()<10000) {
			throw new Exception ("Ürün fiyati 10 dan kucuk olamaz.");
		}
		productDao.add(product);
		
		for(Logger logger : loggers) {
			logger.log(product.getName());
		}
	}	
	

}
