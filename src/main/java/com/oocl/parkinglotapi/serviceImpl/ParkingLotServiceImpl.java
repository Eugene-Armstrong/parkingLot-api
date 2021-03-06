package com.oocl.parkinglotapi.serviceImpl;

import com.oocl.parkinglotapi.pojo.ParkingLot;
import com.oocl.parkinglotapi.service.ParkingLotService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>(){{
        add(new ParkingLot("1",5));
        add(new ParkingLot("2",10));
    }};

    @Override
    public ArrayList<ParkingLot> getParkingLotsList() {
        return parkingLots;
    }

    @Override
    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    @Override
    public void deleteParkingLot(String id) {
        for(int i=0;i<parkingLots.size();i++){
            if(parkingLots.get(i).getId().equals(id)){
                parkingLots.remove(i);
                break;
            }
        }
    }
}
