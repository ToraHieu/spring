package com.example.spring.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Greet(long id, String content) {
    @Override
    public String toString() {
        return "Greet{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
