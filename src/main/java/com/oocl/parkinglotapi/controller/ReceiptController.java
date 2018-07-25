package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.Car;
import com.oocl.parkinglotapi.pojo.Receipt;
import com.oocl.parkinglotapi.service.ReceiptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private ReceiptServiceImpl receiptServiceImpl;

    /**
     * 获取所有receiptId和car
     */
    @GetMapping("")
    public Map<String,Car> getReceiptsList(){
        return receiptServiceImpl.getReceiptsAndCarsList();
    }

    /**
     * 凭票取车
     */
    @GetMapping("{receiptsId}")
    public Car getCarByReceipt(@PathVariable String receiptsId){
        return receiptServiceImpl.getCarByReceipt(receiptsId);
    }

    /**
     * 添加receipt
     */
    @PostMapping("")
    public ArrayList<Receipt> addReceipt(@RequestBody Car car){
        receiptServiceImpl.addReceipt(car);
        return receiptServiceImpl.getReceiptsList();
    }

    /**
     * 删除receipt
     */
    @DeleteMapping("{id}")
    public ArrayList<Receipt> deleteReceipt(@PathVariable String id){
        receiptServiceImpl.deleteReceipt(id);
        return receiptServiceImpl.getReceiptsList();
    }

}
