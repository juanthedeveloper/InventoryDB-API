package com.jcp.InventoryDBAPI.Controller;

import com.jcp.InventoryDBAPI.Models.items;
import com.jcp.InventoryDBAPI.Repo.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private ItemsRepo itemsRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/items")
    public List<items> getItems(){
        return itemsRepo.findAll();
    }

    @PostMapping(value="/additem")
    public String addItem(@RequestBody items item){
        itemsRepo.save(item);
        return "saved";

    }
}
