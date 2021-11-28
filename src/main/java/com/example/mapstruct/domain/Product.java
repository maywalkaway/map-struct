package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author：may
 * @date：2021年11月28日 19:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long id;
    private String productSn;
    private String name;
    private String subTitle;
    private String brandName;
    private BigDecimal price;
    private Integer count;
    private LocalDateTime createTime;
}
