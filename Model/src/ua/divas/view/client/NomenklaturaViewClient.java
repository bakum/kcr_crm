package ua.divas.view.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import ua.divas.view.common.NomenklaturaView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 10 22:49:48 EET 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NomenklaturaViewClient extends ViewUsageImpl implements NomenklaturaView {
    /**
     * This is the default constructor (do not remove).
     */
    public NomenklaturaViewClient() {
    }

    public void findNomByParent(String parent) {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "findNomByParent", new String[] {
                                                                         "java.lang.String" }, new Object[] { parent });
        return;
    }
}
