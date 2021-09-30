package in.codegram.afdapp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codegram.afdapp.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
