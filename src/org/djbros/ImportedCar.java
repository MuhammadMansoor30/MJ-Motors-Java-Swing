package org.djbros;

import java.io.File;
import java.io.FileInputStream;

import java.io.ObjectInputStream;
import java.util.ArrayList;



public class ImportedCar extends ShowRoomCars {

    public ImportedCar() {

        super();
    }


    ImportedCar(String carName, String carType, double carPrice, int carModel) {
        super(carName, carType, carPrice, carModel);

    }

    ImportedCar(String carName, String carType, double carPrice, int carModel, int carCondition) {
        super(carName, carType, carPrice, carModel, carCondition);

    }

    public ImportedCar(String carName, String carType, double carPrice, int carModel, int carCondition
            , int yearOfImport, double gradeAtTimeOfImport, boolean auctionSheet) {
        super(carName, carType, carPrice, carModel, carCondition, yearOfImport, gradeAtTimeOfImport, auctionSheet);
    }


    @Override
    public void populateNewCarArray() {
        newImportedCars = new ArrayList<>();
        File file = new File("newImportedCarRecord.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            ArrayList<ShowRoomCars> f = (ArrayList<ShowRoomCars>) ois.readObject();
            for (int i = 0; i < f.size(); i++) {
                ShowRoomCars b = (ShowRoomCars) f.get(i);
                ShowRoomCars.newImportedCars.add(b);
            }
        } catch (Exception e) {
        }


    }

    @Override
    public void populateOldCarArray() {
        oldImportedCars = new ArrayList<>();
        File file = new File("oldImportedCarsRecord.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            ArrayList<ShowRoomCars> f = (ArrayList<ShowRoomCars>) ois.readObject();
            for (int i = 0; i < f.size(); i++) {
                ShowRoomCars b = (ShowRoomCars) f.get(i);
                ShowRoomCars.oldImportedCars.add(b);

            }
        } catch (Exception e) {
        }

    }
}






