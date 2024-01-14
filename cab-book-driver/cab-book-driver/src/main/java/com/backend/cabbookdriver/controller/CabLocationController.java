package com.backend.cabbookdriver.controller;

import com.backend.cabbookdriver.constant.AppConstant;
import com.backend.cabbookdriver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    private static final Random random = new Random();

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range=10;
        while(range > 0) {
            double newLatitude = AppConstant.CITY_CENTER_LATITUDE + (random.nextDouble() - 0.5) * AppConstant.MOVEMENT_RANGE;
            double newLongitude = AppConstant.CITY_CENTER_LONGITUDE + (random.nextDouble() - 0.5) * AppConstant.MOVEMENT_RANGE;
            cabLocationService.updateLocation("Latitude " + newLatitude + ", Longitude " + newLongitude);
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }
}
