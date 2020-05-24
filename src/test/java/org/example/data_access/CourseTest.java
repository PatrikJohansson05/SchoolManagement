package org.example.data_access;

import org.example.model.Course;
import org.example.model.Student;
import org.junit.Before;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CourseTest {
    private CourseDao test;

    public static List<Course> coursesListTest(){
        return Arrays.asList(
                new Course("Programming - Java", LocalDate.parse("2020-07-05"), 30),
                new Course("Programming - C#", LocalDate.parse("2020-08-10"), 30),
                new Course("Math", LocalDate.parse("2020-09-23"), 23)
        );
    }

    public static List<Student> studentsListTest(){
        return Arrays.asList(
                new Student("Test Testsson", "test.testsson@gmail.com", "Växjö"),
                new Student("Test Testsson2", "test.testsson2@gmail.com", "Alvesta"),
                new Student("Test Testsson3", "test.testsson3@live.com", "Stockholm")
        );
    }

    private Student test1;
    private Student test2;
    private Student test3;

    private Course courseTest1;
    private Course courseTest2;
    private Course courseTest3;

    @Before
    public void setUp() throws Exception{
        Student test1 = studentsListTest().get(0);
        Student test2 = studentsListTest().get(1);
        Student test3 = studentsListTest().get(2);

        Course courseTest1 = coursesListTest().get(0);
        Course courseTest2 = coursesListTest().get(1);
        Course courseTest3 = coursesListTest().get(2);

        courseTest1.register();

    }
}
