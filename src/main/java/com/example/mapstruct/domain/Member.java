package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author：may
 * @date：2021年11月28日 21:19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Date birthday;
    private String phone;
    private String icon;
    private Integer gender;
}
