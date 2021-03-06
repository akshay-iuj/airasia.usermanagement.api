package com.airasia.usermanagement.repository;

import com.airasia.usermanagement.models.Permission;
import com.airasia.usermanagement.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    List<Permission> findAll();
    Optional<Permission> findByName(String name);
}
