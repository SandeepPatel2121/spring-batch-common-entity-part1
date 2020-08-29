package com.fixed.utility.util;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bypt-dev-laptop-9
 */
@MappedSuperclass
@Getter
@Setter
public class AbstractDomain implements Serializable {
    
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updatedDate;

    private String updatedBy;

    @PrePersist
    public void updateCreateddDate() {
        createdDate = updatedDate = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @PreUpdate
    public void updateUpdatedDate() {
        updatedDate = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
    
}
