package com.itwill.test.member;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class Member {
  private String id;
  private String pass;
  private String name;
  private Timestamp date;
  private String email;
  private String address;
  private String phone;
  private String mobile;
}
