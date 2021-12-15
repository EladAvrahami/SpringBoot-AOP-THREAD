package com.jb.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Chip {
    private String uuid = UUID.randomUUID().toString();
}
