package com.example.velocities.controller;

import com.example.velocities.entity.Velocity;
import com.example.velocities.repository.VelocityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VelocityController {

    @Autowired
    VelocityRepository velocityRepository;

 // Get All Velocities
    @CrossOrigin(origins = "*") //CORS (Cross-origin resource sharing) for all sites
    @GetMapping("/velocities")
    public List<Velocity> getAllVelocities(HttpServletResponse response) {
    	response.setHeader("Cache-Control", "no-cache");
        return velocityRepository.findAll();
    }
    
    @CrossOrigin(origins = "*") //CORS (Cross-origin resource sharing) for all sites
    @GetMapping("/velocitiespagination")
    public List<Velocity> getVelocitiesByPagination(@RequestParam int start, HttpServletResponse response) {
    	response.setHeader("Cache-Control", "no-cache");
        List<Velocity> velocities = velocityRepository.findAll();
        List<Velocity> v = new ArrayList<>();
        if( start < 0 ) start = 0;
        for(int index = start; index < start + 5 && index < velocities.size(); index++) {
        	v.add(velocities.get(index));
        }
        return v;
    }
}