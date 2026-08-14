package com.example.demo.model;

import java.time.LocalDate;

import com.example.demo.strategy.DiscountContext;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

    
    @Entity
    @Table(name = "Tgame")
    
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id;
    private String title;
     private String genre;
    private String platform;
    private Double rating;
    private LocalDate releaseDate;
    private Double price;
    private String discountType;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public Double getRating() {
        return rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public String getDiscountType() {
        return discountType;
    }

    
    

    // set
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

}
