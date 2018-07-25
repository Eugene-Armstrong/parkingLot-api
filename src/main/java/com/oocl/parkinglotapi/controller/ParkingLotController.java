package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.ParkingLot;
import com.oocl.parkinglotapi.service.ParkingLotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/parkingLots")
public class ParkingLotController {

    @Autowired
    private ParkingLotServiceImpl parkingLotServiceImpl;

    /**
     * 获取停车场列表
     */
    @GetMapping("")
    public ArrayList<ParkingLot> getParkingLotsList(){
        return parkingLotServiceImpl.getParkingLotsList();
    }

    /**
     * 添加parkinglot
     */
    @PostMapping("newParkingLots")
    public ArrayList<ParkingLot> addParkingLot(@RequestBody ParkingLot parkingLot){
        parkingLotServiceImpl.addParkingLot(parkingLot);
        return parkingLotServiceImpl.getParkingLotsList();
    }


}
