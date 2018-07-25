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
     * 获取parkingLot列表
     */
    @GetMapping("")
    public ArrayList<ParkingLot> getParkingLotsList(){
        return parkingLotServiceImpl.getParkingLotsList();
    }

    /**
     * 添加parkingLot
     */
    @PostMapping("")
    public ArrayList<ParkingLot> addParkingLot(@RequestBody ParkingLot parkingLot){
        parkingLotServiceImpl.addParkingLot(parkingLot);
        return parkingLotServiceImpl.getParkingLotsList();
    }

    /**
     * 删除parkingLot
     */
    @DeleteMapping("{id}")
    public ArrayList<ParkingLot> deleteParkingLot(@PathVariable String id){
        parkingLotServiceImpl.deleteParkingLot(id);
        return parkingLotServiceImpl.getParkingLotsList();
    }

}
