package Online.Shopping.Platform.Service;

import Online.Shopping.Platform.Entity.SmartPhones;
import Online.Shopping.Platform.Exception.ProductNotFound;
import Online.Shopping.Platform.Repository.SmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartPhoneService {
    @Autowired
    SmartPhoneRepository smartPhoneRepository;


    public SmartPhones findSmartPhoneById(String Id) {
        return smartPhoneRepository.findById(Id)
                .orElseThrow(() -> new ProductNotFound("Smartphone with ID " + Id + " not found"));
    }

    public SmartPhones findSmartPhoneByName(String name) {
        return smartPhoneRepository.findByName(name).
                orElseThrow(() -> new ProductNotFound("Smartphone with name " + name + " not found"));
    }

    public SmartPhones addElectronicItem(SmartPhones smartPhones) {
        return smartPhoneRepository.save(smartPhones);
    }
}
