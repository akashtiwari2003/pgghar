package com.ar.pgghar.entity;

import com.ar.pgghar.enums.AvailabilityStatus;
import com.ar.pgghar.enums.OccupancyType;
import com.ar.pgghar.enums.PropertyType;
import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class Properties {
    @Id
    @Column(name="property_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int propertyId;

    @Column(name="property_type")
    private PropertyType propertyType;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String price;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip_code")
    private String zip_code;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="owner_id")
    private int ownerId;

    @Column(name="availability_status")
    private AvailabilityStatus availabilityStatus;

    @Column(name="deposit")
    private double deposit;

    public Properties() {
    }

    public Properties(int propertyId, PropertyType propertyType, String title, String price, String address, String city, String state, String zip_code, double latitude, double longitude, int ownerId, AvailabilityStatus availabilityStatus, double deposit) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.title = title;
        this.price = price;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ownerId = ownerId;
        this.availabilityStatus = availabilityStatus;
        this.deposit = deposit;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
