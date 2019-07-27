package pl.sda.java.aquiz.aquizapp.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user")
    private Long idUser;

    @Column(name="user_name")
    private String userName;

    @Column(name="nick_name")
    private String nickName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String passowrd;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="user_role")
    private Set<RoleEntity> roles;

    public void addRole(RoleEntity roleEntity){
       if (roles == null){
           roles = new HashSet<>();
       }
       roles.add(roleEntity);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", passowrd='" + passowrd + '\'' +
                ", roles=" + roles +
                '}';
    }
}
