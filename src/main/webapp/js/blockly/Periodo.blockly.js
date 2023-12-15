window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Periodo = window.blockly.js.blockly.Periodo || {};

/**
 * @function mostraModal
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 13/12/2023, 11:44:45
 *
 */
window.blockly.js.blockly.Periodo.mostraModalArgs = [];
window.blockly.js.blockly.Periodo.mostraModal = async function() {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Periodo:obterPeriodoAtivo', async function(sender_item) {
      item = sender_item;
    //
    console.log(item);
    //
    if (!item) {
      //
      this.cronapi.notification.confirmDialogAlert('info', 'Você não tem nenhum período ativo.', '', this.cronapi.notification.buttonConfirmDialogAlert('true', 'Ok, entendi!', async function() {
        }.bind(this)));
    }
  }.bind(this));
}
