package org.jpademo.jpademo.repository;

import org.jpademo.jpademo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    
}
