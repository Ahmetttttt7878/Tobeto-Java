package org.example.core.logging;

public class Filelogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı : "+ data);

    }
}
