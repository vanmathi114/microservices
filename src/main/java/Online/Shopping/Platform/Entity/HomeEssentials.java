package Online.Shopping.Platform.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
//@Document(collection="Electronics")
public class HomeEssentials extends Product {
    private String brand;
}
