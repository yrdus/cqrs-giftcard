package pl.yrdus.giftcard.ui.rest.giftcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.yrdus.giftcard.inf.persistence.giftcard.GiftCardRepository;

@RestController
@RequestMapping("/")
public class GiftCardController {

    @Autowired
    private GiftCardRepository repository;

    @GetMapping("generate")
    public ResponseEntity generate(@RequestParam(value = "value", defaultValue = "0") Integer value) {
        return  ResponseEntity.ok(value);
    }

    @GetMapping("activate")
    public ResponseEntity activate(@RequestParam(value = "id", defaultValue = "0") Integer id) {
        return  ResponseEntity.ok(id);
    }
}
