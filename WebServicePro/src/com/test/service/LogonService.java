package com.test.service;

public class LogonService {
	public void checkUserRight(String userId, String password) {
        //假设进行数据库操作
        if (password != null && "fred".equals(userId)) {
            System.out.println("your userId is ==>"+userId);
        }
    System.out.println("sorry,you input a wrong id.");;
}

}
