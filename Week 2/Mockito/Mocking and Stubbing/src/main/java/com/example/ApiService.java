package com.example;

public class ApiService {

    private final ExternalApi externalApi;

    public ApiService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
