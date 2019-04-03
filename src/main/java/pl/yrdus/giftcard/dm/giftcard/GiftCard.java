package pl.yrdus.giftcard.dm.giftcard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class GiftCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @NotNull
    public String code;
    @NotNull
    public double value;
    @NotNull
    public boolean active = true;
    @NotNull
    public Date expiresAt;
    @NotNull
    public Date createdAt;
    @NotNull
    public Date modifiedAt;
}
