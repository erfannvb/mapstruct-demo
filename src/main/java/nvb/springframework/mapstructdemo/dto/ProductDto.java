package nvb.springframework.mapstructdemo.dto;

import lombok.*;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {

    @Id
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId;

}
