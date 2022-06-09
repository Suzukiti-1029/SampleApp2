CREATE DATABASE IF NOT EXISTS messageapp;
CREATE TABLE IF NOT EXISTS messageapp.messages (
  id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  title varchar(50),
  contents varchar(500),
  created_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
);