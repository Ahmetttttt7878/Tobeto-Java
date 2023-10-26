package org.example.core.logging;

public class DatebaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Veri tabanına loglandı : " + data);


    }
}
