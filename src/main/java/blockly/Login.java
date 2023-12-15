package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Login {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 15/12/2023, 09:13:45
 *
 */
public static Var trueAdmin() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.database.Operations.query(Var.valueOf("app.entity.UserRole"),Var.valueOf("select \n	u \nfrom \n	UserRole u  \nwhere \n	u.user.normalizedUserName = :userNormalizedUserName AND \n	u.role.builtIn = true"),Var.valueOf("userNormalizedUserName",
    cronapi.text.Operations.normalize(
    cronapi.util.Operations.getCurrentUserName())));
    if (
    cronapi.database.Operations.hasElement(item).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction(Var.valueOf("blockly.js.blockly.Periodo.mostraModal"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

