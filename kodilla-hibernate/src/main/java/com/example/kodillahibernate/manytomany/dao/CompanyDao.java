package com.example.kodillahibernate.manytomany.dao;

import com.example.kodillahibernate.manytomany.Employee;
import com.example.kodillahibernate.manytomany.facade.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    List<Company> findCompanyByNameContains(String companyName);
    List<Employee> findCompanyByEmployeesContains(String name, String secondName);

}