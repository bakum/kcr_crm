package ua.divas.view.common;

import oracle.jbo.ViewObject;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 16 16:55:41 EEST 2015
// ---------------------------------------------------------------------
public interface PkoView extends ViewObject {
    void addEntry(String _id);

    void removeEntry(String _id);

    String getOperationName(String Id);
}

