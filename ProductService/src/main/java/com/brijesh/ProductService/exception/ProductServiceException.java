package com.brijesh.ProductService.exception;import lombok.Getter;@Getterpublic class ProductServiceException extends RuntimeException{    private final String errorCode;    public ProductServiceException(String message, String errorCode){        super(message);        this.errorCode = errorCode;    }}