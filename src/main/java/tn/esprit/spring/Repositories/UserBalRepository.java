package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Etities.UserBal;

@Repository
public interface UserBalRepository extends CrudRepository<UserBal, Integer>{

}
