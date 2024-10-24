package Online.Shopping.Platform.Repository;

import Online.Shopping.Platform.Entity.SmartPhones;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SmartPhoneRepository extends MongoRepository<SmartPhones, String> {
    Optional<SmartPhones> findById(String Id);
    Optional<SmartPhones> findByName(String Name);
}
