package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.ParkingBoy;
import com.oocl.parkinglotapi.pojo.ParkingLot;
import com.oocl.parkinglotapi.serviceImpl.ParkingBoyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {

    @Autowired
    private ParkingBoyServiceImpl parkingBoyServiceImpl;

    /**
     * 获取parkingBoy列表
     */
    @GetMapping("")
    public ArrayList<ParkingBoy> getParkingBoysList(){
        return parkingBoyServiceImpl.getParkingBoysList();
    }

    /**
     * 添加parkingBoy
     */
    @PostMapping("")
    public ArrayList<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        parkingBoyServiceImpl.addParkingBoy(parkingBoy);
        return parkingBoyServiceImpl.getParkingBoysList();
    }

    /**
     * 删除parkingBoy
     */
    @DeleteMapping("{id}")
    public ArrayList<ParkingBoy> deleteParkingBoy(@PathVariable String id){
        parkingBoyServiceImpl.deleteParkingBoy(id);
        return parkingBoyServiceImpl.getParkingBoysList();
    }

    /**
     * 给某个parkingBoy安排parkingLot
     */
    @PutMapping("{id}")
    public ArrayList<ParkingBoy> arrangeParkingLot(@PathVariable String id, @RequestBody ParkingLot parkingLot){
        parkingBoyServiceImpl.arrangeParkingLot(id,parkingLot);
        return parkingBoyServiceImpl.getParkingBoysList();
    }

    /**
     * 给某个parkingBoy取消安排parkingLot
     */
    @DeleteMapping("{boyId}/{lotId}")
    public ArrayList<ParkingBoy> cancelArrangeParkingLot(@PathVariable String boyId, @PathVariable String lotId){
        parkingBoyServiceImpl.cancelArrangeParkingLot(boyId,lotId);
        return parkingBoyServiceImpl.getParkingBoysList();
    }
}
