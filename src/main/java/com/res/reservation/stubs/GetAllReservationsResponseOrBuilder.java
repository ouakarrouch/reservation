// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Reservation.proto

package com.res.reservation.stubs;

public interface GetAllReservationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllReservationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<com.res.reservation.stubs.Reservation> 
      getReservationsList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  com.res.reservation.stubs.Reservation getReservations(int index);
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  int getReservationsCount();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<? extends com.res.reservation.stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList();
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  com.res.reservation.stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index);
}