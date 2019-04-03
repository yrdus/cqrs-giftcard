package pl.yrdus.giftcard.inf.persistance.giftcard;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.yrdus.giftcard.dm.giftcard.GiftCard;

public interface GiftCardRepository extends JpaRepository<GiftCard, Integer> {
}
