package com.jb.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Eyal {
    private Map<String, Integer> myData;

}
