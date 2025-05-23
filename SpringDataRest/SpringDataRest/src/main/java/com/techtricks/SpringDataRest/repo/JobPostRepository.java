package com.techtricks.SpringDataRest.repo;

import com.techtricks.SpringDataRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@RepositoryRestResource
public interface JobPostRepository extends JpaRepository<JobPost, Integer> {


}