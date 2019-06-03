package club.jolyne.models;

import javax.persistence.*;

@Entity
@Table(name = "CHECK", schema = "MOCK", catalog = "")
public class CheckEntity {
    private int checkId;
    private UserEntity userByUserId;
    private ExhiEntity exhiByExhiId;

    @Id
    @Column(name = "CHECK_ID", nullable = false)
    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckEntity that = (CheckEntity) o;

        if (checkId != that.checkId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return checkId;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "EXHI_ID", referencedColumnName = "EXHIBITID")
    public ExhiEntity getExhiByExhiId() {
        return exhiByExhiId;
    }

    public void setExhiByExhiId(ExhiEntity exhiByExhiId) {
        this.exhiByExhiId = exhiByExhiId;
    }
}
