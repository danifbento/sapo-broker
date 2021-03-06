/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using Thrift.Protocol;
using Thrift.Transport;
namespace SapoBrokerClient.Encoding.Thrift.Messages
{

  [Serializable]
  public partial class Acknowledge : TBase
  {
    private string action_id;
    private string message_id;
    private string destination;

    public string Action_id
    {
      get
      {
        return action_id;
      }
      set
      {
        __isset.action_id = true;
        this.action_id = value;
      }
    }

    public string Message_id
    {
      get
      {
        return message_id;
      }
      set
      {
        __isset.message_id = true;
        this.message_id = value;
      }
    }

    public string Destination
    {
      get
      {
        return destination;
      }
      set
      {
        __isset.destination = true;
        this.destination = value;
      }
    }


    public Isset __isset;
    [Serializable]
    public struct Isset {
      public bool action_id;
      public bool message_id;
      public bool destination;
    }

    public Acknowledge() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String) {
              this.action_id = iprot.ReadString();
              this.__isset.action_id = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              this.message_id = iprot.ReadString();
              this.__isset.message_id = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              this.destination = iprot.ReadString();
              this.__isset.destination = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("Acknowledge");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (this.action_id != null && __isset.action_id) {
        field.Name = "action_id";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(this.action_id);
        oprot.WriteFieldEnd();
      }
      if (this.message_id != null && __isset.message_id) {
        field.Name = "message_id";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(this.message_id);
        oprot.WriteFieldEnd();
      }
      if (this.destination != null && __isset.destination) {
        field.Name = "destination";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(this.destination);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("Acknowledge(");
      sb.Append("action_id: ");
      sb.Append(this.action_id);
      sb.Append(",message_id: ");
      sb.Append(this.message_id);
      sb.Append(",destination: ");
      sb.Append(this.destination);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
