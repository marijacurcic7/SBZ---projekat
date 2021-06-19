package com.flowershop.model;

import java.util.Date;

import org.kie.api.definition.type.Duration;
import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;


@Role(Role.Type.EVENT)
@Timestamp("executionTime")
// @Duration("duration")
@Expires("2d")
public class KupovinaEvent {

    private static final long serialVersionUID = 1L;

    private Date executionTime;

    private Long kupacId;

    private Long duration;

    private double iznos;


    public KupovinaEvent() {
        super();
    }

    public KupovinaEvent(Long kupacId, double iznos, Long duration) {
        super();
        this.executionTime = new Date();
        this.kupacId = kupacId;
        this.iznos = iznos;
        this.duration = duration;
    }

    public Date getExecutionTime() {
        return this.executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    public Long getKupacId() {
        return this.kupacId;
    }

    public void setKupacId(Long kupacId) {
        this.kupacId = kupacId;
    }

    public double getIznos() {
        return this.iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }


    public Long getDuration() {
        return this.duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }



    
}
