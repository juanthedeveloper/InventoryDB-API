package com.jcp.InventoryDBAPI.Repo;


import com.jcp.InventoryDBAPI.Models.items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepo extends JpaRepository<items, Long> {
}
