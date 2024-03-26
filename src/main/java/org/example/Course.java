package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
public class Course {

    private int id;
    private String name;
    private Teacher teacher;
    private Student student;

    @With private String newName;
    @With private Teacher newTeacher;
    @With private Student newStudent;

}
