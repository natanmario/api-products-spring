package com.example.springboot.dtos;

import java.math.BigDecimal;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotBlank;

public record ProductRecordDto(@NotBlank String name, @NonNull BigDecimal value) {
    
}
