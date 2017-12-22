package ru.eleron.osa.lris.otcenka.entity;

import javax.persistence.*;

@Entity
@Table(name="test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="text")
    private String text;

    public Test(){}
    public Test(String text){
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
