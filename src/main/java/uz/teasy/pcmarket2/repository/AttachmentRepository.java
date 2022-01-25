package uz.teasy.pcmarket2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.teasy.pcmarket2.entity.Attachment;
import uz.teasy.pcmarket2.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "myList", excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
