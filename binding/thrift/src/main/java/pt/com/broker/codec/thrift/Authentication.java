/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package pt.com.broker.codec.thrift;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.nio.ByteBuffer;
import java.util.*;

class Authentication implements org.apache.thrift.TBase<Authentication, Authentication._Fields>, java.io.Serializable, Cloneable, Comparable<Authentication> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Authentication");

  private static final org.apache.thrift.protocol.TField ACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("action_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AUTHENTICATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("authentication_type", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("user_id", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("roles", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthenticationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthenticationTupleSchemeFactory());
  }

  public String action_id; // optional
  public String authentication_type; // required
  public ByteBuffer token; // required
  public String user_id; // optional
  public List<String> roles; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTION_ID((short)1, "action_id"),
    AUTHENTICATION_TYPE((short)2, "authentication_type"),
    TOKEN((short)3, "token"),
    USER_ID((short)4, "user_id"),
    ROLES((short)5, "roles");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACTION_ID
          return ACTION_ID;
        case 2: // AUTHENTICATION_TYPE
          return AUTHENTICATION_TYPE;
        case 3: // TOKEN
          return TOKEN;
        case 4: // USER_ID
          return USER_ID;
        case 5: // ROLES
          return ROLES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.ACTION_ID,_Fields.USER_ID,_Fields.ROLES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("action_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AUTHENTICATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("authentication_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("user_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Authentication.class, metaDataMap);
  }

  public Authentication() {
  }

  public Authentication(
    String authentication_type,
    ByteBuffer token)
  {
    this();
    this.authentication_type = authentication_type;
    this.token = token;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Authentication(Authentication other) {
    if (other.isSetAction_id()) {
      this.action_id = other.action_id;
    }
    if (other.isSetAuthentication_type()) {
      this.authentication_type = other.authentication_type;
    }
    if (other.isSetToken()) {
      this.token = org.apache.thrift.TBaseHelper.copyBinary(other.token);
;
    }
    if (other.isSetUser_id()) {
      this.user_id = other.user_id;
    }
    if (other.isSetRoles()) {
      List<String> __this__roles = new ArrayList<String>(other.roles);
      this.roles = __this__roles;
    }
  }

  public Authentication deepCopy() {
    return new Authentication(this);
  }

  @Override
  public void clear() {
    this.action_id = null;
    this.authentication_type = null;
    this.token = null;
    this.user_id = null;
    this.roles = null;
  }

  public String getAction_id() {
    return this.action_id;
  }

  public Authentication setAction_id(String action_id) {
    this.action_id = action_id;
    return this;
  }

  public void unsetAction_id() {
    this.action_id = null;
  }

  /** Returns true if field action_id is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_id() {
    return this.action_id != null;
  }

  public void setAction_idIsSet(boolean value) {
    if (!value) {
      this.action_id = null;
    }
  }

  public String getAuthentication_type() {
    return this.authentication_type;
  }

  public Authentication setAuthentication_type(String authentication_type) {
    this.authentication_type = authentication_type;
    return this;
  }

  public void unsetAuthentication_type() {
    this.authentication_type = null;
  }

  /** Returns true if field authentication_type is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthentication_type() {
    return this.authentication_type != null;
  }

  public void setAuthentication_typeIsSet(boolean value) {
    if (!value) {
      this.authentication_type = null;
    }
  }

  public byte[] getToken() {
    setToken(org.apache.thrift.TBaseHelper.rightSize(token));
    return token == null ? null : token.array();
  }

  public ByteBuffer bufferForToken() {
    return token;
  }

  public Authentication setToken(byte[] token) {
    setToken(token == null ? (ByteBuffer)null : ByteBuffer.wrap(token));
    return this;
  }

  public Authentication setToken(ByteBuffer token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public String getUser_id() {
    return this.user_id;
  }

  public Authentication setUser_id(String user_id) {
    this.user_id = user_id;
    return this;
  }

  public void unsetUser_id() {
    this.user_id = null;
  }

  /** Returns true if field user_id is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_id() {
    return this.user_id != null;
  }

  public void setUser_idIsSet(boolean value) {
    if (!value) {
      this.user_id = null;
    }
  }

  public int getRolesSize() {
    return (this.roles == null) ? 0 : this.roles.size();
  }

  public java.util.Iterator<String> getRolesIterator() {
    return (this.roles == null) ? null : this.roles.iterator();
  }

  public void addToRoles(String elem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(elem);
  }

  public List<String> getRoles() {
    return this.roles;
  }

  public Authentication setRoles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public void unsetRoles() {
    this.roles = null;
  }

  /** Returns true if field roles is set (has been assigned a value) and false otherwise */
  public boolean isSetRoles() {
    return this.roles != null;
  }

  public void setRolesIsSet(boolean value) {
    if (!value) {
      this.roles = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION_ID:
      if (value == null) {
        unsetAction_id();
      } else {
        setAction_id((String)value);
      }
      break;

    case AUTHENTICATION_TYPE:
      if (value == null) {
        unsetAuthentication_type();
      } else {
        setAuthentication_type((String)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((ByteBuffer)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((String)value);
      }
      break;

    case ROLES:
      if (value == null) {
        unsetRoles();
      } else {
        setRoles((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_ID:
      return getAction_id();

    case AUTHENTICATION_TYPE:
      return getAuthentication_type();

    case TOKEN:
      return getToken();

    case USER_ID:
      return getUser_id();

    case ROLES:
      return getRoles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION_ID:
      return isSetAction_id();
    case AUTHENTICATION_TYPE:
      return isSetAuthentication_type();
    case TOKEN:
      return isSetToken();
    case USER_ID:
      return isSetUser_id();
    case ROLES:
      return isSetRoles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Authentication)
      return this.equals((Authentication)that);
    return false;
  }

  public boolean equals(Authentication that) {
    if (that == null)
      return false;

    boolean this_present_action_id = true && this.isSetAction_id();
    boolean that_present_action_id = true && that.isSetAction_id();
    if (this_present_action_id || that_present_action_id) {
      if (!(this_present_action_id && that_present_action_id))
        return false;
      if (!this.action_id.equals(that.action_id))
        return false;
    }

    boolean this_present_authentication_type = true && this.isSetAuthentication_type();
    boolean that_present_authentication_type = true && that.isSetAuthentication_type();
    if (this_present_authentication_type || that_present_authentication_type) {
      if (!(this_present_authentication_type && that_present_authentication_type))
        return false;
      if (!this.authentication_type.equals(that.authentication_type))
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_user_id = true && this.isSetUser_id();
    boolean that_present_user_id = true && that.isSetUser_id();
    if (this_present_user_id || that_present_user_id) {
      if (!(this_present_user_id && that_present_user_id))
        return false;
      if (!this.user_id.equals(that.user_id))
        return false;
    }

    boolean this_present_roles = true && this.isSetRoles();
    boolean that_present_roles = true && that.isSetRoles();
    if (this_present_roles || that_present_roles) {
      if (!(this_present_roles && that_present_roles))
        return false;
      if (!this.roles.equals(that.roles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Authentication other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAction_id()).compareTo(other.isSetAction_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_id, other.action_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthentication_type()).compareTo(other.isSetAuthentication_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthentication_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authentication_type, other.authentication_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser_id()).compareTo(other.isSetUser_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_id, other.user_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoles()).compareTo(other.isSetRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roles, other.roles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Authentication(");
    boolean first = true;

    if (isSetAction_id()) {
      sb.append("action_id:");
      if (this.action_id == null) {
        sb.append("null");
      } else {
        sb.append(this.action_id);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("authentication_type:");
    if (this.authentication_type == null) {
      sb.append("null");
    } else {
      sb.append(this.authentication_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.token, sb);
    }
    first = false;
    if (isSetUser_id()) {
      if (!first) sb.append(", ");
      sb.append("user_id:");
      if (this.user_id == null) {
        sb.append("null");
      } else {
        sb.append(this.user_id);
      }
      first = false;
    }
    if (isSetRoles()) {
      if (!first) sb.append(", ");
      sb.append("roles:");
      if (this.roles == null) {
        sb.append("null");
      } else {
        sb.append(this.roles);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AuthenticationStandardSchemeFactory implements SchemeFactory {
    public AuthenticationStandardScheme getScheme() {
      return new AuthenticationStandardScheme();
    }
  }

  private static class AuthenticationStandardScheme extends StandardScheme<Authentication> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Authentication struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.action_id = iprot.readString();
              struct.setAction_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AUTHENTICATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authentication_type = iprot.readString();
              struct.setAuthentication_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readBinary();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_id = iprot.readString();
              struct.setUser_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list10 = iprot.readListBegin();
                struct.roles = new ArrayList<String>(_list10.size);
                for (int _i11 = 0; _i11 < _list10.size; ++_i11)
                {
                  String _elem12;
                  _elem12 = iprot.readString();
                  struct.roles.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setRolesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Authentication struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action_id != null) {
        if (struct.isSetAction_id()) {
          oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
          oprot.writeString(struct.action_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.authentication_type != null) {
        oprot.writeFieldBegin(AUTHENTICATION_TYPE_FIELD_DESC);
        oprot.writeString(struct.authentication_type);
        oprot.writeFieldEnd();
      }
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeBinary(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.user_id != null) {
        if (struct.isSetUser_id()) {
          oprot.writeFieldBegin(USER_ID_FIELD_DESC);
          oprot.writeString(struct.user_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.roles != null) {
        if (struct.isSetRoles()) {
          oprot.writeFieldBegin(ROLES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.roles.size()));
            for (String _iter13 : struct.roles)
            {
              oprot.writeString(_iter13);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthenticationTupleSchemeFactory implements SchemeFactory {
    public AuthenticationTupleScheme getScheme() {
      return new AuthenticationTupleScheme();
    }
  }

  private static class AuthenticationTupleScheme extends TupleScheme<Authentication> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Authentication struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAction_id()) {
        optionals.set(0);
      }
      if (struct.isSetAuthentication_type()) {
        optionals.set(1);
      }
      if (struct.isSetToken()) {
        optionals.set(2);
      }
      if (struct.isSetUser_id()) {
        optionals.set(3);
      }
      if (struct.isSetRoles()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAction_id()) {
        oprot.writeString(struct.action_id);
      }
      if (struct.isSetAuthentication_type()) {
        oprot.writeString(struct.authentication_type);
      }
      if (struct.isSetToken()) {
        oprot.writeBinary(struct.token);
      }
      if (struct.isSetUser_id()) {
        oprot.writeString(struct.user_id);
      }
      if (struct.isSetRoles()) {
        {
          oprot.writeI32(struct.roles.size());
          for (String _iter14 : struct.roles)
          {
            oprot.writeString(_iter14);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Authentication struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.action_id = iprot.readString();
        struct.setAction_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.authentication_type = iprot.readString();
        struct.setAuthentication_typeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.token = iprot.readBinary();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.user_id = iprot.readString();
        struct.setUser_idIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.roles = new ArrayList<String>(_list15.size);
          for (int _i16 = 0; _i16 < _list15.size; ++_i16)
          {
            String _elem17;
            _elem17 = iprot.readString();
            struct.roles.add(_elem17);
          }
        }
        struct.setRolesIsSet(true);
      }
    }
  }

}

