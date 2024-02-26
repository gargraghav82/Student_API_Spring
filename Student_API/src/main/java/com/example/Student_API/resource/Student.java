package com.example.Student_API.resource;

import com.example.Student_API.models.*;
import com.example.Student_API.repoistery.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Student")
public class Student {
    @Autowired

    private StudentDataRepo StudentDataRepo;

    @PostMapping("/create/{Name}/{Age}/{Adhar}/{University}")
    public String CreateStudent(@PathVariable String Name , @PathVariable String Age , @PathVariable String Adhar , @PathVariable String University){
        return StudentDataRepo.AddStudentData(Name, Age, Adhar, University);
    }

    @GetMapping("/get/{id}")
    public studentDetailsModel getStudent(@PathVariable String id){
        return StudentDataRepo.findByID(id);
    }
}
