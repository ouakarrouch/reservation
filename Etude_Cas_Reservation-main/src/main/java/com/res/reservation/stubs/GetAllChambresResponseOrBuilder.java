// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Reservation.proto

package com.res.reservation.stubs;

public interface GetAllChambresResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllChambresResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  java.util.List<com.res.reservation.stubs.Chambre> 
      getChambresList();
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  com.res.reservation.stubs.Chambre getChambres(int index);
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  int getChambresCount();
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  java.util.List<? extends com.res.reservation.stubs.ChambreOrBuilder> 
      getChambresOrBuilderList();
  /**
   * <code>repeated .Chambre chambres = 1;</code>
   */
  com.res.reservation.stubs.ChambreOrBuilder getChambresOrBuilder(
      int index);
}