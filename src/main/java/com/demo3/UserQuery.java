package com.demo3;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/21
 * @Description:
 */
public class UserQuery {

    private CustomUser customUser;

    private UserCondition userCondition;


    public CustomUser getCustomUser() {
        return customUser;
    }

    public void setCustomUser(CustomUser customUser) {
        this.customUser = customUser;
    }

    public UserCondition getUserCondition() {
        return userCondition;
    }

    public void setUserCondition(UserCondition userCondition) {
        this.userCondition = userCondition;
    }
}
