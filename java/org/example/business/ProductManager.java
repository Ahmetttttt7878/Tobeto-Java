package org.example.business;

import org.example.core.logging.Logger;
import org.example.dateAccess.HibernateProductDao;
import org.example.dateAccess.JdbcProductDao;
import org.example.dateAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] Loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.Loggers = loggers;



    }

    public void add (Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }


        productDao.add(product);
        for (Logger logger : Loggers){ //[db, mail]
            logger.log(product.getName());
        }
    }
}
