package com.spring.boot.docker.nginx.mysql.b.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.b.common.bean.UserPo;

public interface UserRepository extends JpaRepository<UserPo, Long> {

	public UserPo findByUserId(String userId);
}
