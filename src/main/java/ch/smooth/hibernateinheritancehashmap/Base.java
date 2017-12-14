package ch.smooth.hibernateinheritancehashmap;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class Base {


    @Id
    @GeneratedValue
    Long id;

    String type;
}
