package com.example.mapstruct.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author：may
 * @date：2021年11月28日 21:31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long id;
    private String orderSn;
    private Date createTime;
    private String receiverAddress;
    //子对象映射Dto
    private MemberDTO memberDto;
    //子对象数组映射Dto
    private List<ProductDTO> productDtoList;
}
