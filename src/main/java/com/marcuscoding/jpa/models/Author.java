package com.marcuscoding.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author {
    @Id
    @GeneratedValue
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_sequence")
    //@SequenceGenerator(name = "author_sequence", sequenceName = "author_sequence", allocationSize = 1)
    //this gen-value work with primary key
    //why use Integer, but not int
    //because hibernate will check, if got value will use the value
    //0 should not be the default for ID
    private Integer id;
    //    @Column(name = "f_name", length = 35)
    private String firstName;
    private String lastName;
    //    @Column(
    //            unique = true,
    //            nullable = false
    //    )
    private String email;
    private int age;
    //    @Column(updatable = false)
    //    private LocalDateTime createdAt;
    //    @Column(insertable = false)
    //    private LocalDateTime lastModified;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
