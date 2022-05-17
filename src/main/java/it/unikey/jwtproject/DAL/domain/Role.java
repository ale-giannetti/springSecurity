package it.unikey.jwtproject.DAL.domain;

import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<User> user = new ArrayList<>();
}
