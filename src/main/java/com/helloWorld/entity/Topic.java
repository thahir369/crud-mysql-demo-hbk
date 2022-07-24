package com.helloWorld.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "topic")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Topic {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;
  private String description;
}
