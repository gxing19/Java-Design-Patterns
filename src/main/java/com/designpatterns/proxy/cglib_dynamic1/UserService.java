package com.designpatterns.proxy.cglib_dynamic1;

/**
 * 不需要实现接口的业务类
 *
 */
public class UserService {
	
	public void queryInfo(int id) {
		System.out.println("根据ID查询信息。。。 " + id);
	}
	
	public final void updateInfo(int id, String name) {
		System.out.println("根据ID和名称更新信息 。。。" + id);
	}
}
