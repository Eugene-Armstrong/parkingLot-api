package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.ParkingBoy;
import com.oocl.parkinglotapi.pojo.ParkingLot;
import com.oocl.parkinglotapi.service.ParkingBoyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyServiceImpl parkingBoyServiceImpl;

    /**
     * 获取停车小弟列表
     */
    @GetMapping("")
    public ArrayList<ParkingBoy> getParkingBoysList(){
        return parkingBoyServiceImpl.getParkingBoysList();
    }

    /**
     * 添加parkingBoy
     */
    @PostMapping("newBoys")
    public ArrayList<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        parkingBoyServiceImpl.addParkingBoy(parkingBoy);
        return parkingBoyServiceImpl.getParkingBoysList();
    }

    /**
     * 给某个停车小弟安排停车场
     */
    @PutMapping("{id}/newParkingLots")
    public ArrayList<ParkingBoy> arrangeParkingLot(@PathVariable String id, @RequestBody ParkingLot parkingLot){
        parkingBoyServiceImpl.arrangeParkingLot(id,parkingLot);
        return parkingBoyServiceImpl.getParkingBoysList();
    }
}
