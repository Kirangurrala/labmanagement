package com.demo.labmanagement.labmanagement.respositories;

import org.springframework.data.repository.CrudRepository;
import com.demo.labmanagement.labmanagement.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}