package exeptionPra.Valid;

import exeptionPra.validHandler.RangeOutUserIdException;
import exeptionPra.validHandler.RangeOutUserPasswordException;


/**
 * author {yhh1056}
 * Create by {2020/07/11}
 */
public class ValidRegister {
    private static final int MAX_USER_ID = 5;
    private static final int MAX_USER_PASSWORD = 9999;
    private static final int MIN_USER_PASSWORD = 1000;

    public static void validId(String id) throws RangeOutUserIdException {
        if (id.length() > MAX_USER_ID) {
            throw new RangeOutUserIdException("아이디가 5글자가 넘습니다");
        }
    }

    public static void validPassword(int password) throws RangeOutUserPasswordException {
        if (password > MAX_USER_PASSWORD || password < MIN_USER_PASSWORD) {
            throw new RangeOutUserPasswordException("4자리 비밀번호가 아닙니다.");
        }
    }
}
