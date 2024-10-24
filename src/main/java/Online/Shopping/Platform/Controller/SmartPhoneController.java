package Online.Shopping.Platform.Controller;

import Online.Shopping.Platform.Entity.SmartPhones;
import Online.Shopping.Platform.Service.SmartPhoneService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/electronics/smartPhones")
public class SmartPhoneController {

    private SmartPhoneService smartPhoneService;
//
//    @Autowired
//    public SmartPhoneController(SmartPhoneService smartPhoneService) {
//        this.smartPhoneService = smartPhoneService;
//    }

    // Endpoint to fetch electronics by brand
    @GetMapping({"/Id"})
    public SmartPhones getSmartPhone(@PathVariable String Id) {
        return smartPhoneService.findSmartPhoneById(Id);
    }

    @GetMapping({"/{name}"})
    public SmartPhones getSmartPhoneByName(@PathVariable String name) {
        return smartPhoneService.findSmartPhoneByName(name);
    }

    @PostMapping("/add")
    public SmartPhones addElectronicItem(@RequestBody SmartPhones newItem) {
        return smartPhoneService.addElectronicItem(newItem);
    }

//    @PostMapping("/purchase")
//    public ResponseEntity<Payment> purchaseSmartphone(@RequestParam BigDecimal amount, @RequestParam String currency) {
//        Payment payment = smartPhoneService.purchaseSmartphone(amount, currency);
//        return ResponseEntity.ok(payment);
//    }
}