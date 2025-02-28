package ru.perm.v.s256.echo.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundEntityException extends RuntimeException {
    public NotFoundEntityException(Long id) {
        super("Not found with ID: " + id);
    }
}