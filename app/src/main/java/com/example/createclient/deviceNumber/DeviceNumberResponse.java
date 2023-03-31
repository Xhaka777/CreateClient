package com.example.createclient.deviceNumber;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeviceNumberResponse {
    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("error")
    @Expose
    public Error error;
    @SerializedName("data")
    @Expose
    public DeviceData data;

    public Boolean getSuccess() {
        return success;
    }

    public Error getError() {
        return error;
    }

    public DeviceData getData() {
        return data;
    }
}
