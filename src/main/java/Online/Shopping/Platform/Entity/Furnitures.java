package Online.Shopping.Platform.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
//@Document(collection="HomeEssentials")
public class Furnitures extends Product {
    private String brand;
}
