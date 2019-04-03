package pl.yrdus.giftcard.app.giftcard.command;

import org.springframework.beans.factory.annotation.Autowired;
import pl.yrdus.giftcard.inf.persistence.giftcard.GiftCardRepository;

public class CreateGiftCardCommand implements CommandInterface{

    private double value;

    public CreateGiftCardCommand(double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
