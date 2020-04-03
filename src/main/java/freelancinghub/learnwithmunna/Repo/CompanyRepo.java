package freelancinghub.learnwithmunna.Repo;

import freelancinghub.learnwithmunna.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Integer> {
}
