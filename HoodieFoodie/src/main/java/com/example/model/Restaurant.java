package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Restaurant {
    @Id
    @GeneratedValue(generator = "UUID",strategy = GenerationType.IDENTITY)
    @GenericGenerator(
    name = "UUID",
    strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private String restaurantId;
    private String restaurantName;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_address_id")
  //  @Embedded //1812
    private Address address;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinTable(name = "restaurantItem", joinColumns = @JoinColumn(name ="restaurant_id" ),inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> itemList;
    private String managerName;
    private String contactNumber;

//    public Restaurant() {
//    }
//
//    public Restaurant(String restaurantId, String restaurantName, Address address, List<Item> itemList, String managerName, String contactNumber) {
//        this.restaurantId = restaurantId;
//        this.restaurantName = restaurantName;
//        this.address = address;
//        this.itemList = itemList;
//        this.managerName = managerName;
//        this.contactNumber = contactNumber;
//    }
//
//    public String getRestaurantId() {
//        return restaurantId;
//    }
//
//    public void setRestaurantId(String restaurantId) {
//        this.restaurantId = restaurantId;
//    }
//
//    public String getRestaurantName() {
//        return restaurantName;
//    }
//
//    public void setRestaurantName(String restaurantName) {
//        this.restaurantName = restaurantName;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public List<Item> getItemList() {
//        return itemList;
//    }
//
//    public void setItemList(List<Item> itemList) {
//        this.itemList = itemList;
//    }
//
//    public String getManagerName() {
//        return managerName;
//    }
//
//    public void setManagerName(String managerName) {
//        this.managerName = managerName;
//    }
//
//    public String getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber(String contactNumber) {
//        this.contactNumber = contactNumber;
//    }

}
