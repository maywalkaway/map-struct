package com.example.mapstruct;

import cn.hutool.core.collection.ListUtil;
import com.example.mapstruct.domain.Course;
import com.example.mapstruct.domain.GenderEnum;
import com.example.mapstruct.domain.Student;
import com.example.mapstruct.domain.StudentVO;
import com.example.mapstruct.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class MapStructApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        Student student = Student.builder().name("小明").age(23).gender(GenderEnum.Male).height(175.12).birthday(new Date()).address("武汉市").build();
        StudentVO studentVO = StudentMapper.INSTANCE.student2StudentVO(student);
        System.out.println(studentVO);
    }

    @Test
    void test2() {
        Student student = Student.builder().name("小明").age(23).gender(GenderEnum.Male).height(175.12).birthday(new Date()).build();
        List<Student> students = ListUtil.of(student);
        List<StudentVO> studentVOs = StudentMapper.INSTANCE.students2StudentVOs(students);
        System.out.println(studentVOs);
    }

    @Test
    void test3() {
        Student student = Student.builder().name("小明").age(23).gender(GenderEnum.Male).height(175.12).birthday(new Date()).address("武汉市").build();
        Course course = Course.builder().id(111).courseName("语文").sortNo(001).build();
        StudentVO studentVO = StudentMapper.INSTANCE.studentAndCourse2StudentVO(student, course);
        System.out.println(studentVO);
    }

}
