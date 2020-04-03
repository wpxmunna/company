package freelancinghub.learnwithmunna.Controller;

import freelancinghub.learnwithmunna.Model.Company;
import freelancinghub.learnwithmunna.Repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Configuration
@RestController
public class CompanyController {
    @Autowired
    private CompanyRepo companyRepo;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Company>>getAll(){
        List<Company> companies=companyRepo.findAll();
        return new ResponseEntity<List<Company>>(companies,new HttpHeaders(), HttpStatus.OK);
    }
}
