package com.example.demo.repository;

import com.example.demo.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository  extends JpaRepository<Tenant, Integer> {
}
