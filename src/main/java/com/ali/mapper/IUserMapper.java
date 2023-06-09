package com.ali.mapper;

import com.ali.dto.request.UserResgisterRequestDto;
import com.ali.dto.response.LoginResponseDto;
import com.ali.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    User toUser(final UserResgisterRequestDto dto);

    LoginResponseDto toLoginResponseDto(final User user);


}
