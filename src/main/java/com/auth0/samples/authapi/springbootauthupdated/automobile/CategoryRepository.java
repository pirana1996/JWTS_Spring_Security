package com.auth0.samples.authapi.springbootauthupdated.automobile;

import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
