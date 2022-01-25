package uz.teasy.pcmarket2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.pcmarket2.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getPhoto_id();

    String getCode();

    Integer getPrice();

    Integer getAmount();

    User getAdmin_id();

    boolean getActive();
}
