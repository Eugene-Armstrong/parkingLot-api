package com.oocl.parkinglotapi.serviceImpl;

import com.oocl.parkinglotapi.pojo.ParkingBoy;
import com.oocl.parkinglotapi.pojo.ParkingLot;
import com.oocl.parkinglotapi.service.ParkingBoyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingBoyServiceImpl implements ParkingBoyService {
    ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>(){{
        add(new ParkingLot("1",5));
        add(new ParkingLot("2",10));
    }};
    ArrayList<ParkingBoy> parkingBoys = new ArrayList<ParkingBoy>(){{
        add(new ParkingBoy("1",parkingLots));
    }};

    /**
     * 获取parkingBoy列表
     */
    @Override
    public ArrayList<ParkingBoy> getParkingBoysList() {
        return parkingBoys;
    }

    /**
     * 添加parkingBoy
     */
    @Override
    public void addParkingBoy(ParkingBoy parkingBoy) {
        parkingBoys.add(parkingBoy);
    }

    /**
     * 删除parkingBoy
     */
    @Override
    public void deleteParkingBoy(String id) {
        for(int i=0;i<parkingBoys.size();i++){
            if(parkingBoys.get(i).getId().equals(id)){
                parkingBoys.remove(i);
                break;
            }
        }
    }

    /**
     * 给某个parkingBoy安排parkingLot
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

    /**
     * 给某个parkingBoy取消安排parkingLot
     */
    @Override
    public void cancelArrangeParkingLot(String boyId,String lotId) {
        for(int i=0;i<parkingBoys.size();i++){
            if(parkingBoys.get(i).getId().equals(boyId)){
                ArrayList<ParkingLot> parkingLots = parkingBoys.get(i).getParkingLots();
                for(int j=0;j<parkingLots.size();j++){
                    if(parkingLots.get(j).getId().equals(lotId)){
                        parkingLots.remove(j);
                        break;
                    }
                }
                break;
            }
        }
    }
}
