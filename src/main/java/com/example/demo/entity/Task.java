package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private String name;
    private String description;


}