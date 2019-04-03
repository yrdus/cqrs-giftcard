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
    private String code;
    @NotNull
    private double value;
    @NotNull
    private boolean active = true;
    @NotNull
    private Date expiresAt;
    @NotNull
    private Date createdAt;
    @NotNull
    private Date modifiedAt;
    private Date usedAt = null;

    public GiftCard(@NotNull String code, @NotNull double value, @NotNull boolean active, @NotNull Date expiresAt, @NotNull Date createdAt, @NotNull Date modifiedAt,Date usedAt) {
        this.code = code;
        this.value = value;
        this.active = active;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.usedAt = usedAt;
    }
}
