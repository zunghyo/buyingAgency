package buyingagency.agency.service.product;

import buyingagency.agency.domain.product.Product;
import buyingagency.agency.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository productRepository;

    /**
     * 상품 생성
     */
    @Transactional
    public Long create(Product product) {
        productRepository.save(product);
        return product.getId();
    }


    /**
     * 상품 조회
     */
    public Product findProduct(Long productId) {
        return productRepository.findOne(productId);
    }

    public List<Product> findProducts(){
        return productRepository.findAll();
    }
}
