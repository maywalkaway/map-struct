package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：may
 * @date：2021年11月28日 18:04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO {
    private String name;
    private int age;
    private String gender;
    private Double height;
    private String birthday;
    private String course;
}
