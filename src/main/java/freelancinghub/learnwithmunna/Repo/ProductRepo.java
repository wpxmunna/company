package freelancinghub.learnwithmunna.Repo;

import freelancinghub.learnwithmunna.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
