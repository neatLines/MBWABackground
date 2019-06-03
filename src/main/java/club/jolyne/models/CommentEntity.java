package club.jolyne.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "COMMENT", schema = "MOCK", catalog = "")
public class CommentEntity {
    private int commentId;
    private String date;
    private String icon;
    private String comment;
    private String name;
    private UserEntity userByUserId;
    private ExhiEntity exhiByExhiId;

    private int userId;
    private String username;

    private int exhiId;
    private String exhiName;

    @Id
    @Column(name = "COMMENT_ID", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "DATE", nullable = true, length = 255)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "ICON", nullable = true, length = 255)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "COMMENT", nullable = true, length = -1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Transient
    public int getExhiId() {
        return exhiId;
    }

    public void setExhiId(int exhiId) {
        this.exhiId = exhiId;
    }

    @Transient
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Transient
    public String getExhiName() {
        return exhiName;
    }

    public void setExhiName(String exhiName) {
        this.exhiName = exhiName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (commentId != that.commentId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne(fetch=FetchType.EAGER )
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @JsonIgnore
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "EXHI_ID", referencedColumnName = "EXHIBITID")
    public ExhiEntity getExhiByExhiId() {
        return exhiByExhiId;
    }

    public void setExhiByExhiId(ExhiEntity exhiByExhiId) {
        this.exhiByExhiId = exhiByExhiId;
    }
}
