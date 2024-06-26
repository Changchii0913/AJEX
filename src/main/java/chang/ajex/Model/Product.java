package chang.ajex.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    private String code;    // 產品編號

    private String model;
    private String name;    // 產品名稱
    private String line;    // 產品類型
    private String scale;   // 比例
    private int qty;        // 庫存
    private double msrp;    // 售價
    // private String[]  image;   // 照片路徑 /images/product/S10-1234/1.png
}
