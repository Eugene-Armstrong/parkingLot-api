package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.Car;
import java.util.Map;

public interface ReceiptService {
    Map<String,Car> getReceiptsAndCarsList();
    void addReceipt(Car car);
    Car getCarByReceipt(String receiptId);
    void deleteReceipt(String id);
}
