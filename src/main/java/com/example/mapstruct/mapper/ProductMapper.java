package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Product;
import com.example.mapstruct.domain.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author：may
 * @date：2021年11月28日 19:38
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "id", constant = "11L")
    @Mapping(target = "productSn", expression = "java(cn.hutool.core.util.IdUtil.fastSimpleUUID())")
    @Mapping(source = "count", target = "count", defaultValue = "22")
    @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    ProductDTO product2ProductDto(Product product);
}
