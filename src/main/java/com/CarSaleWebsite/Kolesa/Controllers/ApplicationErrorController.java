package com.CarSaleWebsite.Kolesa.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

//@Controller
public class ApplicationErrorController implements ErrorController {
    public ApplicationErrorController(){}
    
//    @GetMapping(value = "/error")
//    public String handleError(HttpServletRequest request) {
//
//        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//
//        if (status != null) {
//
//            int statusCode = Integer.parseInt(status.toString());
//
//            if(statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "error-404";
//            }
//            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                return "error-500";
//            }
//            else if(statusCode==HttpStatus.FORBIDDEN.value()){
//                return "error-403";
//            }
//        }
//        return "error";
//    }
    @Override
    public String getErrorPath() {
        return null;
    }
}
