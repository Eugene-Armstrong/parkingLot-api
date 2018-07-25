package com.oocl.parkinglotapi.serviceImpl;

import com.oocl.parkinglotapi.pojo.Car;
import com.oocl.parkinglotapi.pojo.Receipt;
import com.oocl.parkinglotapi.service.ReceiptService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    ArrayList<Receipt> receipts = new ArrayList<>();
    Map<String,Car> carAndReceiptMap = new HashMap<>();
    {
        String receiptId = "e7086ba6-521e-4df5-b5e3-96c0b226ef25";
        Receipt receipt = new Receipt(receiptId,true);
        Car car = new Car("粤666666");
        receipts.add(receipt);
        carAndReceiptMap.put(receiptId,car);
    }

    /**
     * 获取所有receiptId和car
     */
    @Override
    public Map<String,Car> getReceiptsAndCarsList() {
        return carAndReceiptMap;
    }

    /**
     * 获取所有receipt
     */
    public ArrayList<Receipt> getReceiptsList(){
        return receipts;
    }

    /**
     * 添加receipt
     */
    @Override
    public void addReceipt(Car car) {
        String receiptId = UUID.randomUUID().toString();
        Receipt receipt = new Receipt(receiptId,true);
        receipts.add(receipt);
        carAndReceiptMap.put(receiptId,car);
    }

    /**
     * 凭票取车
     */
    @Override
    public Car getCarByReceipt(String receiptId) {
        if (carAndReceiptMap.keySet().contains(receiptId)){
            return carAndReceiptMap.get(receiptId);
        }
        return null;
    }

    /**
     * 删除receipt
     */
    @Override
    public void deleteReceipt(String id) {
        if (carAndReceiptMap.keySet().contains(id)){
            for (Receipt receipts:receipts){
                if (receipts.getId().equals(id)){
                    receipts.setValidate(false);
                    break;
                }
            }
        }
    }
}
