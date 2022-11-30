package buyingagency.agency.domain.product;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("eleventhst")
public class EleventhstProduct extends Product{

    private String more;
}
