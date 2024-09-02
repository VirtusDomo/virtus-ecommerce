package com.virtusdev.virtus_ecommerce.exceptions;

public class ResourceNotFoundException extends Throwable {
    String resourceName;
    String fieldName;
    String field;
    Long fieldId;

    public ResourceNotFoundException(String resourceName, String fieldName, String field) {
        super(String.format("%s not found in %s: %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.field = field;
    }
}
