package com.exercise.productreview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Field required")
    @Size(min=1, message = "Name is required")
    @Pattern(regexp ="^[a-zA-Z\\s]+$", message = "Name must contain only letters")
    private String name;
    @NotNull(message = "Field required")
    @Size(min=1, message = "Email is required")
    private String email;
    @NotNull(message = "Field required")
    @Pattern(regexp ="^[0-9]|10$", message = "Rate must be a number between 0 and 10")
    private String rating;
    @NotNull(message = "Field required")
    @Size(min=1, message = "Comment is required")
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
