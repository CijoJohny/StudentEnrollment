create table STUDENT
(
   STUDENT_ID  number(6) not null PRIMARY KEY,
   NAME varchar(255) not null,
   CONTACT_NAME varchar(255) not null,
   STATUS  varchar(32) not null,
   CREATED_DATE date default sysdate,
   LAST_MODIFIED_DATE date default sysdate
);

CREATE SEQUENCE STUDENT_ID_SEQ
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;


 create table COURSE
(
   COURSE_ID  number(6) not null PRIMARY KEY,
   NAME varchar(255) not null,
   COURSE_DESCRIPTION varchar(255) not null,
   STATUS  varchar(32) not null,
   CREATED_DATE date default sysdate,
   LAST_MODIFIED_DATE date default sysdate
);


CREATE SEQUENCE COURSE_ID_SEQ
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;


create table ENROLLMENT
(
   OID  number(6) not null PRIMARY KEY,
   STUDENT_ID  number(6) not null REFERENCES STUDENT(STUDENT_ID),
   COURSE_ID  number(6) not null REFERENCES COURSE(COURSE_ID),
   MARK  number(6),
   STATUS  varchar(32) not null,
   CREATED_DATE date default sysdate,
   LAST_MODIFIED_DATE date default sysdate
);

CREATE SEQUENCE ENROLLMENT_ID_SEQ
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;