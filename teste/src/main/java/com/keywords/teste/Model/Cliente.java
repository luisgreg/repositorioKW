package com.keywords.teste.Model;

import com.keywords.teste.Enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "CLIENT_KW")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FK")
    private Long id;

    @Column(name = "CLIENT_NAME")
    private String name;

    @Column(name = "CLIENT_STATUS")
    private Status status;

    @Column(name = "CLIENT_CODE")
    private Integer code;

    public Cliente(String name, Status status, Integer code) {
        this.name = name;
        this.status = status;
        this.code = code;
    }

    public Cliente() {

    }
}
