package pl.yrdus.giftcard.inf.persistence.giftcard;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.yrdus.giftcard.dm.giftcard.GiftCard;

import java.util.Collection;

public interface GiftCardRepository extends JpaRepository<GiftCard, Integer> {
    Collection<GiftCard> findAllByCode(String code);
}
