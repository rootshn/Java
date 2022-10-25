package oopWithNLayered.business;

import oopWithNLayered.core.logging.Logger;
import oopWithNLayered.dataAccess.HibernateProductDao;
import oopWithNLayered.dataAccess.JdbcProductDao;
import oopWithNLayered.dataAccess.ProductDao;
import oopWithNLayered.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List[] loggers;




    public ProductManager(ProductDao productDao,Logger[] logger) {
        this.productDao = productDao;
        this.loggers = logger;
    }

    public ProductManager() {

    }

    public void add (Product product)throws Exception{
        //Business rules
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }
        //HibernateProductDao productDao = new HibernateProductDao();
        productDao.add(product);



    }
}
