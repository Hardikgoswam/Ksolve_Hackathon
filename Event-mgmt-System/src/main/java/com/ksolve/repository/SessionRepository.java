package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Sessions;

@Repository
public interface SessionRepository extends JpaRepository<Sessions, Long> {

}
