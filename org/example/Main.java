package org.example;

import org.example.Core.logging.DatabaseLogger;
import org.example.Core.logging.Filelogger;
import org.example.Core.logging.Logger;
import org.example.business.CarManager;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[]args) throws Exception {

        Car car = new Car(4,"X3","BMW","sDrive20i",2023,1000000);
        Car car1 = new Car(5,"i7","BMW","sDrive60",2022,900000);
        //LOG
        Logger[] loggers = {new DatabaseLogger(), new Filelogger()};
        //Veri Tabanı
        CarManager carManager = new CarManager(new JdbcCarDao(),loggers);

        carManager.add(car);

    }
}
