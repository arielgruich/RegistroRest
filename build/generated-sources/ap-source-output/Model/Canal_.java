package Model;

import Model.Peticion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-12T16:02:20")
@StaticMetamodel(Canal.class)
public class Canal_ { 

    public static volatile SingularAttribute<Canal, String> nombrecanal;
    public static volatile SingularAttribute<Canal, Integer> idcanal;
    public static volatile SingularAttribute<Canal, String> registroBitacora;
    public static volatile CollectionAttribute<Canal, Peticion> peticionCollection;
    public static volatile SingularAttribute<Canal, String> usuarioBitacora;
    public static volatile SingularAttribute<Canal, Date> fechaBitacora;

}