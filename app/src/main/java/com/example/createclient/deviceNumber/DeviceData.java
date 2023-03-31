package com.example.createclient.deviceNumber;

public class DeviceData {
    String device_token;
    String device_number;

    public DeviceData(String device_token, String device_number) {
        this.device_token = device_token;
        this.device_number = device_number;
    }

    public String getDeviceToken() {
        return device_token;
    }

    public String getDeviceNumber() {
        return device_number;
    }
}
