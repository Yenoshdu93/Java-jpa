package org.jpademo.jpademo.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(
        name = "course_seq",
        sequenceName = "course_seq",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "course_seq"
    )
    private Long courseId;
    private String title;
    private String credits;

    @OneToOne(
        mappedBy = "course"
    )
    private CourseMaterial courseMaterial;

    @ManyToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
        name = "teacher_id",
        referencedColumnName = "teacherId"
    )
    private Teacher teacher;

    @ManyToOne
    @JoinTable(
        name = "std_mapwith_cour",
        joinColumns = @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
        ),
        inverseJoinColumns = @JoinColumn(
            name = "student_id",
            referencedColumnName = "studentId"
        )
    )
    List<Student> student;
    
}
