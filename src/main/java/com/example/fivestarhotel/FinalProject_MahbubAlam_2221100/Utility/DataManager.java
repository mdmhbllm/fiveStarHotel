package com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Utility;

import com.example.fivestarhotel.FinalProject_MahbubAlam_2221100.Hotel.Hotel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    // write object
    public static void saveObject(Object object, String fileName) throws IOException {
        File f = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }
        oos.writeObject(object);
        oos.close();
    }


    public static <T> List<T> getObject(String filename) throws IOException, ClassNotFoundException {
        List<T> objects = new ArrayList<>();
        File f = new File(filename);
        if (!f.exists()) {
            return new ArrayList<>();
        }
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                try {
                    T obj = (T) ois.readObject();
                    objects.add(obj);
                } catch (EOFException e) {
                    break;
                }
            }
        }
        return objects;
    }

    // Rewrite object
    public static <T> void saveUpdatedObject(List<T> object, String fileName) throws IOException {
        File f = new File(fileName);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (T obj: object){
            oos.writeObject(obj);
        }
        oos.close();
    }
}

