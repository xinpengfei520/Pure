package com.xpf.android.pure.data.model;

/**
 * @author x-sir :)
 * @date 2021/7/17
 */
public class LoginStatus {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private Integer code;
        private AccountBean account;
        private ProfileBean profile;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public AccountBean getAccount() {
            return account;
        }

        public void setAccount(AccountBean account) {
            this.account = account;
        }

        public ProfileBean getProfile() {
            return profile;
        }

        public void setProfile(ProfileBean profile) {
            this.profile = profile;
        }

        public static class AccountBean {
            private Integer id;
            private String userName;
            private Integer type;
            private Integer status;
            private Integer whitelistAuthority;
            private Long createTime;
            private Integer tokenVersion;
            private Integer ban;
            private Integer baoyueVersion;
            private Integer donateVersion;
            private Integer vipType;
            private Boolean anonimousUser;
            private Boolean paidFee;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public Integer getType() {
                return type;
            }

            public void setType(Integer type) {
                this.type = type;
            }

            public Integer getStatus() {
                return status;
            }

            public void setStatus(Integer status) {
                this.status = status;
            }

            public Integer getWhitelistAuthority() {
                return whitelistAuthority;
            }

            public void setWhitelistAuthority(Integer whitelistAuthority) {
                this.whitelistAuthority = whitelistAuthority;
            }

            public Long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Long createTime) {
                this.createTime = createTime;
            }

            public Integer getTokenVersion() {
                return tokenVersion;
            }

            public void setTokenVersion(Integer tokenVersion) {
                this.tokenVersion = tokenVersion;
            }

            public Integer getBan() {
                return ban;
            }

            public void setBan(Integer ban) {
                this.ban = ban;
            }

            public Integer getBaoyueVersion() {
                return baoyueVersion;
            }

            public void setBaoyueVersion(Integer baoyueVersion) {
                this.baoyueVersion = baoyueVersion;
            }

            public Integer getDonateVersion() {
                return donateVersion;
            }

            public void setDonateVersion(Integer donateVersion) {
                this.donateVersion = donateVersion;
            }

            public Integer getVipType() {
                return vipType;
            }

            public void setVipType(Integer vipType) {
                this.vipType = vipType;
            }

            public Boolean getAnonimousUser() {
                return anonimousUser;
            }

            public void setAnonimousUser(Boolean anonimousUser) {
                this.anonimousUser = anonimousUser;
            }

            public Boolean getPaidFee() {
                return paidFee;
            }

            public void setPaidFee(Boolean paidFee) {
                this.paidFee = paidFee;
            }
        }

        public static class ProfileBean {
            private Integer userId;
            private Integer userType;
            private String nickname;
            private Long avatarImgId;
            private String avatarUrl;
            private Long backgroundImgId;
            private String backgroundUrl;
            private String signature;
            private Long createTime;
            private String userName;
            private Integer accountType;
            private String shortUserName;
            private Long birthday;
            private Integer authority;
            private Integer gender;
            private Integer accountStatus;
            private Integer province;
            private Integer city;
            private Integer authStatus;
            private Object description;
            private Object detailDescription;
            private Boolean defaultAvatar;
            private Object expertTags;
            private Object experts;
            private Integer djStatus;
            private Integer locationStatus;
            private Integer vipType;
            private Boolean followed;
            private Boolean mutual;
            private Boolean authenticated;
            private Long lastLoginTime;
            private String lastLoginIP;
            private Object remarkName;
            private Long viptypeVersion;
            private Integer authenticationTypes;
            private Object avatarDetail;
            private Boolean anchor;

            public Integer getUserId() {
                return userId;
            }

            public void setUserId(Integer userId) {
                this.userId = userId;
            }

            public Integer getUserType() {
                return userType;
            }

            public void setUserType(Integer userType) {
                this.userType = userType;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Long getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(Long avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public Long getBackgroundImgId() {
                return backgroundImgId;
            }

            public void setBackgroundImgId(Long backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public Long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Long createTime) {
                this.createTime = createTime;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public Integer getAccountType() {
                return accountType;
            }

            public void setAccountType(Integer accountType) {
                this.accountType = accountType;
            }

            public String getShortUserName() {
                return shortUserName;
            }

            public void setShortUserName(String shortUserName) {
                this.shortUserName = shortUserName;
            }

            public Long getBirthday() {
                return birthday;
            }

            public void setBirthday(Long birthday) {
                this.birthday = birthday;
            }

            public Integer getAuthority() {
                return authority;
            }

            public void setAuthority(Integer authority) {
                this.authority = authority;
            }

            public Integer getGender() {
                return gender;
            }

            public void setGender(Integer gender) {
                this.gender = gender;
            }

            public Integer getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(Integer accountStatus) {
                this.accountStatus = accountStatus;
            }

            public Integer getProvince() {
                return province;
            }

            public void setProvince(Integer province) {
                this.province = province;
            }

            public Integer getCity() {
                return city;
            }

            public void setCity(Integer city) {
                this.city = city;
            }

            public Integer getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(Integer authStatus) {
                this.authStatus = authStatus;
            }

            public Object getDescription() {
                return description;
            }

            public void setDescription(Object description) {
                this.description = description;
            }

            public Object getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(Object detailDescription) {
                this.detailDescription = detailDescription;
            }

            public Boolean getDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(Boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }

            public Object getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(Object expertTags) {
                this.expertTags = expertTags;
            }

            public Object getExperts() {
                return experts;
            }

            public void setExperts(Object experts) {
                this.experts = experts;
            }

            public Integer getDjStatus() {
                return djStatus;
            }

            public void setDjStatus(Integer djStatus) {
                this.djStatus = djStatus;
            }

            public Integer getLocationStatus() {
                return locationStatus;
            }

            public void setLocationStatus(Integer locationStatus) {
                this.locationStatus = locationStatus;
            }

            public Integer getVipType() {
                return vipType;
            }

            public void setVipType(Integer vipType) {
                this.vipType = vipType;
            }

            public Boolean getFollowed() {
                return followed;
            }

            public void setFollowed(Boolean followed) {
                this.followed = followed;
            }

            public Boolean getMutual() {
                return mutual;
            }

            public void setMutual(Boolean mutual) {
                this.mutual = mutual;
            }

            public Boolean getAuthenticated() {
                return authenticated;
            }

            public void setAuthenticated(Boolean authenticated) {
                this.authenticated = authenticated;
            }

            public Long getLastLoginTime() {
                return lastLoginTime;
            }

            public void setLastLoginTime(Long lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
            }

            public String getLastLoginIP() {
                return lastLoginIP;
            }

            public void setLastLoginIP(String lastLoginIP) {
                this.lastLoginIP = lastLoginIP;
            }

            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
            }

            public Long getViptypeVersion() {
                return viptypeVersion;
            }

            public void setViptypeVersion(Long viptypeVersion) {
                this.viptypeVersion = viptypeVersion;
            }

            public Integer getAuthenticationTypes() {
                return authenticationTypes;
            }

            public void setAuthenticationTypes(Integer authenticationTypes) {
                this.authenticationTypes = authenticationTypes;
            }

            public Object getAvatarDetail() {
                return avatarDetail;
            }

            public void setAvatarDetail(Object avatarDetail) {
                this.avatarDetail = avatarDetail;
            }

            public Boolean getAnchor() {
                return anchor;
            }

            public void setAnchor(Boolean anchor) {
                this.anchor = anchor;
            }
        }
    }
}
