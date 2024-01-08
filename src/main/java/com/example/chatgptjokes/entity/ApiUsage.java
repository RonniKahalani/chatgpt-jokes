package com.example.chatgptjokes.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class ApiUsage {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String promptTokens;
  private int completionTokens;
  private int totalTokens;

  private String prompt;

  @CreationTimestamp
  LocalDateTime created;

}
