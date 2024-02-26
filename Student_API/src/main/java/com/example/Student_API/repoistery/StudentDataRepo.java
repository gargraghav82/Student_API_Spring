package com.example.Student_API.repoistery;

import com.example.Student_API.models.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component
public class StudentDataRepo {
    private Map<String , studentDetailsModel> dataMap;

    public StudentDataRepo(){
        dataMap = new HashMap<>();
    }

    public studentDetailsModel findByID(final String id){
        return dataMap.get(id);
    }
    
    public String AddStudentData(final String Name , final String Age , final String Adhar , final String University){
        studentDetailsModel newStudent = new studentDetailsModel(Name, Adhar, University, Age);
        String UniqueId = UUID.randomUUID().toString();
        dataMap.put(UniqueId , newStudent);
        return UniqueId;
    }

}
