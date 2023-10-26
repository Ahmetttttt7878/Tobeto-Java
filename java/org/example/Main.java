package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.DatebaseLogger;
import org.example.core.logging.Filelogger;
import org.example.core.logging.Logger;
import org.example.dateAccess.HibernateProductDao;
import org.example.dateAccess.JdbcProductDao;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"IPhone Xr",9000);

        Logger[] loggers ={new DatebaseLogger(), new Filelogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}