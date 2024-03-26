package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private int id;
    private String name;
    private String address;
    private double grade;

    @With private String newName;
    @With private String newAddress;
    @With private double newGrade;

}
