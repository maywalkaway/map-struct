package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：may
 * @date：2021年11月28日 18:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private String courseName;
    private int sortNo;
    private long id;

}
