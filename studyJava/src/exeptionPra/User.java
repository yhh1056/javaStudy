package exeptionPra;

import exeptionPra.Valid.ValidRegister;
import exeptionPra.validHandler.RangeOutUserIdException;
import exeptionPra.validHandler.RangeOutUserPasswordException;

/**
 * author {yhh1056}
 * Create by {2020/07/10}
 */
public class User {
    private String id;
    private int password;

    public void register(String id, int password) {
        this.id = id;
        this.password = password;
    }

    public boolean isSigned() throws RangeOutUserIdException, RangeOutUserPasswordException {
        ValidRegister.validId(id);
        ValidRegister.validPassword(password);
        return true;
    }
}
