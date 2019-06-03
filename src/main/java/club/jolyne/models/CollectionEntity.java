package club.jolyne.models;

import javax.persistence.*;

@Entity
@Table(name = "COLLECTION", schema = "MOCK", catalog = "")
public class CollectionEntity {
    private int collectionId;
    private UserEntity userByUserId;
    private ExhiEntity exhiByExhiId;

    @Id
    @Column(name = "COLLECTION_ID", nullable = false)
    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollectionEntity that = (CollectionEntity) o;

        if (collectionId != that.collectionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return collectionId;
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
