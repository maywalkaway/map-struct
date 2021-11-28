package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Member;
import com.example.mapstruct.domain.MemberDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author：may
 * @date：2021年11月28日 21:21
 */
@Mapper(componentModel = "spring")
public interface MemberMapper {

    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "phone", target = "phoneNumber")
    MemberDTO member2MemberDTO(Member member);
}
