package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByRoleName(String roleName);
}
