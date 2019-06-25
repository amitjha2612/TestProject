/**
 * 
 */
package com.springboot.web.loyaltyhomework.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.loyaltyhomework.models.User;

/**
 * @author Amit
 *
 */
@Repository
public interface UserInputDaoImpl extends CrudRepository<User, Integer> {

	
}
