package com.oocl.parkinglotapi.pojo;

public class ParkingLot {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParkingLot(){

    }
    public ParkingLot(String id){
        setId(id);
    }
}
