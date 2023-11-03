package org.jpademo.jpademo.repository;

import java.util.List;

import org.jpademo.jpademo.entity.Gurdian;
import org.jpademo.jpademo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    // @Test
    // public void 
    // @Test
    // public void getStudents(){
    //     List<Student> list = studentRepository.findAll();

    //     System.out.println(list);
    // }
    // @Test
    // public void getStudentsWithGurdian(){

    //     Gurdian gurdian = Gurdian.builder()
    //                         .email("Yen@gmail.com")
    //                         .name("vijay")
    //                         .mobile("234234")
    //                         .build();

    //      Student student = Student.builder()
    //                         .emailId("Yela@gmail.com")
    //                         .firstName("Ynhs")
    //                         .lastName("Dulla")
    //                         .gurdian(gurdian)
    //                         .build();

    // studentRepository.save(student);
          
    // }

    // @Test
    // public void getTheDataByfirstName(){
        
    //     List<Student> data = studentRepository.findByFirstName("Yneohs");
    //     System.out.println(data);

    // }

}
