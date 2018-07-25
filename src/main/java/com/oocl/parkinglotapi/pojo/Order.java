package com.oocl.parkinglotapi.pojo;

public class Order {
    private String id;
    private boolean isValidate;
    private String carId;
    private String boyId;

    public String getBoyId() {
        return boyId;
    }

    public void setBoyId(String boyId) {
        this.boyId = boyId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public boolean isValidate() {
        return isValidate;
    }

    public void setValidate(boolean validate) {
        isValidate = validate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order(){

    }

    public Order(String id, boolean isValidate, String carId){
        setId(id);
        setValidate(isValidate);
        setCarId(carId);
    }
}
