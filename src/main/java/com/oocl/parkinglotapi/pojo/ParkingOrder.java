package com.oocl.parkinglotapi.pojo;

import java.util.ArrayList;

public class ParkingOrder {
    private String id;
    private ArrayList<ParkingLot> parkingLots;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingOrder(){

    }

    public ParkingOrder(String id, ArrayList<ParkingLot> parkingLots){
        setId(id);
        setParkingLots(parkingLots);
    }
}
