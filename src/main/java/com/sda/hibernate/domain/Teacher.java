package com.sda.hibernate.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="teacher_gen")
    @SequenceGenerator(name="teacher_gen", sequenceName = "teacher_seq", allocationSize = 1)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="hire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate hireDate;

    @Column(name="salary")
    private double salary;
}
