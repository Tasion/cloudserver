package com.tasion.fegin.util;

public interface CommonConstant {
    String STATUS_DISABLE = "0";
    String STATUS_ENABLE = "1";
    String YES = "1";
    String NO = "0";
    String MENU_TYPE_FIRST = "0";
    String MENU_TYPE_CHILDREN = "1";
    String MENU_TYPE_BUTTON = "2";
    String DEL_FLAG_1 = "1";
    String DEL_FLAG_0 = "0";
    int LOG_TYPE_1 = 1;
    int LOG_TYPE_2 = 2;
    Integer SC_INTERNAL_SERVER_ERROR_500 = 500;
    Integer SC_OK_200 = 200;
    Integer SC_BAD_REQUEST = 400;
    Integer SC_UNAUTHORIZED = 401;
    Integer SC_FORBIDDEN = 403;
    Integer SC_NOT_FOUND = 404;
    Integer SC_CONFLICT = 409;
    Integer SC_LOGIN_ERROR = 451;
    Integer SC_HYSTRIX = 9990;
    String PREFIX_USER_ROLE = "PREFIX_USER_ROLE";
    String PREFIX_USER_PERMISSION = "PREFIX_USER_PERMISSION ";
    int TOKEN_EXPIRE_TIME = 3600;
    String PREFIX_PRINCIPAL = "PREFIX_PRINCIPAL ";
}
