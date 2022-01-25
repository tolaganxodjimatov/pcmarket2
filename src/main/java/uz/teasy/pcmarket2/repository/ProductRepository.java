package uz.teasy.pcmarket2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.teasy.pcmarket2.entity.Product;
import uz.teasy.pcmarket2.projection.CustomProduct;

@RepositoryRestResource(path = "product", collectionResourceRel = "muList", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
