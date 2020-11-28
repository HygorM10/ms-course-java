package com.hygor.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygor.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
