package com.example.springboot_security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_tabel")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
    private String name;
    private String password;
    @ManyToMany
    @JoinTable(name = "user_role",
    joinColumns={@JoinColumn(name="user_id",referencedColumnName ="user_id" )},
    inverseJoinColumns = {@JoinColumn(name="role_id",referencedColumnName = "role_id")})
    private List<Role> roles;



}
