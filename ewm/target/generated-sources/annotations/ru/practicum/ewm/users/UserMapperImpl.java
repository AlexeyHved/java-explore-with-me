package ru.practicum.ewm.users;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-22T14:21:38+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toEntity(NewUserRequest newUserRequest) {
        if ( newUserRequest == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setName( newUserRequest.getName() );
        userEntity.setEmail( newUserRequest.getEmail() );

        return userEntity;
    }

    @Override
    public UserDto toUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userEntity.getId() );
        userDto.setName( userEntity.getName() );
        userDto.setEmail( userEntity.getEmail() );

        return userDto;
    }

    @Override
    public UserShortDto toUserShortDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserShortDto userShortDto = new UserShortDto();

        userShortDto.setId( userEntity.getId() );
        userShortDto.setName( userEntity.getName() );

        return userShortDto;
    }
}
