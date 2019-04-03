package pl.yrdus.giftcard.inf.utils;

import pl.yrdus.giftcard.inf.persistence.giftcard.GiftCardRepository;

import java.util.ArrayList;
import java.util.Collection;

public class CodeGenerator {

    private GiftCardRepository repository;

    private static final Integer CODE_LENGTH = 10;
    private static final String CODE_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";

    public String getAlphaNumericCode()
    {
        Collection collection;
        String code = "";
        do {
            StringBuilder sb = new StringBuilder(CODE_LENGTH);

            for (int i = 0; i < CODE_LENGTH; i++) {
                int index
                        = (int)(CODE_POOL.length()
                        * Math.random());
                sb.append(CODE_POOL
                        .charAt(index));
            }

            code = sb.toString();
            collection = repository.findAllByCode(code);
        } while (!collection.isEmpty());

        return code;
    }
}
