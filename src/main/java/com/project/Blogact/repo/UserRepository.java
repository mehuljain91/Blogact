package com.project.Blogact.repo;

import com.project.Blogact.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author mehul jain
 */
public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByUsername(String username);
}
