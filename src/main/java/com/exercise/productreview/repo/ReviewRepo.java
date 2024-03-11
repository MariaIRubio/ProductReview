package com.exercise.productreview.repo;

import com.exercise.productreview.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, Long> {
}
