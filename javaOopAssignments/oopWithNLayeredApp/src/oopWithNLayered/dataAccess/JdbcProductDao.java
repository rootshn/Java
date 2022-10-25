package oopWithNLayered.dataAccess;

import oopWithNLayered.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add (Product product){
        //sadece ve sadece db erişim kodları buraya yazılır... SQL bilmek lazım.
        System.out.println("JDBC ile veritabanına eklendi" );
    }
}


