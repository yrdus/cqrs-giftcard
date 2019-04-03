package pl.yrdus.giftcard.app.giftcard.command;

public class CreateGiftCardCommandValidator implements CommandValidatorInterface<CreateGiftCardCommand>{

    @Override
    public boolean validate(CreateGiftCardCommand command) {
        if(command.getValue() instanceof Double && command.getValue() > 0) {
            return true;
        }
        return false;
    }
}
