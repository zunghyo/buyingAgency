package buyingagency.agency.service.shop;

import buyingagency.agency.domain.shop.CountryType;
import buyingagency.agency.domain.shop.Shop;
import buyingagency.agency.repository.shop.ShopRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ShopServiceTest {

    @Autowired ShopService shopService;
    @Autowired ShopRepository shopRepository;

    @Test
    public void 쇼핑몰_등록(){
        //given
        Shop shop = new Shop();
        shop.setName("쿠팡");
        shop.setCounty(CountryType.KOREA);

        //when
        Long savedId = shopService.regist(shop);

        //then
        Shop findShop = shopService.findShop(savedId);
        assertEquals(shop, shopRepository.findOne(savedId));
    }
}