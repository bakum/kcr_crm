package ua.divas.view;

import java.sql.SQLException;
import java.sql.Timestamp;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import oracle.jbo.Row;
import oracle.jbo.Variable;
import oracle.jbo.common.VariableImpl;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jbo.server.ViewRowSetImpl;

import org.codehaus.groovy.runtime.InvokerHelper;

import ua.divas.classes.DivasView;
import ua.divas.view.common.RkoView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 15 16:14:32 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RkoViewImpl extends DivasView implements RkoView {
    /**
     * This is the default constructor (do not remove).
     */
    public RkoViewImpl() {
    }
    
    public java.sql.Timestamp getDateLast() throws SQLException {
        Calendar calendar = Calendar.getInstance();
        //calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH)); // это будет начало месяца
        //calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // это будет конец месяца
        //calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR)); // это будет конец года
        //calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMinimum(Calendar.DAY_OF_YEAR)); // это будет начало года
        calendar.set(1970, Calendar.JANUARY, 01);
        java.util.Date pDate = calendar.getTime();
        java.sql.Timestamp dbDate= new java.sql.Timestamp(pDate.getTime());
        //oracle.jbo.domain.Date time = new oracle.jbo.domain.Date(pDate);
        return dbDate;
    }
    
    public String getOperationName(String Id) {
        String _id = (String) callStoredFunction(VARCHAR2, "RKO_ENTRY.get_operationname(?)", new Object[] { Id });
        if (_id.equals("none"))
            return null;
        else
            return _id;
    }
    
    private ViewRowSetImpl getSettingsRowSet() {
        VariableImpl z = new VariableImpl();
        z.setName("UserKey");
        ViewObjectImpl vo = (ViewObjectImpl) this.getRootApplicationModule().findViewObject("UserSettingsView1");
        ViewRowSetImpl rs =
            (ViewRowSetImpl) vo.findByViewCriteriaWithBindVars(vo.getViewCriteria("FilterSettingsByUser"), -1,
                                                               vo.QUERY_MODE_SCAN_DATABASE_TABLES, new Variable[] { z }, new Object[] {
                                                               this.getSessionUserId() });
        return rs;
    }

    public String retrieveCurrencyId() {
        ViewRowSetImpl rs = this.getSettingsRowSet();
        Row row = rs.first();
        if (row != null) {
            String rv = (String) row.getAttribute("CurrencyId");
            return rv;
        }
        return null;
    }
    
    public String retrieveDivisionId() {
        ViewRowSetImpl rs = this.getSettingsRowSet();
        Row row = rs.first();
        if (row != null) {
            String rv = (String) row.getAttribute("DivisionId");
            return rv;
        }
        return null;
    }
    
    public String retrieveKassaId() {
        ViewRowSetImpl rs = this.getSettingsRowSet();
        Row row = rs.first();
        if (row != null) {
            String rv = (String) row.getAttribute("KassaId");
            return rv;
        }
        return null;
    }
    
    public String retrieveActivitiesId() {
        ViewRowSetImpl rs = this.getSettingsRowSet();
        Row row = rs.first();
        if (row != null) {
            String rv = (String) row.getAttribute("ActivitiesId");
            return rv;
        }
        return null;
    }
    
    public String retrieveOperationId() {
        ViewObjectImpl vo = (ViewObjectImpl) this.getRootApplicationModule().findViewObject("OperationRkoView1");
        ViewRowSetImpl rs =
            (ViewRowSetImpl) vo.findByViewCriteria(vo.getViewCriteria("OperationRkoOther"),
                                                   -1, vo.QUERY_MODE_SCAN_DATABASE_TABLES);
        Row row = rs.first();
        if (row != null) {
            String rv = (String) row.getAttribute("Id");
            return rv;
        }
        return null;
    }
    
    public void addEntry(String _id) {
        callStoredProcedure("RKO_ENTRY.rko_move_plan_acc(?)", new Object[] { _id });
    }
    
    public void removeEntry(String _id) {
        callStoredProcedure("RKO_ENTRY.rko_remove_plan_acc(?)", new Object[] { _id });
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

    /**
     * Returns the variable value for s_dat.
     * @return variable value for s_dat
     */
    public Timestamp gets_dat() {
        return (Timestamp) ensureVariableManager().getVariableValue("s_dat");
    }

    /**
     * Sets <code>value</code> for variable s_dat.
     * @param value value to bind as s_dat
     */
    public void sets_dat(Timestamp value) {
        ensureVariableManager().setVariableValue("s_dat", value);
    }

    private class AgrFuncHelper extends HashMap {
        private static final long serialVersionUID = 1L;
        private String funcName;

        public AgrFuncHelper(String funcName) {
            super();
            this.funcName = funcName;
        }


        public Object get(Object key) {
            //Invoke private method
            //of our DefaultRowSet (sum,count,avg,min,max)
            //key is argument expression for the aggr funcion being called
            //sum("Salary")

            return InvokerHelper.invokeMethod(getDefaultRowSet(), funcName, key);
        }


    }
    
    public Map getSum() {
        return new AgrFuncHelper("sum");
    }

    public Map getCount() {
        return new AgrFuncHelper("count");
    }
}

