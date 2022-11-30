package buyingagency.agency.domain.shop;

import buyingagency.agency.domain.common.DataInfo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Shop {

    @Id
    @GeneratedValue
    @Column(name = "shop_id")
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ShopType type;

    @Enumerated(EnumType.STRING)
    private CountryType county;

    private String url;

    @Embedded
    private DataInfo dataInfo;

}
