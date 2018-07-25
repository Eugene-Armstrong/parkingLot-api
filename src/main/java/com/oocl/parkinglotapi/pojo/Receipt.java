package com.oocl.parkinglotapi.pojo;

public class Receipt {
    private String id;
    private boolean isValidate;

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

    public Receipt(){

    }

    public Receipt(String id, boolean isValidate){
        setId(id);
        setValidate(isValidate);
    }
}
