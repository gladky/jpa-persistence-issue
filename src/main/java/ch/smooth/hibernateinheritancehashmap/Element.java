package ch.smooth.hibernateinheritancehashmap;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Element {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;

    private String text;

    @OneToMany(cascade = CascadeType.ALL)
    private Map<String, Base> map;


    public Element(String text, Map<String, Base> map) {
        this.text = text;
        this.map = map;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<String, Base> getMap() {
        return map;
    }

    public void setMap(Map<String, Base> map) {
        this.map = map;
    }

}
