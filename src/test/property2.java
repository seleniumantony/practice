package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property2{
    public static String speak()
    {

    File f=new File("D:\\Antony\\Appium\\Eclipse Appium storage\\JMJ\\anton.property");
    FileInputStream fis = null;
    try {
        fis = new FileInputStream(f);
    } catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
    Properties p=new Properties();
    try {
        p.load(fis);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    String s=p.getProperty("holycross");
    return s;
}
}
 