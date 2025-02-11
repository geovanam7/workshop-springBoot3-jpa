package com.project.course.services.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (Object id){
        super("resource not found. Id " + id );
    }
}
