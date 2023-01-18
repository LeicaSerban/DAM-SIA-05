package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Pretendenti {
    private Integer idPretendent;
    private String nume;
    private Integer age;

    @Id
    @Column(name = "id_pretendent")
    public Integer getIdPretendent() {
        return idPretendent;
    }

    public void setIdPretendent(Integer idPretendent) {
        this.idPretendent = idPretendent;
    }

    @Basic
    @Column(name = "nume")
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pretendenti that = (Pretendenti) o;
        return Objects.equals(idPretendent, that.idPretendent) && Objects.equals(nume, that.nume) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPretendent, nume, age);
    }
}
