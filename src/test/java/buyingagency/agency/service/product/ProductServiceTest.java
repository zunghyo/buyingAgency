package buyingagency.agency.service.product;

import buyingagency.agency.domain.product.CoupangProduct;
import buyingagency.agency.domain.product.Product;
import buyingagency.agency.repository.product.ProductRepository;
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
public class ProductServiceTest {

    @Autowired ProductService productService;
    @Autowired ProductRepository productRepository;

    @Test
    public void 상품_생성(){
        //given
        CoupangProduct product = new CoupangProduct();
        product.setName("애플워치");

        //when
        Long savedId = productService.create(product);

        //then
        assertEquals(product, productRepository.findOne(savedId));
    }
}