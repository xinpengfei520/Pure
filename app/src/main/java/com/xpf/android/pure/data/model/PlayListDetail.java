package com.xpf.android.pure.data.model;

import java.util.List;

/**
 * PlayListDetail
 *
 * @author x-sir :)
 * @date 2021/7/19
 */
public class PlayListDetail extends BaseModel {

    private Object relatedVideos;
    private PlaylistBean playlist;
    private Object urls;
    private List<PrivilegesBean> privileges;
    private Object sharedPrivilege;

    public Object getRelatedVideos() {
        return relatedVideos;
    }

    public void setRelatedVideos(Object relatedVideos) {
        this.relatedVideos = relatedVideos;
    }

    public PlaylistBean getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlaylistBean playlist) {
        this.playlist = playlist;
    }

    public Object getUrls() {
        return urls;
    }

    public void setUrls(Object urls) {
        this.urls = urls;
    }

    public List<PrivilegesBean> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<PrivilegesBean> privileges) {
        this.privileges = privileges;
    }

    public Object getSharedPrivilege() {
        return sharedPrivilege;
    }

    public void setSharedPrivilege(Object sharedPrivilege) {
        this.sharedPrivilege = sharedPrivilege;
    }

    public static class PlaylistBean {
        private Long id;
        private String name;
        private Long coverImgId;
        private String coverImgUrl;
        private String coverImgId_str;
        private Integer adType;
        private Integer userId;
        private Long createTime;
        private Integer status;
        private Boolean opRecommend;
        private Boolean highQuality;
        private Boolean newImported;
        private Long updateTime;
        private Integer trackCount;
        private Integer specialType;
        private Integer privacy;
        private Long trackUpdateTime;
        private String commentThreadId;
        private Integer playCount;
        private Long trackNumberUpdateTime;
        private Integer subscribedCount;
        private Integer cloudTrackCount;
        private Boolean ordered;
        private Object description;
        private List<?> tags;
        private Object updateFrequency;
        private Integer backgroundCoverId;
        private Object backgroundCoverUrl;
        private Integer titleImage;
        private Object titleImageUrl;
        private Object englishTitle;
        private Object officialPlaylistType;
        private List<?> subscribers;
        private Boolean subscribed;
        private CreatorBean creator;
        private List<TracksBean> tracks;
        private Object videoIds;
        private Object videos;
        private List<TrackIdsBean> trackIds;
        private Integer shareCount;
        private Integer commentCount;
        private Object remixVideo;
        private Object sharedUsers;
        private Object historySharedUsers;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(Long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public String getCoverImgId_str() {
            return coverImgId_str;
        }

        public void setCoverImgId_str(String coverImgId_str) {
            this.coverImgId_str = coverImgId_str;
        }

        public Integer getAdType() {
            return adType;
        }

        public void setAdType(Integer adType) {
            this.adType = adType;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Long createTime) {
            this.createTime = createTime;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Boolean getOpRecommend() {
            return opRecommend;
        }

        public void setOpRecommend(Boolean opRecommend) {
            this.opRecommend = opRecommend;
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

        public Long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
        }

        public Integer getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(Integer trackCount) {
            this.trackCount = trackCount;
        }

        public Integer getSpecialType() {
            return specialType;
        }

        public void setSpecialType(Integer specialType) {
            this.specialType = specialType;
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

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public Integer getPlayCount() {
            return playCount;
        }

        public void setPlayCount(Integer playCount) {
            this.playCount = playCount;
        }

        public Long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(Long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
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

        public Boolean getOrdered() {
            return ordered;
        }

        public void setOrdered(Boolean ordered) {
            this.ordered = ordered;
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

        public Object getOfficialPlaylistType() {
            return officialPlaylistType;
        }

        public void setOfficialPlaylistType(Object officialPlaylistType) {
            this.officialPlaylistType = officialPlaylistType;
        }

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

        public List<TracksBean> getTracks() {
            return tracks;
        }

        public void setTracks(List<TracksBean> tracks) {
            this.tracks = tracks;
        }

        public Object getVideoIds() {
            return videoIds;
        }

        public void setVideoIds(Object videoIds) {
            this.videoIds = videoIds;
        }

        public Object getVideos() {
            return videos;
        }

        public void setVideos(Object videos) {
            this.videos = videos;
        }

        public List<TrackIdsBean> getTrackIds() {
            return trackIds;
        }

        public void setTrackIds(List<TrackIdsBean> trackIds) {
            this.trackIds = trackIds;
        }

        public Integer getShareCount() {
            return shareCount;
        }

        public void setShareCount(Integer shareCount) {
            this.shareCount = shareCount;
        }

        public Integer getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
        }

        public Object getRemixVideo() {
            return remixVideo;
        }

        public void setRemixVideo(Object remixVideo) {
            this.remixVideo = remixVideo;
        }

        public Object getSharedUsers() {
            return sharedUsers;
        }

        public void setSharedUsers(Object sharedUsers) {
            this.sharedUsers = sharedUsers;
        }

        public Object getHistorySharedUsers() {
            return historySharedUsers;
        }

        public void setHistorySharedUsers(Object historySharedUsers) {
            this.historySharedUsers = historySharedUsers;
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

        public static class TracksBean {
            private String name;
            private Integer id;
            private Integer pst;
            private Integer t;
            private List<ArBean> ar;
            private List<?> alia;
            private Integer pop;
            private Integer st;
            private String rt;
            private Integer fee;
            private Integer v;
            private Object crbt;
            private String cf;
            private AlBean al;
            private Integer dt;
            private HBean h;
            private MBean m;
            private LBean l;
            private Object a;
            private String cd;
            private Integer no;
            private Object rtUrl;
            private Integer ftype;
            private List<?> rtUrls;
            private Integer djId;
            private Integer copyright;
            private Integer s_id;
            private Long mark;
            private Integer originCoverType;
            private Object originSongSimpleData;
            private Integer single;
            private Object noCopyrightRcmd;
            private Integer mst;
            private Integer cp;
            private Integer mv;
            private Integer rtype;
            private Object rurl;
            private Long publishTime;
            private PcBean pc;
            private List<String> tns;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public Integer getPst() {
                return pst;
            }

            public void setPst(Integer pst) {
                this.pst = pst;
            }

            public Integer getT() {
                return t;
            }

            public void setT(Integer t) {
                this.t = t;
            }

            public List<ArBean> getAr() {
                return ar;
            }

            public void setAr(List<ArBean> ar) {
                this.ar = ar;
            }

            public List<?> getAlia() {
                return alia;
            }

            public void setAlia(List<?> alia) {
                this.alia = alia;
            }

            public Integer getPop() {
                return pop;
            }

            public void setPop(Integer pop) {
                this.pop = pop;
            }

            public Integer getSt() {
                return st;
            }

            public void setSt(Integer st) {
                this.st = st;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public Integer getFee() {
                return fee;
            }

            public void setFee(Integer fee) {
                this.fee = fee;
            }

            public Integer getV() {
                return v;
            }

            public void setV(Integer v) {
                this.v = v;
            }

            public Object getCrbt() {
                return crbt;
            }

            public void setCrbt(Object crbt) {
                this.crbt = crbt;
            }

            public String getCf() {
                return cf;
            }

            public void setCf(String cf) {
                this.cf = cf;
            }

            public AlBean getAl() {
                return al;
            }

            public void setAl(AlBean al) {
                this.al = al;
            }

            public Integer getDt() {
                return dt;
            }

            public void setDt(Integer dt) {
                this.dt = dt;
            }

            public HBean getH() {
                return h;
            }

            public void setH(HBean h) {
                this.h = h;
            }

            public MBean getM() {
                return m;
            }

            public void setM(MBean m) {
                this.m = m;
            }

            public LBean getL() {
                return l;
            }

            public void setL(LBean l) {
                this.l = l;
            }

            public Object getA() {
                return a;
            }

            public void setA(Object a) {
                this.a = a;
            }

            public String getCd() {
                return cd;
            }

            public void setCd(String cd) {
                this.cd = cd;
            }

            public Integer getNo() {
                return no;
            }

            public void setNo(Integer no) {
                this.no = no;
            }

            public Object getRtUrl() {
                return rtUrl;
            }

            public void setRtUrl(Object rtUrl) {
                this.rtUrl = rtUrl;
            }

            public Integer getFtype() {
                return ftype;
            }

            public void setFtype(Integer ftype) {
                this.ftype = ftype;
            }

            public List<?> getRtUrls() {
                return rtUrls;
            }

            public void setRtUrls(List<?> rtUrls) {
                this.rtUrls = rtUrls;
            }

            public Integer getDjId() {
                return djId;
            }

            public void setDjId(Integer djId) {
                this.djId = djId;
            }

            public Integer getCopyright() {
                return copyright;
            }

            public void setCopyright(Integer copyright) {
                this.copyright = copyright;
            }

            public Integer getS_id() {
                return s_id;
            }

            public void setS_id(Integer s_id) {
                this.s_id = s_id;
            }

            public Long getMark() {
                return mark;
            }

            public void setMark(Long mark) {
                this.mark = mark;
            }

            public Integer getOriginCoverType() {
                return originCoverType;
            }

            public void setOriginCoverType(Integer originCoverType) {
                this.originCoverType = originCoverType;
            }

            public Object getOriginSongSimpleData() {
                return originSongSimpleData;
            }

            public void setOriginSongSimpleData(Object originSongSimpleData) {
                this.originSongSimpleData = originSongSimpleData;
            }

            public Integer getSingle() {
                return single;
            }

            public void setSingle(Integer single) {
                this.single = single;
            }

            public Object getNoCopyrightRcmd() {
                return noCopyrightRcmd;
            }

            public void setNoCopyrightRcmd(Object noCopyrightRcmd) {
                this.noCopyrightRcmd = noCopyrightRcmd;
            }

            public Integer getMst() {
                return mst;
            }

            public void setMst(Integer mst) {
                this.mst = mst;
            }

            public Integer getCp() {
                return cp;
            }

            public void setCp(Integer cp) {
                this.cp = cp;
            }

            public Integer getMv() {
                return mv;
            }

            public void setMv(Integer mv) {
                this.mv = mv;
            }

            public Integer getRtype() {
                return rtype;
            }

            public void setRtype(Integer rtype) {
                this.rtype = rtype;
            }

            public Object getRurl() {
                return rurl;
            }

            public void setRurl(Object rurl) {
                this.rurl = rurl;
            }

            public Long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(Long publishTime) {
                this.publishTime = publishTime;
            }

            public PcBean getPc() {
                return pc;
            }

            public void setPc(PcBean pc) {
                this.pc = pc;
            }

            public List<String> getTns() {
                return tns;
            }

            public void setTns(List<String> tns) {
                this.tns = tns;
            }

            public static class AlBean {
                private Integer id;
                private String name;
                private String picUrl;
                private List<?> tns;
                private String pic_str;
                private Long pic;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public List<?> getTns() {
                    return tns;
                }

                public void setTns(List<?> tns) {
                    this.tns = tns;
                }

                public String getPic_str() {
                    return pic_str;
                }

                public void setPic_str(String pic_str) {
                    this.pic_str = pic_str;
                }

                public Long getPic() {
                    return pic;
                }

                public void setPic(Long pic) {
                    this.pic = pic;
                }
            }

            public static class HBean {
                private Integer br;
                private Integer fid;
                private Integer size;
                private Float vd;

                public Integer getBr() {
                    return br;
                }

                public void setBr(Integer br) {
                    this.br = br;
                }

                public Integer getFid() {
                    return fid;
                }

                public void setFid(Integer fid) {
                    this.fid = fid;
                }

                public Integer getSize() {
                    return size;
                }

                public void setSize(Integer size) {
                    this.size = size;
                }

                public Float getVd() {
                    return vd;
                }

                public void setVd(Float vd) {
                    this.vd = vd;
                }
            }

            public static class MBean {
                private Integer br;
                private Integer fid;
                private Integer size;
                private Float vd;

                public Integer getBr() {
                    return br;
                }

                public void setBr(Integer br) {
                    this.br = br;
                }

                public Integer getFid() {
                    return fid;
                }

                public void setFid(Integer fid) {
                    this.fid = fid;
                }

                public Integer getSize() {
                    return size;
                }

                public void setSize(Integer size) {
                    this.size = size;
                }

                public Float getVd() {
                    return vd;
                }

                public void setVd(Float vd) {
                    this.vd = vd;
                }
            }

            public static class LBean {
                private Integer br;
                private Integer fid;
                private Integer size;
                private Float vd;

                public Integer getBr() {
                    return br;
                }

                public void setBr(Integer br) {
                    this.br = br;
                }

                public Integer getFid() {
                    return fid;
                }

                public void setFid(Integer fid) {
                    this.fid = fid;
                }

                public Integer getSize() {
                    return size;
                }

                public void setSize(Integer size) {
                    this.size = size;
                }

                public Float getVd() {
                    return vd;
                }

                public void setVd(Float vd) {
                    this.vd = vd;
                }
            }

            public static class PcBean {
                private String nickname;
                private String ar;
                private String fn;
                private String alb;
                private String cid;
                private Integer version;
                private Integer uid;
                private String sn;
                private Integer br;

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getAr() {
                    return ar;
                }

                public void setAr(String ar) {
                    this.ar = ar;
                }

                public String getFn() {
                    return fn;
                }

                public void setFn(String fn) {
                    this.fn = fn;
                }

                public String getAlb() {
                    return alb;
                }

                public void setAlb(String alb) {
                    this.alb = alb;
                }

                public String getCid() {
                    return cid;
                }

                public void setCid(String cid) {
                    this.cid = cid;
                }

                public Integer getVersion() {
                    return version;
                }

                public void setVersion(Integer version) {
                    this.version = version;
                }

                public Integer getUid() {
                    return uid;
                }

                public void setUid(Integer uid) {
                    this.uid = uid;
                }

                public String getSn() {
                    return sn;
                }

                public void setSn(String sn) {
                    this.sn = sn;
                }

                public Integer getBr() {
                    return br;
                }

                public void setBr(Integer br) {
                    this.br = br;
                }
            }

            public static class ArBean {
                private Integer id;
                private String name;
                private List<?> tns;
                private List<?> alias;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<?> getTns() {
                    return tns;
                }

                public void setTns(List<?> tns) {
                    this.tns = tns;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }
        }

        public static class TrackIdsBean {
            private Integer id;
            private Integer v;
            private Integer t;
            private Long at;
            private Object alg;
            private Integer uid;
            private String rcmdReason;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public Integer getV() {
                return v;
            }

            public void setV(Integer v) {
                this.v = v;
            }

            public Integer getT() {
                return t;
            }

            public void setT(Integer t) {
                this.t = t;
            }

            public Long getAt() {
                return at;
            }

            public void setAt(Long at) {
                this.at = at;
            }

            public Object getAlg() {
                return alg;
            }

            public void setAlg(Object alg) {
                this.alg = alg;
            }

            public Integer getUid() {
                return uid;
            }

            public void setUid(Integer uid) {
                this.uid = uid;
            }

            public String getRcmdReason() {
                return rcmdReason;
            }

            public void setRcmdReason(String rcmdReason) {
                this.rcmdReason = rcmdReason;
            }
        }
    }

    public static class PrivilegesBean {
        private Integer id;
        private Integer fee;
        private Integer payed;
        private Integer realPayed;
        private Integer st;
        private Integer pl;
        private Integer dl;
        private Integer sp;
        private Integer cp;
        private Integer subp;
        private Boolean cs;
        private Integer maxbr;
        private Integer fl;
        private Object pc;
        private Boolean toast;
        private Integer flag;
        private Boolean paidBigBang;
        private Boolean preSell;
        private Integer playMaxbr;
        private Integer downloadMaxbr;
        private Object rscl;
        private FreeTrialPrivilegeBean freeTrialPrivilege;
        private List<ChargeInfoListBean> chargeInfoList;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getFee() {
            return fee;
        }

        public void setFee(Integer fee) {
            this.fee = fee;
        }

        public Integer getPayed() {
            return payed;
        }

        public void setPayed(Integer payed) {
            this.payed = payed;
        }

        public Integer getRealPayed() {
            return realPayed;
        }

        public void setRealPayed(Integer realPayed) {
            this.realPayed = realPayed;
        }

        public Integer getSt() {
            return st;
        }

        public void setSt(Integer st) {
            this.st = st;
        }

        public Integer getPl() {
            return pl;
        }

        public void setPl(Integer pl) {
            this.pl = pl;
        }

        public Integer getDl() {
            return dl;
        }

        public void setDl(Integer dl) {
            this.dl = dl;
        }

        public Integer getSp() {
            return sp;
        }

        public void setSp(Integer sp) {
            this.sp = sp;
        }

        public Integer getCp() {
            return cp;
        }

        public void setCp(Integer cp) {
            this.cp = cp;
        }

        public Integer getSubp() {
            return subp;
        }

        public void setSubp(Integer subp) {
            this.subp = subp;
        }

        public Boolean getCs() {
            return cs;
        }

        public void setCs(Boolean cs) {
            this.cs = cs;
        }

        public Integer getMaxbr() {
            return maxbr;
        }

        public void setMaxbr(Integer maxbr) {
            this.maxbr = maxbr;
        }

        public Integer getFl() {
            return fl;
        }

        public void setFl(Integer fl) {
            this.fl = fl;
        }

        public Object getPc() {
            return pc;
        }

        public void setPc(Object pc) {
            this.pc = pc;
        }

        public Boolean getToast() {
            return toast;
        }

        public void setToast(Boolean toast) {
            this.toast = toast;
        }

        public Integer getFlag() {
            return flag;
        }

        public void setFlag(Integer flag) {
            this.flag = flag;
        }

        public Boolean getPaidBigBang() {
            return paidBigBang;
        }

        public void setPaidBigBang(Boolean paidBigBang) {
            this.paidBigBang = paidBigBang;
        }

        public Boolean getPreSell() {
            return preSell;
        }

        public void setPreSell(Boolean preSell) {
            this.preSell = preSell;
        }

        public Integer getPlayMaxbr() {
            return playMaxbr;
        }

        public void setPlayMaxbr(Integer playMaxbr) {
            this.playMaxbr = playMaxbr;
        }

        public Integer getDownloadMaxbr() {
            return downloadMaxbr;
        }

        public void setDownloadMaxbr(Integer downloadMaxbr) {
            this.downloadMaxbr = downloadMaxbr;
        }

        public Object getRscl() {
            return rscl;
        }

        public void setRscl(Object rscl) {
            this.rscl = rscl;
        }

        public FreeTrialPrivilegeBean getFreeTrialPrivilege() {
            return freeTrialPrivilege;
        }

        public void setFreeTrialPrivilege(FreeTrialPrivilegeBean freeTrialPrivilege) {
            this.freeTrialPrivilege = freeTrialPrivilege;
        }

        public List<ChargeInfoListBean> getChargeInfoList() {
            return chargeInfoList;
        }

        public void setChargeInfoList(List<ChargeInfoListBean> chargeInfoList) {
            this.chargeInfoList = chargeInfoList;
        }

        public static class FreeTrialPrivilegeBean {
            private Boolean resConsumable;
            private Boolean userConsumable;

            public Boolean getResConsumable() {
                return resConsumable;
            }

            public void setResConsumable(Boolean resConsumable) {
                this.resConsumable = resConsumable;
            }

            public Boolean getUserConsumable() {
                return userConsumable;
            }

            public void setUserConsumable(Boolean userConsumable) {
                this.userConsumable = userConsumable;
            }
        }

        public static class ChargeInfoListBean {
            private Integer rate;
            private Object chargeUrl;
            private Object chargeMessage;
            private Integer chargeType;

            public Integer getRate() {
                return rate;
            }

            public void setRate(Integer rate) {
                this.rate = rate;
            }

            public Object getChargeUrl() {
                return chargeUrl;
            }

            public void setChargeUrl(Object chargeUrl) {
                this.chargeUrl = chargeUrl;
            }

            public Object getChargeMessage() {
                return chargeMessage;
            }

            public void setChargeMessage(Object chargeMessage) {
                this.chargeMessage = chargeMessage;
            }

            public Integer getChargeType() {
                return chargeType;
            }

            public void setChargeType(Integer chargeType) {
                this.chargeType = chargeType;
            }
        }
    }
}
