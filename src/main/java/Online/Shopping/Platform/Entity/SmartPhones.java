package Online.Shopping.Platform.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Smartphones")
public class SmartPhones extends Product {

    public SmartPhones(String id, String name, String catagory, int stock, int cost, String brand, String Model) {
        super.setId(id);
        super.setName(name);
        super.setCatagory(catagory);
        super.setStock(stock);
        super.setCost(cost);
        super.setBrand(brand);
        super.setModel(Model);
    }

    public SmartPhones(){

    }

}