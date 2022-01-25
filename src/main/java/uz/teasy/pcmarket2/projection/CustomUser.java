package uz.teasy.pcmarket2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.pcmarket2.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFullName();

    String getPhoneNumber();

    String getPassword();

    boolean getIs_admin();

    boolean getActive();
}
