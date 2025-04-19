package goodsmanagment.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Good {

    private Long id;
    private UUID uuid;
    private Name name;
    private String description;
    private Barcode barcode;
    private Price price;

}