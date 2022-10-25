package oopWithNLayered;

import oopWithNLayered.business.ProductManager;
import oopWithNLayered.dataAccess.HibernateProductDao;
import oopWithNLayered.dataAccess.JdbcProductDao;
import oopWithNLayered.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone",13);

        ProductManager productManager = new ProductManager(new HibernateProductDao());
        productManager.add(product1);

    }
}


