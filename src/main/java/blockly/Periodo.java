package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Periodo {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 15/12/2023, 09:15:34
 *
 */
public static Var obterPeriodoAtivo() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.list.Operations.getFirst((
cronapi.database.Operations.query(Var.valueOf("app.entity.Periodo"),Var.valueOf("select \n	p.ativo \nfrom \n	Periodo p  \nwhere \n	p.ativo = true"))));
   }
 }.call();
}

}

