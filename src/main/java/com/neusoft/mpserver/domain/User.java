package com.neusoft.mpserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * user映射实体类
 * @name fandp
 * @email fandp@neusoft.com
 */
@Data
@Entity
@Table(name = "SIPO_MP_USER")
public class User {
   //id
    @Id
    private String id;
    //姓名
    private String username;
    //密码
    private String password;
    //注册时间
    private String createTime;
/*
    @OneToMany(cascade={ CascadeType.ALL })
    @JoinColumn(name="id")
    private Collection<AddressRule> addresses = new ArrayList<AddressRule>();
*/


}
