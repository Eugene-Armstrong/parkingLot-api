package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingLotServiceImpl implements ParkingLotService{
    ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>(){{
        add(new ParkingLot("1"));
        add(new ParkingLot("2"));
    }};

    @Override
    public ArrayList<ParkingLot> getParkingLotsList() {
        return parkingLots;
    }

    @Override
    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }
}
