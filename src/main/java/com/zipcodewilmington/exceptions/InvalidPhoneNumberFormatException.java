package com.zipcodewilmington.exceptions;

import java.io.IOException;

/**
 * Created by leon on 5/10/17.
 */ // Checked Exception
public final class InvalidPhoneNumberFormatException extends IOException {

    String errorMessage;

    public InvalidPhoneNumberFormatException(){

    }

    public InvalidPhoneNumberFormatException(String message){
        errorMessage = message;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

}
