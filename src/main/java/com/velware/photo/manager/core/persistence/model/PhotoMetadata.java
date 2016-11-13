package com.velware.photo.manager.core.persistence.model;


import javax.persistence.*;

@Entity
@Table(name = "PHOTO_METADATA")
public class PhotoMetadata {

    private Long id;
    private String originalUri;
    private String uri;
    private String dateTaken;
    private String checkSum;
    private String fileName;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "PHOTO_METADATA_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "ORIGINAL_URI",length = 2000)
    public String getOriginalUri() {
        return originalUri;
    }

    public void setOriginalUri(String originalUri) {
        this.originalUri = originalUri;
    }

    @Column(name = "URI")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Column(name = "DATE_TAKEN")
    @Temporal(TemporalType.DATE)
    public String getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
    }

    @Column(name = "CHECKSUM")
    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

    @Column(name = "FILE_NAME")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "PhotoMetadata{" +
                "id=" + id +
                ", originalUri='" + originalUri + '\'' +
                ", uri='" + uri + '\'' +
                ", dateTaken='" + dateTaken + '\'' +
                ", checkSum='" + checkSum + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
