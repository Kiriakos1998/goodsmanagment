package goodsmanagment.domain.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
