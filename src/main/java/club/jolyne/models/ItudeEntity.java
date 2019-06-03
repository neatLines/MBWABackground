package club.jolyne.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "ITUDE", schema = "MOCK", catalog = "")
public class ItudeEntity {
    private int itudeId;
    private String address;
    private Double longitude;
    private Double latitude;
    private ExhiEntity exhiByExhiid;

    @Id
    @Column(name = "ITUDE_ID", nullable = false)
    public int getItudeId() {
        return itudeId;
    }

    public void setItudeId(int itudeId) {
        this.itudeId = itudeId;
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
    @Column(name = "LONGITUDE", nullable = true, precision = 6)
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "LATITUDE", nullable = true, precision = 6)
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItudeEntity that = (ItudeEntity) o;

        if (itudeId != that.itudeId) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itudeId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "EXHIID", referencedColumnName = "EXHIBITID", nullable = false)
    public ExhiEntity getExhiByExhiid() {
        return exhiByExhiid;
    }

    public void setExhiByExhiid(ExhiEntity exhiByExhiid) {
        this.exhiByExhiid = exhiByExhiid;
    }
}
