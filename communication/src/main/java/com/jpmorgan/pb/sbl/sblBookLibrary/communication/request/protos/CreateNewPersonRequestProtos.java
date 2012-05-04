// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CreateNewPerson.proto

package com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos;

public final class CreateNewPersonRequestProtos {
  private CreateNewPersonRequestProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CreateNewPersonRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string firstName = 1;
    boolean hasFirstName();
    String getFirstName();
    
    // optional string surname = 2;
    boolean hasSurname();
    String getSurname();
    
    // optional string emailAddress = 3;
    boolean hasEmailAddress();
    String getEmailAddress();
  }
  public static final class CreateNewPersonRequest extends
      com.google.protobuf.GeneratedMessage
      implements CreateNewPersonRequestOrBuilder {
    // Use CreateNewPersonRequest.newBuilder() to construct.
    private CreateNewPersonRequest(Builder builder) {
      super(builder);
    }
    private CreateNewPersonRequest(boolean noInit) {}
    
    private static final CreateNewPersonRequest defaultInstance;
    public static CreateNewPersonRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public CreateNewPersonRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.internal_static_tutorial_CreateNewPersonRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.internal_static_tutorial_CreateNewPersonRequest_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string firstName = 1;
    public static final int FIRSTNAME_FIELD_NUMBER = 1;
    private java.lang.Object firstName_;
    public boolean hasFirstName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          firstName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string surname = 2;
    public static final int SURNAME_FIELD_NUMBER = 2;
    private java.lang.Object surname_;
    public boolean hasSurname() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getSurname() {
      java.lang.Object ref = surname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          surname_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSurnameBytes() {
      java.lang.Object ref = surname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        surname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string emailAddress = 3;
    public static final int EMAILADDRESS_FIELD_NUMBER = 3;
    private java.lang.Object emailAddress_;
    public boolean hasEmailAddress() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getEmailAddress() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          emailAddress_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEmailAddressBytes() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        emailAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      firstName_ = "";
      surname_ = "";
      emailAddress_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasFirstName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSurnameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getEmailAddressBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSurnameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getEmailAddressBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.internal_static_tutorial_CreateNewPersonRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.internal_static_tutorial_CreateNewPersonRequest_fieldAccessorTable;
      }
      
      // Construct using com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        firstName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        surname_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        emailAddress_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest.getDescriptor();
      }
      
      public com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest getDefaultInstanceForType() {
        return com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest.getDefaultInstance();
      }
      
      public com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest build() {
        com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest buildPartial() {
        com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest result = new com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.firstName_ = firstName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.surname_ = surname_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.emailAddress_ = emailAddress_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest) {
          return mergeFrom((com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest other) {
        if (other == com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest.getDefaultInstance()) return this;
        if (other.hasFirstName()) {
          setFirstName(other.getFirstName());
        }
        if (other.hasSurname()) {
          setSurname(other.getSurname());
        }
        if (other.hasEmailAddress()) {
          setEmailAddress(other.getEmailAddress());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasFirstName()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              firstName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              surname_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              emailAddress_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string firstName = 1;
      private java.lang.Object firstName_ = "";
      public boolean hasFirstName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFirstName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        firstName_ = value;
        onChanged();
        return this;
      }
      public Builder clearFirstName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      void setFirstName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        firstName_ = value;
        onChanged();
      }
      
      // optional string surname = 2;
      private java.lang.Object surname_ = "";
      public boolean hasSurname() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getSurname() {
        java.lang.Object ref = surname_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          surname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSurname(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        surname_ = value;
        onChanged();
        return this;
      }
      public Builder clearSurname() {
        bitField0_ = (bitField0_ & ~0x00000002);
        surname_ = getDefaultInstance().getSurname();
        onChanged();
        return this;
      }
      void setSurname(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        surname_ = value;
        onChanged();
      }
      
      // optional string emailAddress = 3;
      private java.lang.Object emailAddress_ = "";
      public boolean hasEmailAddress() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getEmailAddress() {
        java.lang.Object ref = emailAddress_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          emailAddress_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEmailAddress(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        emailAddress_ = value;
        onChanged();
        return this;
      }
      public Builder clearEmailAddress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        emailAddress_ = getDefaultInstance().getEmailAddress();
        onChanged();
        return this;
      }
      void setEmailAddress(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        emailAddress_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:tutorial.CreateNewPersonRequest)
    }
    
    static {
      defaultInstance = new CreateNewPersonRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:tutorial.CreateNewPersonRequest)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_CreateNewPersonRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tutorial_CreateNewPersonRequest_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CreateNewPerson.proto\022\010tutorial\"R\n\026Cre" +
      "ateNewPersonRequest\022\021\n\tfirstName\030\001 \002(\t\022\017" +
      "\n\007surname\030\002 \001(\t\022\024\n\014emailAddress\030\003 \001(\tB_\n" +
      "?com.jpmorgan.pb.sbl.sblBookLibrary.comm" +
      "unication.request.protosB\034CreateNewPerso" +
      "nRequestProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_tutorial_CreateNewPersonRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_tutorial_CreateNewPersonRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_tutorial_CreateNewPersonRequest_descriptor,
              new java.lang.String[] { "FirstName", "Surname", "EmailAddress", },
              com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest.class,
              com.jpmorgan.pb.sbl.sblBookLibrary.communication.request.protos.CreateNewPersonRequestProtos.CreateNewPersonRequest.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
