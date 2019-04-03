//package pl.yrdus.giftcard;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import pl.yrdus.giftcard.app.giftcard.command.CommandHandlerInterface;
//import pl.yrdus.giftcard.app.giftcard.command.CreateGiftCardCommand;
//import pl.yrdus.giftcard.app.giftcard.command.CreateGiftCardCommandHandler;
//import pl.yrdus.giftcard.app.giftcard.command.CreateGiftCardCommandValidator;
//import pl.yrdus.giftcard.inf.persistence.giftcard.GiftCardRepository;
//
//@Configuration
//public class Config {
//    @Bean
//    public CommandHandlerInterface<CreateGiftCardCommand> giftCardCommandHandler(GiftCardRepository repository, CreateGiftCardCommandValidator validator) {
//        return new CreateGiftCardCommandHandler(repository, validator);
//    }
//}
