package com.test01.service;

import com.test01.api.ApiClient;
import com.test01.web.Dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ApiClient apiClient;

    @Transactional(readOnly = true)
    public ProductResponseDto findByProduct(String category, String product) {
        return apiClient.requestProduct(category, product);
    }
}
