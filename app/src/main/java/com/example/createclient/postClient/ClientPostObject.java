package com.example.createclient.postClient;

import com.google.gson.annotations.SerializedName;

public class ClientPostObject {
    @SerializedName("device_number")
    private String device_number;

    @SerializedName("device_token")
    private String device_token;

    @SerializedName("client")
    private ClientData client;

    public ClientPostObject(String device_number, String device_token, ClientData client) {
        this.device_number = device_number;
        this.device_token = device_token;
        this.client = client;
    }

    public ClientPostObject(){

    }

    public String getDeviceNumber() {
        return device_number;
    }

    public void setDeviceNumber(String device_number) {
        this.device_number = device_number;
    }

    public String getDeviceToken() {
        return device_token;
    }

    public void setDeviceToken(String device_token) {
        this.device_token = device_token;
    }

    public ClientData getClient() {
        return client;
    }

    public void setClient(ClientData client) {
        this.client = client;
    }
}
