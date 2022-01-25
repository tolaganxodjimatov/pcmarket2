package uz.teasy.pcmarket2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.pcmarket2.entity.Category;


@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    Integer getParentCategory();
}
