package org.nick.demo.repositories;

import org.nick.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Administrator on 14-8-10.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
