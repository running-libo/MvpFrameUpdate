package com.example.apple.mvpframe.videobean;

/**
 * create by libo
 * create on 2018/12/27
 * description
 */
public class VideoBean {

    private int id;
    private int userId;
    private int channelId;
    private int originId;
    private String content;
    private int downloadAllow;
    private double duration;
    private int videoSize;
    private int status;
    private String location;
    private Object lat;
    private Object lon;
    private String cover;
    private String coverWidthHeight;
    private int visibleType;
    private int likeCount;
    private int playCount;
    private int replyCount;
    private int forwardCount;
    private String createTime;
    private String updatedTime;
    private String videoUrl;
    private Object highVideoUrl;
    private Object normVideoUrl;
    private Object videoM3u8Url;
    private Object isLossless;
    private String phoneModel;
    private String phoneOs;
    private UserInfoDtoBean userInfoDto;
    private double scoreAvg;
    private Object commentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getOriginId() {
        return originId;
    }

    public void setOriginId(int originId) {
        this.originId = originId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDownloadAllow() {
        return downloadAllow;
    }

    public void setDownloadAllow(int downloadAllow) {
        this.downloadAllow = downloadAllow;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(int videoSize) {
        this.videoSize = videoSize;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Object getLon() {
        return lon;
    }

    public void setLon(Object lon) {
        this.lon = lon;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCoverWidthHeight() {
        return coverWidthHeight;
    }

    public void setCoverWidthHeight(String coverWidthHeight) {
        this.coverWidthHeight = coverWidthHeight;
    }

    public int getVisibleType() {
        return visibleType;
    }

    public void setVisibleType(int visibleType) {
        this.visibleType = visibleType;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Object getHighVideoUrl() {
        return highVideoUrl;
    }

    public void setHighVideoUrl(Object highVideoUrl) {
        this.highVideoUrl = highVideoUrl;
    }

    public Object getNormVideoUrl() {
        return normVideoUrl;
    }

    public void setNormVideoUrl(Object normVideoUrl) {
        this.normVideoUrl = normVideoUrl;
    }

    public Object getVideoM3u8Url() {
        return videoM3u8Url;
    }

    public void setVideoM3u8Url(Object videoM3u8Url) {
        this.videoM3u8Url = videoM3u8Url;
    }

    public Object getIsLossless() {
        return isLossless;
    }

    public void setIsLossless(Object isLossless) {
        this.isLossless = isLossless;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneOs() {
        return phoneOs;
    }

    public void setPhoneOs(String phoneOs) {
        this.phoneOs = phoneOs;
    }

    public UserInfoDtoBean getUserInfoDto() {
        return userInfoDto;
    }

    public void setUserInfoDto(UserInfoDtoBean userInfoDto) {
        this.userInfoDto = userInfoDto;
    }

    public double getScoreAvg() {
        return scoreAvg;
    }

    public void setScoreAvg(double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }

    public Object getCommentList() {
        return commentList;
    }

    public void setCommentList(Object commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "VideoBean{" +
                "id=" + id +
                ", userId=" + userId +
                ", channelId=" + channelId +
                ", originId=" + originId +
                ", content='" + content + '\'' +
                ", downloadAllow=" + downloadAllow +
                ", duration=" + duration +
                ", videoSize=" + videoSize +
                ", status=" + status +
                ", location='" + location + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", cover='" + cover + '\'' +
                ", coverWidthHeight='" + coverWidthHeight + '\'' +
                ", visibleType=" + visibleType +
                ", likeCount=" + likeCount +
                ", playCount=" + playCount +
                ", replyCount=" + replyCount +
                ", forwardCount=" + forwardCount +
                ", createTime='" + createTime + '\'' +
                ", updatedTime='" + updatedTime + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", highVideoUrl=" + highVideoUrl +
                ", normVideoUrl=" + normVideoUrl +
                ", videoM3u8Url=" + videoM3u8Url +
                ", isLossless=" + isLossless +
                ", phoneModel='" + phoneModel + '\'' +
                ", phoneOs='" + phoneOs + '\'' +
                ", userInfoDto=" + userInfoDto +
                ", scoreAvg=" + scoreAvg +
                ", commentList=" + commentList +
                '}';
    }

    public static class UserInfoDtoBean {
        private int id;
        private String nickName;
        private String avatar;
        private int sex;
        private String cover;
        private String signature;
        private int vipType;
        private int fansCount;
        private int followCount;
        private int workCount;
        private int relationStatus;
        private String interests;
        private String hivideoId;
        private int goodCount;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getFansCount() {
            return fansCount;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public int getFollowCount() {
            return followCount;
        }

        public void setFollowCount(int followCount) {
            this.followCount = followCount;
        }

        public int getWorkCount() {
            return workCount;
        }

        public void setWorkCount(int workCount) {
            this.workCount = workCount;
        }

        public int getRelationStatus() {
            return relationStatus;
        }

        public void setRelationStatus(int relationStatus) {
            this.relationStatus = relationStatus;
        }

        public String getInterests() {
            return interests;
        }

        public void setInterests(String interests) {
            this.interests = interests;
        }

        public String getHivideoId() {
            return hivideoId;
        }

        public void setHivideoId(String hivideoId) {
            this.hivideoId = hivideoId;
        }

        public int getGoodCount() {
            return goodCount;
        }

        public void setGoodCount(int goodCount) {
            this.goodCount = goodCount;
        }
    }
}
