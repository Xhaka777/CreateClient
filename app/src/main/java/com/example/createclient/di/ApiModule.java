package com.example.createclient.di;

import com.example.createclient.api.ApiService;
import com.example.createclient.api.ServiceFactory;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {
    @Provides
    @Singleton
    ApiService provideApiServiceWithoutBus() {
        return ServiceFactory.createRetrofitService(ApiService.class, ServiceFactory.BASE_URL);
    }

}
