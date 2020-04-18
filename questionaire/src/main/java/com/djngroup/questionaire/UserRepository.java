package com.djngroup.questionaire;
import org.springframework.data.repository.CrudRepository;
import com.djngroup.questionaire.entity.User;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer> {

}