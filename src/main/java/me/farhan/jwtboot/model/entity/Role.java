package me.farhan.jwtboot.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_roles")
public class Role {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotNull
  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy="role")
  private Set<User> ancestors = new HashSet<User>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<User> getAncestors() {
    return ancestors;
  }

  public void setAncestors(Set<User> ancestors) {
    this.ancestors = ancestors;
  }
}
