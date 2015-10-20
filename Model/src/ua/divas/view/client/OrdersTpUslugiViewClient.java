package ua.divas.view.client;

import java.math.BigDecimal;

import oracle.jbo.client.remote.ViewUsageImpl;

import ua.divas.view.common.OrdersTpUslugiView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 12 21:14:16 EET 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrdersTpUslugiViewClient extends ViewUsageImpl implements OrdersTpUslugiView {
    /**
     * This is the default constructor (do not remove).
     */
    public OrdersTpUslugiViewClient() {
    }


    public String retrieveMeasure(String NomId) {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "retrieveMeasure", new String[] {
                                                                         "java.lang.String" }, new Object[] { NomId });
        return (String) _ret;
    }

    public BigDecimal retrievePrice(String NomId) {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "retrievePrice", new String[] {
                                                                         "java.lang.String" }, new Object[] { NomId });
        return (BigDecimal) _ret;
    }

    public BigDecimal retrieveSumm(BigDecimal p, BigDecimal q) {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "retrieveSumm", new String[] {
                                                                         "java.math.BigDecimal", "java.math.BigDecimal"
        }, new Object[] { p, q });
        return (BigDecimal) _ret;
    }
}

