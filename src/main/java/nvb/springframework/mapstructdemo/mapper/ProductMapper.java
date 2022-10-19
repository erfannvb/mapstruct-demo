package nvb.springframework.mapstructdemo.mapper;

import nvb.springframework.mapstructdemo.dto.ProductDto;
import nvb.springframework.mapstructdemo.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper(imports = UUID.class)
public interface ProductMapper {

    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "product.desc", target = "description", defaultValue = "description")
    @Mapping(target = "itemId", expression = "java(UUID.randomUUID().toString())")
    ProductDto modelToDto(Product product);

    @InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto);

}
