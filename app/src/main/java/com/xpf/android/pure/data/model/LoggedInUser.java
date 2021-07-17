package com.xpf.android.pure.data.model;

import java.util.List;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser extends BaseModel {

    private Integer loginType;
    private AccountBean account;
    private String token;
    private ProfileBean profile;
    private List<BindingsBean> bindings;
    private String cookie;

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public static class AccountBean {
        private Integer id;
        private String userName;
        private Integer type;
        private Integer status;
        private Integer whitelistAuthority;
        private Long createTime;
        private String salt;
        private Integer tokenVersion;
        private Integer ban;
        private Integer baoyueVersion;
        private Integer donateVersion;
        private Integer vipType;
        private Long viptypeVersion;
        private Boolean anonimousUser;

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

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
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

        public Long getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(Long viptypeVersion) {
            this.viptypeVersion = viptypeVersion;
        }

        public Boolean getAnonimousUser() {
            return anonimousUser;
        }

        public void setAnonimousUser(Boolean anonimousUser) {
            this.anonimousUser = anonimousUser;
        }
    }

    public static class ProfileBean {
        private String avatarImgIdStr;
        private Integer userType;
        private Integer vipType;
        private Integer gender;
        private String nickname;
        private Long avatarImgId;
        private Long birthday;
        private Integer accountStatus;
        private Integer city;
        private Long backgroundImgId;
        private String avatarUrl;
        private Integer province;
        private Boolean defaultAvatar;
        private Integer djStatus;
        private ProfileBean.ExpertsBean experts;
        private Boolean mutual;
        private Object remarkName;
        private Object expertTags;
        private Integer authStatus;
        private String backgroundImgIdStr;
        private String signature;
        private Integer authority;
        private String description;
        private Integer userId;
        private Boolean followed;
        private String backgroundUrl;
        private String detailDescription;
        private String avatarImgId_str;
        private Integer followeds;
        private Integer follows;
        private Integer eventCount;
        private Object avatarDetail;
        private Integer playlistCount;
        private Integer playlistBeSubscribedCount;

        public String getAvatarImgIdStr() {
            return avatarImgIdStr;
        }

        public void setAvatarImgIdStr(String avatarImgIdStr) {
            this.avatarImgIdStr = avatarImgIdStr;
        }

        public Integer getUserType() {
            return userType;
        }

        public void setUserType(Integer userType) {
            this.userType = userType;
        }

        public Integer getVipType() {
            return vipType;
        }

        public void setVipType(Integer vipType) {
            this.vipType = vipType;
        }

        public Integer getGender() {
            return gender;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
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

        public Long getBirthday() {
            return birthday;
        }

        public void setBirthday(Long birthday) {
            this.birthday = birthday;
        }

        public Integer getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(Integer accountStatus) {
            this.accountStatus = accountStatus;
        }

        public Integer getCity() {
            return city;
        }

        public void setCity(Integer city) {
            this.city = city;
        }

        public Long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(Long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public Integer getProvince() {
            return province;
        }

        public void setProvince(Integer province) {
            this.province = province;
        }

        public Boolean getDefaultAvatar() {
            return defaultAvatar;
        }

        public void setDefaultAvatar(Boolean defaultAvatar) {
            this.defaultAvatar = defaultAvatar;
        }

        public Integer getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(Integer djStatus) {
            this.djStatus = djStatus;
        }

        public ProfileBean.ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ProfileBean.ExpertsBean experts) {
            this.experts = experts;
        }

        public Boolean getMutual() {
            return mutual;
        }

        public void setMutual(Boolean mutual) {
            this.mutual = mutual;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public Object getExpertTags() {
            return expertTags;
        }

        public void setExpertTags(Object expertTags) {
            this.expertTags = expertTags;
        }

        public Integer getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(Integer authStatus) {
            this.authStatus = authStatus;
        }

        public String getBackgroundImgIdStr() {
            return backgroundImgIdStr;
        }

        public void setBackgroundImgIdStr(String backgroundImgIdStr) {
            this.backgroundImgIdStr = backgroundImgIdStr;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public Integer getAuthority() {
            return authority;
        }

        public void setAuthority(Integer authority) {
            this.authority = authority;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Boolean getFollowed() {
            return followed;
        }

        public void setFollowed(Boolean followed) {
            this.followed = followed;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public String getDetailDescription() {
            return detailDescription;
        }

        public void setDetailDescription(String detailDescription) {
            this.detailDescription = detailDescription;
        }

        public String getAvatarImgId_str() {
            return avatarImgId_str;
        }

        public void setAvatarImgId_str(String avatarImgId_str) {
            this.avatarImgId_str = avatarImgId_str;
        }

        public Integer getFolloweds() {
            return followeds;
        }

        public void setFolloweds(Integer followeds) {
            this.followeds = followeds;
        }

        public Integer getFollows() {
            return follows;
        }

        public void setFollows(Integer follows) {
            this.follows = follows;
        }

        public Integer getEventCount() {
            return eventCount;
        }

        public void setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
        }

        public Object getAvatarDetail() {
            return avatarDetail;
        }

        public void setAvatarDetail(Object avatarDetail) {
            this.avatarDetail = avatarDetail;
        }

        public Integer getPlaylistCount() {
            return playlistCount;
        }

        public void setPlaylistCount(Integer playlistCount) {
            this.playlistCount = playlistCount;
        }

        public Integer getPlaylistBeSubscribedCount() {
            return playlistBeSubscribedCount;
        }

        public void setPlaylistBeSubscribedCount(Integer playlistBeSubscribedCount) {
            this.playlistBeSubscribedCount = playlistBeSubscribedCount;
        }

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        private Long bindingTime;
        private String tokenJsonStr;
        private Integer expiresIn;
        private Long id;
        private Integer type;
        private Integer userId;
        private Integer refreshTime;
        private String url;
        private Boolean expired;

        public Long getBindingTime() {
            return bindingTime;
        }

        public void setBindingTime(Long bindingTime) {
            this.bindingTime = bindingTime;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public Integer getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(Integer refreshTime) {
            this.refreshTime = refreshTime;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean getExpired() {
            return expired;
        }

        public void setExpired(Boolean expired) {
            this.expired = expired;
        }
    }
}