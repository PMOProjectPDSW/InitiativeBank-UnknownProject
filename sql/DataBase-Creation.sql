-- Drops

DROP TABLE Comment, Initiative, Tag, Users, Vote;
DROP sequence auto_initiative, auto_tag, auto_users, auto_vote, auto_comment;

-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-11-07 19:15:25.553

-- sequences
-- Sequence: auto_comment
CREATE SEQUENCE auto_comment
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_initiative
CREATE SEQUENCE auto_initiative
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_tag
CREATE SEQUENCE auto_tag
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_users
CREATE SEQUENCE auto_users
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: auto_vote
CREATE SEQUENCE auto_vote
	 INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- tables
-- Table: Comment
CREATE TABLE Comment (
    ID int  NOT NULL DEFAULT NEXTVAL ('auto_comment'),
    Description varchar(500)  NOT NULL,
    CreationDate date  NOT NULL,
    Users_ID int  NOT NULL,
    Initiative_ID int  NOT NULL,
    CONSTRAINT Comment_pk PRIMARY KEY (ID)
);

-- Table: Initiative
CREATE TABLE Initiative (
    ID int  NOT NULL DEFAULT NEXTVAL ('auto_initiative'),
    Title varchar(50)  NOT NULL,
    Description varchar(1000)  NOT NULL,    
    Status varchar(25)  NOT NULL,
    CreationDate date  NOT NULL,
    Field varchar(50)  NOT NULL,
    KeyWords text[]  NOT NULL,
    Users_ID int  NOT NULL,
    Tag_ID int  NOT NULL,       
    CONSTRAINT valite_status CHECK (Status in ('En espera de revision','En revision','Proyecto','Solucionado')) NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT Initiative_pk PRIMARY KEY (ID)
);

-- Table: Tag
CREATE TABLE Tag (
    ID int  NOT NULL DEFAULT NEXTVAL ('auto_tag'),
    Tag varchar(50)  NOT NULL,
    CONSTRAINT Tag_pk PRIMARY KEY (ID)
);

-- Table: Users
CREATE TABLE Users (
    ID int  NOT NULL DEFAULT NEXTVAL ('auto_users'),
    Name varchar(255)  NOT NULL,
    Email varchar(255)  NOT NULL,
    Password varchar(30)  NOT NULL,
    Area varchar(50)  NOT NULL,
    Role varchar(50)  NOT NULL,
    CONSTRAINT Email_uk UNIQUE (Email) NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT valid_Email CHECK (Email LIKE '%@%escuelaing.edu.co' AND Email NOT LIKE '%@%@%') NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT Users_pk PRIMARY KEY (ID)
);

-- Table: Vote
CREATE TABLE Vote (
    ID int  NOT NULL DEFAULT NEXTVAL ('auto_vote'),
    Vote boolean  NOT NULL,
    Users_ID int  NOT NULL,
    Initiative_ID int  NOT NULL,
    CONSTRAINT Vote_ak_1 UNIQUE (Initiative_ID, Users_ID) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT Vote_pk PRIMARY KEY (ID)
);

-- Reference: Users_Initiative (table: Initiative)
ALTER TABLE Initiative ADD CONSTRAINT Users_Initiative
    FOREIGN KEY (Users_ID)
    REFERENCES Users (ID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Tag_Initiative_ID (table: Initiative)
ALTER TABLE Initiative ADD CONSTRAINT Tag_Initiative_ID
    FOREIGN KEY (Tag_ID)
    REFERENCES Tag (ID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Comment_Initiative (table: Comment)
ALTER TABLE Comment ADD CONSTRAINT Comment_Initiative
    FOREIGN KEY (Initiative_ID)
    REFERENCES Initiative (ID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Comment_Users (table: Comment)
ALTER TABLE Comment ADD CONSTRAINT Comment_Users
    FOREIGN KEY (Users_ID)
    REFERENCES Users (ID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Vote_Initiative (table: Vote)
ALTER TABLE Vote ADD CONSTRAINT Vote_Initiative
    FOREIGN KEY (Initiative_ID)
    REFERENCES Initiative (ID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Vote_Users (table: Vote)
ALTER TABLE Vote ADD CONSTRAINT Vote_Users
    FOREIGN KEY (Users_ID)
    REFERENCES Users (ID)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

delete from Users;
