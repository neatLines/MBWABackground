package club.jolyne.models;

import javax.persistence.*;

@Entity
@Table(name = "TRAVEL", schema = "MOCK", catalog = "")
public class TravelEntity {
    private int travelId;
    private String date;
    private String remarks;
    private UserEntity userByUserId;
    private ExhiEntity exhiByExhiId;

    @Id
    @Column(name = "TRAVEL_ID", nullable = false)
    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
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
    @Column(name = "REMARKS", nullable = true, length = -1)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelEntity that = (TravelEntity) o;

        if (travelId != that.travelId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = travelId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
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
