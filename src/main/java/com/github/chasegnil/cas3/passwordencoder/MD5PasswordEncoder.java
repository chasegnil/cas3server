package com.github.chasegnil.cas3.passwordencoder;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.jasig.cas.authentication.handler.PasswordEncoder;

/**
 * md5加密
 */
public class MD5PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String s) {
        return new Md5Hash(s).toHex();
    }
}
