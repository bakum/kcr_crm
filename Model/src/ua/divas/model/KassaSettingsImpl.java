package ua.divas.model;

import java.util.UUID;

import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;

import ua.divas.classes.DivasEntityNoDelete;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 28 16:32:33 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class KassaSettingsImpl extends DivasEntityNoDelete {
    
    @Override
    protected void callId() {
        this.setId(UUID.randomUUID().toString());
    }
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        UserId,
        KassaId,
        Kassa,
        Users;
        private static AttributesEnum[] vals = null;
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
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int KASSAID = AttributesEnum.KassaId.index();
    public static final int KASSA = AttributesEnum.Kassa.index();
    public static final int USERS = AttributesEnum.Users.index();

    /**
     * This is the default constructor (do not remove).
     */
    public KassaSettingsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("ua.divas.model.KassaSettings");
    }


    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public String getId() {
        return (String) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(String value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the value of UserId
     */
    public String getUserId() {
        return (String) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(String value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for KassaId, using the alias name KassaId.
     * @return the value of KassaId
     */
    public String getKassaId() {
        return (String) getAttributeInternal(KASSAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for KassaId.
     * @param value value to set the KassaId
     */
    public void setKassaId(String value) {
        setAttributeInternal(KASSAID, value);
    }

    /**
     * @return the associated entity KassaImpl.
     */
    public KassaImpl getKassa() {
        return (KassaImpl) getAttributeInternal(KASSA);
    }

    /**
     * Sets <code>value</code> as the associated entity KassaImpl.
     */
    public void setKassa(KassaImpl value) {
        setAttributeInternal(KASSA, value);
    }

    /**
     * @return the associated entity UsersImpl.
     */
    public UsersImpl getUsers() {
        return (UsersImpl) getAttributeInternal(USERS);
    }

    /**
     * Sets <code>value</code> as the associated entity UsersImpl.
     */
    public void setUsers(UsersImpl value) {
        setAttributeInternal(USERS, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String id) {
        return new Key(new Object[] { id });
    }


}
