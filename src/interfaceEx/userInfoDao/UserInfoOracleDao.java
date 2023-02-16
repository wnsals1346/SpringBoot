package interfaceEx.userInfoDao;

import interfaceEx.UserInfo;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert Oracle user, user ID : "+userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update Oracle user, user ID : "+userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete Oracle user, user ID : "+userInfo.getUserID());
    }
}
