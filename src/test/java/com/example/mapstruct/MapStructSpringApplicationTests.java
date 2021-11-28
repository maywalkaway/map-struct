package com.example.mapstruct;

import cn.hutool.core.collection.ListUtil;
import com.example.mapstruct.domain.*;
import com.example.mapstruct.mapper.MemberMapper;
import com.example.mapstruct.mapper.OrderMapper;
import com.example.mapstruct.mapper.ProductMapper;
import com.example.mapstruct.mapper.StudentMapperSpring;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MapStructSpringApplicationTests {

    @Autowired
    StudentMapperSpring studentMapperSpring;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    MemberMapper memberMapper;
    @Autowired
    OrderMapper orderMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        Student student = Student.builder().name("小明").age(23).gender(GenderEnum.Male).height(175.12).birthday(new Date()).address("武汉市").build();
        StudentVO studentVO = studentMapperSpring.student2StudentVO(student);
        System.out.println(studentVO);
    }

    @Test
    void test2() {
        Student student = Student.builder().name("小明").age(23).gender(GenderEnum.Male).height(175.12).birthday(new Date()).build();
        List<Student> students = ListUtil.of(student);
        List<StudentVO> studentVOs = studentMapperSpring.students2StudentVOs(students);
        System.out.println(studentVOs);
    }

    @Test
    void test3() {
        Student student = Student.builder().name("小明").age(23).gender(GenderEnum.Male).height(175.12).birthday(new Date()).address("武汉市").build();
        Course course = Course.builder().id(111).courseName("语文").sortNo(001).build();
        StudentVO studentVO = studentMapperSpring.studentAndCourse2StudentVO(student, course);
        System.out.println(studentVO);
    }

    @Test
    void test4() {
        Product product = Product.builder().name("洗发露").brandName("清扬").subTitle("宝洁").price(new BigDecimal(36.8)).createTime(LocalDateTime.now()).build();
        ProductDTO productDto = productMapper.product2ProductDto(product);
        System.out.println(productDto);
    }

    @Test
    void test5() {
        Member member = Member.builder().id(1L).gender(1).birthday(new Date()).username("test").password("test").nickname("小六").icon("dfs").phone("13163276445").build();
        MemberDTO memberDTO = memberMapper.member2MemberDTO(member);
        System.out.println(memberDTO);
    }

    @Test
    void test6() {
        Member member = Member.builder().id(1L).gender(1).birthday(new Date()).username("test").password("test").nickname("小六").icon("dfs").phone("13163276445").build();
        Product product = Product.builder().name("洗发露").brandName("清扬").subTitle("宝洁").price(new BigDecimal(36.8)).createTime(LocalDateTime.now()).build();
        Order order = Order.builder().id(2L).orderSn("20211128").createTime(new Date()).receiverAddress("北京市朝阳区").member(member).productList(ListUtil.of(product)).build();
        OrderDTO orderDTO = orderMapper.order2OrderDTO(order);
        System.out.println(orderDTO);
    }

}
