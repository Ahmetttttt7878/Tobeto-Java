package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao {
    public void add(Car car){
        System.out.println("Hibarnate ile Eklendi");
    }
    public void delete(Car car){
        System.out.println("Hibernate ile Silindi");
    }
    public void update(Car car){
        System.out.println("Hibarnate ile Güncellendi");
    }

}
