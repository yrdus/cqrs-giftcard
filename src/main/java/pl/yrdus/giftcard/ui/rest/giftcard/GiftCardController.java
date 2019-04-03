package pl.yrdus.giftcard.ui.rest.giftcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.yrdus.giftcard.dm.giftcard.GiftCard;
import pl.yrdus.giftcard.inf.persistance.giftcard.GiftCardRepository;

@RestController
@RequestMapping("/")
public class GiftCardController {

    @Autowired
    private GiftCardRepository repository;

    @GetMapping("create")
    public ResponseEntity createAction(@RequestBody GiftCard giftCard) {
        repository.save(giftCard);
        return  ResponseEntity.ok("Success");
    }
}
