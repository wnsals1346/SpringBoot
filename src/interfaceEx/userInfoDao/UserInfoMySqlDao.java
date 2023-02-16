package interfaceEx.userInfoDao;

import interfaceEx.UserInfo;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert MySQL user, user ID : "+userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update MySQL user, user ID : "+userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete MySQL user, user ID : "+userInfo.getUserID());
    }
}
