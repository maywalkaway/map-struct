package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Course;
import com.example.mapstruct.domain.Student;
import com.example.mapstruct.domain.StudentVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author：may
 * @date：2021年11月28日 18:05
 */
@Mapper(componentModel = "spring")
public interface StudentMapperSpring {
    @Mapping(source = "gender.name", target = "gender")
    @Mapping(target = "birthday", dateFormat = "yyyy-MM-dd HH:mm:ss")
    StudentVO student2StudentVO(Student student);

    List<StudentVO> students2StudentVOs(List<Student> students);

    @Mapping(source = "student.gender.name", target = "gender")
    @Mapping(source = "student.birthday", target = "birthday", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "course.courseName", target = "course")
    @Mapping(source = "student.name", target = "name", defaultValue = "李斯")
    StudentVO studentAndCourse2StudentVO(Student student, Course course);
}
