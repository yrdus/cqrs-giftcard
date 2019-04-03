package pl.yrdus.giftcard.app.giftcard.command;

import pl.yrdus.giftcard.dm.giftcard.GiftCard;
import pl.yrdus.giftcard.inf.persistence.giftcard.GiftCardRepository;

public class CreateGiftCardCommandHandler implements CommandHandlerInterface<CreateGiftCardCommand> {

    private GiftCardRepository repository;
    private CreateGiftCardCommandValidator validator;

    public CreateGiftCardCommandHandler(GiftCardRepository repository, CreateGiftCardCommandValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    @Override
    public void handle(CreateGiftCardCommand command) {
        if(validator.validate(command)) {
            GiftCard giftCard;
            giftCard.
        }
    }
}
