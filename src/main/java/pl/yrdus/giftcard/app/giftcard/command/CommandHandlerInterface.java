package pl.yrdus.giftcard.app.giftcard.command;

public interface CommandHandlerInterface<T extends CommandInterface> {
    public void handle(T command);
}
