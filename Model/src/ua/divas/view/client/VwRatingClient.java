package ua.divas.view.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import ua.divas.view.common.VwRating;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 16 12:41:28 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VwRatingClient extends ViewUsageImpl implements VwRating {
    /**
     * This is the default constructor (do not remove).
     */
    public VwRatingClient() {
    }

    public String retrieveKontragName(String Id) {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "retrieveKontragName", new String[] {
                                                                         "java.lang.String" }, new Object[] { Id });
        return (String) _ret;
    }
}

