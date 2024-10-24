package Online.Shopping.Platform.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String id;

    private String name;
    private String catagory;
    private int stock;
    private int cost;
    private String brand;
    private String model;


}
