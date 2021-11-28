package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：may
 * @date：2021年11月28日 19:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    //使用常量
    private Long id;
    //使用表达式生成属性
    private String productSn;
    private String name;
    private String subTitle;
    private String brandName;
    private double price;
    //使用默认值
    private Integer count;
    private String createTime;
}
