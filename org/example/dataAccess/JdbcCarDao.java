package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao {
    public void add(Car car){
        System.out.println(" Jdbc ile Eklendi");
    }
    public void delete(Car car){
        System.out.println("Jdbc ile Silindi");
    }
    public void update(Car car){
        System.out.println("Jdbc ile Güncellendi");
    }


}
