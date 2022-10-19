package nvb.springframework.mapstructdemo.dto;

import lombok.*;
import nvb.springframework.mapstructdemo.model.Item;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class ProductDto {

    @Id
    private Long id;
    private String name;
    private String description;
    private String quantity;
    private long price;
    private String itemId;

    private List<Item> itemsList;

}
