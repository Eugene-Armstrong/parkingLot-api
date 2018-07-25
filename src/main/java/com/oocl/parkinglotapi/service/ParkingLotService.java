package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.ParkingLot;

import java.util.ArrayList;

public interface ParkingLotService {
    ArrayList<ParkingLot> getParkingLotsList();
    void addParkingLot(ParkingLot parkingLot);
    void deleteParkingLot(String id);
}
