package com.github.chasegnil.cas3.passwordencoder;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.jasig.cas.authentication.handler.PasswordEncoder;

/**
 * SHA-256加密
 */
public class SHA256PasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(String s) {
        return new Sha256Hash(s).toHex();
    }
}
