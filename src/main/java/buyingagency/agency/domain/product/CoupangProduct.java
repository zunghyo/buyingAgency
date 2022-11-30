package buyingagency.agency.domain.product;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("coupang")
public class CoupangProduct extends Product{

    private String more;

}
