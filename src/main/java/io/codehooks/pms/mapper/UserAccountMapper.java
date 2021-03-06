package io.codehooks.pms.mapper;

import io.codehooks.pms.dto.UserAccountDto;
import io.codehooks.pms.entity.UserAccount;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface UserAccountMapper {

    UserAccountDto fromUserAccount(UserAccount userAccount);

    @InheritInverseConfiguration(name = "fromUserAccount")
    UserAccount fromUserAccountDto(UserAccountDto userAccount);

    @InheritInverseConfiguration(name = "fromUserAccount")
    UserAccount updateUserAccount(UserAccountDto dto, @MappingTarget UserAccount userAccount);
}
