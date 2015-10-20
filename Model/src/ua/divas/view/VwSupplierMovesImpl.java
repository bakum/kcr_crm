package ua.divas.view;

import java.math.BigDecimal;

import java.sql.SQLException;

import java.util.Calendar;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewObjectImpl;

import ua.divas.classes.DivasView;
import ua.divas.module.AppModuleImpl;
import ua.divas.view.common.VwSupplierMoves;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 24 20:16:32 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VwSupplierMovesImpl extends DivasView implements VwSupplierMoves {
    /**
     * This is the default constructor (do not remove).
     */
    public VwSupplierMovesImpl() {
    }
    
    public Date getDateFirst() throws SQLException {
        Calendar calendar = Calendar.getInstance();
        //calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH)); // это будет начало месяца
        //calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // это будет конец месяца
        //calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR)); // это будет конец года
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMinimum(Calendar.DAY_OF_YEAR)); // это будет начало года
        java.util.Date pDate = calendar.getTime();
        oracle.jbo.domain.Date dbDate= new oracle.jbo.domain.Date(new java.sql.Date(pDate.getTime()));
        //oracle.jbo.domain.Date time = new oracle.jbo.domain.Date(pDate);
        return dbDate;
    }
    
    public Date getDateLast() throws SQLException {
        Calendar calendar = Calendar.getInstance();
        //calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH)); // это будет начало месяца
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // это будет конец месяца
        //calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR)); // это будет конец года
        //calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMinimum(Calendar.DAY_OF_YEAR)); // это будет начало года
        java.util.Date pDate = calendar.getTime();
        oracle.jbo.domain.Date dbDate= new oracle.jbo.domain.Date(new java.sql.Date(pDate.getTime()));
        //oracle.jbo.domain.Date time = new oracle.jbo.domain.Date(pDate);
        return dbDate;
    }

    private boolean isDeleted(String kontragId) {
        AppModuleImpl am = (AppModuleImpl) this.getApplicationModule();
        VwKontragAllItemsImpl kg = am.getVwKontragAllItems1();
        boolean ret = true;
        Row[] filteredRows = kg.getFilteredRows("Id", kontragId);
        if (filteredRows.length > 0) {
            Row rw = filteredRows[0];
            Integer del = (Integer) rw.getAttribute("Deleted");
            if (del.intValue() == 0) {
                ret = false;
            }
        }
        return ret;
    }

    public void addSelectedRowsObj(String kassaId) {
        RowSet duplicateRowSet = this.createRowSet("duplicateRowSet");
        duplicateRowSet.first();
        Row currentRow = this.getCurrentRow();
        boolean currentRowDeleted = false;
        Row[] rowsToDelete = duplicateRowSet.getFilteredRows("Mark", 1);
        try {
            if (rowsToDelete.length > 0) {
                for (Row rw : rowsToDelete) {
                    if (rw.getKey().equals(currentRow.getKey())) {
                        currentRowDeleted = true;
                    }
                    String kontragId = (String) rw.getAttribute("KontragId");
                    if (isDeleted(kontragId)) continue;
                    String OrderId = (String) rw.getAttribute("RegistratorId");
                    oracle.jbo.domain.Number Summa = (oracle.jbo.domain.Number) rw.getAttribute("BallForOrder");
                    AppModuleImpl am = (AppModuleImpl) this.getApplicationModule();
                    if (Summa.bigDecimalValue().floatValue() < 0) {
                        am.addRkoOrder(kassaId, kontragId, OrderId, Summa.bigDecimalValue().abs());
                    } else {
                        am.addPkoOrder(kassaId, kontragId, OrderId, Summa.bigDecimalValue());
                    }

                    //deleteRec(pId, pTableName);
                }
                this.executeQuery();
                if (!currentRowDeleted) {
                    this.setCurrentRow(currentRow);
                }

            }
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        } finally {
            duplicateRowSet.closeRowSet();
        }
    }

    /**
     * Returns the bind variable value for u_name.
     * @return bind variable value for u_name
     */
    public String getu_name() {
        return (String) getNamedWhereClauseParam("u_name");
    }

    /**
     * Sets <code>value</code> for bind variable u_name.
     * @param value value to bind as u_name
     */
    public void setu_name(String value) {
        setNamedWhereClauseParam("u_name", value);
    }
}

