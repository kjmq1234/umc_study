package umc.spring.exception.handler;

import umc.spring.apiPayLoad.code.BaseErrorCode;
import umc.spring.apiPayLoad.code.status.ErrorStatus;
import umc.spring.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(ErrorStatus errorCode) {
        super(errorCode);
    }
}
