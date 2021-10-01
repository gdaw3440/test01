package com.test01.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApiDomain {
    @Value("${first}")
    public static String fisrtCategory;
    @Value("${first.api.url}")
    public static String firstUrl;
    @Value("${first.api.key}")
    public static String firstKey;
    @Value("${second}")
    public static String secondCategory;
    @Value("${second.api.url}")
    public static String secondUrl;
    @Value("${second.api.key}")
    public static String secondKey;
}
