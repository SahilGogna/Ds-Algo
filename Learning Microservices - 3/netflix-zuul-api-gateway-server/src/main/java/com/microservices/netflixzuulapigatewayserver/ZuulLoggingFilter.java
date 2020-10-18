package com.microservices.netflixzuulapigatewayserver;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.protocol.RequestContent;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{
	
	private static final Logger LOGGER = Logger.getLogger( ZuulLoggingFilter.class.getName() );
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = 
				RequestContext.getCurrentContext().getRequest();
		LOGGER.info("request -> "+request+" request uri -> "+request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
