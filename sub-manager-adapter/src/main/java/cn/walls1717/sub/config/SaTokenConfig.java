package cn.walls1717.sub.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpUtil;

@Configuration
public class SaTokenConfig implements WebMvcConfigurer {

	private final List<String> excludePath = List.of(
			"/doc.html",
			"/webjars/**",
			"/*/api-docs/**",
			"/favicon.ico"
	);

	/**
	 * 注册 Sa-Token 拦截器，打开注解式鉴权功能
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册 Sa-Token 拦截器，打开注解式鉴权功能
		registry.addInterceptor(new SaInterceptor(interceptor -> StpUtil.checkLogin()))
				.addPathPatterns("/**")
				.excludePathPatterns(excludePath);
	}
}
