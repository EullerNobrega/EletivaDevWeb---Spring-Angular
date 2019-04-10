package com.eletiva_dev_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletiva_dev_web.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, String> {

}
