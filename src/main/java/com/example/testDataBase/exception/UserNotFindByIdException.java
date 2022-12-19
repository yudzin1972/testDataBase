package com.example.testDataBase.exception;

public class UserNotFindByIdException extends Exception{
    public UserNotFindByIdException(String message) {
        super(message);
    }
}
