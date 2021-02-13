package club.codedemo.jpaindexes;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 学生.
 *
 * @author panjie
 */
@Entity
@Table(indexes = @Index(name = "index_name", columnList = "name"))
public class Student implements Serializable {
  @Id
  @GeneratedValue
  private Long id;

  /**
   * 姓名.
   */
  private String name;

  /**
   * 学号.
   */
  private String sno;

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

  public String getSno() {
    return sno;
  }

  public void setSno(String sno) {
    this.sno = sno;
  }
}
