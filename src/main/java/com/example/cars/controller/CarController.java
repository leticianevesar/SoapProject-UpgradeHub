package com.example.cars.controller;

import com.example.cars.model.GetCarRequest;
import com.example.cars.model.GetCarResponse;
import com.example.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    @Autowired
    private CarService carService;

    @PayloadRoot( namespace = "http://example.com/", localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request){
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.findCarByCarId(request.getCarId()));
        return response;
    }
}
