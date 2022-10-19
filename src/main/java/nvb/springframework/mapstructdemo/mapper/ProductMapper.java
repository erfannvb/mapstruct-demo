package nvb.springframework.mapstructdemo.mapper;

import nvb.springframework.mapstructdemo.dto.ProductDto;
import nvb.springframework.mapstructdemo.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface ProductMapper {

    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "product.desc", target = "description", defaultValue = "description")
    ProductDto modelToDto(Product product);

    List<ProductDto> modelsToDtos(List<Product> products);

    @InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto);

}
