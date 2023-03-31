package com.example.createclient.postClient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientUploadResponse {
    @SerializedName("success")
    @Expose
    public Boolean success;
    @SerializedName("error")
    @Expose
    public Error error;

    public Boolean getSuccess() {
        return success;
    }

    public Error getError() {
        return error;
    }
}
