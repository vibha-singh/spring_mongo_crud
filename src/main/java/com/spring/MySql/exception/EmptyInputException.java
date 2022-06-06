package com.spring.MySql.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serial;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BussinessException extends RuntimeException{


    @Serial
    private static final long serialVersionUID = 596542963078496151L;

    private String errorCode;
    private String errorMessage;
}
