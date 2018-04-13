package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SomeInterceptor implements HandlerInterceptor{

	/**
	 * DispathcherServlet�յ�����󣬻��ȵ���preHandle������
	 * ����÷����ķ���ֵΪtrue,�����������
	 * �������ֵΪfalse,���������á�
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle()");
		
		return true;
	}
	
	/**
	 * ������(Controller)�ķ����Ѿ�ִ����ϣ�
	 * ��׼�������(ModelAndView����)���ظ�DispatcherServlet֮ǰִ��postHandle������
	 * �����ڸ÷��������޸Ĵ�����(ModelAndView����)
	 * 
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle()");
	}

	
	/**
	 * ���ִ�еķ���
	 * ע�⣺ֻ�е�preHandle��������ֵΪtrueʱ��
	 * 		�÷����Ż�ִ�С� 
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion()");
	}

}
