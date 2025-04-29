package com.example.mongocopy.repository;

import com.example.mongocopy.model.CopyJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CopyJobRepository extends JpaRepository<CopyJob, String> {
}
