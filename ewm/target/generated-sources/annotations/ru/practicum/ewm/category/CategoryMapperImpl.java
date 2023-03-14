package ru.practicum.ewm.category;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-22T14:21:39+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.15 (Amazon.com Inc.)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryEntity toEntity(NewCategoryDto newCategoryDto) {
        if ( newCategoryDto == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setName( newCategoryDto.getName() );

        return categoryEntity;
    }

    @Override
    public CategoryEntity toEntity(long catId, NewCategoryDto newCategoryDto) {
        if ( newCategoryDto == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        if ( newCategoryDto != null ) {
            categoryEntity.setName( newCategoryDto.getName() );
        }
        categoryEntity.setId( catId );

        return categoryEntity;
    }

    @Override
    public CategoryDto toDto(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( categoryEntity.getId() );
        categoryDto.setName( categoryEntity.getName() );

        return categoryDto;
    }
}
