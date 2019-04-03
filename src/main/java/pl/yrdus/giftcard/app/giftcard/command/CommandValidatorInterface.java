package pl.yrdus.giftcard.app.giftcard.command;

public interface CommandValidatorInterface<T extends CommandInterface> {
    public boolean validate(T command);
}
