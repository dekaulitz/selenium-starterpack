package config;


import java.io.*;


public class Utils {


    public static String findFile(String filename) {
        String paths = "target/classes/";
        if (new File(paths + filename).exists())
            return paths + filename;
        return "";
    }
}
