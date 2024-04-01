package appbd.daoAtiv;

import appbd.daoAtiv.Aluno;
import appbd.daoAtiv.Publicacao;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-01T15:13:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Emprestimo.class)
public class Emprestimo_ { 

    public static volatile SingularAttribute<Emprestimo, Integer> idEmprestimo;
    public static volatile SingularAttribute<Emprestimo, Date> dataEmprestimo;
    public static volatile SingularAttribute<Emprestimo, Aluno> idAluno;
    public static volatile SingularAttribute<Emprestimo, Publicacao> codigoPublicacao;
    public static volatile SingularAttribute<Emprestimo, Date> dataDevolucao;

}