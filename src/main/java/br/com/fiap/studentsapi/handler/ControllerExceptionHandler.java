package br.com.fiap.studentsapi.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ControllerExceptionHandler {

    // private ResponseEntity<ErrorMessageResponse> getErrorMessageResponseResponseEntity(String message, String description, HttpStatus statusCode ) {
    //     ErrorMessageResponse error = new ErrorMessageResponse();
    //     error.setMessage(message);
    //     error.setDescription(description);
    //     error.setTimestamp(new Date());
    //     error.setStatusCode(statusCode.value());
    //     return new ResponseEntity<ErrorMessageResponse>(error, statusCode);
    // }
}
