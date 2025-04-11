package com.ohgiraffers.lambda.test;


import java.time.LocalDateTime;

@FunctionalInterface
public interface App {
    LocalDateTime getTime();
}
