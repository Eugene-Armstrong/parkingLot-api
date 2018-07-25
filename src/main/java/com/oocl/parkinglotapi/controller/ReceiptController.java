package com.oocl.parkinglotapi.controller;

import com.oocl.parkinglotapi.pojo.Receipt;
import com.oocl.parkinglotapi.service.ReceiptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private ReceiptServiceImpl receiptServiceImpl;

    @GetMapping("")
    public ArrayList<Receipt> getReceiptsList(){
        return receiptServiceImpl.getReceiptsList();
    }

    @PostMapping("")
    public ArrayList<Receipt> addReceipt(@RequestBody Receipt receipt){
        receiptServiceImpl.addReceipt(receipt);
        return receiptServiceImpl.getReceiptsList();
    }

}
