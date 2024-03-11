package com.exercise.productreview.controller;

import com.exercise.productreview.model.Review;
import com.exercise.productreview.repo.ReviewRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReviewController {

    @Autowired
    ReviewRepo reviewRepo;

    @GetMapping("/review")
    public String makeReview(Model model){
        model.addAttribute("review", new Review());
        return "review-form";
    }

    @PostMapping("/processForm")
    public String processData(@Valid @ModelAttribute("review") Review review, BindingResult binder){
        if(binder.hasErrors()){
            return "review-form";
        }else{
            reviewRepo.save(review);
            return "confirmation";
        }
    }
}
