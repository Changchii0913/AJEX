package chang.ajex.Service;

import chang.ajex.DAO.ProductRepository;
import chang.ajex.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProduct() {
        // 無參數呼叫 不允許
        return productRepository.getProductAll();
    }

    public List<Product> getProductById(String id) {
        // 進行判斷 或是邏輯管理
        // 紀錄 查詢時間 哪一個客戶
        return productRepository.getProductById(id);
    }
    public List<Product> getProductByScale(String scale) {
        // 進行判斷 或是邏輯管理
        // 紀錄 查詢時間 哪一個客戶
        return productRepository.getProductByScale(scale);
    }
}
