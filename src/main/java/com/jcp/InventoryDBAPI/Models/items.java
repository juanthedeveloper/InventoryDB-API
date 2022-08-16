package com.jcp.InventoryDBAPI.Models;

import javax.persistence.*;

@Entity
@NamedQuery(name = "searchById", query = "SELECT I FROM items I WHERE I.item_Id=?1")
@NamedQuery(name = "allItemsName", query = "SELECT I FROM items I")
public class items {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long item_Id;
    @Column
    private String item_name;
    @Column
    private int item_quanity;

    public long getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(long itemId) {
        this.item_Id = itemId;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String itemName) {
        this.item_name = itemName;
    }

    public int getItem_quanity() {
        return item_quanity;
    }

    public void setItem_quanity(int itemQuanity) {
        this.item_quanity = itemQuanity;
    }


}
