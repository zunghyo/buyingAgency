package buyingagency.agency.domain.product;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("gmarket")
public class GmarketProduct extends Product{

    private String more;
}
