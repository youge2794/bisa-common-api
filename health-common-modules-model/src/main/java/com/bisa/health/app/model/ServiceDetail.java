package com.bisa.health.app.model;

import com.bisa.health.app.enumerate.ActivateEnum;
import com.bisa.health.app.enumerate.ServiceType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "e_service", indexes = {@Index(columnList = "user_guid")})
public class ServiceDetail implements Serializable {

    private static final long serialVersionUID = 8620973614906844066L;

    private int id;
    private int userGuid;
    private Date finishedTime;            //服务到期时间
    private ActivateEnum isActive;        //是否有效（1-有效,；0-无效）
    private int count;                    //剩余次数
    private ServiceType serviceType;      //服务类型
    private ServiceCategory category;     //服务类别
    @Version
    private int version;                  //乐观锁，版本控制

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "user_guid")
    public int getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(int userGuid) {
        this.userGuid = userGuid;
    }

    @Column(name = "finished_time")
    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    @Column(name = "is_active")
    @Enumerated(EnumType.ORDINAL)
    public ActivateEnum getIsActive() {
        return isActive;
    }

    public void setIsActive(ActivateEnum isActive) {
        this.isActive = isActive;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "service_type")
    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    @Cascade(value = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.SAVE_UPDATE})
    @ManyToOne
    @JoinColumn(name = "sid")
    public ServiceCategory getCategory() {
        return category;
    }

    public void setCategory(ServiceCategory category) {
        this.category = category;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public ServiceDetail() {
        super();
    }

    @Override
    public String toString() {
        return "ServiceDetail{" +
                "id=" + id +
                ", userGuid=" + userGuid +
                ", finishedTime=" + finishedTime +
                ", isActive=" + isActive +
                ", count=" + count +
                ", serviceType=" + serviceType +
                ", category=" + category +
                ", version=" + version +
                '}';
    }

    public static ServiceDetail byCategory(List<ServiceDetail> list, String name) {
        for (ServiceDetail serviceDetail : list) {
            if (name.equals(serviceDetail.getCategory().getName())) {
                return serviceDetail;
            }
        }
        return null;
    }

}
