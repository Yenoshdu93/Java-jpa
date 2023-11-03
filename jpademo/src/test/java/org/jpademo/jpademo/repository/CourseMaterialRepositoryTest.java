package org.jpademo.jpademo.repository;

import org.jpademo.jpademo.entity.Course;
import org.jpademo.jpademo.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveMaterial(){

        Course course = Course.builder()
                            .title("Yneosh")
                            .credits("2")
                            .build();

        CourseMaterial material = CourseMaterial.builder()
                                    .url("How are you brother")
                                    .course(course)
                                    .build();
        courseMaterialRepository.save(material);
    }

}
