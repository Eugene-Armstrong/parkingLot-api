package com.oocl.parkinglotapi.pojo;

public class ParkingLot {
    private String id;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParkingLot(){

    }
    public ParkingLot(String id, int size){
        setId(id);
        setSize(size);
    }
}
