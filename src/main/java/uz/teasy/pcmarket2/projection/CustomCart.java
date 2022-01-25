package uz.teasy.pcmarket2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.pcmarket2.entity.Cart;
import uz.teasy.pcmarket2.entity.Product;
import uz.teasy.pcmarket2.entity.User;


import java.sql.Timestamp;

@Projection(types = Cart.class)
public interface CustomCart {

    Integer getId();

    String getName();

    Product getProduct();

    Integer getAmount();

    User getUser();

    Timestamp getDate();

    String getOrder_status();
}
