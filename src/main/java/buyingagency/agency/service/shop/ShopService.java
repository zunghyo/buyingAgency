package buyingagency.agency.service.shop;

import buyingagency.agency.domain.shop.Shop;
import buyingagency.agency.repository.shop.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ShopService {

    private final ShopRepository shopRepository;

    /**
     * 쇼핑몰 등록
     */
    @Transactional
    public Long regist(Shop shop) {
        shopRepository.save(shop);
        return shop.getId();
    }

    /**
     * 쇼핑몰 조회
     */
    public Shop findShop(Long shopId) {
        return shopRepository.findOne(shopId);
    }

    public List<Shop> findShops(){
        return shopRepository.findAll();
    }
}
