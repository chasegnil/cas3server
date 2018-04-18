/*
 * Copyright 2007 The JA-SIG Collaborative. All rights reserved. See license
 * distributed with this file and available online at
 * http://www.ja-sig.org/products/cas/overview/license/
 */
package org.jasig.cas.authentication.principal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 在原生的UsernamePasswordCredentials基础上添加了imgverifycode校验码字段
 */
public class UsernamePasswordCredentials implements Credentials {

    /** Unique ID for serialization. */
    private static final long serialVersionUID = -8343864967200862794L;

    /** The username. */
    @NotNull
    @Size(min=1,message = "required.username")
    private String username;

    /** The password. */
    @NotNull
    @Size(min=1, message = "required.password")
    private String password;

    /** The imgverifycode. */
    @NotNull
    @Size(min=1, message = "required.imgverifycode")
    private String imgverifycode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsernamePasswordCredentials that = (UsernamePasswordCredentials) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        return imgverifycode != null ? imgverifycode.equals(that.imgverifycode) : that.imgverifycode == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (imgverifycode != null ? imgverifycode.hashCode() : 0);
        return result;
    }

    public String getImgverifycode() {
        return imgverifycode;
    }

    public void setImgverifycode(String imgverifycode) {
        this.imgverifycode = imgverifycode;
    }

    /**
     * @return Returns the password.
     */
    public final String getPassword() {
        return this.password;
    }

    /**
     * @param password The password to set.
     */
    public final void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return Returns the userName.
     */
    public final String getUsername() {
        return this.username;
    }

    /**
     * @param userName The userName to set.
     */
    public final void setUsername(final String userName) {
        this.username = userName;
    }

    public String toString() {
        return "[username: " + this.username + "]";
    }

}
