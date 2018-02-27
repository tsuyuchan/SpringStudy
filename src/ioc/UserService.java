package ioc;

public class UserService {
    //定义dao类型属性
    private UserDao userDao;

    //生成set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service..........");
        userDao.add();
    }
}
