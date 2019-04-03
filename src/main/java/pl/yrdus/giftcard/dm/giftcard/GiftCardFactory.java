package pl.yrdus.giftcard.dm.giftcard;

import org.springframework.beans.factory.annotation.Autowired;
import pl.yrdus.giftcard.inf.utils.CodeGenerator;


public class GiftCardFactory {

    @Autowired
    private CodeGenerator codeGenerator;

    private GiftCard giftCard;

    public double value;

    public GiftCardFactory(double value) {
        code = codeGenerator.getAlphaNumericCode();
        giftCard = new GiftCard();
    }
}
