package org.example.business;
import org.example.Core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;



public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao,Logger[] loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }

    //iş kuralı
    public void add (Car car) throws Exception {
        if (car.getId() <= 3){
        throw new Exception("Araba Id 3 ten küçük ve 3 e eşit olamaz");
        }

        carDao.add(car);
        for (Logger logger : loggers){
            logger.log(car.getName());
        }
    }
}








