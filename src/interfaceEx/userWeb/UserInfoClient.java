package interfaceEx.userWeb;

import interfaceEx.UserInfo;
import interfaceEx.userInfoDao.UserInfoDao;
import interfaceEx.userInfoDao.UserInfoMySqlDao;
import interfaceEx.userInfoDao.UserInfoOracleDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        File newdir = new File(System.getProperty("user.dir")+"/src/interfaceEx/userWeb/db.properties");
        FileInputStream fis = new FileInputStream(newdir);
        Properties prop = new Properties(); //pair data를 불러올 때 사용
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE"); // DBTYPE의 값을 불러옴

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("wnsals1346");
        userInfo.setUserPW("wnsals");
        userInfo.setUserName("Kim");
        UserInfoDao.staticMethodTest(); //interface static method
        UserInfoDao userInfoDao = null;

        if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else {
            System.err.println("ERROR!!");
            return;
        }
        userInfoDao.defaultMethodTest(); //interface default method
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
