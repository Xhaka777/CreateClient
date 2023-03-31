package com.example.createclient.deviceNumber;

public class DeviceNumber {
    String token;
    String user_id;
    String company_id;
    String data;


    public DeviceNumber(String token, String user_id, String company_id) {
        this.token = token;
        this.user_id = user_id;
        this.company_id = company_id;
    }

    public void setData(String data) {
        this.data = data;
    }
}
