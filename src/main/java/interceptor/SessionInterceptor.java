package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * session��֤�Ƿ��½
 * @author KUIKUI
 *
 */
public class SessionInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//��ȡsession
		HttpSession session = request.getSession();
		
		Object object = session.getAttribute("admin");
		if(object == null) {
			//δ��¼���ض��򵽵�½ҳ��
			response.sendRedirect("toLogin.do");
			return false;
		}else {
			//�ѵ�½����������
			return true;
		}
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
