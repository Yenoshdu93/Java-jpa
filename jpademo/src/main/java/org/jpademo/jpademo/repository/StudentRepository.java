package org.jpademo.jpademo.repository;

import java.util.List;

import org.jpademo.jpademo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

    public List<Student> findByFirstName(String firstName);
    // public List<Student> findByLastNameNotNull(String lastName);
    // public List<Student> findByGurdianName(String name);
    // public List<Student> findByFirstNameContaining(String firstName);
    
    // @Query("select s from Student s where s.emailId = ?1")
    // public List<Student> getTheDetailsByEmailAddress(String emailId);

    // @Query(
    //     value = "select * from studentstbl s where s.email_address = ?1",
    //     nativeQuery = true
    //     )
    // public List<Student> getThedetails(String emailId);

    // @Query(
    //     value = "select * from studentstbl s where s.email_address = :emailId",
    //     nativeQuery = true
    //     )
    // public List<Student> getThedetailsNamedParam(@Param("emailId") String emailId);
    // @Modifying
    // @Transactional
    // @Query(
    //     value = "update stuentstbl set first_name = ?1 where email_address = ?2",
    //     nativeQuery = true
    // )
    // public int updateNameByEmail(String firstName,String emailId);
}
