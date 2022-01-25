package uz.teasy.pcmarket2.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.teasy.pcmarket2.projection.CustomUser;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UserRepository {
}
