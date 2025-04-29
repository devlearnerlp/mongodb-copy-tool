package com.example.mongocopy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CopyJob {

    @Id
    private String jobId;
    private String source;
    private String target;
    private String database;
    private String collections;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String log;

    // Getters and Setters
}
