package club.jolyne.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "USER", schema = "MOCK", catalog = "")
public class UserEntity {
    private int id;
    private int openId;
    private String username;
    private String phoneNumber;
    private Integer sex;
    private Collection<CheckEntity> checksById;
    private Collection<CollectionEntity> collectionsById;
    private Collection<CommentEntity> commentsById;
    private Collection<TravelEntity> travelsById;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "OPEN_ID", nullable = false)
    public int getOpenId() {
        return openId;
    }

    public void setOpenId(int openId) {
        this.openId = openId;
    }

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true, length = 255)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "SEX", nullable = true)
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (openId != that.openId) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + openId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserId")
    public Collection<CheckEntity> getChecksById() {
        return checksById;
    }

    public void setChecksById(Collection<CheckEntity> checksById) {
        this.checksById = checksById;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserId")
    public Collection<CollectionEntity> getCollectionsById() {
        return collectionsById;
    }

    public void setCollectionsById(Collection<CollectionEntity> collectionsById) {
        this.collectionsById = collectionsById;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserId")
    public Collection<CommentEntity> getCommentsById() {
        return commentsById;
    }

    public void setCommentsById(Collection<CommentEntity> commentsById) {
        this.commentsById = commentsById;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserId")
    public Collection<TravelEntity> getTravelsById() {
        return travelsById;
    }

    public void setTravelsById(Collection<TravelEntity> travelsById) {
        this.travelsById = travelsById;
    }
}
