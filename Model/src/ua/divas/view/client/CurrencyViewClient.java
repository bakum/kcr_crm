package ua.divas.view.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import ua.divas.view.common.CurrencyView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 13 18:58:22 EEST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CurrencyViewClient extends ViewUsageImpl implements CurrencyView {
    /**
     * This is the default constructor (do not remove).
     */
    public CurrencyViewClient() {
    }

    public void doCurrencyExchange() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "doCurrencyExchange", null, null);
        return;
    }
}

