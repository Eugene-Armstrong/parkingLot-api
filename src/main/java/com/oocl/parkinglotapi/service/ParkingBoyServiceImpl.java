package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.ParkingBoy;
import com.oocl.parkinglotapi.pojo.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingBoyServiceImpl implements ParkingBoyService{
    ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>(){{
        add(new ParkingLot("1"));
        add(new ParkingLot("2"));
    }};
    ArrayList<ParkingBoy> parkingBoys = new ArrayList<ParkingBoy>(){{
        add(new ParkingBoy("1",parkingLots));
    }};

    /**
     * 获取停车小弟列表
     */
    @Override
    public ArrayList<ParkingBoy> getParkingBoysList() {
        return parkingBoys;
    }

    /**
     * 添加停车小弟
     */
    @Override
    public void addParkingBoy(ParkingBoy parkingBoy) {
        parkingBoys.add(parkingBoy);
    }

    /**
     * 给某个停车小弟安排停车场
     */
    @Override
    public void arrangeParkingLot(String id, ParkingLot parkingLot) {
        for(ParkingBoy boy:parkingBoys){
            if(boy.getId().equals(id)){
                boy.getParkingLots().add(parkingLot);
                break;
            }
        }
    }
}
