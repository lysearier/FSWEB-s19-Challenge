package com.eren.twitter_api.repository;

import com.eren.twitter_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {
}
