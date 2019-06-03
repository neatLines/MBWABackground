package club.jolyne.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "EXHI", schema = "MOCK", catalog = "")
public class ExhiEntity {
    private int exhibitid;
    private String name;
    private String fname;
    private String englishName;
    private String videoUrl;
    private String videoTitle;
    private String videoPic;
    private String startDate;
    private String endDate;
    private String address;
    private String bigPic;
    private String topPic;
    private String panoramaBgPic;
    private String panoramaUrl;
    private String content;
    private String pic;
    private String isInMessage;
    private String realPic;
    private Collection<ArtEntity> artsByExhibitid;
    private Collection<CheckEntity> checksByExhibitid;
    private Collection<CollectionEntity> collectionsByExhibitid;
    private Collection<CommentEntity> commentsByExhibitid;
    private Collection<ItudeEntity> itudesByExhibitid;
    private Collection<TravelEntity> travelsByExhibitid;

    @Id
    @Column(name = "EXHIBITID", nullable = false)
    public int getExhibitid() {
        return exhibitid;
    }

    public void setExhibitid(int exhibitid) {
        this.exhibitid = exhibitid;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "FNAME", nullable = true, length = 255)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "ENGLISH_NAME", nullable = true, length = 255)
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Basic
    @Column(name = "VIDEO_URL", nullable = true, length = -1)
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Basic
    @Column(name = "VIDEO_TITLE", nullable = true, length = -1)
    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    @Basic
    @Column(name = "VIDEO_PIC", nullable = true, length = -1)
    public String getVideoPic() {
        return videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic;
    }

    @Basic
    @Column(name = "START_DATE", nullable = true, length = 255)
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true, length = 255)
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "BIG_PIC", nullable = true, length = -1)
    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    @Basic
    @Column(name = "TOP_PIC", nullable = true, length = -1)
    public String getTopPic() {
        return topPic;
    }

    public void setTopPic(String topPic) {
        this.topPic = topPic;
    }

    @Basic
    @Column(name = "PANORAMA_BG_PIC", nullable = true, length = -1)
    public String getPanoramaBgPic() {
        return panoramaBgPic;
    }

    public void setPanoramaBgPic(String panoramaBgPic) {
        this.panoramaBgPic = panoramaBgPic;
    }

    @Basic
    @Column(name = "PANORAMA_URL", nullable = true, length = -1)
    public String getPanoramaUrl() {
        return panoramaUrl;
    }

    public void setPanoramaUrl(String panoramaUrl) {
        this.panoramaUrl = panoramaUrl;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "PIC", nullable = true, length = -1)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "IS_IN_MESSAGE", nullable = true, length = -1)
    public String getIsInMessage() {
        return isInMessage;
    }

    public void setIsInMessage(String isInMessage) {
        this.isInMessage = isInMessage;
    }

    @Basic
    @Column(name = "REAL_PIC", nullable = true, length = -1)
    public String getRealPic() {
        return realPic;
    }

    public void setRealPic(String realPic) {
        this.realPic = realPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExhiEntity that = (ExhiEntity) o;

        if (exhibitid != that.exhibitid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fname != null ? !fname.equals(that.fname) : that.fname != null) return false;
        if (englishName != null ? !englishName.equals(that.englishName) : that.englishName != null) return false;
        if (videoUrl != null ? !videoUrl.equals(that.videoUrl) : that.videoUrl != null) return false;
        if (videoTitle != null ? !videoTitle.equals(that.videoTitle) : that.videoTitle != null) return false;
        if (videoPic != null ? !videoPic.equals(that.videoPic) : that.videoPic != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (bigPic != null ? !bigPic.equals(that.bigPic) : that.bigPic != null) return false;
        if (topPic != null ? !topPic.equals(that.topPic) : that.topPic != null) return false;
        if (panoramaBgPic != null ? !panoramaBgPic.equals(that.panoramaBgPic) : that.panoramaBgPic != null)
            return false;
        if (panoramaUrl != null ? !panoramaUrl.equals(that.panoramaUrl) : that.panoramaUrl != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (isInMessage != null ? !isInMessage.equals(that.isInMessage) : that.isInMessage != null) return false;
        if (realPic != null ? !realPic.equals(that.realPic) : that.realPic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = exhibitid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (englishName != null ? englishName.hashCode() : 0);
        result = 31 * result + (videoUrl != null ? videoUrl.hashCode() : 0);
        result = 31 * result + (videoTitle != null ? videoTitle.hashCode() : 0);
        result = 31 * result + (videoPic != null ? videoPic.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (bigPic != null ? bigPic.hashCode() : 0);
        result = 31 * result + (topPic != null ? topPic.hashCode() : 0);
        result = 31 * result + (panoramaBgPic != null ? panoramaBgPic.hashCode() : 0);
        result = 31 * result + (panoramaUrl != null ? panoramaUrl.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (isInMessage != null ? isInMessage.hashCode() : 0);
        result = 31 * result + (realPic != null ? realPic.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "exhiByExhiId", fetch=FetchType.EAGER)
    public Collection<ArtEntity> getArtsByExhibitid() {
        return artsByExhibitid;
    }

    public void setArtsByExhibitid(Collection<ArtEntity> artsByExhibitid) {
        this.artsByExhibitid = artsByExhibitid;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "exhiByExhiId")
    public Collection<CheckEntity> getChecksByExhibitid() {
        return checksByExhibitid;
    }

    public void setChecksByExhibitid(Collection<CheckEntity> checksByExhibitid) {
        this.checksByExhibitid = checksByExhibitid;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "exhiByExhiId")
    public Collection<CollectionEntity> getCollectionsByExhibitid() {
        return collectionsByExhibitid;
    }

    public void setCollectionsByExhibitid(Collection<CollectionEntity> collectionsByExhibitid) {
        this.collectionsByExhibitid = collectionsByExhibitid;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "exhiByExhiId")
    public Collection<CommentEntity> getCommentsByExhibitid() {
        return commentsByExhibitid;
    }

    public void setCommentsByExhibitid(Collection<CommentEntity> commentsByExhibitid) {
        this.commentsByExhibitid = commentsByExhibitid;
    }

    @OneToMany(mappedBy = "exhiByExhiid",  fetch=FetchType.EAGER)
    public Collection<ItudeEntity> getItudesByExhibitid() {
        return itudesByExhibitid;
    }

    public void setItudesByExhibitid(Collection<ItudeEntity> itudesByExhibitid) {
        this.itudesByExhibitid = itudesByExhibitid;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "exhiByExhiId")
    public Collection<TravelEntity> getTravelsByExhibitid() {
        return travelsByExhibitid;
    }

    public void setTravelsByExhibitid(Collection<TravelEntity> travelsByExhibitid) {
        this.travelsByExhibitid = travelsByExhibitid;
    }
}
