package com.test01.web.Controller;

import com.test01.service.ProductService;
import com.test01.web.Dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiController {
    private final ProductService productService;

    @GetMapping("/api/{category}/item/{product}")
    public ProductResponseDto get(@PathVariable String category, @PathVariable String product){
        return productService.findByProduct(category, product);
    }
}
