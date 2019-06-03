package club.jolyne.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "ART", schema = "MOCK", catalog = "")
public class ArtEntity {
    private int artId;
    private String name;
    private String picUrl;
    private String listPic;
    private String pic;
    private ExhiEntity exhiByExhiId;

    @Id
    @Column(name = "ART_ID", nullable = false)
    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
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
    @Column(name = "PIC_URL", nullable = true, length = -1)
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Basic
    @Column(name = "LIST_PIC", nullable = true, length = -1)
    public String getListPic() {
        return listPic;
    }

    public void setListPic(String listPic) {
        this.listPic = listPic;
    }

    @Basic
    @Column(name = "PIC", nullable = true, length = -1)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtEntity artEntity = (ArtEntity) o;

        if (artId != artEntity.artId) return false;
        if (name != null ? !name.equals(artEntity.name) : artEntity.name != null) return false;
        if (picUrl != null ? !picUrl.equals(artEntity.picUrl) : artEntity.picUrl != null) return false;
        if (listPic != null ? !listPic.equals(artEntity.listPic) : artEntity.listPic != null) return false;
        if (pic != null ? !pic.equals(artEntity.pic) : artEntity.pic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (picUrl != null ? picUrl.hashCode() : 0);
        result = 31 * result + (listPic != null ? listPic.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "EXHI_ID", referencedColumnName = "EXHIBITID", nullable = false)
    public ExhiEntity getExhiByExhiId() {
        return exhiByExhiId;
    }

    public void setExhiByExhiId(ExhiEntity exhiByExhiId) {
        this.exhiByExhiId = exhiByExhiId;
    }
}
