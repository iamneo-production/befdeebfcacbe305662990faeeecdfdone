package com.examly.springapp.controller;
import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class LaptopController{
    @Autowired
    private ApiService apiService;
    @PostMapping("/")
    public boolean addLaptop(@RequestBody Laptop laptop){
           boolean added=apiService.addLaptop(laptop);
           return added;
    }
    @GetMapping("/{laptopId}")
    public Laptop getLaptopById(@PathVariable int laptopId){
          Laptop laptop=apiService.getLaptopById(laptopId);
          return laptop;
    }
    @GetMapping("/")
    public List<Laptop> getAllLaptops(){
         List <Laptop> laptops=apiService.getAllLaptops();
         return laptops; 
    }
}
