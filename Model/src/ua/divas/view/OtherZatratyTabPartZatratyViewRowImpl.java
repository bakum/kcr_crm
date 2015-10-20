package ua.divas.view;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;

import ua.divas.model.OtherZatratyTabPartZatratyImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 10 21:53:14 EET 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OtherZatratyTabPartZatratyViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_OTHERZATRATYTABPARTZATRATY = 0;

    @Override
    public boolean isAttributeUpdateable(int i) {
        BigDecimal editable = this.getOthtpEditable();
        if (editable.intValue()==0) {
            return false;
        } else { 
        return super.isAttributeUpdateable(i);
            }
    }

    @Override
    protected void create(AttributeList attributeList) {
        this.setOthtpEditable(new BigDecimal(1));
        super.create(attributeList);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        OthId,
        ZatrId,
        Zatrname,
        Summa,
        OthtpEditable,
        ZatratyView1;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int OTHID = AttributesEnum.OthId.index();
    public static final int ZATRID = AttributesEnum.ZatrId.index();
    public static final int ZATRNAME = AttributesEnum.Zatrname.index();
    public static final int SUMMA = AttributesEnum.Summa.index();
    public static final int OTHTPEDITABLE = AttributesEnum.OthtpEditable.index();
    public static final int ZATRATYVIEW1 = AttributesEnum.ZatratyView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OtherZatratyTabPartZatratyViewRowImpl() {
    }

    /**
     * Gets OtherZatratyTabPartZatraty entity object.
     * @return the OtherZatratyTabPartZatraty
     */
    public OtherZatratyTabPartZatratyImpl getOtherZatratyTabPartZatraty() {
        return (OtherZatratyTabPartZatratyImpl) getEntity(ENTITY_OTHERZATRATYTABPARTZATRATY);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public String getId() {
        return (String) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(String value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for OTH_ID using the alias name OthId.
     * @return the OTH_ID
     */
    public String getOthId() {
        return (String) getAttributeInternal(OTHID);
    }

    /**
     * Sets <code>value</code> as attribute value for OTH_ID using the alias name OthId.
     * @param value value to set the OTH_ID
     */
    public void setOthId(String value) {
        setAttributeInternal(OTHID, value);
    }

    /**
     * Gets the attribute value for ZATR_ID using the alias name ZatrId.
     * @return the ZATR_ID
     */
    public String getZatrId() {
        return (String) getAttributeInternal(ZATRID);
    }

    /**
     * Sets <code>value</code> as attribute value for ZATR_ID using the alias name ZatrId.
     * @param value value to set the ZATR_ID
     */
    public void setZatrId(String value) {
        setAttributeInternal(ZATRID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Zatrname.
     * @return the Zatrname
     */
    public String getZatrname() {
        return (String) getAttributeInternal(ZATRNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Zatrname.
     * @param value value to set the  Zatrname
     */
    public void setZatrname(String value) {
        setAttributeInternal(ZATRNAME, value);
    }

    /**
     * Gets the attribute value for SUMMA using the alias name Summa.
     * @return the SUMMA
     */
    public BigDecimal getSumma() {
        return (BigDecimal) getAttributeInternal(SUMMA);
    }

    /**
     * Sets <code>value</code> as attribute value for SUMMA using the alias name Summa.
     * @param value value to set the SUMMA
     */
    public void setSumma(BigDecimal value) {
        setAttributeInternal(SUMMA, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OthtpEditable.
     * @return the OthtpEditable
     */
    public BigDecimal getOthtpEditable() {
        return (BigDecimal) getAttributeInternal(OTHTPEDITABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OthtpEditable.
     * @param value value to set the  OthtpEditable
     */
    public void setOthtpEditable(BigDecimal value) {
        setAttributeInternal(OTHTPEDITABLE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ZatratyView1.
     */
    public RowSet getZatratyView1() {
        return (RowSet) getAttributeInternal(ZATRATYVIEW1);
    }
}
