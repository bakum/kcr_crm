package ua.divas.view;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;

import ua.divas.model.KontragentsImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 24 12:12:08 EEST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class KontragentsViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_KONTRAGENTS = 0;

    @Override
    public boolean isAttributeUpdateable(int i) {
        BigDecimal editable = this.getEditable();
        if (editable.intValue()==0) {
            return false;
        } else { 
        return super.isAttributeUpdateable(i);
            }
    }

    @Override
    protected void create(AttributeList attributeList) {
        this.setEditable(new BigDecimal(1));
        //this.setForValidation(new Integer(2));
        super.create(attributeList);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        IsGroup,
        ParentId,
        Fullname,
        Deleted,
        Inn,
        Okpo,
        Kpp,
        Namefull,
        UrFiz,
        Version,
        Predefined,
        Editable,
        IsSupplier,
        IsBuyer,
        IsMeasurer,
        UserId,
        Photo,
        TotalSumm,
        TotalOplat,
        DebtBuyer,
        CountContacts,
        KontragentsView,
        CompaignsDetailsView,
        ContactDetailsView,
        OrdersView,
        ContactDetailsView1,
        OrdersTpUslugiView,
        OrdersView1,
        OrderZamerView,
        OrderZamerView1,
        OrdersTpUslugiView1,
        OrdersTpRashodyView,
        OrdersTpNachisleniaView,
        OrdersTpOplatyView,
        VwBuyerMoves,
        VwSales,
        CallLogView,
        VwSupplierMoves,
        KontragSettingsView,
        ProfitDistribTpView,
        KontragentsView1,
        UsersView1;
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
    public static final int ISGROUP = AttributesEnum.IsGroup.index();
    public static final int PARENTID = AttributesEnum.ParentId.index();
    public static final int FULLNAME = AttributesEnum.Fullname.index();
    public static final int DELETED = AttributesEnum.Deleted.index();
    public static final int INN = AttributesEnum.Inn.index();
    public static final int OKPO = AttributesEnum.Okpo.index();
    public static final int KPP = AttributesEnum.Kpp.index();
    public static final int NAMEFULL = AttributesEnum.Namefull.index();
    public static final int URFIZ = AttributesEnum.UrFiz.index();
    public static final int VERSION = AttributesEnum.Version.index();
    public static final int PREDEFINED = AttributesEnum.Predefined.index();
    public static final int EDITABLE = AttributesEnum.Editable.index();
    public static final int ISSUPPLIER = AttributesEnum.IsSupplier.index();
    public static final int ISBUYER = AttributesEnum.IsBuyer.index();
    public static final int ISMEASURER = AttributesEnum.IsMeasurer.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int PHOTO = AttributesEnum.Photo.index();
    public static final int TOTALSUMM = AttributesEnum.TotalSumm.index();
    public static final int TOTALOPLAT = AttributesEnum.TotalOplat.index();
    public static final int DEBTBUYER = AttributesEnum.DebtBuyer.index();
    public static final int COUNTCONTACTS = AttributesEnum.CountContacts.index();
    public static final int KONTRAGENTSVIEW = AttributesEnum.KontragentsView.index();
    public static final int COMPAIGNSDETAILSVIEW = AttributesEnum.CompaignsDetailsView.index();
    public static final int CONTACTDETAILSVIEW = AttributesEnum.ContactDetailsView.index();
    public static final int ORDERSVIEW = AttributesEnum.OrdersView.index();
    public static final int CONTACTDETAILSVIEW1 = AttributesEnum.ContactDetailsView1.index();
    public static final int ORDERSTPUSLUGIVIEW = AttributesEnum.OrdersTpUslugiView.index();
    public static final int ORDERSVIEW1 = AttributesEnum.OrdersView1.index();
    public static final int ORDERZAMERVIEW = AttributesEnum.OrderZamerView.index();
    public static final int ORDERZAMERVIEW1 = AttributesEnum.OrderZamerView1.index();
    public static final int ORDERSTPUSLUGIVIEW1 = AttributesEnum.OrdersTpUslugiView1.index();
    public static final int ORDERSTPRASHODYVIEW = AttributesEnum.OrdersTpRashodyView.index();
    public static final int ORDERSTPNACHISLENIAVIEW = AttributesEnum.OrdersTpNachisleniaView.index();
    public static final int ORDERSTPOPLATYVIEW = AttributesEnum.OrdersTpOplatyView.index();
    public static final int VWBUYERMOVES = AttributesEnum.VwBuyerMoves.index();
    public static final int VWSALES = AttributesEnum.VwSales.index();
    public static final int CALLLOGVIEW = AttributesEnum.CallLogView.index();
    public static final int VWSUPPLIERMOVES = AttributesEnum.VwSupplierMoves.index();
    public static final int KONTRAGSETTINGSVIEW = AttributesEnum.KontragSettingsView.index();
    public static final int PROFITDISTRIBTPVIEW = AttributesEnum.ProfitDistribTpView.index();
    public static final int KONTRAGENTSVIEW1 = AttributesEnum.KontragentsView1.index();
    public static final int USERSVIEW1 = AttributesEnum.UsersView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public KontragentsViewRowImpl() {
    }

    /**
     * Gets Kontragents entity object.
     * @return the Kontragents
     */
    public KontragentsImpl getKontragents() {
        return (KontragentsImpl) getEntity(ENTITY_KONTRAGENTS);
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
     * Gets the attribute value for IS_GROUP using the alias name IsGroup.
     * @return the IS_GROUP
     */
    public Integer getIsGroup() {
        return (Integer) getAttributeInternal(ISGROUP);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_GROUP using the alias name IsGroup.
     * @param value value to set the IS_GROUP
     */
    public void setIsGroup(Integer value) {
        setAttributeInternal(ISGROUP, value);
    }

    /**
     * Gets the attribute value for PARENT_ID using the alias name ParentId.
     * @return the PARENT_ID
     */
    public String getParentId() {
        return (String) getAttributeInternal(PARENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_ID using the alias name ParentId.
     * @param value value to set the PARENT_ID
     */
    public void setParentId(String value) {
        setAttributeInternal(PARENTID, value);
    }


    /**
     * Gets the attribute value for FULLNAME using the alias name Fullname.
     * @return the FULLNAME
     */
    public String getFullname() {
        return (String) getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FULLNAME using the alias name Fullname.
     * @param value value to set the FULLNAME
     */
    public void setFullname(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the attribute value for DELETED using the alias name Deleted.
     * @return the DELETED
     */
    public Integer getDeleted() {
        return (Integer) getAttributeInternal(DELETED);
    }

    /**
     * Sets <code>value</code> as attribute value for DELETED using the alias name Deleted.
     * @param value value to set the DELETED
     */
    public void setDeleted(Integer value) {
        setAttributeInternal(DELETED, value);
    }

    /**
     * Gets the attribute value for INN using the alias name Inn.
     * @return the INN
     */
    public String getInn() {
        return (String) getAttributeInternal(INN);
    }

    /**
     * Sets <code>value</code> as attribute value for INN using the alias name Inn.
     * @param value value to set the INN
     */
    public void setInn(String value) {
        setAttributeInternal(INN, value);
    }

    /**
     * Gets the attribute value for OKPO using the alias name Okpo.
     * @return the OKPO
     */
    public String getOkpo() {
        return (String) getAttributeInternal(OKPO);
    }

    /**
     * Sets <code>value</code> as attribute value for OKPO using the alias name Okpo.
     * @param value value to set the OKPO
     */
    public void setOkpo(String value) {
        setAttributeInternal(OKPO, value);
    }

    /**
     * Gets the attribute value for KPP using the alias name Kpp.
     * @return the KPP
     */
    public String getKpp() {
        return (String) getAttributeInternal(KPP);
    }

    /**
     * Sets <code>value</code> as attribute value for KPP using the alias name Kpp.
     * @param value value to set the KPP
     */
    public void setKpp(String value) {
        setAttributeInternal(KPP, value);
    }

    /**
     * Gets the attribute value for NAMEFULL using the alias name Namefull.
     * @return the NAMEFULL
     */
    public String getNamefull() {
        return (String) getAttributeInternal(NAMEFULL);
    }

    /**
     * Sets <code>value</code> as attribute value for NAMEFULL using the alias name Namefull.
     * @param value value to set the NAMEFULL
     */
    public void setNamefull(String value) {
        setAttributeInternal(NAMEFULL, value);
    }

    /**
     * Gets the attribute value for UR_FIZ using the alias name UrFiz.
     * @return the UR_FIZ
     */
    public Integer getUrFiz() {
        return (Integer) getAttributeInternal(URFIZ);
    }

    /**
     * Sets <code>value</code> as attribute value for UR_FIZ using the alias name UrFiz.
     * @param value value to set the UR_FIZ
     */
    public void setUrFiz(Integer value) {
        setAttributeInternal(URFIZ, value);
    }

    /**
     * Gets the attribute value for VERSION using the alias name Version.
     * @return the VERSION
     */
    public Timestamp getVersion() {
        return (Timestamp) getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as attribute value for VERSION using the alias name Version.
     * @param value value to set the VERSION
     */
    public void setVersion(Timestamp value) {
        setAttributeInternal(VERSION, value);
    }

    /**
     * Gets the attribute value for PREDEFINED using the alias name Predefined.
     * @return the PREDEFINED
     */
    public Integer getPredefined() {
        return (Integer) getAttributeInternal(PREDEFINED);
    }

    /**
     * Sets <code>value</code> as attribute value for PREDEFINED using the alias name Predefined.
     * @param value value to set the PREDEFINED
     */
    public void setPredefined(Integer value) {
        setAttributeInternal(PREDEFINED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Editable.
     * @return the Editable
     */
    public BigDecimal getEditable() {
        return (BigDecimal) getAttributeInternal(EDITABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Editable.
     * @param value value to set the  Editable
     */
    public void setEditable(BigDecimal value) {
        setAttributeInternal(EDITABLE, value);
    }


    /**
     * Gets the attribute value for IS_BUYER using the alias name IsBuyer.
     * @return the IS_BUYER
     */
    public Integer getIsBuyer() {
        return (Integer) getAttributeInternal(ISBUYER);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_BUYER using the alias name IsBuyer.
     * @param value value to set the IS_BUYER
     */
    public void setIsBuyer(Integer value) {
        setAttributeInternal(ISBUYER, value);
    }

    /**
     * Gets the attribute value for IS_MEASURER using the alias name IsMeasurer.
     * @return the IS_MEASURER
     */
    public Integer getIsMeasurer() {
        return (Integer) getAttributeInternal(ISMEASURER);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_MEASURER using the alias name IsMeasurer.
     * @param value value to set the IS_MEASURER
     */
    public void setIsMeasurer(Integer value) {
        setAttributeInternal(ISMEASURER, value);
    }

    /**
     * Gets the attribute value for USER_ID using the alias name UserId.
     * @return the USER_ID
     */
    public String getUserId() {
        return (String) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_ID using the alias name UserId.
     * @param value value to set the USER_ID
     */
    public void setUserId(String value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalSumm.
     * @return the TotalSumm
     */
    public Number getTotalSumm() {
        return (Number) getAttributeInternal(TOTALSUMM);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalOplat.
     * @return the TotalOplat
     */
    public Number getTotalOplat() {
        return (Number) getAttributeInternal(TOTALOPLAT);
    }


    /**
     * Gets the attribute value for the calculated attribute DebtBuyer.
     * @return the DebtBuyer
     */
    public Number getDebtBuyer() {
        return (Number) getAttributeInternal(DEBTBUYER);
    }


    /**
     * Gets the attribute value for the calculated attribute CountContacts.
     * @return the CountContacts
     */
    public Number getCountContacts() {
        return (Number) getAttributeInternal(COUNTCONTACTS);
    }

    /**
     * Gets the attribute value for PHOTO using the alias name Photo.
     * @return the PHOTO
     */
    public BlobDomain getPhoto() {
        return (BlobDomain) getAttributeInternal(PHOTO);
    }

    /**
     * Sets <code>value</code> as attribute value for PHOTO using the alias name Photo.
     * @param value value to set the PHOTO
     */
    public void setPhoto(BlobDomain value) {
        setAttributeInternal(PHOTO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link KontragentsView.
     */
    public RowIterator getKontragentsView() {
        return (RowIterator) getAttributeInternal(KONTRAGENTSVIEW);
    }

    /**
     * Gets the attribute value for IS_SUPPLIER using the alias name IsSupplier.
     * @return the IS_SUPPLIER
     */
    public Integer getIsSupplier() {
        return (Integer) getAttributeInternal(ISSUPPLIER);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_SUPPLIER using the alias name IsSupplier.
     * @param value value to set the IS_SUPPLIER
     */
    public void setIsSupplier(Integer value) {
        setAttributeInternal(ISSUPPLIER, value);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CompaignsDetailsView.
     */
    public RowIterator getCompaignsDetailsView() {
        return (RowIterator) getAttributeInternal(COMPAIGNSDETAILSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ContactDetailsView.
     */
    public RowIterator getContactDetailsView() {
        return (RowIterator) getAttributeInternal(CONTACTDETAILSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersView.
     */
    public RowIterator getOrdersView() {
        return (RowIterator) getAttributeInternal(ORDERSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ContactDetailsView1.
     */
    public RowIterator getContactDetailsView1() {
        return (RowIterator) getAttributeInternal(CONTACTDETAILSVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersTpUslugiView.
     */
    public RowIterator getOrdersTpUslugiView() {
        return (RowIterator) getAttributeInternal(ORDERSTPUSLUGIVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersView1.
     */
    public RowIterator getOrdersView1() {
        return (RowIterator) getAttributeInternal(ORDERSVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrderZamerView.
     */
    public RowIterator getOrderZamerView() {
        return (RowIterator) getAttributeInternal(ORDERZAMERVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrderZamerView1.
     */
    public RowIterator getOrderZamerView1() {
        return (RowIterator) getAttributeInternal(ORDERZAMERVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersTpUslugiView1.
     */
    public RowIterator getOrdersTpUslugiView1() {
        return (RowIterator) getAttributeInternal(ORDERSTPUSLUGIVIEW1);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersTpRashodyView.
     */
    public RowIterator getOrdersTpRashodyView() {
        return (RowIterator) getAttributeInternal(ORDERSTPRASHODYVIEW);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersTpNachisleniaView.
     */
    public RowIterator getOrdersTpNachisleniaView() {
        return (RowIterator) getAttributeInternal(ORDERSTPNACHISLENIAVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrdersTpOplatyView.
     */
    public RowIterator getOrdersTpOplatyView() {
        return (RowIterator) getAttributeInternal(ORDERSTPOPLATYVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VwBuyerMoves.
     */
    public RowIterator getVwBuyerMoves() {
        return (RowIterator) getAttributeInternal(VWBUYERMOVES);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VwSales.
     */
    public RowIterator getVwSales() {
        return (RowIterator) getAttributeInternal(VWSALES);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link CallLogView.
     */
    public RowIterator getCallLogView() {
        return (RowIterator) getAttributeInternal(CALLLOGVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VwSupplierMoves.
     */
    public RowIterator getVwSupplierMoves() {
        return (RowIterator) getAttributeInternal(VWSUPPLIERMOVES);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link KontragSettingsView.
     */
    public RowIterator getKontragSettingsView() {
        return (RowIterator) getAttributeInternal(KONTRAGSETTINGSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ProfitDistribTpView.
     */
    public RowIterator getProfitDistribTpView() {
        return (RowIterator) getAttributeInternal(PROFITDISTRIBTPVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> KontragentsView1.
     */
    public RowSet getKontragentsView1() {
        return (RowSet) getAttributeInternal(KONTRAGENTSVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UsersView1.
     */
    public RowSet getUsersView1() {
        return (RowSet) getAttributeInternal(USERSVIEW1);
    }
}
