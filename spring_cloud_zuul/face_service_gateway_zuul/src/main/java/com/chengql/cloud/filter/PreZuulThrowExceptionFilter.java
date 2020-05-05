package com.chengql.cloud.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.chengql.cloud.enums.ZuulFilterTypeEnum;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
@Component
public class PreZuulThrowExceptionFilter extends ZuulFilter{
    private static final Logger LOGGER = LoggerFactory.getLogger(PreZuulThrowExceptionFilter.class);
	@Override
	public Object run() {
		System.err.println("ZuulFilter PreThrowExceptionFilter");
		RequestContext ctx = RequestContext.getCurrentContext();
		//判断异常处理必须拥用error.status_code参数
		LOGGER.info("PreThrowExceptionFilter 运行");
		try{
		  doSomething();
		}catch (Exception e) {
			//error.status_code 错误编码
			//error.exception Exception 异常对象
			//error.message 错误信息
			// 用来给后面的 Filter 标识，是否继续执行
			//ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			//ctx.set("error.exception", e);
			//ctx.setThrowable(e);
			//ctx.set("sendErrorFilter.ran",true);
			System.out.println(ctx.get("sendErrorFilter.ran"));
			//ctx.setSendZuulResponse(false);
            //ctx.setResponseStatusCode(401);
              /*  try {
					ctx.getResponse().getWriter().write("token is empty");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
			//表示不进行路由 最终不会被zuul转发到后端服务器
		   //ctx.setSendZuulResponse(false);
			//单这个异常抛出前端并没有显示
			 ctx.setSendZuulResponse(false); //不对其进行路由
	            ctx.setResponseStatusCode(400);
	            ctx.setResponseBody("token is em33pty");
	            ctx.set("isSuccess", false);
	            //判断异常来自于那个阶段
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {
		//判断执行条件
		RequestContext ctx = RequestContext.getCurrentContext();
		 //方法来做判断,如果这个请求最终被拦截掉,则后面的过滤器逻辑也不需要执行了
	    if(!ctx.sendZuulResponse()){
	        return false;
	    }else{
		  return true;
	    }
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return  ZuulFilterTypeEnum.PRE_TYPE.getCode();
	}
	
	private void doSomething(){
		throw new RuntimeException("Exist some errors...");
	}

}
