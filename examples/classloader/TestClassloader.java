package classloader;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

public class TestClassloader {


    public static void main(String[] args) {

        ClassLoader classLoaderApp = TestClassloader.class.getClassLoader();
        System.out.println("Classloader of this class:"
                + TestClassloader.class.getClassLoader());
        ClassLoader classLoaderExt = Logging.class.getClassLoader();

        System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());
        ClassLoader classLoaderBoot = ArrayList.class.getClassLoader();

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }
}
