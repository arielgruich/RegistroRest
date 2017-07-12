package Model;

import Model.Canal;
import Model.Tipo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-12T16:02:20")
@StaticMetamodel(Peticion.class)
public class Peticion_ { 

    public static volatile SingularAttribute<Peticion, Tipo> tipo;
    public static volatile SingularAttribute<Peticion, String> registroBitacora;
    public static volatile SingularAttribute<Peticion, Integer> idpeticion;
    public static volatile SingularAttribute<Peticion, String> telefono1;
    public static volatile SingularAttribute<Peticion, Canal> canal;
    public static volatile SingularAttribute<Peticion, String> usuarioBitacora;
    public static volatile SingularAttribute<Peticion, String> nombre;
    public static volatile SingularAttribute<Peticion, Date> fechaBitacora;

}