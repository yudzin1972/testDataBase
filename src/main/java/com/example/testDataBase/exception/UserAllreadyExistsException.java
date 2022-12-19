package com.example.testDataBase.exception;

public class UserAllreadyExistsException extends Exception{
    public UserAllreadyExistsException(String message) {
        super(message);
    }
}
