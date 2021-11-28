package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：may
 * @date：2021年11月28日 21:19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    //与Member类型不同的属性
    private String birthday;
    //与Member名称不同的属性
    private String phoneNumber;
    private String icon;
    private Integer gender;
}
