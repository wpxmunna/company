package freelancinghub.learnwithmunna.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String C_Name;

    @OneToMany
    @JsonBackReference
    private List<Company> companies;
    @OneToMany
    @JsonManagedReference
    private List<Product> products;

    public Category(List<Company> companies, List<Product> products) {
        this.companies = companies;
        this.products = products;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Category() {
    }

    public Category(String c_Name) {
        C_Name = c_Name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getC_Name() {
        return C_Name;
    }

    public void setC_Name(String c_Name) {
        C_Name = c_Name;
    }
}
