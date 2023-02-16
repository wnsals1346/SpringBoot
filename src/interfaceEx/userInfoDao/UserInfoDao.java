package interfaceEx.userInfoDao;

import interfaceEx.UserInfo;

public interface UserInfoDao {
    //모든 변수는 public static final
    //모든 메소드는 public abstract
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
    static void staticMethodTest() {
        System.out.println("This is static method."+privateMethodTest());
    }
    default void defaultMethodTest() {
        System.out.println("This is default method."+privateMethodTest());
    }
    private static int privateMethodTest() {
        int id = 0;
        return ++id;
    }
    /*
        인터페이스는 구현부가 없는 추상 메소드로만 구성된다.
        java 8 이후 default, static 메소드가 추가됐다. (반복 작업을 줄이기 위함)
        java 9 이후 private 추가 : 외부에서 사용 못함, default or static에서 사용하기 위함

     */
}
