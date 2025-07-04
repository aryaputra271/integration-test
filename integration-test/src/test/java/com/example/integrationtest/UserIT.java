package com.example.integrationtest;

import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserIT extends BaseIT {

    @Test
    void testUser() {
        UserDto user = new UserDto("test");

        String response = testRestTemplate.postForObject(getBaseUrl() + "/users", user, String.class);

        assertThat(response).isEqualTo("ok");
    }
}
