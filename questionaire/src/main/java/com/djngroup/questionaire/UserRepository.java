package com.djngroup.questionaire;
import org.springframework.data.repository.CrudRepository;
import com.djngroup.questionaire.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}