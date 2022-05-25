package com.qa.SpringbootEx.exceptions;

import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User does not exist with that ID")
public class UserNotFoundExceptions extends NoSuchElementException{

}
