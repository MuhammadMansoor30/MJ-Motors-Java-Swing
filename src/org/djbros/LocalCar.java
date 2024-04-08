package org.djbros;

import java.io.*;
import java.util.ArrayList;


public class LocalCar extends ShowRoomCars {
    public LocalCar() {

        super();
    }

    public LocalCar(String carName, String carType, double carPrice, int carModel) {
        super(carName, carType, carPrice, carModel);
    }

    public LocalCar(String carName, String carType, double carPrice, int carModel, int carCondition) {
        super(carName, carType, carPrice, carModel, carCondition);
    }


    @Override
    public void populateNewCarArray() {
        newLocalCars = new ArrayList<>();
        File file = new File("newLocalCarsRecord.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            ArrayList<ShowRoomCars> f = (ArrayList<ShowRoomCars>) ois.readObject();
            for (int i = 0; i < f.size(); i++) {
                ShowRoomCars b = (ShowRoomCars) f.get(i);
                ShowRoomCars.newLocalCars.add(b);
            }
        } catch (Exception e) {
        }


    }

    @Override
    public void populateOldCarArray() {
        oldLocalCars = new ArrayList<>();
        File file = new File("oldLocalCarsRecord.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            ArrayList<ShowRoomCars> f = (ArrayList<ShowRoomCars>) ois.readObject();
            for (int i = 0; i < f.size(); i++) {
                ShowRoomCars b = (ShowRoomCars) f.get(i);
                ShowRoomCars.oldLocalCars.add(b);
            }
        } catch (Exception e) {
        }


    }
}
