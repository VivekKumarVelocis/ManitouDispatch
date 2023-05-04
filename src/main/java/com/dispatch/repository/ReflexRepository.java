package com.dispatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dispatch.entity.Reflex;

@Repository
public interface ReflexRepository extends JpaRepository<Reflex, Long>{

}
