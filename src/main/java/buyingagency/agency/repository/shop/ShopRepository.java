package buyingagency.agency.repository.shop;

import buyingagency.agency.domain.member.Member;
import buyingagency.agency.domain.shop.Shop;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ShopRepository {

    private final EntityManager em;

    public void save(Shop shop){
        em.persist(shop);
    }

    public Shop findOne(Long shopId){
        return em.find(Shop.class, shopId);
    }

    public List<Shop> findAll(){
        return em.createQuery("select s from shop s", Shop.class)
                .getResultList();
    }
}
