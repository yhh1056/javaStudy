package exeptionPra;

import exeptionPra.validHandler.RangeOutUserIdException;
import exeptionPra.validHandler.RangeOutUserPasswordException;

/**
 * author {yhh1056}
 * Create by {2020/07/10}
 */
public class UserRegisterApplication {
    public static void main(String[] args) throws RangeOutUserIdException, RangeOutUserPasswordException {
        /**
         * @param String id : 5글자 이내로 가능
         * @param password : 4자리 숫자만 가능
         */
        User user = new User();
        user.register("yhh", 9999);
        user.isSigned();
    }
}
