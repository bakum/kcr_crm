package ua.divas.view.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import ua.divas.view.common.VwSupplierMoves;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 05 21:58:33 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VwSupplierMovesClient extends ViewUsageImpl implements VwSupplierMoves {
    /**
     * This is the default constructor (do not remove).
     */
    public VwSupplierMovesClient() {
    }

    public void addSelectedRowsObj(String kassaId) {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "addSelectedRowsObj", new String[] {
                                                                         "java.lang.String" }, new Object[] {
                                                                         kassaId });
        return;
    }
}

