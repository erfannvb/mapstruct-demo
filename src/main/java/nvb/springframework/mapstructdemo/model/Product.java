package nvb.springframework.mapstructdemo.model;

import lombok.*;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Product {

    @Id
    private Long id;
    private String name;
    private String desc;
    private int quantity;
    private long price;
    private String itemId;

    private List<Item> items;

}
