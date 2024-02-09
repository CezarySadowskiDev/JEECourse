package encje;

import encje.Album;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-08T11:02:34")
@StaticMetamodel(Wykonawca.class)
public class Wykonawca_ { 

    public static volatile SingularAttribute<Wykonawca, Long> id;
    public static volatile CollectionAttribute<Wykonawca, Album> albumy;
    public static volatile SingularAttribute<Wykonawca, Long> version;
    public static volatile SingularAttribute<Wykonawca, String> nazwa;

}