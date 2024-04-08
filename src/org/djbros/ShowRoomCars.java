package org.djbros;

import java.io.Serializable;
import java.util.*;

public abstract class ShowRoomCars implements PopulateArray, Serializable {

    public String carName;
    public String carType;
    public double carPrice;
    public int carCondition;
    public int carModel;
    public int yearOfImport;
    public double gradeAtTimeOfImport;
    public boolean auctionSheet;
    public static ArrayList<ShowRoomCars> newLocalCars = new ArrayList();
    public static ArrayList<ShowRoomCars> oldLocalCars = new ArrayList();
    public static ArrayList<ShowRoomCars> newImportedCars = new ArrayList();
    public static ArrayList<ShowRoomCars> oldImportedCars = new ArrayList();





    protected ShowRoomCars() {


    }

    protected ShowRoomCars(String carName, String carType, double carPrice, int carModel) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carModel = carModel;

    }

    protected ShowRoomCars(String carName, String carType, double carPrice, int carModel, int carCondition, int yearOfImport, double gradeAtTimeOfImport, boolean auctionSheet) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carModel = carModel;
        this.carCondition = carCondition;
        this.yearOfImport = yearOfImport;
        this.gradeAtTimeOfImport = gradeAtTimeOfImport;
        this.auctionSheet = auctionSheet;


    }

    protected ShowRoomCars(String carName, String carType, double carPrice, int carModel, int carCondition) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carModel = carModel;
        this.carCondition = carCondition;


    }


    protected ShowRoomCars(String carName, String carType, double carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;

    }


    public ArrayList<ShowRoomCars> getNewImportedCars() {
        return newLocalCars;
    }

    public ArrayList<ShowRoomCars> getNewLocalCars() {
        return newLocalCars;
    }

    public ArrayList<ShowRoomCars> getOldImportedCars() {
        return oldLocalCars;
    }


    public ArrayList<ShowRoomCars> getOldLocalCars() {
        return oldLocalCars;
    }


    public String getCarType() {
        return carType;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarModel() {
        return carModel;
    }

    public double getCarPrice() {
        return carPrice;
    }

}


