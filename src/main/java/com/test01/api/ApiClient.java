package com.test01.api;
import com.test01.web.Dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.Objects;

import static com.test01.domain.ApiDomain.*;

@RequiredArgsConstructor
@Service
public class ApiClient {
    public ProductResponseDto requestProduct(String category, String list)  {
        String url="", key="";
        if (Objects.equals(category, fisrtCategory)) {
            url = firstUrl;
            key = firstKey;
        } else if (Objects.equals(category, secondCategory)) {
            url = secondUrl;
            key = secondKey;
        }

        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();
        headers.add("Authorization",key);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("name",list);
        builder.encode();
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, ProductResponseDto.class).getBody();
    }
}
