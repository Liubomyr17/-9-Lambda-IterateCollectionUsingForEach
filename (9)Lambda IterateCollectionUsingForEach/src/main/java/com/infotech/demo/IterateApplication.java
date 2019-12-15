package com.infotech.demo;

import com.infotech.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class IterateApplication {

    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("Bean", 45));
        stuList.add(new Student("Andrew", 40));
        stuList.add(new Student("Martin", 42));

        stuList.forEach(System.out::println);
    }
}

