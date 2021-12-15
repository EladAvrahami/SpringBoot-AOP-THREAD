package com.jb.spring.beans;

import com.jb.spring.interfaces.Mobile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Qualifier("iPhone")
public class Iphone  implements Mobile {
    private String name;
    @Value("${iosType}")
    private String phoneType;
}
