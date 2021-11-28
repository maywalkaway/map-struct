package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author：may
 * @date：2021年11月28日 17:53
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private GenderEnum gender;
    private Double height;
    private Date birthday;
    private String address;
}
