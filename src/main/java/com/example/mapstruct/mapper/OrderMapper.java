package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Order;
import com.example.mapstruct.domain.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author：may
 * @date：2021年11月28日 21:33
 */
@Mapper(componentModel = "spring", uses = {MemberMapper.class, ProductMapper.class})
public interface OrderMapper {

    @Mapping(source = "member", target = "memberDto")
    @Mapping(source = "productList", target = "productDtoList")
    OrderDTO order2OrderDTO(Order order);
}
