package com.demo.labmanagement.labmanagement.respositories;

import org.springframework.data.repository.CrudRepository;
import com.demo.labmanagement.labmanagement.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {    
}