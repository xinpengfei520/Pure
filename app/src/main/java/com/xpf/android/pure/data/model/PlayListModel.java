package com.xpf.android.pure.data.model;

import java.util.List;

/**
 * @author x-sir :)
 * @date 2021/7/19
 */
public class PlayListModel extends BaseModel {

    private String version;
    private Boolean more;
    private List<PlaylistBean> playlist;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public List<PlaylistBean> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<PlaylistBean> playlist) {
        this.playlist = playlist;
    }

    public static class PlaylistBean {
        private List<?> subscribers;
        private Boolean subscribed;
        private CreatorBean creator;
        private Object artists;
        private Object tracks;
        private Object updateFrequency;
        private Integer backgroundCoverId;
        private Object backgroundCoverUrl;
        private Integer titleImage;
        private Object titleImageUrl;
        private Object englishTitle;
        private Boolean opRecommend;
        private Object recommendInfo;
        private Integer subscribedCount;
        private Integer cloudTrackCount;
        private Integer userId;
        private Integer totalDuration;
        private Long coverImgId;
        private Integer privacy;
        private Long trackUpdateTime;
        private Integer trackCount;
        private Long updateTime;
        private String commentThreadId;
        private String coverImgUrl;
        private Integer specialType;
        private Boolean anonimous;
        private Long createTime;
        private Boolean highQuality;
        private Boolean newImported;
        private Long trackNumberUpdateTime;
        private Integer playCount;
        private Integer adType;
        private Object description;
        private List<?> tags;
        private Boolean ordered;
        private Integer status;
        private String name;
        private Long id;
        private String coverImgId_str;
        private Object sharedUsers;

        public List<?> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<?> subscribers) {
            this.subscribers = subscribers;
        }

        public Boolean getSubscribed() {
            return subscribed;
        }

        public void setSubscribed(Boolean subscribed) {
            this.subscribed = subscribed;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public Object getArtists() {
            return artists;
        }

        public void setArtists(Object artists) {
            this.artists = artists;
        }

        public Object getTracks() {
            return tracks;
        }

        public void setTracks(Object tracks) {
            this.tracks = tracks;
        }

        public Object getUpdateFrequency() {
            return updateFrequency;
        }

        public void setUpdateFrequency(Object updateFrequency) {
            this.updateFrequency = updateFrequency;
        }

        public Integer getBackgroundCoverId() {
            return backgroundCoverId;
        }

        public void setBackgroundCoverId(Integer backgroundCoverId) {
            this.backgroundCoverId = backgroundCoverId;
        }

        public Object getBackgroundCoverUrl() {
            return backgroundCoverUrl;
        }

        public void setBackgroundCoverUrl(Object backgroundCoverUrl) {
            this.backgroundCoverUrl = backgroundCoverUrl;
        }

        public Integer getTitleImage() {
            return titleImage;
        }

        public void setTitleImage(Integer titleImage) {
            this.titleImage = titleImage;
        }

        public Object getTitleImageUrl() {
            return titleImageUrl;
        }

        public void setTitleImageUrl(Object titleImageUrl) {
            this.titleImageUrl = titleImageUrl;
        }

        public Object getEnglishTitle() {
            return englishTitle;
        }

        public void setEnglishTitle(Object englishTitle) {
            this.englishTitle = englishTitle;
        }

        public Boolean getOpRecommend() {
            return opRecommend;
        }

        public void setOpRecommend(Boolean opRecommend) {
            this.opRecommend = opRecommend;
        }

        public Object getRecommendInfo() {
            return recommendInfo;
        }

        public void setRecommendInfo(Object recommendInfo) {
            this.recommendInfo = recommendInfo;
        }

        public Integer getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(Integer subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public Integer getCloudTrackCount() {
            return cloudTrackCount;
        }

        public void setCloudTrackCount(Integer cloudTrackCount) {
            this.cloudTrackCount = cloudTrackCount;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getTotalDuration() {
            return totalDuration;
        }

        public void setTotalDuration(Integer totalDuration) {
            this.totalDuration = totalDuration;
        }

        public Long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(Long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public Integer getPrivacy() {
            return privacy;
        }

        public void setPrivacy(Integer privacy) {
            this.privacy = privacy;
        }

        public Long getTrackUpdateTime() {
            return trackUpdateTime;
        }

        public void setTrackUpdateTime(Long trackUpdateTime) {
            this.trackUpdateTime = trackUpdateTime;
        }

        public Integer getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(Integer trackCount) {
            this.trackCount = trackCount;
        }

        public Long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public Integer getSpecialType() {
            return specialType;
        }

        public void setSpecialType(Integer specialType) {
            this.specialType = specialType;
        }

        public Boolean getAnonimous() {
            return anonimous;
        }

        public void setAnonimous(Boolean anonimous) {
            this.anonimous = anonimous;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Boolean getHighQuality() {
            return highQuality;
        }

        public void setHighQuality(Boolean highQuality) {
            this.highQuality = highQuality;
        }

        public Boolean getNewImported() {
            return newImported;
        }

        public void setNewImported(Boolean newImported) {
            this.newImported = newImported;
        }

        public Long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(Long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public Integer getPlayCount() {
            return playCount;
        }

        public void setPlayCount(Integer playCount) {
            this.playCount = playCount;
        }

        public Integer getAdType() {
            return adType;
        }

        public void setAdType(Integer adType) {
            this.adType = adType;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public Boolean getOrdered() {
            return ordered;
        }

        public void setOrdered(Boolean ordered) {
            this.ordered = ordered;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCoverImgId_str() {
            return coverImgId_str;
        }

        public void setCoverImgId_str(String coverImgId_str) {
            this.coverImgId_str = coverImgId_str;
        }

        public Object getSharedUsers() {
            return sharedUsers;
        }

        public void setSharedUsers(Object sharedUsers) {
            this.sharedUsers = sharedUsers;
        }

        public static class CreatorBean {
            private Boolean defaultAvatar;
            private Integer province;
            private Integer authStatus;
            private Boolean followed;
            private String avatarUrl;
            private Integer accountStatus;
            private Integer gender;
            private Integer city;
            private Long birthday;
            private Integer userId;
            private Integer userType;
            private String nickname;
            private String signature;
            private String description;
            private String detailDescription;
            private Long avatarImgId;
            private Long backgroundImgId;
            private String backgroundUrl;
            private Integer authority;
            private Boolean mutual;
            private Object expertTags;
            private Object experts;
            private Integer djStatus;
            private Integer vipType;
            private Object remarkName;
            private Integer authenticationTypes;
            private Object avatarDetail;
            private Boolean anchor;
            private String avatarImgIdStr;
            private String backgroundImgIdStr;
            private String avatarImgId_str;

            public Boolean getDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(Boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }

            public Integer getProvince() {
                return province;
            }

            public void setProvince(Integer province) {
                this.province = province;
            }

            public Integer getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(Integer authStatus) {
                this.authStatus = authStatus;
            }

            public Boolean getFollowed() {
                return followed;
            }

            public void setFollowed(Boolean followed) {
                this.followed = followed;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public Integer getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(Integer accountStatus) {
                this.accountStatus = accountStatus;
            }

            public Integer getGender() {
                return gender;
            }

            public void setGender(Integer gender) {
                this.gender = gender;
            }

            public Integer getCity() {
                return city;
            }

            public void setCity(Integer city) {
                this.city = city;
            }

            public Long getBirthday() {
                return birthday;
            }

            public void setBirthday(Long birthday) {
                this.birthday = birthday;
            }

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

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
            }

            public Long getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(Long avatarImgId) {
                this.avatarImgId = avatarImgId;
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

            public Integer getAuthority() {
                return authority;
            }

            public void setAuthority(Integer authority) {
                this.authority = authority;
            }

            public Boolean getMutual() {
                return mutual;
            }

            public void setMutual(Boolean mutual) {
                this.mutual = mutual;
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

            public Integer getVipType() {
                return vipType;
            }

            public void setVipType(Integer vipType) {
                this.vipType = vipType;
            }

            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
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

            public String getAvatarImgIdStr() {
                return avatarImgIdStr;
            }

            public void setAvatarImgIdStr(String avatarImgIdStr) {
                this.avatarImgIdStr = avatarImgIdStr;
            }

            public String getBackgroundImgIdStr() {
                return backgroundImgIdStr;
            }

            public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                this.backgroundImgIdStr = backgroundImgIdStr;
            }

            public String getAvatarImgId_str() {
                return avatarImgId_str;
            }

            public void setAvatarImgId_str(String avatarImgId_str) {
                this.avatarImgId_str = avatarImgId_str;
            }
        }
    }
}
