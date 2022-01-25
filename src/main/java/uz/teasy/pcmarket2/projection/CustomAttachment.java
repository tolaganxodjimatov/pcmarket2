package uz.teasy.pcmarket2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.teasy.pcmarket2.entity.Attachment;


@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    String getSize();

    String getContent_type();
}
