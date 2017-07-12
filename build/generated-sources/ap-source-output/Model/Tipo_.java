package Model;

import Model.Peticion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-12T16:02:20")
@StaticMetamodel(Tipo.class)
public class Tipo_ { 

    public static volatile SingularAttribute<Tipo, String> registroBitacora;
    public static volatile SingularAttribute<Tipo, String> nombretipo;
    public static volatile CollectionAttribute<Tipo, Peticion> peticionCollection;
    public static volatile SingularAttribute<Tipo, Integer> idtipo;
    public static volatile SingularAttribute<Tipo, String> usuarioBitacora;
    public static volatile SingularAttribute<Tipo, Date> fechaBitacora;

}