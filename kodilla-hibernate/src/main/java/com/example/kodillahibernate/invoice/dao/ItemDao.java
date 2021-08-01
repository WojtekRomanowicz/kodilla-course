package com.example.kodillahibernate.invoice.dao;

import com.example.kodillahibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Transactional
@Repository
public interface ItemDao  extends CrudRepository<Item, Integer> {
}
