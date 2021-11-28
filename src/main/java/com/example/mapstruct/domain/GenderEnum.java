package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author：may
 * @date：2021年11月28日 18:03
 */
@AllArgsConstructor
@Getter
public enum GenderEnum {
    Male("1", "男"),
    Female("0", "女");

    private String code;
    private String name;
}
