package com.oocl.parkinglotapi.service;

import com.oocl.parkinglotapi.pojo.Receipt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReceiptServiceImpl implements ReceiptService{

    ArrayList<Receipt> receipts = new ArrayList<>();

    /**
     * 获取所有receipt
     */
    @Override
    public ArrayList<Receipt> getReceiptsList() {
        return receipts;
    }

    /**
     * 添加receipt
     */
    @Override
    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    /**
     * 删除receipt
     */
    @Override
    public void deleteReceipt(String id) {
        for(int i=0;i<receipts.size();i++){
            if(receipts.get(i).getId().equals(id)){
                receipts.remove(i);
                break;
            }
        }
    }
}
