package com.jlw.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class Interceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(
	  HttpServletRequest request,
	  HttpServletResponse response, 
	  Object handler) throws Exception {
	  
		System.out.println("pre handle method invoekd"+request.getRequestURI() + request.getMethod());
		
	    return true;
	}
	@Override
	public void postHandle(
	  HttpServletRequest request, 
	  HttpServletResponse response,
	  Object handler, 
	  ModelAndView modelAndView) throws Exception {
	    
		System.out.println("post handle method invoekd"+request.getRequestURI() + request.getMethod());
	}
	
	@Override
	public void afterCompletion(
	  HttpServletRequest request, 
	  HttpServletResponse response,
	  Object handler, Exception ex) {
		System.out.println("after completion method invoekd"+request.getRequestURI() + request.getMethod());
	}

}
