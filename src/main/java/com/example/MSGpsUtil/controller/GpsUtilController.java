package com.example.MSGpsUtil.controller;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import gpsUtil.GpsUtil;
import java.util.List;
import java.util.UUID;

@RestController
public class GpsUtilController {

    private GpsUtil gpsUtil;

    @Autowired
    public GpsUtilController(GpsUtil gpsUtil) {
        this.gpsUtil = gpsUtil;
    }

    @RequestMapping("/getAttractions")
    public List<Attraction> getAttractions() {
        return gpsUtil.getAttractions();
    }

    @RequestMapping("/getUserLocation")
    public VisitedLocation getUserLocation(@RequestParam UUID userId) {
       // System.out.println("user id" + userId.toString());
        return gpsUtil.getUserLocation(userId);
    }
}
