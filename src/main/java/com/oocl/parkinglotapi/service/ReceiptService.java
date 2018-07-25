package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.ParkingLot;
import com.oocl.parkinglotapi.pojo.Receipt;

import java.util.ArrayList;

public interface ReceiptService {
    ArrayList<Receipt> getReceiptsList();
    void addReceipt(Receipt receipt);
    void deleteReceipt(String id);
}
