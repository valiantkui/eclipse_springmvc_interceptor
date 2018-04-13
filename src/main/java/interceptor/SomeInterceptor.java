package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SomeInterceptor implements HandlerInterceptor{

	/**
	 * DispathcherServlet收到请求后，会先调用preHandle方法。
	 * 如果该方法的返回值为true,则继续向后调用
	 * 如果返回值为false,则不再向后调用。
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle()");
		
		return true;
	}
	
	/**
	 * 处理器(Controller)的方法已经执行完毕，
	 * 正准备将结果(ModelAndView对象)返回给DispatcherServlet之前执行postHandle方法。
	 * 可以在该方法里面修改处理结果(ModelAndView对象)
	 * 
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle()");
	}

	
	/**
	 * 最后执行的方法
	 * 注意：只有当preHandle方法返回值为true时，
	 * 		该方法才会执行。 
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion()");
	}

}
