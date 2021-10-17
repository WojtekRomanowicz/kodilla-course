package com.example.kodillahibernate.manytomany.facade;

import com.example.kodillahibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private  CompanyDao companyDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    public Facade(CompanyDao companyDao){
        this.companyDao = companyDao;
    }

    public Iterable<Company> companyFinder(String companyName){


        return companyDao.findCompanyByNameContains(companyName);
    }

}
