package com.shush.mainPackge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shush.mainPackge.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {


}
