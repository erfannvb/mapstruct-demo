package nvb.springframework.mapstructdemo.model;

import lombok.*;

import javax.persistence.*;

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

}
