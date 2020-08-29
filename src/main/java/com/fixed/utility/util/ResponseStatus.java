package com.fixed.utility.util;

import org.springframework.http.HttpStatus;

/**
 *
 * @author bypt-dev-laptop-9
 */
public class ResponseStatus {
    
    public static ResponseModel create(String message, Object obj, HttpStatus httpStatus, int httpStatusCode) {
        ResponseModel rs = new ResponseModel();
        rs.setMessage(message);
        rs.setData(obj);
        rs.setStatus(httpStatus);
        rs.setStatusCode(httpStatusCode);
        return rs;
    }
    
}
