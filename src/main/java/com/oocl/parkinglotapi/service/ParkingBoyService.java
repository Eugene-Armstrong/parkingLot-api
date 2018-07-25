package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.ParkingBoy;
import com.oocl.parkinglotapi.pojo.ParkingLot;

import java.util.ArrayList;

public interface ParkingBoyService {
    ArrayList<ParkingBoy> getParkingBoysList();
    void addParkingBoy(ParkingBoy parkingBoy);
    void deleteParkingBoy(String id);
    void arrangeParkingLot(String id, ParkingLot parkingLot);
}
