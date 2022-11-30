package buyingagency.agency.domain.product;

import buyingagency.agency.domain.common.DataInfo;
import buyingagency.agency.domain.member.Member;
import buyingagency.agency.domain.shop.Category;
import buyingagency.agency.domain.shop.Shop;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private String name;
    private Long price;

    @Lob
    private String description;

    @Embedded
    private DataInfo dataInfo;

}
