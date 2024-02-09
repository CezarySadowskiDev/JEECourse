package encje;

import encje.Wykonawca;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-08T11:02:34")
@StaticMetamodel(Album.class)
public class Album_ { 

    public static volatile SingularAttribute<Album, Wykonawca> wykonawca;
    public static volatile SingularAttribute<Album, Long> id;
    public static volatile SingularAttribute<Album, Long> version;
    public static volatile SingularAttribute<Album, String> tytul;
    public static volatile SingularAttribute<Album, Integer> rok;

}