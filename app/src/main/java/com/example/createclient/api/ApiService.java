package com.example.createclient.api;

import com.example.createclient.deviceNumber.DeviceNumber;
import com.example.createclient.deviceNumber.DeviceNumberResponse;
import com.example.createclient.postClient.ClientPostObject;
import com.example.createclient.postClient.ClientUploadResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface ApiService {

    @POST("api/get_device_number")
    Observable<DeviceNumberResponse> getDeviceNumber(@Body DeviceNumber deviceNumber);

    @POST("api/add_client__device")
    Observable<ClientUploadResponse> postClient(@Body ClientPostObject clientPostObject);

}
