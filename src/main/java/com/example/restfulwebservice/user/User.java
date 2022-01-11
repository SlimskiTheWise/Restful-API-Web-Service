package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value = {"password","name"})
@JsonFilter("UserInfo")
public class User {

    private Integer id;

    @Size(min=2)
    private String name;
    @Past
    private Date joinData;

//    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String ssn;
}
