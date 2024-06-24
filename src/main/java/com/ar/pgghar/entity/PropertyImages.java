package com.ar.pgghar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "property_images")
public class PropertyImages {

    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column(name = "property_id")
    private int propertyId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "description")
    private String description;

    public PropertyImages() {
    }

    public PropertyImages(int imageId, int propertyId, String imageUrl, String description) {
        this.imageId = imageId;
        this.propertyId = propertyId;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
