package nvb.springframework.mapstructdemo.controller;

import lombok.AllArgsConstructor;
import nvb.springframework.mapstructdemo.dto.ProductDto;
import nvb.springframework.mapstructdemo.mapper.ProductMapper;
import nvb.springframework.mapstructdemo.model.Product;
import nvb.springframework.mapstructdemo.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto) {
        return new ResponseEntity<>(productRepository.save(productMapper.dtoToModel(productDto)), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> findAll() {
        return new ResponseEntity<>(productMapper.modelsToDtos(productRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(productMapper.modelToDto(productRepository.findById(id).get()), HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        ProductDto productDto = productMapper.modelToDto(productRepository.findById(id).get());
        productRepository.deleteById(productDto.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
